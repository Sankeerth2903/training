package com.java.pmsapp.container;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
public class Injector<TContract, TImplementation extends TContract> {
	private static Injector _injector;

	private Injector() {
	}

	public static Injector getInjector() {
		if (_injector == null)
			_injector = new Injector();
		return _injector;
	}
	
	// public <TContract, TImplementation extends TContract> TContract
	// createInstance(Class<TImplementation> classInfo)
	public TContract createInstance(Class<TImplementation> classInfo)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		TImplementation classInstance = classInfo.newInstance();
		return classInstance;

	}

	public TContract createInstance(Class<TImplementation> classInfo, Object dependencyObject,
			Class<?> dependencyObjectBaseType) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		if (dependencyObject == null)
			return classInfo.getDeclaredConstructor().newInstance();
		else {
			Constructor<TImplementation> ctor = classInfo.getDeclaredConstructor(dependencyObjectBaseType);
			return ctor.newInstance(dependencyObject);
		}
	}
}
*/
public class Injector{
	private static Injector _injector;

	private Injector() {
	}

	public static Injector getInjector() {
		if (_injector == null)
			_injector = new Injector();
		return _injector;
	}

	// public <TContract, TImplementation extends TContract> TContract
	// createInstance(Class<TImplementation> classInfo)
	public <TContract, TImplementation extends TContract> TContract createInstance(Class<TImplementation> classInfo)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		TImplementation classInstance = classInfo.newInstance();
		return classInstance;

	}

	public <TContract, TImplementation extends TContract> TContract createInstance(Class<TImplementation> classInfo,
			Object dependencyObject, Class<?> dependencyObjectBaseType)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {

		if (dependencyObject == null)
			return classInfo.getDeclaredConstructor().newInstance();
		else {
			Constructor<TImplementation> ctor = classInfo.getDeclaredConstructor(dependencyObjectBaseType);
			return ctor.newInstance(dependencyObject);
		}
	}
}
