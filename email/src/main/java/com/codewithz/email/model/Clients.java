package com.codewithz.email.model;

public class Clients {

	private int clientId;
	private String clientName;
	private String clientBranch;
	private String clientRM;
	private String clientDOB;
	private String clientOnboardingDate;
	

	public Clients() {
		super();
	}

	public Clients( int clientId, String clientName,String clientBranch,
			String clientRM, String clientDOB, String ClientOnboardingDate) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientBranch = clientBranch;
		this.clientRM = clientRM;
		this.clientDOB = clientDOB;
		this.clientOnboardingDate=ClientOnboardingDate;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientBranch() {
		return clientBranch;
	}
	
	
	public void setClientBranch(String clientBranch) {
		this.clientBranch = clientBranch;
	}

	public String getClientRM() {
		return clientRM;
	}

	public void setClientRM(String clientRM) {
		this.clientRM = clientRM;
	}

	public String getClientDOB() {
		return clientDOB;
	}

	public void setClientDOB(String clientDOB) {
		this.clientDOB = clientDOB;
	}
	
	public String getClientOnboardingDate() {
		return clientOnboardingDate;
	}
	
	public void setClientOnboardingDate(String clientOnboardingDate) {
		this.clientOnboardingDate = clientOnboardingDate;
	}
	
	

}
