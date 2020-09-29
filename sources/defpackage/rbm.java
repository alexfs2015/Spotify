package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

/* renamed from: rbm reason: default package */
public final class rbm {
    private final rgl a;
    private final rbo b;
    private final ujf c;
    private final lay d;
    private final lal e;
    private final vcb f;
    private final MusicPagesFiltering g;
    private final rha h;
    private final lon i;
    private final MusicPagesLogger j;
    private final rbg k;
    private final rep l;
    private final rgw m;
    private final res n;
    private final Flowable<PlayerState> o;
    private final jwo p;
    private final rdu q;
    private final OffliningLogger r;
    private final rgi s;
    private final ren t;
    private final rid u;
    private final rfv v;

    public rbm(rgl rgl, rbo rbo, ujf ujf, lay lay, lal lal, vcb vcb, MusicPagesFiltering musicPagesFiltering, rha rha, lon lon, MusicPagesLogger musicPagesLogger, rbg rbg, rep rep, rgw rgw, res res, Flowable<PlayerState> flowable, jwo jwo, rdu rdu, OffliningLogger offliningLogger, rgi rgi, ren ren, rid rid, rfv rfv) {
        this.a = rgl;
        this.b = rbo;
        this.c = ujf;
        this.d = lay;
        this.e = lal;
        this.f = vcb;
        this.g = musicPagesFiltering;
        this.h = rha;
        this.i = lon;
        this.j = musicPagesLogger;
        this.k = rbg;
        this.l = rep;
        this.m = rgw;
        this.n = res;
        this.o = flowable;
        this.p = jwo;
        this.q = rdu;
        this.r = offliningLogger;
        this.s = rgi;
        this.t = ren;
        this.u = rid;
        this.v = rfv;
    }

    private c<MusicPagesModel, rey, rex> a(rbi rbi, rda rda) {
        rda rda2 = rda;
        $$Lambda$Sd8WidMnB5tqxyLKAaTkBPKWwOI r15 = $$Lambda$Sd8WidMnB5tqxyLKAaTkBPKWwOI.INSTANCE;
        ren ren = this.t;
        $$Lambda$Sd8WidMnB5tqxyLKAaTkBPKWwOI r21 = r15;
        $$Lambda$Sd8WidMnB5tqxyLKAaTkBPKWwOI r18 = r21;
        ren ren2 = ren;
        a a2 = kok.a((kni<M, E, F>) r18, rfb.a(ren2, this.b, rda2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.m, this.i, this.q, this.j, this.r, this.u, this.v)).a((kmx<M, F>) $$Lambda$5yTRv4wbOOp9nLk4u5MPs2wFho.INSTANCE).b($$Lambda$rbm$0Raq1YWV1guLYU8NuBgU6zZwuT4.INSTANCE).a((kny<koe>) $$Lambda$rbm$7FMivvGJ_a_0jh372g4BNgSQBE.INSTANCE).a(rfc.a(rbi, this.i, this.n, this.o, this.p, this.s, this.l.b()));
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_MOBIUS_LOGGING;
        return a2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe a() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe b() {
        return new kom(Schedulers.a());
    }

    public final b<MusicPagesModel, rey> a(rbi rbi, MusicPagesModel musicPagesModel) {
        return knc.a(a(rbi, this.a.a()), musicPagesModel, knm.a());
    }
}
