package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: srp reason: default package */
public final class srp {
    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float b = b(view);
        float c = c(view);
        int round = Math.round((((float) view.getMeasuredWidth()) * (1.0f - b)) / 2.0f);
        int round2 = Math.round((((float) view.getMeasuredHeight()) * (1.0f - c)) / 2.0f);
        return new Rect(iArr[0] - round, iArr[1] - round2, (iArr[0] + view.getMeasuredWidth()) - round, (iArr[1] + view.getMeasuredHeight()) - round2);
    }

    public static void a(Fragment fragment) {
        Bundle bundle = fragment.i;
        if (bundle != null) {
            bundle.putParcelable("EXTRA_TRANSITION_PARAMS", null);
        }
    }

    public static void a(Fragment fragment, srq srq) {
        Bundle bundle = fragment.i;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.g(bundle);
        }
        bundle.putParcelable("EXTRA_TRANSITION_PARAMS", srq);
    }

    private static float b(View view) {
        float scaleX = view.getScaleX();
        for (View view2 = (View) view.getParent(); view2.getParent() instanceof View; view2 = (View) view2.getParent()) {
            scaleX *= view2.getScaleX();
        }
        return scaleX;
    }

    private static float c(View view) {
        float scaleY = view.getScaleY();
        for (View view2 = (View) view.getParent(); view2.getParent() instanceof View; view2 = (View) view2.getParent()) {
            scaleY *= view2.getScaleY();
        }
        return scaleY;
    }
}
