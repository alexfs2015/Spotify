package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: pyy reason: default package */
public final class pyy implements pzg {
    private final rwr a;
    private final rdh b;
    private final sih c;
    private View d;
    private ViewLoadingTracker e;

    public pyy(final a aVar, rwr rwr, rdh rdh, sih sih) {
        this.a = rwr;
        this.b = rdh;
        this.c = sih;
        aVar.a(new c() {
            public final void aP_() {
                aVar.b(this);
            }

            public final void a() {
                pyy.this.b();
            }
        });
    }

    public final void a(View view) {
        this.d = view;
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null && !viewLoadingTracker.g()) {
            Assertion.b("Should not be called after the tracker is created");
        }
    }

    public final void a() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.e();
        }
        this.e = this.a.a(this.d, this.c.toString(), null, this.b);
    }

    public final void b() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.e();
        }
    }

    public final void c() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null && !viewLoadingTracker.g()) {
            this.e.b();
        }
    }

    public final void d() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.d();
        }
    }

    public final void e() {
        this.e = null;
    }
}
