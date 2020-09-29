package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lz reason: default package */
public final class lz {
    private final b a;
    private final mb b;

    /* renamed from: lz$a */
    public static class a extends d {
        private static a a;
        private Application b;

        private a(Application application) {
            this.b = application;
        }

        public static a a(Application application) {
            if (a == null) {
                a = new a(application);
            }
            return a;
        }

        public final <T extends ly> T a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            if (!lc.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (ly) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
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

    /* renamed from: lz$b */
    public interface b {
        <T extends ly> T a(Class<T> cls);
    }

    /* renamed from: lz$c */
    static abstract class c implements b {
        c() {
        }

        public abstract <T extends ly> T a();
    }

    /* renamed from: lz$d */
    public static class d implements b {
        public <T extends ly> T a(Class<T> cls) {
            String str = "Cannot create an instance of ";
            try {
                return (ly) cls.newInstance();
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

    public lz(mb mbVar, b bVar) {
        this.a = bVar;
        this.b = mbVar;
    }

    private <T extends ly> T a(String str, Class<T> cls) {
        T a2 = this.b.a(str);
        if (cls.isInstance(a2)) {
            return a2;
        }
        b bVar = this.a;
        T a3 = bVar instanceof c ? ((c) bVar).a() : bVar.a(cls);
        this.b.a(str, a3);
        return a3;
    }

    public final <T extends ly> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
