package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: im reason: default package */
public final class im implements OnAttachStateChangeListener, OnPreDrawListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private im(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static im a(View view, Runnable runnable) {
        if (view != null) {
            im imVar = new im(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(imVar);
            view.addOnAttachStateChangeListener(imVar);
            return imVar;
        }
        throw new NullPointerException("view == null");
    }

    private void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        a();
        this.c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
