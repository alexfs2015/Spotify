package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: woz reason: default package */
public interface woz {

    @Inherited
    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: woz$a */
    public @interface a {
    }

    @Deprecated
    void a(wpb wpb, Throwable th);

    void e(wpb wpb);

    void f(wpb wpb);
}
