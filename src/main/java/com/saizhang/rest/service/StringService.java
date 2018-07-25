package com.saizhang.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.saizhang.rest.logic.StringUtils;
import com.saizhang.rest.model.Request;

@Path("/strser")
public class StringService {

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response get(Request request) {
		
		String result = new String();
		result = "";
		
		if( request.getMethod().equals("stringClean") ) {
			result = StringUtils.stringClean(request.getTxt());
		} else if( request.getMethod().equals("maxBlock") ) {
			result = "" + StringUtils.maxBlock(request.getTxt());
		} else if( request.getMethod().equals("reorderBlock") ) {
			result = StringUtils.reorderBlock(request.getTxt());
		} else {
			return Response.status(500).build();
		}
		return Response.status(200).entity("{ \"result\": \"" + result + "\" }").build();
	}
}
