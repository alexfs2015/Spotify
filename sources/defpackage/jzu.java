package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import java.util.concurrent.TimeUnit;

/* renamed from: jzu reason: default package */
public final class jzu implements taa {
    private final Player a;
    private final tmu b;
    private final gix c;
    private final Scheduler d;

    public jzu(gix gix, Scheduler scheduler, tmu tmu, PlayerFactory playerFactory) {
        this.c = gix;
        this.d = scheduler;
        this.b = tmu;
        this.a = playerFactory.create(ViewUris.W.toString(), uqo.ay, rta.s);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(PlayerContext playerContext) {
        return Completable.a((Runnable) new $$Lambda$jzu$Zag3ylWL0cp_jq8RCFpREWW5jPQ(this, playerContext));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fqn fqn, SessionState sessionState) {
        if (fqn.a(kaz.f) == RolloutFlag.ENABLED) {
            String uri = intent.getData().toString();
            jva a2 = jva.a(uri);
            if (!TextUtils.isEmpty(uri) && a2.b == LinkType.LIVE_EVENT) {
                return jzt.a(a2.b(), new jzs("Live event", "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8"), this.c).a(this.d).a(5, TimeUnit.SECONDS).e(new $$Lambda$jzu$TvtxMgyVM9CZWR6BOWmNVQlIO0(this)).a((SingleSource<T>) Single.b(new a()));
            }
        }
        return Single.b(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerContext playerContext) {
        this.a.play(playerContext, new Builder().skipToIndex(0, 0).build());
        this.b.a();
    }

    public final void a(szz szz) {
        szz.a(tah.a(LinkType.LIVE_EVENT), "Play live stream and navigate to NPV", (szx) new $$Lambda$jzu$ekIZeuS140HX3PsMXUF7YfUdD5g(this));
    }
}
