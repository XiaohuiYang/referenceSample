package com.adobe.yxh.sample.referrence.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.adobe.yxh.sample.referrence.Producer;
@Component(label = "producer2" )
@Service
@Property(name = "service.ranking", intValue = 1)
public class Producer2 implements Producer {

	public String output() {
		return "This is Producer2.";
	}

}
