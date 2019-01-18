package com.lvhong.springTest;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Class getBeanClass(Element e) {
		return User.class;
	}
	
	protected void doParse(Element e , BeanDefinitionBuilder builder) {
		String userName = e.getAttribute("userName");
		String email = e.getAttribute("email");
		if(StringUtils.hasText(userName)) {
			builder.addPropertyValue("userName", userName);
		}
		if(StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
		
	}
}
