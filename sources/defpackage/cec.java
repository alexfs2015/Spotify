package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: cec reason: default package */
final class cec implements OnScrollChangedListener {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ cdv b;

    cec(cdv cdv, WeakReference weakReference) {
        this.b = cdv;
        this.a = weakReference;
    }

    public final void onScrollChanged() {
        cdv.a(this.b, this.a, true);
    }
}
