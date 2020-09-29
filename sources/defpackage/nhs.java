package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: nhs reason: default package */
public final class nhs {
    public Optional<Boolean> a = Optional.e();

    public nhs(final lon lon, a aVar) {
        aVar.a(new c() {
            private xip a = xon.b();

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                nhs.this.a = Optional.b(bool);
            }

            public final void a() {
                this.a.unsubscribe();
            }

            public final void c() {
                this.a = lon.a().a((xis<? super T>) new $$Lambda$nhs$1$3dNzwubU8am897gbLtkgmimLGA4<Object>(this), (xis<Throwable>) $$Lambda$nhs$1$kdVyZRygQY45Y2ZxPiq35nqcXMA.INSTANCE);
            }
        });
    }
}
