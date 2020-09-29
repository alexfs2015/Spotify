package defpackage;

import java.util.Arrays;

/* renamed from: aey reason: default package */
public final class aey<T> {
    private T a;

    public final boolean a(T t) {
        T t2 = this.a;
        if (t2 != null && a(t2, t)) {
            return false;
        }
        this.a = t;
        return true;
    }

    private static boolean a(T t, T t2) {
        if (t instanceof byte[]) {
            return Arrays.equals((byte[]) t, (byte[]) t2);
        }
        return t.equals(t2);
    }
}
