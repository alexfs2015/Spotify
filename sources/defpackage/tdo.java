package defpackage;

import android.animation.ObjectAnimator;
import android.widget.ScrollView;

/* renamed from: tdo reason: default package */
public final class tdo implements tdr {
    public final void a(ScrollView scrollView, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(scrollView, "scrollY", new int[]{i});
        ofInt.setDuration(500);
        ofInt.setInterpolator(fuh.d);
        ofInt.start();
    }
}