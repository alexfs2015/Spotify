package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: cuz reason: default package */
final class cuz implements OnAttachStateChangeListener {
    private final /* synthetic */ clb a;
    private final /* synthetic */ cuw b;

    cuz(cuw cuw, clb clb) {
        this.b = cuw;
        this.a = clb;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.a(view, this.a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
