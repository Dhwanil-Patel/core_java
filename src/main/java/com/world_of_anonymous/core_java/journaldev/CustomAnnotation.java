package com.world_of_anonymous.core_java.journaldev;

import java.lang.annotation.*;

/**
 * Java Annotation is metadata about the program embedded in the program itself. It can be parsed by the annotation parsing tool or by the compiler.
 * We can also specify annotation availability to either compile time only or till runtime.
 *
 * Before java annotations, program metadata was available through java comments or by Javadoc but annotation offers more than that.
 * Annotations metadata can be available at runtime too and annotation parsers can use it to determine the process flow.
 *
 * 1. Annotation methods can’t have parameters.
 * 2. Annotation methods return types are limited to primitives, String, Enums, Annotation or array of these.
 * 3. Java Annotation methods can have default values.
 * 4. Annotations can have meta annotations attached to them. Meta annotations are used to provide information about the annotation.
 *
 * @Documented          – indicates that elements using this annotation should be documented by javadoc and similar tools.
 *                        This type should be used to annotate the declarations of types whose annotations affect the use of annotated elements
*                         by their clients. If a type declaration is annotated with Documented, its annotations become part of the public API
 *                        of the annotated elements.
 * @Target              – indicates the kinds of program element to which an annotation type is applicable. Some possible values are TYPE, METHOD,
 *                        CONSTRUCTOR, FIELD etc. If Target meta-annotation is not present, then annotation can be used on any program element.
 * @Inherited           – indicates that an annotation type is automatically inherited. If user queries the annotation type on a class declaration,
 *                        and the class declaration has no annotation for this type, then the class’s superclass will automatically be queried for
 *                        the annotation type. This process will be repeated until an annotation for this type is found,
 *                        or the top of the class hierarchy (Object) is reached.
 * @Retention           – indicates how long annotations with the annotated type are to be retained. It takes RetentionPolicy argument whose Possible values
 *                        are SOURCE, CLASS and RUNTIME
 * @Repeatable          – used to indicate that the annotation type whose declaration it annotates is repeatable.
 * @Override            – When we want to override a method of Superclass, we should use this annotation to inform compiler that we are overriding a method.
 *                        So when superclass method is removed or changed, compiler will show error message. Learn why we should always use java override
 *                        annotation while overriding a method.
 * @Deprecated          – when we want the compiler to know that a method is deprecated, we should use this annotation. Java recommends that in javadoc,
 *                        we should provide information for why this method is deprecated and what is the alternative to use.
 * @SuppressWarnings    – This is just to tell compiler to ignore specific warnings they produce, for example using raw types in java generics.
 *                        It’s retention policy is SOURCE and it gets discarded by compiler.
 * @FunctionalInterface – This annotation was introduced in Java 8 to indicate that the interface is intended to be a functional interface.
 * @SafeVarargs         – A programmer assertion that the body of the annotated method or constructor does not perform potentially unsafe operations on its varargs parameter.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
  String author() default "Dhwanil";
  String date();
  int revision() default 1;
  String comments();
}
