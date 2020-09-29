package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* renamed from: qg reason: default package */
public final class qg extends ro {
    private float a = 3.0f;

    private static float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public final long a(ViewGroup viewGroup, Transition transition, qz qzVar, qz qzVar2) {
        int i;
        int i2;
        int i3;
        if (qzVar == null && qzVar2 == null) {
            return 0;
        }
        if (qzVar2 == null || b(qzVar) == 0) {
            i = -1;
        } else {
            qzVar = qzVar2;
            i = 1;
        }
        int a2 = ro.a(qzVar, 0);
        int a3 = ro.a(qzVar, 1);
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
}
