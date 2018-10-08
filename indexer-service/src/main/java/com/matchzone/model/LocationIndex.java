package com.matchzone.model;

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
public class LocationIndex {
	 private String profileId;

		private String city;
		private String state;
		private String country;
		//private String message;
		
		
}
