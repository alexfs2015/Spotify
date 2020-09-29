package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: gh reason: default package */
final class gh extends gk {
    private static final Class a;
    private static final Constructor b;
    private static final Method d;
    private static final Method e;

    gh() {
    }

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        b = constructor;
        a = cls;
        d = method;
        e = method2;
    }

    public static boolean a() {
        return d != null;
    }

    private static Object b() {
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        dv dvVar = new dv();
        for (b bVar : bVarArr) {
            Uri uri = bVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) dvVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = gl.a(context, cancellationSignal, uri);
                dvVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !a(b2, byteBuffer, bVar.b, bVar.c, bVar.d)) {
                return null;
            }
        }
        Typeface a2 = a(b2);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }

    public final Typeface a(Context context, b bVar, Resources resources, int i) {
        c[] cVarArr;
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        for (c cVar : bVar.a) {
            ByteBuffer a2 = gl.a(context, resources, cVar.f);
            if (a2 == null || !a(b2, a2, cVar.e, cVar.b, cVar.c)) {
                return null;
            }
        }
        return a(b2);
    }
}
