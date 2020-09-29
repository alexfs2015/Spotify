package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: xp reason: default package */
public final class xp {
    /* access modifiers changed from: private */
    public static final Map<String, xv<xo>> a = new HashMap();

    private static String a(int i) {
        StringBuilder sb = new StringBuilder("rawRes_");
        sb.append(i);
        return sb.toString();
    }

    private static xr a(xo xoVar, String str) {
        for (xr xrVar : xoVar.c.values()) {
            if (xrVar.b.equals(str)) {
                return xrVar;
            }
        }
        return null;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.xu<defpackage.xo> a(android.util.JsonReader r26, java.lang.String r27) {
        /*
            r0 = r26
            float r1 = defpackage.ack.a()     // Catch:{ Exception -> 0x0161 }
            ds r2 = new ds     // Catch:{ Exception -> 0x0161 }
            r2.<init>()     // Catch:{ Exception -> 0x0161 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0161 }
            r3.<init>()     // Catch:{ Exception -> 0x0161 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x0161 }
            r4.<init>()     // Catch:{ Exception -> 0x0161 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0161 }
            r5.<init>()     // Catch:{ Exception -> 0x0161 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0161 }
            r6.<init>()     // Catch:{ Exception -> 0x0161 }
            dw r7 = new dw     // Catch:{ Exception -> 0x0161 }
            r7.<init>()     // Catch:{ Exception -> 0x0161 }
            xo r8 = new xo     // Catch:{ Exception -> 0x0161 }
            r8.<init>()     // Catch:{ Exception -> 0x0161 }
            r26.beginObject()     // Catch:{ Exception -> 0x0161 }
            r9 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0032:
            boolean r15 = r26.hasNext()     // Catch:{ Exception -> 0x0161 }
            if (r15 == 0) goto L_0x012a
            java.lang.String r15 = r26.nextName()     // Catch:{ Exception -> 0x0161 }
            r16 = -1
            int r17 = r15.hashCode()     // Catch:{ Exception -> 0x0161 }
            r18 = 2
            r19 = 1
            switch(r17) {
                case -1408207997: goto L_0x00a7;
                case -1109732030: goto L_0x009d;
                case 104: goto L_0x0093;
                case 118: goto L_0x0089;
                case 119: goto L_0x007f;
                case 3276: goto L_0x0075;
                case 3367: goto L_0x006b;
                case 3553: goto L_0x0061;
                case 94623709: goto L_0x0056;
                case 97615364: goto L_0x004b;
                default: goto L_0x0049;
            }     // Catch:{ Exception -> 0x0161 }
        L_0x0049:
            goto L_0x00b1
        L_0x004b:
            java.lang.String r10 = "fonts"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 8
            goto L_0x00b2
        L_0x0056:
            java.lang.String r10 = "chars"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 9
            goto L_0x00b2
        L_0x0061:
            java.lang.String r10 = "op"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 3
            goto L_0x00b2
        L_0x006b:
            java.lang.String r10 = "ip"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 2
            goto L_0x00b2
        L_0x0075:
            java.lang.String r10 = "fr"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 4
            goto L_0x00b2
        L_0x007f:
            java.lang.String r10 = "w"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 0
            goto L_0x00b2
        L_0x0089:
            java.lang.String r10 = "v"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 5
            goto L_0x00b2
        L_0x0093:
            java.lang.String r10 = "h"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 1
            goto L_0x00b2
        L_0x009d:
            java.lang.String r10 = "layers"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 6
            goto L_0x00b2
        L_0x00a7:
            java.lang.String r10 = "assets"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x0161 }
            if (r10 == 0) goto L_0x00b1
            r10 = 7
            goto L_0x00b2
        L_0x00b1:
            r10 = -1
        L_0x00b2:
            switch(r10) {
                case 0: goto L_0x0120;
                case 1: goto L_0x0119;
                case 2: goto L_0x0111;
                case 3: goto L_0x0104;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00bc;
                default: goto L_0x00b5;
            }     // Catch:{ Exception -> 0x0161 }
        L_0x00b5:
            r10 = r6
            r15 = r7
            r26.skipValue()     // Catch:{ Exception -> 0x0161 }
            goto L_0x0126
        L_0x00bc:
            defpackage.abq.a(r0, r8, r7)     // Catch:{ Exception -> 0x0161 }
            goto L_0x00cb
        L_0x00c0:
            defpackage.abq.a(r0, r6)     // Catch:{ Exception -> 0x0161 }
            goto L_0x00cb
        L_0x00c4:
            defpackage.abq.a(r0, r8, r4, r5)     // Catch:{ Exception -> 0x0161 }
            goto L_0x00cb
        L_0x00c8:
            defpackage.abq.a(r0, r8, r3, r2)     // Catch:{ Exception -> 0x0161 }
        L_0x00cb:
            r10 = r6
            r15 = r7
            goto L_0x0126
        L_0x00ce:
            java.lang.String r10 = r26.nextString()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r15 = "\\."
            java.lang.String[] r10 = r10.split(r15)     // Catch:{ Exception -> 0x0161 }
            r15 = 0
            r16 = r10[r15]     // Catch:{ Exception -> 0x0161 }
            int r20 = java.lang.Integer.parseInt(r16)     // Catch:{ Exception -> 0x0161 }
            r15 = r10[r19]     // Catch:{ Exception -> 0x0161 }
            int r21 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x0161 }
            r10 = r10[r18]     // Catch:{ Exception -> 0x0161 }
            int r22 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0161 }
            r23 = 4
            r24 = 4
            r25 = 0
            boolean r10 = defpackage.ack.a(r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0161 }
            if (r10 != 0) goto L_0x00cb
            java.lang.String r10 = "Lottie only supports bodymovin >= 4.4.0"
            r8.a(r10)     // Catch:{ Exception -> 0x0161 }
            goto L_0x00cb
        L_0x00fd:
            double r14 = r26.nextDouble()     // Catch:{ Exception -> 0x0161 }
            float r14 = (float) r14     // Catch:{ Exception -> 0x0161 }
            goto L_0x0032
        L_0x0104:
            r10 = r6
            r15 = r7
            double r6 = r26.nextDouble()     // Catch:{ Exception -> 0x0161 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0161 }
            r7 = 1008981770(0x3c23d70a, float:0.01)
            float r13 = r6 - r7
            goto L_0x0126
        L_0x0111:
            r10 = r6
            r15 = r7
            double r6 = r26.nextDouble()     // Catch:{ Exception -> 0x0161 }
            float r12 = (float) r6     // Catch:{ Exception -> 0x0161 }
            goto L_0x0126
        L_0x0119:
            r10 = r6
            r15 = r7
            int r11 = r26.nextInt()     // Catch:{ Exception -> 0x0161 }
            goto L_0x0126
        L_0x0120:
            r10 = r6
            r15 = r7
            int r9 = r26.nextInt()     // Catch:{ Exception -> 0x0161 }
        L_0x0126:
            r6 = r10
            r7 = r15
            goto L_0x0032
        L_0x012a:
            r10 = r6
            r15 = r7
            r26.endObject()     // Catch:{ Exception -> 0x0161 }
            float r0 = (float) r9     // Catch:{ Exception -> 0x0161 }
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ Exception -> 0x0161 }
            float r6 = (float) r11     // Catch:{ Exception -> 0x0161 }
            float r6 = r6 * r1
            int r1 = (int) r6     // Catch:{ Exception -> 0x0161 }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ Exception -> 0x0161 }
            r7 = 0
            r6.<init>(r7, r7, r0, r1)     // Catch:{ Exception -> 0x0161 }
            r8.h = r6     // Catch:{ Exception -> 0x0161 }
            r8.i = r12     // Catch:{ Exception -> 0x0161 }
            r8.j = r13     // Catch:{ Exception -> 0x0161 }
            r8.k = r14     // Catch:{ Exception -> 0x0161 }
            r8.g = r3     // Catch:{ Exception -> 0x0161 }
            r8.f = r2     // Catch:{ Exception -> 0x0161 }
            r8.b = r4     // Catch:{ Exception -> 0x0161 }
            r8.c = r5     // Catch:{ Exception -> 0x0161 }
            r0 = r15
            r8.e = r0     // Catch:{ Exception -> 0x0161 }
            r8.d = r10     // Catch:{ Exception -> 0x0161 }
            zp r0 = defpackage.zp.a()     // Catch:{ Exception -> 0x0161 }
            r1 = r27
            r0.a(r1, r8)     // Catch:{ Exception -> 0x0161 }
            xu r0 = new xu     // Catch:{ Exception -> 0x0161 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0161 }
            return r0
        L_0x0161:
            r0 = move-exception
            xu r1 = new xu
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp.a(android.util.JsonReader, java.lang.String):xu");
    }

    public static xu<xo> a(InputStream inputStream, String str) {
        return a(inputStream, str, true);
    }

    private static xu<xo> a(InputStream inputStream, String str, boolean z) {
        try {
            return a(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                ack.a((Closeable) inputStream);
            }
        }
    }

    public static xu<xo> a(ZipInputStream zipInputStream, String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            ack.a((Closeable) zipInputStream);
        }
    }

    public static xv<xo> a(Context context, final int i) {
        final Context applicationContext = context.getApplicationContext();
        return a(a(i), (Callable<xu<xo>>) new Callable<xu<xo>>() {
            public final /* synthetic */ Object call() {
                return xp.b(applicationContext, i);
            }
        });
    }

    public static xv<xo> a(Context context, String str) {
        return new xv<>(new Callable<xu<xo>>() {
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                    r4 = this;
                    aay r0 = defpackage.aay.this
                    aax r1 = r0.b
                    ho r1 = r1.a()
                    if (r1 == 0) goto L_0x0031
                    F r2 = r1.a
                    com.airbnb.lottie.network.FileExtension r2 = (com.airbnb.lottie.network.FileExtension) r2
                    S r1 = r1.b
                    java.io.InputStream r1 = (java.io.InputStream) r1
                    com.airbnb.lottie.network.FileExtension r3 = com.airbnb.lottie.network.FileExtension.Zip
                    if (r2 != r3) goto L_0x0022
                    java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
                    r2.<init>(r1)
                    java.lang.String r1 = r0.a
                    xu r1 = defpackage.xp.a(r2, r1)
                    goto L_0x0028
                L_0x0022:
                    java.lang.String r2 = r0.a
                    xu r1 = defpackage.xp.a(r1, r2)
                L_0x0028:
                    V r2 = r1.a
                    if (r2 == 0) goto L_0x0031
                    V r1 = r1.a
                    xo r1 = (defpackage.xo) r1
                    goto L_0x0032
                L_0x0031:
                    r1 = 0
                L_0x0032:
                    if (r1 == 0) goto L_0x003a
                    xu r0 = new xu
                    r0.<init>(r1)
                    return r0
                L_0x003a:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Animation for "
                    r1.<init>(r2)
                    java.lang.String r2 = r0.a
                    r1.append(r2)
                    java.lang.String r2 = " not found in cache. Fetching from network."
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    defpackage.xn.a(r1)
                    xu r0 = r0.a()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aay.AnonymousClass1.call():java.lang.Object");
            }
        });
    }

    private static xv<xo> a(final String str, Callable<xu<xo>> callable) {
        final xo a2 = zp.a().a(str);
        if (a2 != null) {
            return new xv<>(new Callable<xu<xo>>() {
                public final /* synthetic */ Object call() {
                    return new xu(a2);
                }
            });
        }
        if (a.containsKey(str)) {
            return (xv) a.get(str);
        }
        xv<xo> xvVar = new xv<>(callable);
        xvVar.a((xs<T>) new xs<xo>() {
            public final /* synthetic */ void a(Object obj) {
                xo xoVar = (xo) obj;
                if (str != null) {
                    zp.a().a(str, xoVar);
                }
                xp.a.remove(str);
            }
        });
        xvVar.c((xs<Throwable>) new xs<Throwable>() {
            public final /* synthetic */ void a(Object obj) {
                xp.a.remove(str);
            }
        });
        a.put(str, xvVar);
        return xvVar;
    }

    public static xu<xo> b(Context context, int i) {
        try {
            return a(context.getResources().openRawResource(i), a(i), true);
        } catch (NotFoundException e) {
            return new xu<>((Throwable) e);
        }
    }

    private static xu<xo> b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            xo xoVar = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        xoVar = (xo) a(zipInputStream, str, false).a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (xoVar == null) {
                return new xu<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                xr a2 = a(xoVar, (String) entry.getKey());
                if (a2 != null) {
                    a2.c = (Bitmap) entry.getValue();
                }
            }
            for (Entry entry2 : xoVar.c.entrySet()) {
                if (((xr) entry2.getValue()).c == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(((xr) entry2.getValue()).b);
                    return new xu<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            zp.a().a(str, xoVar);
            return new xu<>(xoVar);
        } catch (IOException e) {
            return new xu<>((Throwable) e);
        }
    }

    public static xv<xo> b(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return a(str, (Callable<xu<xo>>) new Callable<xu<xo>>() {
            public final /* synthetic */ Object call() {
                return xp.c(applicationContext, str);
            }
        });
    }

    public static xu<xo> c(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder("asset_");
            sb.append(str);
            String sb2 = sb.toString();
            return str.endsWith(".zip") ? a(new ZipInputStream(context.getAssets().open(str)), sb2) : a(context.getAssets().open(str), sb2, true);
        } catch (IOException e) {
            return new xu<>((Throwable) e);
        }
    }
}
