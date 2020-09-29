package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: wxi reason: default package */
public final class wxi extends wxx {
    public static final Object a = new Object();

    private wxi() {
        Object[] objArr = new Object[32];
        Arrays.fill(objArr, a);
        super(objArr);
    }

    public static wxi a() {
        Thread currentThread = Thread.currentThread();
        return currentThread instanceof wwh ? ((wwh) currentThread).a : (wxi) b.get();
    }

    public static wxi b() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof wwh) {
            wwh wwh = (wwh) currentThread;
            wxi wxi = wwh.a;
            if (wxi == null) {
                wxi = new wxi();
                wwh.a = wxi;
            }
            return wxi;
        }
        ThreadLocal<wxi> threadLocal = wxx.b;
        wxi wxi2 = (wxi) threadLocal.get();
        if (wxi2 == null) {
            wxi2 = new wxi();
            threadLocal.set(wxi2);
        }
        return wxi2;
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

    public static void c() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof wwh) {
            ((wwh) currentThread).a = null;
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

    public final boolean a(int i, Object obj) {
        Object[] objArr = this.d;
        if (i < objArr.length) {
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2 == a;
        }
        b(i, obj);
        return true;
    }

    public final Object b(int i) {
        Object[] objArr = this.d;
        return i < objArr.length ? objArr[i] : a;
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
}
