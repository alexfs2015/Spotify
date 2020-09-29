package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: re reason: default package */
public final class re {
    public static final Property<View, Float> a = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(re.b((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            re.a((View) obj, ((Float) obj2).floatValue());
        }
    };
    public static final Property<View, Rect> b = new Property<View, Rect>(Rect.class, "clipBounds") {
        public final /* synthetic */ Object get(Object obj) {
            return ip.D((View) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ip.a((View) obj, (Rect) obj2);
        }
    };
    private static final ri c;
    private static Field d;
    private static boolean e;

    static {
        if (VERSION.SDK_INT >= 22) {
            c = new rh();
        } else if (VERSION.SDK_INT >= 21) {
            c = new rg();
        } else if (VERSION.SDK_INT >= 19) {
            c = new rf();
        } else {
            c = new ri();
        }
    }

    public static rm a(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new rl(view);
        }
        return new rk(view.getWindowToken());
    }

    public static void a(View view, float f) {
        c.a(view, f);
    }

    public static float b(View view) {
        return c.a(view);
    }

    public static void c(View view) {
        c.b(view);
    }

    public static void d(View view) {
        c.c(view);
    }

    public static void a(View view, Matrix matrix) {
        c.a(view, matrix);
    }

    public static void b(View view, Matrix matrix) {
        c.b(view, matrix);
    }

    public static void c(View view, Matrix matrix) {
        c.c(view, matrix);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        c.a(view, i, i2, i3, i4);
    }

    public static void a(View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
