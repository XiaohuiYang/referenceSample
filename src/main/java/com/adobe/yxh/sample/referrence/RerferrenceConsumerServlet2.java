package com.adobe.yxh.sample.referrence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
@SlingServlet(paths = "/bin/yxh/reference2")
@SuppressWarnings("serial")
public class RerferrenceConsumerServlet2 extends SlingAllMethodsServlet {
	
	@Reference(bind="bind", unbind="unbind", cardinality = ReferenceCardinality.MANDATORY_MULTIPLE)
	Producer producer;
	
	private List<Producer> list = new ArrayList<Producer>();
	
	public void bind(Producer p) {
		list.add(p);
	}
	
	public void unbind(Producer p) {
		list.remove(p);
	}
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
		for (Producer producer: list) {
			response.getWriter().write(producer.output() + "\r\n");
		}
	}
}
