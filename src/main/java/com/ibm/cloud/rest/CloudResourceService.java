package com.ibm.cloud.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ibm.cloud.resource.CloudResource;
;

@Path("/")
public class CloudResourceService {

	@GET
	@Path("instance")
	@Produces(MediaType.APPLICATION_XML)
	public CloudResource getCloudResource() {
		/*String output = "<h1>Cloud Resource found!<h1>" +
				"<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";*/
		CloudResource cloudResource = new CloudResource();
		cloudResource.setId("uueuu123");
		cloudResource.setResourceName("VM Resource");
		return cloudResource;
	}
}
