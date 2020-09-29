package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final Mode h = Mode.SRC_IN;
    public int a = -1;
    public Object b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public Mode i = h;
    public String j = null;

    public static IconCompat a(Context context, int i2) {
        if (context != null) {
            return a(context.getResources(), context.getPackageName(), i2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    private static IconCompat a(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i2);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public static IconCompat a(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public IconCompat() {
    }

    private IconCompat(int i2) {
        this.a = i2;
    }

    public final String a() {
        if (this.a == -1 && VERSION.SDK_INT >= 23) {
            return a((Icon) this.b);
        }
        if (this.a == 2) {
            return ((String) this.b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public static Resources a(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r2 != 5) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r8.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r8.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == r7) goto L_0x0033
            if (r2 == r6) goto L_0x0030
            if (r2 == r5) goto L_0x002d
            if (r2 == r4) goto L_0x002a
            if (r2 == r3) goto L_0x0027
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0035
        L_0x0027:
            java.lang.String r2 = "BITMAP_MASKABLE"
            goto L_0x0035
        L_0x002a:
            java.lang.String r2 = "URI"
            goto L_0x0035
        L_0x002d:
            java.lang.String r2 = "DATA"
            goto L_0x0035
        L_0x0030:
            java.lang.String r2 = "RESOURCE"
            goto L_0x0035
        L_0x0033:
            java.lang.String r2 = "BITMAP"
        L_0x0035:
            r0.append(r2)
            int r2 = r8.a
            if (r2 == r7) goto L_0x00bc
            if (r2 == r6) goto L_0x006b
            if (r2 == r5) goto L_0x0052
            if (r2 == r4) goto L_0x0046
            if (r2 == r3) goto L_0x00bc
            goto L_0x00dc
        L_0x0046:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r8.b
            r0.append(r1)
            goto L_0x00dc
        L_0x0052:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r8.e
            r0.append(r1)
            int r1 = r8.f
            if (r1 == 0) goto L_0x00dc
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r8.f
            r0.append(r1)
            goto L_0x00dc
        L_0x006b:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r8.a()
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            int r4 = r8.a
            if (r4 != r1) goto L_0x0092
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r1 < r4) goto L_0x0092
            java.lang.Object r1 = r8.b
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            int r1 = b(r1)
            goto L_0x0098
        L_0x0092:
            int r1 = r8.a
            if (r1 != r6) goto L_0x00a8
            int r1 = r8.e
        L_0x0098:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            goto L_0x00dc
        L_0x00a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r8.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r8.b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x00dc:
            android.content.res.ColorStateList r1 = r8.g
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r8.g
            r0.append(r1)
        L_0x00ea:
            android.graphics.PorterDuff$Mode r1 = r8.i
            android.graphics.PorterDuff$Mode r2 = h
            if (r1 == r2) goto L_0x00fa
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r8.i
            r0.append(r1)
        L_0x00fa:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    private static String a(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(str2, str, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e(str2, str, e4);
            return null;
        }
    }

    private static int b(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e(str2, str, e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e(str2, str, e4);
            return 0;
        }
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
