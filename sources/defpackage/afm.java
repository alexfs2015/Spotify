package defpackage;

import java.util.Arrays;

/* renamed from: afm reason: default package */
public final class afm<T> {
    private T a;

    private static boolean a(T t, T t2) {
        return t instanceof byte[] ? Arrays.equals((byte[]) t, (byte[]) t2) : t.equals(t2);
    }

    public final boolean a(T t) {
        T t2 = this.a;
        if (t2 != null && a(t2, t)) {
            return false;
        }
        this.a = t;
        return true;
    }
}
