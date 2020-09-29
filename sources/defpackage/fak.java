package defpackage;

import android.graphics.PorterDuff.Mode;
import android.view.View;

/* renamed from: fak reason: default package */
public final class fak {
    public static Mode a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean a(View view) {
        return ip.f(view) == 1;
    }
}
