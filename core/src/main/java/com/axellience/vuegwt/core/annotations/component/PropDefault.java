package com.axellience.vuegwt.core.annotations.component;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Mark a Java property as being a Vue component Property passed from your Component parent
 *
 * @author Adrien Baron
 */
@Target(METHOD)
@Retention(SOURCE)
public @interface PropDefault {

  /**
   * Name of the property
   *
   * @return the name of the property
   */
  String value();
}
