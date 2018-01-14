package com.github.kklisura.dev.tools.java.generator.support.java.builder;

import java.util.List;

/**
 * Java interface builder.
 *
 * @author Kenan Klisura
 */
public interface JavaInterfaceBuilder extends JavaImportAwareBuilder {
	/**
	 * Sets the java doc for this interface.
	 *
	 * @param comment Comment.
	 */
	void setJavaDoc(String comment);

	/**
	 * Adds annotation to this interface.
	 *
	 * @param annotationName Annotation name.
	 */
	void addAnnotation(String annotationName);

	/**
	 * Adds a method to this interface.
	 *
	 * @param name         Method name.
	 * @param description  Method description.
	 * @param methodParams List of method params.
	 * @param returnType   Return parameter.
	 */
	void addMethod(String name, String description, List<MethodParam> methodParams, String returnType);
}