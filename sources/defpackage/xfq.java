package defpackage;

import java.util.Queue;
import org.slf4j.event.Level;

/* renamed from: xfq reason: default package */
public final class xfq implements xfo {
    private String a;
    private xfu b;
    private Queue<xfs> c;

    public xfq(xfu xfu, Queue<xfs> queue) {
        this.b = xfu;
        this.a = xfu.f();
        this.c = queue;
    }

    private void a(Level level, String str, Object[] objArr, Throwable th) {
        xfs xfs = new xfs();
        xfs.h = System.currentTimeMillis();
        xfs.a = level;
        xfs.d = this.b;
        xfs.c = this.a;
        xfs.b = null;
        xfs.f = str;
        xfs.g = objArr;
        xfs.i = th;
        xfs.e = Thread.currentThread().getName();
        this.c.add(xfs);
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

    public final void a(String str, Object... objArr) {
        a(Level.d, str, objArr, null);
    }

    public final boolean a() {
        return true;
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

    public final void b(String str, Throwable th) {
        a(Level.d, str, null, th);
    }

    public final void b(String str, Object... objArr) {
        a(Level.b, str, objArr, null);
    }

    public final boolean b() {
        return true;
    }

    public final void c(String str) {
        a(Level.c, str, null, null);
    }

    public final void c(String str, Object obj) {
        a(Level.b, str, new Object[]{obj}, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        a(Level.b, str, new Object[]{obj, obj2}, null);
    }

    public final void c(String str, Throwable th) {
        a(Level.c, str, null, th);
    }

    public final void c(String str, Object... objArr) {
        a(Level.a, str, objArr, null);
    }

    public final boolean c() {
        return true;
    }

    public final void d(String str) {
        a(Level.b, str, null, null);
    }

    public final void d(String str, Object obj) {
        a(Level.a, str, new Object[]{obj}, null);
    }

    public final void d(String str, Object obj, Object obj2) {
        a(Level.a, str, new Object[]{obj, obj2}, null);
    }

    public final void d(String str, Throwable th) {
        a(Level.b, str, null, th);
    }

    public final boolean d() {
        return true;
    }

    public final void e(String str) {
        a(Level.a, str, null, null);
    }

    public final void e(String str, Throwable th) {
        a(Level.a, str, null, th);
    }

    public final boolean e() {
        return true;
    }

    public final String f() {
        return this.a;
    }
}
