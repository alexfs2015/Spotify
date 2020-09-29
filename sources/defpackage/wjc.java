package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: wjc reason: default package */
public final class wjc extends wjr {
    public static final Object a = new Object();

    public static wjc a() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof wib) {
            return ((wib) currentThread).a;
        }
        return (wjc) b.get();
    }

    public static wjc b() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof wib) {
            wib wib = (wib) currentThread;
            wjc wjc = wib.a;
            if (wjc == null) {
                wjc = new wjc();
                wib.a = wjc;
            }
            return wjc;
        }
        ThreadLocal<wjc> threadLocal = wjr.b;
        wjc wjc2 = (wjc) threadLocal.get();
        if (wjc2 == null) {
            wjc2 = new wjc();
            threadLocal.set(wjc2);
        }
        return wjc2;
    }

    public static void c() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof wib) {
            ((wib) currentThread).a = null;
        } else {
            b.remove();
        }
    }

    public static int d() {
        int andIncrement = c.getAndIncrement();
        if (andIncrement >= 0) {
            return andIncrement;
        }
        c.decrementAndGet();
        throw new IllegalStateException("too many thread-local indexed variables");
    }

    public final <E> ArrayList<E> a(int i) {
        return new ArrayList<>(i);
    }

    public final Object b(int i) {
        Object[] objArr = this.d;
        return i < objArr.length ? objArr[i] : a;
    }

    public final boolean a(int i, Object obj) {
        Object[] objArr = this.d;
        if (i < objArr.length) {
            Object obj2 = objArr[i];
            objArr[i] = obj;
            if (obj2 == a) {
                return true;
            }
            return false;
        }
        b(i, obj);
        return true;
    }

    private void b(int i, Object obj) {
        Object[] objArr = this.d;
        int length = objArr.length;
        int i2 = (i >>> 1) | i;
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        Object[] copyOf = Arrays.copyOf(objArr, (i5 | (i5 >>> 16)) + 1);
        Arrays.fill(copyOf, length, copyOf.length, a);
        copyOf[i] = obj;
        this.d = copyOf;
    }

    public final Object c(int i) {
        Object[] objArr = this.d;
        if (i >= objArr.length) {
            return a;
        }
        Object obj = objArr[i];
        objArr[i] = a;
        return obj;
    }

    private wjc() {
        Object[] objArr = new Object[32];
        Arrays.fill(objArr, a);
        super(objArr);
    }
}
