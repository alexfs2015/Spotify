package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

/* renamed from: cet reason: default package */
final class cet implements OnScrollChangedListener {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ cem b;

    cet(cem cem, WeakReference weakReference) {
        this.b = cem;
        this.a = weakReference;
    }

    public final void onScrollChanged() {
        cem.a(this.b, this.a, true);
    }
}
