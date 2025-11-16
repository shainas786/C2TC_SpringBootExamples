package com.tnsif.AdminService_spring_MVC;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
	@JsonProperty("Super-Admin")
	Super_Admin,
	Manager,
	Staff
}
