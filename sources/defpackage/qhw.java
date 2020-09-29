package defpackage;

import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: qhw reason: default package */
public final class qhw implements qie {
    private final sgb a;
    private final rmf b;
    private final sso c;
    private View d;
    private ViewLoadingTracker e;

    public qhw(final a aVar, sgb sgb, rmf rmf, sso sso) {
        this.a = sgb;
        this.b = rmf;
        this.c = sso;
        aVar.a(new c() {
            public final void a() {
                qhw.this.b();
            }

            public final void aN_() {
                aVar.b(this);
            }
        });
    }

    public final void a() {
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.e();
        }
        this.e = this.a.a(this.d, this.c.toString(), null, this.b);
    }

    public final void a(View view) {
        this.d = view;
        ViewLoadingTracker viewLoadingTracker = this.e;
        if (viewLoadingTracker != null && !viewLoadingTracker.g()) {
            Assertion.b("Should not be called after the tracker is created");
        }
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
