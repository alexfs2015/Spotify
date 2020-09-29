package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Collections;

/* renamed from: tmo reason: default package */
public final class tmo {
    public final Player a;
    public final SerialDisposable b = new SerialDisposable();
    private final PlayOrigin c;
    private final wug d;
    private final tmq e;
    private final uxc f;
    private final tmr g;

    private static boolean a(long j) {
        return j >= 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public tmo(tmq tmq, uxc uxc, tmr tmr, Player player, PlayOrigin playOrigin, wug wug) {
        this.e = tmq;
        this.f = uxc;
        this.g = tmr;
        this.a = player;
        this.c = playOrigin;
        this.d = wug;
    }

    public final void a(String str, String str2, long j) {
        if (!a(str2) || !a(j)) {
            String ah = this.e.ah();
            if (!fax.a(ah)) {
                a ak = this.e.ak();
                LinkType linkType = jst.a(ah).b;
                if (ak == null || !(linkType == LinkType.PROFILE_PLAYLIST || linkType == LinkType.PLAYLIST_V2)) {
                    c(ah, this.e.ai(), j);
                    return;
                } else {
                    a(ah, this.e.ai(), ak, j);
                }
            } else {
                b(str, str2, j);
            }
            return;
        }
        this.a.seekTo(j);
        if (a()) {
            this.a.resume();
        }
    }

    private void b(String str, String str2, long j) {
        this.b.a(vun.a(this.g.a(str, str2).a(this.d)).a((Consumer<? super T>) new $$Lambda$tmo$cDVoiWaaLarNxOQab6MKejzJRz0<Object>(this, str2, j), (Consumer<? super Throwable>) new $$Lambda$tmo$CWTP_XjnbpGFcr9sbO8qPw4k34<Object>(str2)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j, PlayerContext playerContext) {
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, str, 0);
        this.a.play(playerContext, a(playOptionsSkipTo, j));
    }

    private void c(String str, String str2, long j) {
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, str2, null, 0);
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        this.a.play(PlayerContext.createFromContextUrl(str, sb.toString()), a(playOptionsSkipTo, j));
    }

    private void a(String str, String str2, a aVar, long j) {
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, str2, null, 0);
        this.b.a(this.f.a(str, aVar, a(playOptionsSkipTo, j), this.c, Collections.emptyMap()).a((Action) $$Lambda$tmo$pP9m_7AfmSC4FqIx0PE3QmpQMg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$tmo$UD8oB_VnFacAuYDHdHxXi1kPRc.INSTANCE));
    }

    private static PlayOptions a(PlayOptionsSkipTo playOptionsSkipTo, long j) {
        Builder suppressions = new Builder().skipTo(playOptionsSkipTo).suppressions(PlayerProviders.MFT);
        Boolean bool = Boolean.FALSE;
        Builder playerOptionsOverride = suppressions.playerOptionsOverride(bool, bool, Boolean.FALSE);
        if (a(j)) {
            playerOptionsOverride.seekTo(Long.valueOf(j));
        }
        return playerOptionsOverride.build();
    }

    private boolean a(String str) {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (lastPlayerState != null && lastPlayerState.isPlaying()) {
            PlayerTrack track = lastPlayerState.track();
            if (track != null && track.uri().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        return lastPlayerState == null || lastPlayerState.isPaused();
    }
}
