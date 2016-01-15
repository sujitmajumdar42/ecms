package org.ecms.integration.to;

import org.springframework.stereotype.Component;

@Component
public class DBConfigTO {

	private String dbUserName;
	private String dbPassword;
	private String dbName;
	
	
	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	
	
}
