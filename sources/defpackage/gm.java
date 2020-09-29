package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: gm reason: default package */
public final class gm {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    public static void a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
            return;
        }
        if (drawable instanceof gn) {
            ((gn) drawable).setTint(i);
        }
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
            return;
        }
        if (drawable instanceof gn) {
            ((gn) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static void a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static void a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
            return;
        }
        if (drawable instanceof gn) {
            ((gn) drawable).setTintMode(mode);
        }
    }

    public static void a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean a(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static int b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static boolean b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT >= 17) {
            if (!b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                b = true;
            }
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused2) {
                    a = null;
                }
            }
        }
        return false;
    }

    public static boolean c(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static ColorFilter d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static void e(Drawable drawable) {
        if (VERSION.SDK_INT >= 23 || VERSION.SDK_INT < 21) {
            drawable.clearColorFilter();
        } else {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                e(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof go) {
                e(((go) drawable).a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            e(child);
                        }
                    }
                }
            }
        }
    }

    public static Drawable f(Drawable drawable) {
        return VERSION.SDK_INT >= 23 ? drawable : VERSION.SDK_INT >= 21 ? !(drawable instanceof gn) ? new gq(drawable) : drawable : !(drawable instanceof gn) ? new gp(drawable) : drawable;
    }

    public static <T extends Drawable> T g(Drawable drawable) {
        return drawable instanceof go ? ((go) drawable).a() : drawable;
    }

    public static int h(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT >= 17) {
            if (!d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                d = true;
            }
            Method method = c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    c = null;
                }
            }
        }
        return 0;
    }
}
