package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: jja reason: default package */
public final class jja {
    private static final Field e;
    public final Class<? extends Fragment> a;
    private final c b;
    private final Bundle c;
    private int d;

    static {
        try {
            Field declaredField = c.class.getDeclaredField("a");
            e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    private jja(Class<? extends Fragment> cls, c cVar, Bundle bundle, int i) {
        this.a = cls;
        this.b = cVar;
        this.c = bundle;
        this.d = i;
    }

    public static jja a(kf kfVar, Fragment fragment) {
        return new jja(fragment.getClass(), kfVar.a(fragment), fragment.i, -1);
    }

    public final Fragment a() {
        try {
            Fragment fragment = (Fragment) this.a.getConstructor(new Class[0]).newInstance(new Object[0]);
            fragment.a(this.b);
            fragment.g(this.c);
            return fragment;
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchMethodException e3) {
            throw new AssertionError(e3);
        } catch (InstantiationException e4) {
            throw new AssertionError(e4);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }

    public static jja a(ClassLoader classLoader, Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(c.class.getClassLoader());
        c cVar = (c) bundle.getParcelable("saved_state");
        if (cVar != null) {
            try {
                ((Bundle) e.get(cVar)).setClassLoader(classLoader);
            } catch (IllegalAccessException | IllegalArgumentException e2) {
                throw new AssertionError(e2);
            }
        }
        return new jja((Class) fay.a((Class) bundle.getSerializable("class")), cVar, (Bundle) bundle.getParcelable("arguments"), bundle.getInt("size"));
    }

    public final ho<Parcelable, Integer> b() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("class", this.a);
        bundle.putParcelable("saved_state", this.b);
        bundle.putParcelable("arguments", this.c);
        if (this.d == -1) {
            this.d = jsf.a(bundle).length;
        }
        bundle.putInt("size", this.d);
        return new ho<>(bundle, Integer.valueOf(this.d));
    }
}
