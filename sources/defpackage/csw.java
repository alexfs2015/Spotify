package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: csw reason: default package */
final class csw implements OnAttachStateChangeListener {
    private final /* synthetic */ ckk a;
    private final /* synthetic */ css b;

    csw(css css, ckk ckk) {
        this.b = css;
        this.a = ckk;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.a(view, this.a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
