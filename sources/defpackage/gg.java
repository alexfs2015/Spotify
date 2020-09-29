package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: gg reason: default package */
class gg extends gk {
    private static Class a;
    private static Constructor b;
    private static Method d;
    private static Method e;
    private static boolean f;

    gg() {
    }

    private static Typeface a(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void a() {
        Method method;
        Class cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            b = constructor;
            a = cls;
            d = method;
            e = method2;
        }
    }

    private static boolean a(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object b() {
        a();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r3, android.os.CancellationSignal r4, defpackage.hc.b[] r5, int r6) {
        /*
            r2 = this;
            int r0 = r5.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            hc$b r5 = r2.a(r5, r6)
            android.content.ContentResolver r6 = r3.getContentResolver()
            android.net.Uri r5 = r5.a     // Catch:{ IOException -> 0x005a }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r4 = r6.openFileDescriptor(r5, r0, r4)     // Catch:{ IOException -> 0x005a }
            if (r4 != 0) goto L_0x001d
            if (r4 == 0) goto L_0x001c
            r4.close()     // Catch:{ IOException -> 0x005a }
        L_0x001c:
            return r1
        L_0x001d:
            java.io.File r5 = a(r4)     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0034
            boolean r6 = r5.canRead()     // Catch:{ all -> 0x0051 }
            if (r6 != 0) goto L_0x002a
            goto L_0x0034
        L_0x002a:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0033
            r4.close()     // Catch:{ IOException -> 0x005a }
        L_0x0033:
            return r3
        L_0x0034:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0051 }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ all -> 0x0051 }
            r5.<init>(r6)     // Catch:{ all -> 0x0051 }
            android.graphics.Typeface r3 = defpackage.gk.a(r3, r5)     // Catch:{ all -> 0x004a }
            r5.close()     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0049
            r4.close()     // Catch:{ IOException -> 0x005a }
        L_0x0049:
            return r3
        L_0x004a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004c }
        L_0x004c:
            r3 = move-exception
            r5.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r3 = move-exception
            if (r4 == 0) goto L_0x0059
            r4.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r3     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg.a(android.content.Context, android.os.CancellationSignal, hc$b[], int):android.graphics.Typeface");
    }

    public Typeface a(Context context, b bVar, Resources resources, int i) {
        Object b2 = b();
        c[] cVarArr = bVar.a;
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            c cVar = cVarArr[i2];
            File a2 = gl.a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!gl.a(a2, resources, cVar.f)) {
                    a2.delete();
                    return null;
                } else if (!a(b2, a2.getPath(), cVar.b, cVar.c)) {
                    return null;
                } else {
                    a2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return a(b2);
    }
}
