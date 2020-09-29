package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

/* renamed from: qsx reason: default package */
public final class qsx {
    private final qxw a;
    private final qsz b;
    private final txc c;
    private final kxp d;
    private final kxc e;
    private final uqw f;
    private final MusicPagesFiltering g;
    private final qyl h;
    private final lkn i;
    private final MusicPagesLogger j;
    private final qsr k;
    private final qwa l;
    private final qyh m;
    private final qwd n;
    private final Flowable<PlayerState> o;
    private final jug p;
    private final qvh q;
    private final OffliningLogger r;
    private final qxt s;
    private final qvy t;
    private final qzh u;
    private final qxg v;

    public qsx(qxw qxw, qsz qsz, txc txc, kxp kxp, kxc kxc, uqw uqw, MusicPagesFiltering musicPagesFiltering, qyl qyl, lkn lkn, MusicPagesLogger musicPagesLogger, qsr qsr, qwa qwa, qyh qyh, qwd qwd, Flowable<PlayerState> flowable, jug jug, qvh qvh, OffliningLogger offliningLogger, qxt qxt, qvy qvy, qzh qzh, qxg qxg) {
        this.a = qxw;
        this.b = qsz;
        this.c = txc;
        this.d = kxp;
        this.e = kxc;
        this.f = uqw;
        this.g = musicPagesFiltering;
        this.h = qyl;
        this.i = lkn;
        this.j = musicPagesLogger;
        this.k = qsr;
        this.l = qwa;
        this.m = qyh;
        this.n = qwd;
        this.o = flowable;
        this.p = jug;
        this.q = qvh;
        this.r = offliningLogger;
        this.s = qxt;
        this.t = qvy;
        this.u = qzh;
        this.v = qxg;
    }

    public final b<MusicPagesModel, qwj> a(qst qst, MusicPagesModel musicPagesModel) {
        return kjt.a(a(qst, this.a.a()), musicPagesModel, kkd.a());
    }

    private c<MusicPagesModel, qwj, qwi> a(qst qst, qul qul) {
        qul qul2 = qul;
        $$Lambda$11fxyg0s4dRBgB1BUe2QbSqUSFM r15 = $$Lambda$11fxyg0s4dRBgB1BUe2QbSqUSFM.INSTANCE;
        qvy qvy = this.t;
        $$Lambda$11fxyg0s4dRBgB1BUe2QbSqUSFM r21 = r15;
        $$Lambda$11fxyg0s4dRBgB1BUe2QbSqUSFM r18 = r21;
        qvy qvy2 = qvy;
        a a2 = klb.a((kjz<M, E, F>) r18, qwm.a(qvy2, this.b, qul2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.m, this.i, this.q, this.j, this.r, this.u, this.v)).a((kjo<M, F>) $$Lambda$VjSWCxOtNlbPjFLEJNEPKUsPdLc.INSTANCE).b($$Lambda$qsx$ZT1OI93Sh9Ole8B6h05Z1010Lc.INSTANCE).a((kkp<kkv>) $$Lambda$qsx$vBijBu2V3Ta2GKXpHwRA2xOOiPY.INSTANCE).a(qwn.a(qst, this.i, this.n, this.o, this.p, this.s, this.l.b()));
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_MOBIUS_LOGGING;
        return a2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv b() {
        return new kld(Schedulers.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv a() {
        return new kld(Schedulers.a());
    }
}
