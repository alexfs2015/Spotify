package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import io.reactivex.Flowable;

/* renamed from: uvz reason: default package */
public final class uvz {
    private uwo a;
    private final Flowable<PlayerState> b;
    private final xil c;
    private xip d = xon.b();

    /* renamed from: uvz$a */
    interface a {
        boolean doFilter(PlayerState playerState);
    }

    public uvz(Flowable<PlayerState> flowable, xil xil) {
        this.b = flowable;
        this.c = xil;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(a aVar, PlayerState playerState) {
        boolean z = false;
        Logger.a("filtering %s, %s, %s", playerState.playOrigin().featureIdentifier(), playerState.contextUri(), playerState.playbackId());
        if (uqo.bg.a().equalsIgnoreCase(playerState.playOrigin().featureIdentifier()) && playerState.playbackId() != null && aVar.doFilter(playerState)) {
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

    private void b() {
        Logger.a("cleaning up", new Object[0]);
        this.a = null;
    }

    public final void a() {
        Logger.a("stop observing", new Object[0]);
        this.d.unsubscribe();
        b();
    }

    public final void a(String str, String str2, uwo uwo, Intent intent) {
        Logger.a("Starting to observe for %s", str2);
        a(str, uwo, intent, (a) new $$Lambda$uvz$vKWQT0RvPseY1JcPDKYe7wSGBQ(str2));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, uwo uwo, Intent intent, a aVar) {
        if (!this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.a = uwo;
        this.d = wit.a((xfk<T>) this.b).i(new $$Lambda$uvz$eifTjQpd0w5ymypWNWQzlrj3MXs(aVar)).a(this.c).b(this.c).a((xis<? super T>) new $$Lambda$uvz$Xj7SnoeQqM7agswtRnEe7_gau0<Object>(this, str, intent), (xis<Throwable>) new $$Lambda$uvz$mI6ArPuOT3TS6wKpl0Z4k8bI5s<Throwable>(this));
    }
}
