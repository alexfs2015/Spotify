package com.fasterxml.jackson.datatype.guava.deser.util;

import com.google.common.collect.BoundType;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class RangeFactory {
    private static Method legacyAllMethod;
    private static Method legacyDownToMethod;
    private static Method legacyRangeMethod;
    private static Method legacyUpToMethod;

    static {
        initLegacyRangeFactoryMethods();
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return createRange(new Callable<Range<C>>() {
            public final Range<C> call() {
                return Range.a();
            }
        }, legacyAllMethod, new Object[0]);
    }

    private static <C extends Comparable<?>> Range<C> createRange(Callable<Range<C>> callable, Method method, Object... objArr) {
        try {
            return (Range) callable.call();
        } catch (NoSuchMethodError e) {
            if (method != null) {
                return invokeLegacyRangeFactoryMethod(method, objArr);
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static <C extends Comparable<?>> Range<C> downTo(final C c, final BoundType boundType) {
        return createRange(new Callable<Range<C>>() {
            public final Range<C> call() {
                return Range.b(c, boundType);
            }
        }, legacyDownToMethod, c, boundType);
    }

    private static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static void initLegacyRangeFactoryMethods() {
        try {
            Class cls = Class.forName("com.google.common.collect.Ranges");
            legacyRangeMethod = findMethod(cls, "range", Comparable.class, BoundType.class, Comparable.class, BoundType.class);
            legacyDownToMethod = findMethod(cls, "downTo", Comparable.class, BoundType.class);
            legacyUpToMethod = findMethod(cls, "upTo", Comparable.class, BoundType.class);
            legacyAllMethod = findMethod(cls, "all", new Class[0]);
        } catch (ClassNotFoundException unused) {
        }
    }

    private static <C extends Comparable<?>> Range<C> invokeLegacyRangeFactoryMethod(Method method, Object... objArr) {
        try {
            return (Range) method.invoke(null, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to invoke legacy Range factory method [");
            sb.append(method.getName());
            sb.append("] with params ");
            sb.append(Lists.a((E[]) objArr));
            sb.append(".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static <C extends Comparable<?>> Range<C> range(final C c, final BoundType boundType, final C c2, final BoundType boundType2) {
        return createRange(new Callable<Range<C>>() {
            public final Range<C> call() {
                return Range.a(c, boundType, c2, boundType2);
            }
        }, legacyRangeMethod, c, boundType, c2, boundType2);
    }

    public static <C extends Comparable<?>> Range<C> upTo(final C c, final BoundType boundType) {
        return createRange(new Callable<Range<C>>() {
            public final Range<C> call() {
                return Range.a(c, boundType);
            }
        }, legacyUpToMethod, c, boundType);
    }
}
