package in.picklerick;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ajitesh on 07/11/18.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Setup {

    String name();

    String[] subSetups();

    Class[] components();

    String[] namedComponents();
}
