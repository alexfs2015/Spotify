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

/* renamed from: srr reason: default package */
public final class srr implements a {
    wuk a;
    public srs b;
    private final Player c;
    private final SpeedControlInteractor d;
    private final sri e;
    private final srk f;
    private final tad g;
    private final heg h;

    public srr(Player player, SpeedControlInteractor speedControlInteractor, sri sri, srk srk, tad tad, heg heg, a aVar) {
        this.c = player;
        this.d = speedControlInteractor;
        this.e = sri;
        this.f = srk;
        this.g = tad;
        this.h = heg;
        aVar.a(new c() {
            public final void c() {
                srr srr = srr.this;
                srr.a = vun.a((ObservableSource<T>) srr.d.a(), BackpressureStrategy.BUFFER).a(vun.a(srr.h.c())).a((wun<? super T>) new $$Lambda$srr$DxQZtpCz4bQM0zQJLQtBnFyQNSg<Object>(srr), (wun<Throwable>) new $$Lambda$srr$fjfv2nAJkeQqjoJjLe0pi22ZHEs<Throwable>(srr));
            }

            public final void a() {
                hej.a(srr.this.a);
            }
        });
    }

    public final void a() {
        PlayerState lastPlayerState = this.c.getLastPlayerState();
        if (lastPlayerState != null) {
            tad tad = this.g;
            tad.a(PlayerStateUtil.getTrackUri(tad.o()), SectionId.SPEED_CONTROL_BUTTON, UserIntent.OPEN_SPEED_CONTROL_MENU, InteractionType.HIT);
            PlayerTrack playerTrack = (PlayerTrack) fay.a(lastPlayerState.track());
            this.e.a(playerTrack.uri(), (String) playerTrack.metadata().get("title"));
        }
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

    private void a(int i) {
        boolean z = true;
        if (this.f.a(i) != null) {
            this.b.a(b(i));
            srs srs = this.b;
            if (i == 100) {
                z = false;
            }
            srs.a(z);
            return;
        }
        this.b.a(b(100));
        this.b.a(false);
    }
}
