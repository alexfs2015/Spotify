package defpackage;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: iw reason: default package */
public final class iw {
    public final Object a;

    private iw(Object obj) {
        this.a = obj;
    }

    public final int a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final boolean e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.a).isConsumed();
        }
        return false;
    }

    public final iw f() {
        if (VERSION.SDK_INT >= 20) {
            return new iw(((WindowInsets) this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public final iw a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new iw(((WindowInsets) this.a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iw iwVar = (iw) obj;
        Object obj2 = this.a;
        Object obj3 = iwVar.a;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    static iw a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new iw(obj);
    }

    static Object a(iw iwVar) {
        if (iwVar == null) {
            return null;
        }
        return iwVar.a;
    }
}
