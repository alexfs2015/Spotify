package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: wat reason: default package */
public interface wat {

    @Inherited
    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: wat$a */
    public @interface a {
    }

    @Deprecated
    void a(wav wav, Throwable th);

    void e(wav wav);

    void f(wav wav);
}
