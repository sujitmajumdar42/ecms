package org.ecms.integration.to;

import org.springframework.stereotype.Component;

@Component
public class DBConfigTO {

	private String dbUserName;

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	
	
}
