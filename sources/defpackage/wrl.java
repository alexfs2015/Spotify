package defpackage;

import java.util.Queue;
import org.slf4j.event.Level;

/* renamed from: wrl reason: default package */
public final class wrl implements wrj {
    private String a;
    private wrp b;
    private Queue<wrn> c;

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d() {
        return true;
    }

    public final boolean e() {
        return true;
    }

    public wrl(wrp wrp, Queue<wrn> queue) {
        this.b = wrp;
        this.a = wrp.f();
        this.c = queue;
    }

    public final String f() {
        return this.a;
    }

    public final void a(String str) {
        a(Level.e, str, null, null);
    }

    public final void a(String str, Object obj) {
        a(Level.e, str, new Object[]{obj}, null);
    }

    public final void a(String str, Object obj, Object obj2) {
        a(Level.e, str, new Object[]{obj, obj2}, null);
    }

    public final void a(String str, Throwable th) {
        a(Level.e, str, null, th);
    }

    public final void b(String str) {
        a(Level.e, str, null, null);
    }

    public final void b(String str, Object obj) {
        a(Level.d, str, new Object[]{obj}, null);
    }

    public final void b(String str, Object obj, Object obj2) {
        a(Level.d, str, new Object[]{obj, obj2}, null);
    }

    public final void a(String str, Object... objArr) {
        a(Level.d, str, objArr, null);
    }

    public final void b(String str, Throwable th) {
        a(Level.d, str, null, th);
    }

    public final void c(String str) {
        a(Level.c, str, null, null);
    }

    public final void c(String str, Throwable th) {
        a(Level.c, str, null, th);
    }

    public final void d(String str) {
        a(Level.b, str, null, null);
    }

    public final void c(String str, Object obj) {
        a(Level.b, str, new Object[]{obj}, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        a(Level.b, str, new Object[]{obj, obj2}, null);
    }

    public final void b(String str, Object... objArr) {
        a(Level.b, str, objArr, null);
    }

    public final void d(String str, Throwable th) {
        a(Level.b, str, null, th);
    }

    public final void e(String str) {
        a(Level.a, str, null, null);
    }

    public final void d(String str, Object obj) {
        a(Level.a, str, new Object[]{obj}, null);
    }

    public final void d(String str, Object obj, Object obj2) {
        a(Level.a, str, new Object[]{obj, obj2}, null);
    }

    public final void c(String str, Object... objArr) {
        a(Level.a, str, objArr, null);
    }

    public final void e(String str, Throwable th) {
        a(Level.a, str, null, th);
    }

    private void a(Level level, String str, Object[] objArr, Throwable th) {
        wrn wrn = new wrn();
        wrn.h = System.currentTimeMillis();
        wrn.a = level;
        wrn.d = this.b;
        wrn.c = this.a;
        wrn.b = null;
        wrn.f = str;
        wrn.g = objArr;
        wrn.i = th;
        wrn.e = Thread.currentThread().getName();
        this.c.add(wrn);
    }
}
