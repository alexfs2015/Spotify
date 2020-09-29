package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: sc reason: default package */
public abstract class sc {
    protected final dp<String, Method> a;
    protected final dp<String, Method> b;
    protected final dp<String, Class> c;

    public sc(dp<String, Method> dpVar, dp<String, Method> dpVar2, dp<String, Class> dpVar3) {
        this.a = dpVar;
        this.b = dpVar2;
        this.c = dpVar3;
    }

    private Method a(Class cls) {
        Method method = (Method) this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class b2 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b2.getDeclaredMethod("write", new Class[]{cls, sc.class});
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T extends se> T a(String str, sc scVar) {
        Class<sc> cls = sc.class;
        try {
            Method method = (Method) this.a.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.a.put(str, method);
            }
            return (se) method.invoke(null, new Object[]{scVar});
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

    private <T extends se> void a(T t, sc scVar) {
        try {
            a(t.getClass()).invoke(null, new Object[]{t, scVar});
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

    private Class b(Class<? extends se> cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    private void b(se seVar) {
        try {
            a(b(seVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(seVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    public final void a(int i, int i2) {
        c(i2);
        a(i);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    public final void a(Parcelable parcelable, int i) {
        c(i);
        a(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    public final void a(CharSequence charSequence, int i) {
        c(i);
        a(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    public final void a(String str, int i) {
        c(7);
        a(str);
    }

    public final void a(se seVar) {
        if (seVar == null) {
            a((String) null);
            return;
        }
        b(seVar);
        sc b2 = b();
        a((T) seVar, b2);
        b2.a();
    }

    public final void a(se seVar, int i) {
        c(1);
        a(seVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public final void a(boolean z, int i) {
        c(i);
        a(z);
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    public final void a(byte[] bArr, int i) {
        c(2);
        a(bArr);
    }

    public final int b(int i, int i2) {
        return !b(i2) ? i : c();
    }

    public final <T extends Parcelable> T b(T t, int i) {
        return !b(i) ? t : g();
    }

    public final CharSequence b(CharSequence charSequence, int i) {
        return !b(i) ? charSequence : f();
    }

    public final String b(String str, int i) {
        return !b(7) ? str : d();
    }

    /* access modifiers changed from: protected */
    public abstract sc b();

    public final <T extends se> T b(T t, int i) {
        return !b(1) ? t : i();
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(int i);

    public final boolean b(boolean z, int i) {
        return !b(i) ? z : h();
    }

    public final byte[] b(byte[] bArr, int i) {
        return !b(2) ? bArr : e();
    }

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

    public final <T extends se> T i() {
        String d = d();
        if (d == null) {
            return null;
        }
        return a(d, b());
    }
}
