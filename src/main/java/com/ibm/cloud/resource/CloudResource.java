package com.ibm.cloud.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CloudResource {

	private String id = null;
	
	private String resourceName = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
}
