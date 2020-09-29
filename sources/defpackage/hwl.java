package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;

/* renamed from: hwl reason: default package */
public final class hwl {
    private final hqk a;
    private final hqf b;
    private final String c;

    public hwl(hqk hqk, hqf hqf, String str) {
        this.a = hqk;
        this.b = hqf;
        this.c = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, ActionCallback actionCallback, PlayerQueue playerQueue) {
        this.b.a(i, this.c, playerQueue, actionCallback);
    }

    public final void a(int i, ActionCallback actionCallback) {
        this.a.a().c().a((xis<? super T>) new $$Lambda$hwl$H_4ewrM_PVazOL94SY5lM2BTeJA<Object>(this, i, null), (xis<Throwable>) $$Lambda$hwl$0UpsG1GR8MIdqiVM0WNnu0l7ik.INSTANCE);
    }
}
