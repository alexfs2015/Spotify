package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: rws reason: default package */
public abstract class rws<T> implements c<T, T> {
    protected DataSource a = DataSource.UNKNOWN;
    public Reason b = Reason.UNKNOWN;
    /* access modifiers changed from: private */
    public final rwr c;
    /* access modifiers changed from: private */
    public final rdh d;
    /* access modifiers changed from: private */
    public View e;
    /* access modifiers changed from: private */
    public ViewLoadingTracker f;

    /* access modifiers changed from: protected */
    public abstract boolean a(T t);

    protected rws(final a aVar, rwr rwr, final sih sih, rdh rdh) {
        this.c = rwr;
        this.d = rdh;
        aVar.a(new c() {
            public final void aP_() {
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
                if (rws.this.f == null) {
                    rws rws = rws.this;
                    rws.f = rws.c.a(rws.this.e, sih.toString(), bundle, rws.this.d, rws.this.b);
                }
            }

            public final void a(Bundle bundle) {
                ViewLoadingTracker a2 = rws.this.f;
                if (a2 != null) {
                    a2.a(bundle);
                }
            }

            public final void a() {
                ViewLoadingTracker a2 = rws.this.f;
                if (a2 != null) {
                    a2.e();
                }
            }
        });
    }

    public final void a(View view) {
        this.e = view;
        Assertion.c(view == null || this.f == null, "%s", "Should not be called after the tracker is created");
    }

    public final boolean a() {
        return this.f != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        b();
    }

    /* renamed from: a */
    public wud<T> call(wud<T> wud) {
        return wud.b((wun<? super T>) new $$Lambda$rws$3sfRHTPSTQfZlngKETQ8mxjI_k<Object>(this)).a((wun<? super Throwable>) new $$Lambda$rws$662GI3HkMceTQqRUDZVk1vSWy4<Object>(this));
    }

    /* access modifiers changed from: private */
    public void b(T t) {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null && !viewLoadingTracker.g() && a(t)) {
            viewLoadingTracker.a(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.d();
        }
    }
}
