package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils;
import com.spotify.mobile.android.driving.flags.DrivingFlagsUtils.JumpstartVariant;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: gvx reason: default package */
public final class gvx {
    final gtr a;
    final gvz b;
    xip c;
    private final wzi<Player> d;
    private final DrivingFlagsUtils e;
    private xip f;

    /* renamed from: gvx$a */
    class a implements PlayerStateObserver {
        private final Player a;
        private final PlayOptions b = new Builder().build();
        private final JumpstartVariant c;

        public a(Player player, JumpstartVariant jumpstartVariant) {
            this.a = player;
            this.c = jumpstartVariant;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerContext playerContext) {
            this.a.playWithViewUri(playerContext, this.b, playerContext.uri());
        }

        public final void onPlayerStateReceived(PlayerState playerState) {
            PlayerTrack track = playerState.track();
            if (track != null) {
                Map metadata = track.metadata();
                if (!"video".equals(metadata.get("media.type")) || Boolean.parseBoolean((String) metadata.get(Metadata.IS_BACKGROUNDABLE))) {
                    gvx.this.a.t();
                    this.a.resume();
                    return;
                }
            }
            if (JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED == this.c) {
                gvx.this.a.t();
                gvx gvx = gvx.this;
                gvx.c = gvx.b.a().a((xis<? super T>) new $$Lambda$gvx$a$PKHo4EMtXHkj17i7db6PRiodK18<Object>(this), (xis<Throwable>) $$Lambda$gvx$a$S55HfYzL9jG6I3oHUzQf8EI8nI.INSTANCE);
            }
        }
    }

    gvx(wzi<Player> wzi, gtr gtr, DrivingFlagsUtils drivingFlagsUtils, gvz gvz) {
        this.d = wzi;
        this.a = gtr;
        this.e = drivingFlagsUtils;
        this.b = gvz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && "car".equals(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        return bool.booleanValue() ? this.e.a().c() : ScalarSynchronousObservable.d(JumpstartVariant.CONTROL);
    }

    /* access modifiers changed from: private */
    public void a(JumpstartVariant jumpstartVariant) {
        Player player = (Player) this.d.get();
        player.fetchState(new a(player, jumpstartVariant));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(JumpstartVariant jumpstartVariant) {
        return Boolean.valueOf(JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED == jumpstartVariant);
    }

    public final void a() {
        xip xip = this.f;
        if (xip != null && !xip.isUnsubscribed()) {
            this.f.unsubscribe();
        }
        xip xip2 = this.c;
        if (xip2 != null && !xip2.isUnsubscribed()) {
            this.c.unsubscribe();
        }
    }

    public final void a(xii<Boolean> xii, xii<String> xii2) {
        this.f = xii.a(xii2, xii, (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$gvx$4DYLhRZiByv3vZrfv9utQzLVNms.INSTANCE).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$gvx$TTBQGbLH1Srtm3o1uzo4Q7OLxI<Object,Object>(this)).c((xiy<? super T, Boolean>) $$Lambda$gvx$83_Q8NUeKX9bibibjmyFtKfYAg.INSTANCE).c().a((xis<? super T>) new $$Lambda$gvx$G5IzMoLv08qPCqLk8Ogdmp1AR8<Object>(this), (xis<Throwable>) $$Lambda$gvx$hccEstBjoDZ35VQTShHtwQCGVfU.INSTANCE);
    }
}
