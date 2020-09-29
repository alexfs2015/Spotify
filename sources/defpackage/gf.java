package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;

/* renamed from: gf reason: default package */
public final class gf {
    private static final gk a;
    private static final dt<String, Typeface> b = new dt<>(16);

    static {
        if (VERSION.SDK_INT >= 28) {
            a = new gj();
        } else if (VERSION.SDK_INT >= 26) {
            a = new gi();
        } else if (VERSION.SDK_INT >= 24 && gh.a()) {
            a = new gh();
        } else if (VERSION.SDK_INT >= 21) {
            a = new gg();
        } else {
            a = new gk();
        }
    }

    public static Typeface a(Resources resources, int i, int i2) {
        return (Typeface) b.a(b(resources, i, i2));
    }

    private static String b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static Typeface a(Context context, a aVar, Resources resources, int i, int i2, a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        int i3;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.c == 0) {
                z2 = true;
            }
            if (z) {
                i3 = dVar.b;
            } else {
                i3 = -1;
            }
            typeface = hc.a(context, dVar.a, aVar2, handler, z2, i3, i2);
        } else {
            typeface = a.a(context, (b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.a(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.a(b(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr, int i) {
        return a.a(context, (CancellationSignal) null, bVarArr, i);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        b bVar;
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                gk gkVar = a;
                long a2 = gk.a(typeface);
                Typeface typeface2 = null;
                if (a2 == 0) {
                    bVar = null;
                } else {
                    bVar = (b) gkVar.c.get(Long.valueOf(a2));
                }
                if (bVar != null) {
                    typeface2 = a.a(context, bVar, context.getResources(), i);
                }
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
