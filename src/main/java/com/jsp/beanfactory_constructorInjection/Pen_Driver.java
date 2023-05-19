package com.jsp.beanfactory_constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Pen_Driver {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Pen pen =(Pen)beanFactory.getBean("myPen");
		
		pen.print();
	}
}
