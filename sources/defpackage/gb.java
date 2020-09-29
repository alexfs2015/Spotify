package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: gb reason: default package */
public final class gb {

    /* renamed from: gb$a */
    public static abstract class a {
        public abstract void a(int i);

        public final void a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    a.this.a(i);
                }
            });
        }

        public abstract void a(Typeface typeface);

        public final void a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    a.this.a(typeface);
                }
            });
        }
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a2 != null || aVar != null) {
            return a2;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, defpackage.gb.a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00a3
            java.lang.CharSequence r1 = r1.string
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0028
            if (r9 == 0) goto L_0x0027
            r9.a(r14, r10)
        L_0x0027:
            return r13
        L_0x0028:
            android.graphics.Typeface r1 = defpackage.gf.a(r0, r4, r5)
            if (r1 == 0) goto L_0x0034
            if (r9 == 0) goto L_0x0033
            r9.a(r1, r10)
        L_0x0033:
            return r1
        L_0x0034:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x0067
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            fy$a r2 = defpackage.fy.a(r1, r0)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            if (r2 != 0) goto L_0x0055
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            if (r9 == 0) goto L_0x0054
            r9.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
        L_0x0054:
            return r13
        L_0x0055:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = defpackage.gf.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            return r0
        L_0x0067:
            r1 = r15
            android.graphics.Typeface r0 = defpackage.gf.a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            if (r9 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0074
            r9.a(r0, r10)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
            goto L_0x0077
        L_0x0074:
            r9.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0078 }
        L_0x0077:
            return r0
        L_0x0078:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read xml resource "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x009d
        L_0x008b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse xml resource "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x009d:
            if (r9 == 0) goto L_0x00a2
            r9.a(r14, r10)
        L_0x00a2:
            return r13
        L_0x00a3:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r3.<init>(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, gb$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Drawable a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static int b(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }
}
