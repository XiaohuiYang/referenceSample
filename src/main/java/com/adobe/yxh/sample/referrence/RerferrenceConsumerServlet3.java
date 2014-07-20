package com.adobe.yxh.sample.referrence;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
@SlingServlet(paths = "/bin/yxh/reference3")
@SuppressWarnings("serial")
public class RerferrenceConsumerServlet3 extends SlingAllMethodsServlet {
	
	@Reference
	Producer producer;
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write(producer.output());
	}
}
