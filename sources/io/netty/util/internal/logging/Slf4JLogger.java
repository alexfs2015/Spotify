package io.netty.util.internal.logging;

public class Slf4JLogger extends AbstractInternalLogger {
    private static final long serialVersionUID = 108038972685130825L;
    private final transient xfo a;

    public Slf4JLogger(xfo xfo) {
        super(xfo.f());
        this.a = xfo;
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(String str, Object obj) {
        this.a.a(str, obj);
    }

    public final void a(String str, Object obj, Object obj2) {
        this.a.a(str, obj, obj2);
    }

    public final void a(String str, Throwable th) {
        this.a.a(str, th);
    }

    public final void a(String str, Object... objArr) {
        this.a.a(str, objArr);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void b(String str, Object obj) {
        this.a.b(str, obj);
    }

    public final void b(String str, Object obj, Object obj2) {
        this.a.b(str, obj, obj2);
    }

    public final void b(String str, Throwable th) {
        this.a.b(str, th);
    }

    public final void b(String str, Object... objArr) {
        this.a.b(str, objArr);
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c(String str) {
        this.a.c(str);
    }

    public final void c(String str, Object obj) {
        this.a.c(str, obj);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.a.c(str, obj, obj2);
    }

    public final void c(String str, Throwable th) {
        this.a.c(str, th);
    }

    public final void c(String str, Object... objArr) {
        this.a.c(str, objArr);
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void d(String str) {
        this.a.d(str);
    }

    public final void d(String str, Object obj) {
        this.a.d(str, obj);
    }

    public final void d(String str, Object obj, Object obj2) {
        this.a.d(str, obj, obj2);
    }

    public final void d(String str, Throwable th) {
        this.a.d(str, th);
    }

    public final boolean d() {
        return this.a.d();
    }

    public final void e(String str) {
        this.a.e(str);
    }

    public final void e(String str, Throwable th) {
        this.a.e(str, th);
    }

    public final boolean e() {
        return this.a.e();
    }
}
