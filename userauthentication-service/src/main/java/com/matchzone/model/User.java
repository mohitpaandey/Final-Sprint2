//Authentication Service

package com.matchzone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User 
{
	
	@Id
	private String userEmail;
	private String userPassword;
	private String userName;
	private String userRole = "Employee";
	
	

}