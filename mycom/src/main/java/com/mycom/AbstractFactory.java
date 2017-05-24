package com.mycom;

public abstract class AbstractFactory {
	abstract Read getReader(String type); 
	abstract Write getWriter(String type);
}
