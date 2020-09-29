package defpackage;

import android.animation.ObjectAnimator;
import android.widget.ScrollView;

/* renamed from: sth reason: default package */
public final class sth implements stk {
    public final void a(ScrollView scrollView, int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(scrollView, "scrollY", new int[]{i});
        ofInt.setDuration(500);
        ofInt.setInterpolator(ftn.d);
        ofInt.start();
    }
}
