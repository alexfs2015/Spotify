package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: ceb reason: default package */
final class ceb implements OnGlobalLayoutListener {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ cdv b;

    ceb(cdv cdv, WeakReference weakReference) {
        this.b = cdv;
        this.a = weakReference;
    }

    public final void onGlobalLayout() {
        cdv.a(this.b, this.a, false);
    }
}
