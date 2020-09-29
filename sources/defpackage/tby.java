package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.UserIntent;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: tby reason: default package */
public final class tby implements a {
    xip a;
    public tbz b;
    private final Player c;
    private final SpeedControlInteractor d;
    private final tbp e;
    private final tbr f;
    private final tkk g;
    private final hhc h;

    public tby(Player player, SpeedControlInteractor speedControlInteractor, tbp tbp, tbr tbr, tkk tkk, hhc hhc, a aVar) {
        this.c = player;
        this.d = speedControlInteractor;
        this.e = tbp;
        this.f = tbr;
        this.g = tkk;
        this.h = hhc;
        aVar.a(new c() {
            public final void a() {
                hhf.a(tby.this.a);
            }

            public final void c() {
                tby tby = tby.this;
                tby.a = wit.a((ObservableSource<T>) tby.d.a(), BackpressureStrategy.BUFFER).a(wit.a(tby.h.c())).a((xis<? super T>) new $$Lambda$tby$DfRdnCQTXUNuF2Tiqw0q5sCzsAk<Object>(tby), (xis<Throwable>) new $$Lambda$tby$AmcGsglYFHCuH4ZLfFnsn3m1Zns<Throwable>(tby));
            }
        });
    }

    private void a(int i) {
        boolean z = true;
        if (this.f.a(i) != null) {
            this.b.a(b(i));
            tbz tbz = this.b;
            if (i == 100) {
                z = false;
            }
            tbz.a(z);
            return;
        }
        this.b.a(b(100));
        this.b.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Integer num) {
        a(num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(100);
    }

    private String b(int i) {
        return this.f.a(i);
    }

    public final void a() {
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        if (lastPlayerState != null) {
            tkk tkk = this.g;
            tkk.a(PlayerStateUtil.getTrackUri(tkk.o()), SectionId.SPEED_CONTROL_BUTTON, UserIntent.OPEN_SPEED_CONTROL_MENU, InteractionType.HIT);
            PlayerTrack playerTrack = (PlayerTrack) fbp.a(lastPlayerState.track());
            this.e.a(playerTrack.uri(), (String) playerTrack.metadata().get("title"));
        }
    }
}
