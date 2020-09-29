package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import io.reactivex.Flowable;

/* renamed from: uku reason: default package */
public final class uku {
    private ulk a;
    private final Flowable<PlayerState> b;
    private final wug c;
    private wuk d = xaj.b();

    /* renamed from: uku$a */
    interface a {
        boolean doFilter(PlayerState playerState);
    }

    public uku(Flowable<PlayerState> flowable, wug wug) {
        this.b = flowable;
        this.c = wug;
    }

    public final void a(String str, String str2, ulk ulk, Intent intent) {
        Logger.a("Starting to observe for %s", str2);
        a(str, ulk, intent, (a) new $$Lambda$uku$EPfvd_DfiHXFmAlvOeyIcHsFW0(str2));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, ulk ulk, Intent intent, a aVar) {
        if (!this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.a = ulk;
        this.d = vun.a((wrf<T>) this.b).j(new $$Lambda$uku$_sv4lNcPYWfo6K0vQIsi3T13Hw(aVar)).a(this.c).b(this.c).a((wun<? super T>) new $$Lambda$uku$arlDrjhHNLEpqJ3fUEAE7d8uzoM<Object>(this, str, intent), (wun<Throwable>) new $$Lambda$uku$W2jeaGqtjyFxZkDe3ksy2tJstEA<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(a aVar, PlayerState playerState) {
        boolean z = false;
        Logger.a("filtering %s, %s, %s", playerState.playOrigin().featureIdentifier(), playerState.contextUri(), playerState.playbackId());
        if (udt.bg.a().equalsIgnoreCase(playerState.playOrigin().featureIdentifier()) && playerState.playbackId() != null && aVar.doFilter(playerState)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Intent intent, PlayerState playerState) {
        if (this.a != null) {
            Logger.b("Observed player state change %s with playbackId %s", playerState.contextUri(), playerState.playbackId());
            this.a.a(str, intent, playerState);
            b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.d(th, "Unexpected error while observing player state", new Object[0]);
        b();
    }

    public final void a() {
        Logger.a("stop observing", new Object[0]);
        this.d.unsubscribe();
        b();
    }

    private void b() {
        Logger.a("cleaning up", new Object[0]);
        this.a = null;
    }
}
