package lambdasinaction.appa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//comment
@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    Author[] value();

}
