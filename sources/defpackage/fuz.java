package defpackage;

import android.view.View;
import android.widget.Scroller;
import java.lang.ref.WeakReference;

/* renamed from: fuz reason: default package */
public final class fuz {
    public Runnable a;
    public Scroller b;
    public WeakReference<View> c;

    /* renamed from: fuz$a */
    public final class a implements Runnable {
        private final int a;
        private final int b;
        private final View c;
        private final b d;

        public a(View view, int i, int i2, b bVar) {
            this.c = view;
            this.a = i;
            this.b = i2;
            this.d = bVar;
        }

        public final void run() {
            int i;
            if (!(this.c == null || fuz.this.b == null || !fuz.this.b.computeScrollOffset())) {
                int currY = fuz.this.b.getCurrY();
                int i2 = this.b;
                boolean z = true;
                if (currY >= i2) {
                    i = -1;
                } else {
                    int currY2 = fuz.this.b.getCurrY();
                    i2 = this.a;
                    if (currY2 <= i2) {
                        i = 1;
                    } else {
                        i2 = fuz.this.b.getCurrY();
                        i = 1;
                        z = false;
                    }
                }
                this.d.a(i2);
                if (!z) {
                    ip.a(this.c, (Runnable) this);
                    return;
                }
                this.d.b((int) (Math.abs(fuz.this.b.getCurrVelocity()) * ((float) i)));
                fuz.this.b.abortAnimation();
            }
        }
    }

    /* renamed from: fuz$b */
    public interface b {
        void a(int i);

        void b(int i);
    }

    public final void a() {
        Scroller scroller = this.b;
        if (scroller != null) {
            scroller.forceFinished(true);
        }
        if (this.a != null) {
            WeakReference<View> weakReference = this.c;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    view.removeCallbacks(this.a);
                }
            }
        }
    }
}
