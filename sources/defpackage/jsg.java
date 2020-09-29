package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: jsg reason: default package */
public abstract class jsg implements OnPreDrawListener {
    public static <V extends View> void a(V v, gbr<V> gbr) {
        final View view = (View) fay.a(v);
        final gbr gbr2 = (gbr) fay.a(gbr);
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(true) {
            public final boolean onPreDraw() {
                gbr2.accept(view);
                if (true) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
    }
}
