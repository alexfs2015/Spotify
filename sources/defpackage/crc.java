package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

@cfp
/* renamed from: crc reason: default package */
final class crc extends cre implements OnGlobalLayoutListener {
    private final WeakReference<OnGlobalLayoutListener> a;

    public crc(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.a = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void b(ViewTreeObserver viewTreeObserver) {
        bkc.g().a(viewTreeObserver, (OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.a.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
