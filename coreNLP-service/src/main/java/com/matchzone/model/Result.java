package com.matchzone.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private String profileId;
    private List<String> skills;
    private String location;
    private String extra;
    private String organization;
	
    



}
