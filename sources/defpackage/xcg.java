package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: xcg reason: default package */
final class xcg<T> {
    private final Class<?> a;
    private final String b;
    private final Class[] c;

    xcg(Class<?> cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private Method a(Class<?> cls) {
        String str = this.b;
        if (str == null) {
            return null;
        }
        Method a2 = a(cls, str, this.c);
        if (a2 != null) {
            Class<?> cls2 = this.a;
            if (cls2 != null && !cls2.isAssignableFrom(a2.getReturnType())) {
                return null;
            }
        }
        return a2;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) != 0) {
                    return method;
                }
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
        }
        return null;
    }

    private Object c(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            return null;
        }
        try {
            return a2.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    private Object d(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 != null) {
            try {
                return a2.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Unexpectedly could not call: ");
                sb.append(a2);
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Method ");
            sb2.append(this.b);
            sb2.append(" not supported for object ");
            sb2.append(t);
            throw new AssertionError(sb2.toString());
        }
    }

    public final Object a(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean a(T t) {
        return a(t.getClass()) != null;
    }

    public final Object b(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
