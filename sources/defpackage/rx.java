package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rx reason: default package */
public abstract class rx {
    protected final dp<String, Method> a;
    protected final dp<String, Method> b;
    protected final dp<String, Class> c;

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract rx b();

    /* access modifiers changed from: protected */
    public abstract boolean b(int i);

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract byte[] e();

    /* access modifiers changed from: protected */
    public abstract CharSequence f();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T g();

    /* access modifiers changed from: protected */
    public abstract boolean h();

    public rx(dp<String, Method> dpVar, dp<String, Method> dpVar2, dp<String, Class> dpVar3) {
        this.a = dpVar;
        this.b = dpVar2;
        this.c = dpVar3;
    }

    public final void a(boolean z, int i) {
        c(i);
        a(z);
    }

    public final void a(byte[] bArr, int i) {
        c(2);
        a(bArr);
    }

    public final void a(CharSequence charSequence, int i) {
        c(i);
        a(charSequence);
    }

    public final void a(int i, int i2) {
        c(i2);
        a(i);
    }

    public final void a(String str, int i) {
        c(7);
        a(str);
    }

    public final void a(Parcelable parcelable, int i) {
        c(i);
        a(parcelable);
    }

    public final boolean b(boolean z, int i) {
        if (!b(i)) {
            return z;
        }
        return h();
    }

    public final int b(int i, int i2) {
        if (!b(i2)) {
            return i;
        }
        return c();
    }

    public final String b(String str, int i) {
        if (!b(7)) {
            return str;
        }
        return d();
    }

    public final byte[] b(byte[] bArr, int i) {
        if (!b(2)) {
            return bArr;
        }
        return e();
    }

    public final <T extends Parcelable> T b(T t, int i) {
        if (!b(i)) {
            return t;
        }
        return g();
    }

    public final CharSequence b(CharSequence charSequence, int i) {
        if (!b(i)) {
            return charSequence;
        }
        return f();
    }

    public final void a(rz rzVar, int i) {
        c(1);
        a(rzVar);
    }

    public final void a(rz rzVar) {
        if (rzVar == null) {
            a((String) null);
            return;
        }
        b(rzVar);
        rx b2 = b();
        a((T) rzVar, b2);
        b2.a();
    }

    private void b(rz rzVar) {
        try {
            a(b(rzVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(rzVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final <T extends rz> T b(T t, int i) {
        if (!b(1)) {
            return t;
        }
        return i();
    }

    public final <T extends rz> T i() {
        String d = d();
        if (d == null) {
            return null;
        }
        return a(d, b());
    }

    private <T extends rz> void a(T t, rx rxVar) {
        try {
            a(t.getClass()).invoke(null, new Object[]{t, rxVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private Method a(Class cls) {
        Method method = (Method) this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, rx.class});
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class b(Class<? extends rz> cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    private <T extends rz> T a(String str, rx rxVar) {
        Class<rx> cls = rx.class;
        try {
            Method method = (Method) this.a.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.a.put(str, method);
            }
            return (rz) method.invoke(null, new Object[]{rxVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }
}
