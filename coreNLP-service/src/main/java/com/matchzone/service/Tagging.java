package com.matchzone.service;

import java.util.ArrayList;
import java.util.List;

public class Tagging {
    
    public List<String> tagFunction(List<String> list, List<String> file)
    {
        List<String> taggedList=new ArrayList<>();
        for(String str:list) {
            if(file.indexOf(str)!=-1)
            {
                taggedList.add(str);
            }
        }
        return taggedList;
    }
    
     public List<String> tagYears(List<String> list, List<String> file)
    {
        List<String> taggedList=new ArrayList<>();
        for(String str:list) {
            if(file.indexOf(str)!=-1)
            {
                String[] str1=str.split("");
                taggedList.add(str1[0]);
            }
        }
        return taggedList;
    }
}
