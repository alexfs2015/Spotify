package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: ncd reason: default package */
public final class ncd {
    public Optional<Boolean> a = Optional.e();

    public ncd(final lkn lkn, a aVar) {
        aVar.a(new c() {
            private wuk a = xaj.b();

            public final void c() {
                this.a = lkn.a().a((wun<? super T>) new $$Lambda$ncd$1$3hkq02roScu_L6UmxrfwqVayeoY<Object>(this), (wun<Throwable>) $$Lambda$ncd$1$DtoRkPyvab2Q76bMJDj96eE1ID0.INSTANCE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                ncd.this.a = Optional.b(bool);
            }

            public final void a() {
                this.a.unsubscribe();
            }
        });
    }
}
