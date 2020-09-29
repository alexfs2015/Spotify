package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.helpers.NOPLogger;

/* renamed from: xfu reason: default package */
public final class xfu implements xfo {
    public volatile xfo a;
    private final String b;
    private Boolean c;
    private Method d;
    private xfq e;
    private Queue<xfs> f;
    private final boolean g;

    public xfu(String str, Queue<xfs> queue, boolean z) {
        this.b = str;
        this.f = queue;
        this.g = z;
    }

    private xfo i() {
        return this.a != null ? this.a : this.g ? NOPLogger.a : j();
    }

    private xfo j() {
        if (this.e == null) {
            this.e = new xfq(this, this.f);
        }
        return this.e;
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

    public final void a(String str, Object... objArr) {
        i().a(str, objArr);
    }

    public final void a(xfr xfr) {
        if (g()) {
            try {
                this.d.invoke(this.a, new Object[]{xfr});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean a() {
        return i().a();
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

    public final void b(String str, Throwable th) {
        i().b(str, th);
    }

    public final void b(String str, Object... objArr) {
        i().b(str, objArr);
    }

    public final boolean b() {
        return i().b();
    }

    public final void c(String str) {
        i().c(str);
    }

    public final void c(String str, Object obj) {
        i().c(str, obj);
    }

    public final void c(String str, Object obj, Object obj2) {
        i().c(str, obj, obj2);
    }

    public final void c(String str, Throwable th) {
        i().c(str, th);
    }

    public final void c(String str, Object... objArr) {
        i().c(str, objArr);
    }

    public final boolean c() {
        return i().c();
    }

    public final void d(String str) {
        i().d(str);
    }

    public final void d(String str, Object obj) {
        i().d(str, obj);
    }

    public final void d(String str, Object obj, Object obj2) {
        i().d(str, obj, obj2);
    }

    public final void d(String str, Throwable th) {
        i().d(str, th);
    }

    public final boolean d() {
        return i().d();
    }

    public final void e(String str) {
        i().e(str);
    }

    public final void e(String str, Throwable th) {
        i().e(str, th);
    }

    public final boolean e() {
        return i().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((xfu) obj).b);
    }

    public final String f() {
        return this.b;
    }

    public final boolean g() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.a.getClass().getMethod("log", new Class[]{xfr.class});
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final boolean h() {
        return this.a == null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
