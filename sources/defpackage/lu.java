package defpackage;

import androidx.lifecycle.Lifecycle.Event;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: lu reason: default package */
public @interface lu {
    Event a();
}
