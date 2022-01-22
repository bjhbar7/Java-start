package exam06_sec;

import java.lang.annotation.RetentionPolicy;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
String value() default "-";
int number() default 15;
}
