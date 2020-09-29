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

/* renamed from: jxu reason: default package */
public final class jxu implements spt {
    private final Player a;
    private final tcn b;
    private final ghm c;
    private final Scheduler d;

    public jxu(ghm ghm, Scheduler scheduler, tcn tcn, PlayerFactory playerFactory) {
        this.c = ghm;
        this.d = scheduler;
        this.b = tcn;
        this.a = playerFactory.create(ViewUris.X.toString(), udt.ay, rju.s);
    }

    public final void a(sps sps) {
        sps.a(sqa.a(LinkType.LIVE_EVENT), "Play live stream and navigate to NPV", (spq) new $$Lambda$jxu$yNgZh2McUo20gY_j_OnzGjSMfqk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(Intent intent, fpt fpt, SessionState sessionState) {
        if (fpt.a(jyz.f) == RolloutFlag.ENABLED) {
            String uri = intent.getData().toString();
            jst a2 = jst.a(uri);
            if (!TextUtils.isEmpty(uri) && a2.b == LinkType.LIVE_EVENT) {
                return jxt.a(a2.b(), new jxs("Live event", "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8"), this.c).a(this.d).a(5, TimeUnit.SECONDS).e(new $$Lambda$jxu$64ZMnmqbpR898I4aOOw2wUdlItc(this)).a((SingleSource<T>) Single.b(new a()));
            }
        }
        return Single.b(new a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(PlayerContext playerContext) {
        return Completable.a((Runnable) new $$Lambda$jxu$Rwxbjtmv9erkuC7rbvqC3xUIN0(this, playerContext));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerContext playerContext) {
        this.a.play(playerContext, new Builder().skipToIndex(0, 0).build());
        this.b.a();
    }
}
