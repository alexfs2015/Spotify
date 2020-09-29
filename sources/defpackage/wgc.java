package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: wgc reason: default package */
public final class wgc implements OnPreDrawListener {
    private wgr a;
    private WeakReference<ImageView> b;
    private wfz c;

    wgc(wgr wgr, ImageView imageView, wfz wfz) {
        this.a = wgr;
        this.b = new WeakReference<>(imageView);
        this.c = wfz;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void a() {
        this.c = null;
        ImageView imageView = (ImageView) this.b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = (ImageView) this.b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.a.c().b(width, height).a(imageView, this.c);
        }
        return true;
    }
}
