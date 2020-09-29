package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

/* renamed from: ces reason: default package */
final class ces implements OnGlobalLayoutListener {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ cem b;

    ces(cem cem, WeakReference weakReference) {
        this.b = cem;
        this.a = weakReference;
    }

    public final void onGlobalLayout() {
        cem.a(this.b, this.a, false);
    }
}
