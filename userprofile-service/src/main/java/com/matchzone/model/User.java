package com.matchzone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	/*Marking userEmail as @Id, as an identifier for the row
	 * */
	@Id
	private String userEmail;
	private String userName;
	private String userRole="Employee";
	/*For not saving the userPassword in the database
	 * we are marking userPassword as Transient
	 * */
	@Transient
	private String userPassword;
	
}
