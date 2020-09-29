package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: gyj reason: default package */
public final class gyj {
    /* access modifiers changed from: 0000 */
    public boolean a;
    wuk b;
    private final lkn c;

    public gyj(final lkn lkn, final a aVar) {
        this.c = lkn;
        aVar.a(new c() {
            public final void c() {
                gyj.this.b = lkn.a().a((wun<? super T>) new $$Lambda$gyj$1$1C78zolG71pHvcnyZdaUPyhU6Y<Object>(gyj.this), (wun<Throwable>) $$Lambda$gyj$1$eimRWOWOIE6EuonLRSidyu9HY4.INSTANCE);
            }

            public final void a() {
                gyj.this.b.unsubscribe();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final boolean a(boolean z) {
        return this.a && z;
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }
}
