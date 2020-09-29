package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

public final class ObjectHelper {
    private static BiPredicate<Object, Object> a = new BiObjectPredicate();

    static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        BiObjectPredicate() {
        }

        public final boolean test(Object obj, Object obj2) {
            return ObjectHelper.a(obj, obj2);
        }
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static long a(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> BiPredicate<T, T> a() {
        return a;
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
