package com.aspectj;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.CONSTRUCTOR })
public @interface LogMethod {

    boolean entry() default true;
    boolean exit() default true;
    String prefix() default "";
    String suffix() default "";




}
