package lambdasinaction.appa;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//comment
//2nd commit
@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {

    Author[] value();

}
