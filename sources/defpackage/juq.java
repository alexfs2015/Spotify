package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: juq reason: default package */
public abstract class juq implements OnPreDrawListener {
    public static <V extends View> void a(V v, gcp<V> gcp) {
        final View view = (View) fbp.a(v);
        final gcp gcp2 = (gcp) fbp.a(gcp);
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(true) {
            public final boolean onPreDraw() {
                gcp2.accept(view);
                if (true) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
    }
}
