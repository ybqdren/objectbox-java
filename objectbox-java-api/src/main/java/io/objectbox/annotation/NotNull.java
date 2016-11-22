package io.objectbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that property is not null
 * <p>
 * You can also use any another NotNull or NonNull annotation (from any library or your own),
 * they are equal to using this
 * </p>
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
/** TODO public */ @interface NotNull {
}
