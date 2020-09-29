package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

/* renamed from: htz reason: default package */
public final class htz {
    private final hoi a;
    private final hod b;
    private final String c;

    public htz(hoi hoi, hod hod, String str) {
        this.a = hoi;
        this.b = hod;
        this.c = str;
    }

    public final void a(int i, ActionCallback actionCallback) {
        this.a.a().c().a((wun<? super T>) new $$Lambda$htz$sqwcKL73kGj_y3eMxK1Xxcjq5z4<Object>(this, i, null), (wun<Throwable>) $$Lambda$htz$daQpNGjYti1K3GtHqseGvhPXVF4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, ActionCallback actionCallback, PlayerQueue playerQueue) {
        this.b.a(i, this.c, playerQueue, actionCallback);
    }
}
