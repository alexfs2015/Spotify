package defpackage;

import java.lang.reflect.Array;

/* renamed from: fcu reason: default package */
public final class fcu {
    public static <T> T[] a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
