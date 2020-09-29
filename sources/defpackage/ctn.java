package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: ctn reason: default package */
final class ctn implements OnAttachStateChangeListener {
    private final /* synthetic */ clb a;
    private final /* synthetic */ ctj b;

    ctn(ctj ctj, clb clb) {
        this.b = ctj;
        this.a = clb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.a(view, this.a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
