package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: cui reason: default package */
final class cui implements OnAttachStateChangeListener {
    private final /* synthetic */ ckk a;
    private final /* synthetic */ cuf b;

    cui(cuf cuf, ckk ckk) {
        this.b = cuf;
        this.a = ckk;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.a(view, this.a, 10);
    }
}
