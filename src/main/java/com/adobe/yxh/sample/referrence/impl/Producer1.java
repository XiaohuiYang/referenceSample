package com.adobe.yxh.sample.referrence.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.adobe.yxh.sample.referrence.Producer;
@Component(label = "Producer1")
@Service
public class Producer1 implements Producer {

	public String output() {
		return "This is Producer1.";
	}

}
