package defpackage;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lq reason: default package */
public final class lq {
    private static Map<Class, Integer> a = new HashMap();
    private static Map<Class, List<Constructor<? extends lh>>> b = new HashMap();

    private static Constructor<? extends lh> a(Class<?> cls) {
        String str = ".";
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(str, "_"));
            sb.append("_LifecycleAdapter");
            String sb2 = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name);
                sb3.append(str);
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            Constructor<? extends lh> declaredConstructor = Class.forName(sb2).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static lh a(Constructor<? extends lh> constructor, Object obj) {
        try {
            return (lh) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    static lk a(Object obj) {
        boolean z = obj instanceof lk;
        boolean z2 = obj instanceof lg;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((lg) obj, (lk) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((lg) obj, null);
        }
        if (z) {
            return (lk) obj;
        }
        Class cls = obj.getClass();
        if (b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        lh[] lhVarArr = new lh[list.size()];
        for (int i = 0; i < list.size(); i++) {
            lhVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(lhVarArr);
    }

    private static int b(Class<?> cls) {
        Integer num = (Integer) a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int c = c(cls);
        a.put(cls, Integer.valueOf(c));
        return c;
    }

    private static int c(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a2 = a(cls);
        if (a2 != null) {
            b.put(cls, Collections.singletonList(a2));
            return 2;
        } else if (ld.a.a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (d(superclass)) {
                if (b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (d(cls2)) {
                    if (b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            b.put(cls, arrayList);
            return 2;
        }
    }

    private static boolean d(Class<?> cls) {
        return cls != null && ll.class.isAssignableFrom(cls);
    }
}
