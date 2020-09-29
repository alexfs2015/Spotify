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

/* renamed from: gtx reason: default package */
public final class gtx {
    final grp a;
    final gtz b;
    wuk c;
    private final wlc<Player> d;
    private final DrivingFlagsUtils e;
    private wuk f;

    /* renamed from: gtx$a */
    class a implements PlayerStateObserver {
        private final Player a;
        private final PlayOptions b = new Builder().build();
        private final JumpstartVariant c;

        public a(Player player, JumpstartVariant jumpstartVariant) {
            this.a = player;
            this.c = jumpstartVariant;
        }

        public final void onPlayerStateReceived(PlayerState playerState) {
            PlayerTrack track = playerState.track();
            if (track != null) {
                Map metadata = track.metadata();
                if (!"video".equals(metadata.get("media.type")) || Boolean.parseBoolean((String) metadata.get(Metadata.IS_BACKGROUNDABLE))) {
                    gtx.this.a.t();
                    this.a.resume();
                    return;
                }
            }
            if (JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED == this.c) {
                gtx.this.a.t();
                gtx gtx = gtx.this;
                gtx.c = gtx.b.a().a((wun<? super T>) new $$Lambda$gtx$a$TcKpBmrOjEsWMpV2aL9LYu_opdY<Object>(this), (wun<Throwable>) $$Lambda$gtx$a$6DePK6voEpU264B_lOAGzE7BmTA.INSTANCE);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerContext playerContext) {
            this.a.playWithViewUri(playerContext, this.b, playerContext.uri());
        }
    }

    gtx(wlc<Player> wlc, grp grp, DrivingFlagsUtils drivingFlagsUtils, gtz gtz) {
        this.d = wlc;
        this.a = grp;
        this.e = drivingFlagsUtils;
        this.b = gtz;
    }

    public final void a(wud<Boolean> wud, wud<String> wud2) {
        this.f = wud.a(wud2, wud, (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$gtx$wjayviCAaBjFVaIFwFpYgV8Fgdc.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$gtx$nAQ0Dt0GW_Jn4_Dq98SiGYCgnBo<Object,Object>(this)).c((wut<? super T, Boolean>) $$Lambda$gtx$tEb5d9zcmqLc8faaYCgcD6OZ68.INSTANCE).c().a((wun<? super T>) new $$Lambda$gtx$Al8FCcezpdAboyfGpw9BDXizuDI<Object>(this), (wun<Throwable>) $$Lambda$gtx$qnaow4nG1yAXjqWAaae8MPyqg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(bool.booleanValue() && "car".equals(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        if (bool.booleanValue()) {
            return this.e.a().c();
        }
        return ScalarSynchronousObservable.d(JumpstartVariant.CONTROL);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(JumpstartVariant jumpstartVariant) {
        return Boolean.valueOf(JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED == jumpstartVariant);
    }

    public final void a() {
        wuk wuk = this.f;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.f.unsubscribe();
        }
        wuk wuk2 = this.c;
        if (wuk2 != null && !wuk2.isUnsubscribed()) {
            this.c.unsubscribe();
        }
    }

    /* access modifiers changed from: private */
    public void a(JumpstartVariant jumpstartVariant) {
        Player player = (Player) this.d.get();
        player.fetchState(new a(player, jumpstartVariant));
    }
}
