package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: ozw reason: default package */
public final class ozw {
    /* access modifiers changed from: 0000 */
    public wuk a;
    public boolean b;
    private final lkn c;
    private final wug d;

    public ozw(lkn lkn, wug wug, final a aVar) {
        this.c = lkn;
        this.d = wug;
        aVar.a(new c() {
            public final void b(Bundle bundle) {
            }

            public final void c() {
                ozw.this.a = ozw.this.c.a().a(ozw.this.d).a((wun<? super T>) new $$Lambda$ozw$MtTqCm1OqvTIUMEZNHLhG6o5k30<Object>(ozw.this), (wun<Throwable>) $$Lambda$ozw$bFrZhoDyGqP_kFJwsjp6A6DIejo.INSTANCE);
            }

            public final void a() {
                if (ozw.this.a != null) {
                    ozw.this.a.unsubscribe();
                }
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.b = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        Logger.d(th, "Error shouldDisableExplicitContent", new Object[0]);
        wul.a(th);
    }
}
