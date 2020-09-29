package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: qwo reason: default package */
public final class qwo {
    final lkn a;
    public Optional<Boolean> b = Optional.e();

    public qwo(lkn lkn, a aVar) {
        this.a = lkn;
        aVar.a(new c() {
            private wuk a = xaj.b();

            public final void c() {
                this.a = qwo.this.a.a().a((wun<? super T>) new $$Lambda$qwo$1$3CotsSSeBrSXS1j7oM644HWiAQ<Object>(this), (wun<Throwable>) $$Lambda$qwo$1$ynApa2KaJszEPbD2W3L_01VgJsk.INSTANCE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                qwo.this.b = Optional.b(bool);
            }

            public final void a() {
                this.a.unsubscribe();
            }
        });
    }
}
