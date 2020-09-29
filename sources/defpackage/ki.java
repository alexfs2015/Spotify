package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ki reason: default package */
public class ki {
    private static final dv<String, Class<?>> a = new dv<>();

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends Fragment> b(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return d(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new InstantiationException(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new InstantiationException(sb2.toString(), e2);
        }
    }

    private static Class<?> d(ClassLoader classLoader, String str) {
        Class<?> cls = (Class) a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }

    public Fragment c(ClassLoader classLoader, String str) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            return (Fragment) b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(str);
            sb.append(str2);
            throw new InstantiationException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new InstantiationException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb4.toString(), e4);
        }
    }
}
