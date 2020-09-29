package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* renamed from: qb reason: default package */
public final class qb extends rj {
    private float a = 3.0f;

    public final long a(ViewGroup viewGroup, Transition transition, qu quVar, qu quVar2) {
        int i;
        int i2;
        int i3;
        if (quVar == null && quVar2 == null) {
            return 0;
        }
        if (quVar2 == null || b(quVar) == 0) {
            i = -1;
        } else {
            quVar = quVar2;
            i = 1;
        }
        int a2 = rj.a(quVar, 0);
        int a3 = rj.a(quVar, 1);
        Rect e = transition.e();
        if (e != null) {
            i3 = e.centerX();
            i2 = e.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float a4 = a((float) a2, (float) a3, (float) i3, (float) i2) / a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long j = transition.c;
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / this.a) * a4);
    }

    private static float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
