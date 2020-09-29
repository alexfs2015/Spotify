package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: gi reason: default package */
public class gi extends gg {
    protected final Class a;
    protected final Method b;
    private Constructor d;
    private Method e;
    private Method f;
    private Method g;
    private Method h;

    public gi() {
        Method method;
        Method method2;
        Method method3;
        Constructor constructor;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class cls3 = cls2;
            method5 = a(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder sb = new StringBuilder("Unable to collect necessary methods for class ");
            sb.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e2);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.a = cls;
        this.d = constructor;
        this.e = method3;
        this.f = method2;
        this.g = method;
        this.h = method4;
        this.b = method5;
    }

    private boolean a() {
        return this.e != null;
    }

    private Object b() {
        try {
            return this.d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.b.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean b(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void c(Object obj) {
        try {
            this.h.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final Typeface a(Context context, b bVar, Resources resources, int i) {
        c[] cVarArr;
        if (!a()) {
            return super.a(context, bVar, resources, i);
        }
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        for (c cVar : bVar.a) {
            if (!a(context, b2, cVar.a, cVar.e, cVar.b, cVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                c(b2);
                return null;
            }
        }
        if (!b(b2)) {
            return null;
        }
        return a(b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r10 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface a(android.content.Context r10, android.os.CancellationSignal r11, defpackage.hc.b[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r9.a()
            if (r0 != 0) goto L_0x004c
            hc$b r12 = r9.a(r12, r13)
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r13 = r12.a     // Catch:{ IOException -> 0x004b }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r13, r0, r11)     // Catch:{ IOException -> 0x004b }
            if (r10 != 0) goto L_0x0023
            if (r10 == 0) goto L_0x0022
            r10.close()     // Catch:{ IOException -> 0x004b }
        L_0x0022:
            return r1
        L_0x0023:
            android.graphics.Typeface$Builder r11 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0042 }
            java.io.FileDescriptor r13 = r10.getFileDescriptor()     // Catch:{ all -> 0x0042 }
            r11.<init>(r13)     // Catch:{ all -> 0x0042 }
            int r13 = r12.c     // Catch:{ all -> 0x0042 }
            android.graphics.Typeface$Builder r11 = r11.setWeight(r13)     // Catch:{ all -> 0x0042 }
            boolean r12 = r12.d     // Catch:{ all -> 0x0042 }
            android.graphics.Typeface$Builder r11 = r11.setItalic(r12)     // Catch:{ all -> 0x0042 }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ all -> 0x0042 }
            if (r10 == 0) goto L_0x0041
            r10.close()     // Catch:{ IOException -> 0x004b }
        L_0x0041:
            return r11
        L_0x0042:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r11 = move-exception
            if (r10 == 0) goto L_0x004a
            r10.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r11     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r1
        L_0x004c:
            java.util.Map r10 = defpackage.hc.a(r10, r12, r11)
            java.lang.Object r11 = r9.b()
            if (r11 != 0) goto L_0x0057
            return r1
        L_0x0057:
            int r0 = r12.length
            r2 = 0
            r8 = 0
        L_0x005a:
            if (r8 >= r0) goto L_0x007e
            r3 = r12[r8]
            android.net.Uri r4 = r3.a
            java.lang.Object r4 = r10.get(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 == 0) goto L_0x007b
            int r5 = r3.b
            int r6 = r3.c
            boolean r7 = r3.d
            r2 = r9
            r3 = r11
            boolean r2 = r2.a(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x007a
            r9.c(r11)
            return r1
        L_0x007a:
            r2 = 1
        L_0x007b:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x007e:
            if (r2 != 0) goto L_0x0084
            r9.c(r11)
            return r1
        L_0x0084:
            boolean r10 = r9.b(r11)
            if (r10 != 0) goto L_0x008b
            return r1
        L_0x008b:
            android.graphics.Typeface r10 = r9.a(r11)
            if (r10 != 0) goto L_0x0092
            return r1
        L_0x0092:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.a(android.content.Context, android.os.CancellationSignal, hc$b[], int):android.graphics.Typeface");
    }

    public final Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!a()) {
            return super.a(context, resources, i, str, i2);
        }
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        if (!a(context, b2, str, 0, -1, -1, null)) {
            c(b2);
            return null;
        } else if (!b(b2)) {
            return null;
        } else {
            return a(b2);
        }
    }

    /* access modifiers changed from: protected */
    public Method a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
