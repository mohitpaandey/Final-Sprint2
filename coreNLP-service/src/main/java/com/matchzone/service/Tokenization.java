package com.matchzone.service;

import java.util.ArrayList;
import java.util.List;

public class Tokenization {
    public List<String> token(String string,ArrayList<String> stopword,ArrayList<String> extra,ArrayList<String> skill, ArrayList<String> location, ArrayList<String> organization)
    {
        List<String> string1=new ArrayList<>();
     System.out.println(string);
        List<String> token=new ArrayList<>();
        String[] str=string.split(" ");
        for(int i=0;i<str.length -1;i++)
        {
            string1.add(str[i].concat(str[i+1]));
        }
        for(String string2:string1) {
     
            if(location.indexOf(string2)!=-1)
                token.add(string2.toLowerCase());
          
            
        }
        for(String string2:string1) {
        	
            if(extra.indexOf(string2)!=-1)
                token.add(string2.toLowerCase());
                 }
        for(String string2:string1) {
        	
            if(skill.indexOf(string2)!=-1)
                token.add(string2.toLowerCase());
        }
        
        for(String string2:str) {
   
            if(stopword.indexOf(string2)==-1)
                token.add(string2.toLowerCase());
           
        }
        for(String string2:string1) {
            if(organization.indexOf(string2)!=-1)
                token.add(string2.toLowerCase());
        }
     
        return token;
    }

}
