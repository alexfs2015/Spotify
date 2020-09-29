package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: sgc reason: default package */
public abstract class sgc<T> implements c<T, T> {
    protected DataSource a = DataSource.UNKNOWN;
    public Reason b = Reason.UNKNOWN;
    /* access modifiers changed from: private */
    public final sgb c;
    /* access modifiers changed from: private */
    public final rmf d;
    /* access modifiers changed from: private */
    public View e;
    /* access modifiers changed from: private */
    public ViewLoadingTracker f;

    protected sgc(final a aVar, sgb sgb, final sso sso, rmf rmf) {
        this.c = sgb;
        this.d = rmf;
        aVar.a(new c() {
            public final void a() {
                ViewLoadingTracker a2 = sgc.this.f;
                if (a2 != null) {
                    a2.e();
                }
            }

            public final void a(Bundle bundle) {
                ViewLoadingTracker a2 = sgc.this.f;
                if (a2 != null) {
                    a2.a(bundle);
                }
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
                if (sgc.this.f == null) {
                    sgc sgc = sgc.this;
                    sgc.f = sgc.c.a(sgc.this.e, sso.toString(), bundle, sgc.this.d, sgc.this.b);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        b();
    }

    /* access modifiers changed from: private */
    public void b(T t) {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null && !viewLoadingTracker.g() && a(t)) {
            viewLoadingTracker.a(this.a);
        }
    }

    /* renamed from: a */
    public xii<T> call(xii<T> xii) {
        return xii.b((xis<? super T>) new $$Lambda$sgc$pQhArAdEEOGpaEpEzPtPmEuY1cw<Object>(this)).a((xis<? super Throwable>) new $$Lambda$sgc$t6A_WW3xRqS9OTbfvSRzbe8qBb8<Object>(this));
    }

    public final void a(View view) {
        this.e = view;
        Assertion.c(view == null || this.f == null, "%s", "Should not be called after the tracker is created");
    }

    public final boolean a() {
        return this.f != null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(T t);

    /* access modifiers changed from: protected */
    public final void b() {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.d();
        }
    }
}
