package defpackage;

import java.lang.reflect.Array;

/* renamed from: fdm reason: default package */
public final class fdm {
    public static <T> T[] a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
