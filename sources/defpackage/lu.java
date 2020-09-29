package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lu reason: default package */
public final class lu {
    private final b a;
    private final lw b;

    /* renamed from: lu$a */
    public static class a extends d {
        private static a a;
        private Application b;

        public static a a(Application application) {
            if (a == null) {
                a = new a(application);
            }
            return a;
        }

        private a(Application application) {
            this.b = application;
        }

        public final <T extends lt> T a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            if (!kx.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (lt) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder(str);
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder(str);
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: lu$b */
    public interface b {
        <T extends lt> T a(Class<T> cls);
    }

    /* renamed from: lu$c */
    static abstract class c implements b {
        public abstract <T extends lt> T a();

        c() {
        }
    }

    /* renamed from: lu$d */
    public static class d implements b {
        public <T extends lt> T a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            try {
                return (lt) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    public lu(lw lwVar, b bVar) {
        this.a = bVar;
        this.b = lwVar;
    }

    public final <T extends lt> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    private <T extends lt> T a(String str, Class<T> cls) {
        T t;
        T a2 = this.b.a(str);
        if (cls.isInstance(a2)) {
            return a2;
        }
        b bVar = this.a;
        if (bVar instanceof c) {
            t = ((c) bVar).a();
        } else {
            t = bVar.a(cls);
        }
        this.b.a(str, t);
        return t;
    }
}
