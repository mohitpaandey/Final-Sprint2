package com.matchzone.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.matchzone.model.Search;
import com.matchzone.service.Tagging;
import com.matchzone.service.Tokenization;

import ch.qos.logback.core.net.SyslogOutputStream;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")

public class NLPController {
    
    public  Tokenization tokenization =new Tokenization();
    List<String> tokenString = new ArrayList<String>();
    Scanner sc;
    Tagging tagging=new Tagging();
    Search search =new Search();
    RestTemplate restTemplate=new RestTemplate();
    
    @GetMapping("/search/{search}")
    public ResponseEntity<?> breakString(@PathVariable("search") String string)throws FileNotFoundException{
   
        sc=new Scanner(new File("stopword.txt"));
        ArrayList<String> stopword=new ArrayList<>();
        while(sc.hasNext()) {
            stopword.add(sc.next().toLowerCase());
        
        }
        
        sc=new Scanner(new File("extra.txt"));
        ArrayList<String> extra=new ArrayList<>();
        while(sc.hasNext()) {
            extra.add(sc.next().toLowerCase());
        }
    
        sc=new Scanner(new File("skill.txt"));
        ArrayList<String> skill=new ArrayList<>();
        System.out.println(skill);
        while(sc.hasNext()) {
            skill.add(sc.next().toLowerCase());
        }
        sc=new Scanner(new File("location.txt"));
        ArrayList<String> location=new ArrayList<>();
        System.out.println(location);
        while(sc.hasNext()) {
            location.add(sc.next().toLowerCase());
        }
        
        sc=new Scanner(new File("organization.txt"));
        ArrayList<String> organization=new ArrayList<>();
        System.out.println(organization);
        while(sc.hasNext()) {
            organization.add(sc.next().toLowerCase());
        }
        
        tokenString= tokenization.token(string,stopword,extra,skill,location,organization);
        System.out.println(tokenString);
       search.setSkills(tagging.tagFunction(tokenString, skill));
       search.setLocation(tagging.tagFunction(tokenString, location));
       search.setExperience(tagging.tagYears(tokenString, extra));
       search.setOrganization(tagging.tagFunction(tokenString, organization));
        
        
        System.out.println(search);

        
        String url="http://localhost:8095/coreNLP-service";
        HttpHeaders headers=new HttpHeaders();
        HttpEntity<Search> entity=new HttpEntity<>(search,headers);
        
        return restTemplate.exchange(url, HttpMethod.POST,entity,String.class);
            
}
}