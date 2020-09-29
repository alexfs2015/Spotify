package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.helpers.NOPLogger;

/* renamed from: wrp reason: default package */
public final class wrp implements wrj {
    public volatile wrj a;
    private final String b;
    private Boolean c;
    private Method d;
    private wrl e;
    private Queue<wrn> f;
    private final boolean g;

    public wrp(String str, Queue<wrn> queue, boolean z) {
        this.b = str;
        this.f = queue;
        this.g = z;
    }

    public final String f() {
        return this.b;
    }

    public final boolean a() {
        return i().a();
    }

    public final void a(String str) {
        i().a(str);
    }

    public final void a(String str, Object obj) {
        i().a(str, obj);
    }

    public final void a(String str, Object obj, Object obj2) {
        i().a(str, obj, obj2);
    }

    public final void a(String str, Throwable th) {
        i().a(str, th);
    }

    public final boolean b() {
        return i().b();
    }

    public final void b(String str) {
        i().b(str);
    }

    public final void b(String str, Object obj) {
        i().b(str, obj);
    }

    public final void b(String str, Object obj, Object obj2) {
        i().b(str, obj, obj2);
    }

    public final void a(String str, Object... objArr) {
        i().a(str, objArr);
    }

    public final void b(String str, Throwable th) {
        i().b(str, th);
    }

    public final boolean c() {
        return i().c();
    }

    public final void c(String str) {
        i().c(str);
    }

    public final void c(String str, Throwable th) {
        i().c(str, th);
    }

    public final boolean d() {
        return i().d();
    }

    public final void d(String str) {
        i().d(str);
    }

    public final void c(String str, Object obj) {
        i().c(str, obj);
    }

    public final void c(String str, Object obj, Object obj2) {
        i().c(str, obj, obj2);
    }

    public final void b(String str, Object... objArr) {
        i().b(str, objArr);
    }

    public final void d(String str, Throwable th) {
        i().d(str, th);
    }

    public final boolean e() {
        return i().e();
    }

    public final void e(String str) {
        i().e(str);
    }

    public final void d(String str, Object obj) {
        i().d(str, obj);
    }

    public final void d(String str, Object obj, Object obj2) {
        i().d(str, obj, obj2);
    }

    public final void c(String str, Object... objArr) {
        i().c(str, objArr);
    }

    public final void e(String str, Throwable th) {
        i().e(str, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((wrp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private wrj i() {
        if (this.a != null) {
            return this.a;
        }
        if (this.g) {
            return NOPLogger.a;
        }
        return j();
    }

    private wrj j() {
        if (this.e == null) {
            this.e = new wrl(this, this.f);
        }
        return this.e;
    }

    public final boolean g() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.a.getClass().getMethod("log", new Class[]{wrm.class});
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final void a(wrm wrm) {
        if (g()) {
            try {
                this.d.invoke(this.a, new Object[]{wrm});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean h() {
        return this.a == null;
    }
}
