package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.spotify.music.R;
import java.util.HashMap;

@Deprecated
/* renamed from: vfn reason: default package */
public final class vfn {
    private static final HashMap<String, Typeface> a = new HashMap<>();
    private static final int[] b = {16842804, R.attr.fontAsset};

    @Deprecated
    public static synchronized Typeface a(Context context, int i) {
        Typeface a2;
        synchronized (vfn.class) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a.q);
            String string = obtainStyledAttributes.getString(a.r);
            obtainStyledAttributes.recycle();
            a2 = a(context, string);
        }
        return a2;
    }

    @Deprecated
    public static synchronized Typeface a(Context context, AttributeSet attributeSet, int i) {
        Typeface a2;
        synchronized (vfn.class) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            String str = null;
            if (resourceId >= 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, a.q);
                str = obtainStyledAttributes2.getString(a.r);
                obtainStyledAttributes2.recycle();
            }
            String string = obtainStyledAttributes.getString(1);
            if (string == null) {
                string = str;
            }
            obtainStyledAttributes.recycle();
            a2 = a(context, string);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.graphics.Typeface a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<vfn> r0 = defpackage.vfn.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            boolean r2 = defpackage.vgc.a(r5)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0010
            monitor-exit(r0)
            return r1
        L_0x0010:
            java.util.HashMap<java.lang.String, android.graphics.Typeface> r2 = a     // Catch:{ all -> 0x0043 }
            boolean r2 = r2.containsKey(r6)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.String, android.graphics.Typeface> r5 = a     // Catch:{ all -> 0x0043 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0043 }
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x0021:
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x0043 }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ all -> 0x0043 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r5, r6)     // Catch:{ Exception -> 0x002f }
        L_0x002d:
            r5 = r1
            goto L_0x003c
        L_0x002f:
            r5 = move-exception
            java.lang.String r2 = "Failed to load font asset: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0043 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0043 }
            com.spotify.base.java.logging.Logger.e(r5, r2, r3)     // Catch:{ all -> 0x0043 }
            goto L_0x002d
        L_0x003c:
            java.util.HashMap<java.lang.String, android.graphics.Typeface> r1 = a     // Catch:{ all -> 0x0043 }
            r1.put(r6, r5)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)
            return r5
        L_0x0043:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x0047
        L_0x0046:
            throw r5
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfn.a(android.content.Context, java.lang.String):android.graphics.Typeface");
    }

    public static synchronized Typeface b(Context context, int i) {
        Typeface a2;
        synchronized (vfn.class) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            a2 = a(context, resourceId);
        }
        return a2;
    }

    @Deprecated
    public static synchronized Typeface c(Context context, int i) {
        Typeface a2;
        synchronized (vfn.class) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue, true);
            a2 = a(context, (String) typedValue.string);
        }
        return a2;
    }
}
