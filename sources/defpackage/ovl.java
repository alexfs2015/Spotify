package defpackage;

import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: ovl reason: default package */
public final class ovl implements vua<ovk> {
    private final wlc<hbj> a;
    private final wlc<ovf> b;
    private final wlc<String> c;
    private final wlc<TrackCloudShuffling> d;
    private final wlc<a> e;
    private final wlc<Random> f;
    private final wlc<Scheduler> g;
    private final wlc<kvk> h;

    private ovl(wlc<hbj> wlc, wlc<ovf> wlc2, wlc<String> wlc3, wlc<TrackCloudShuffling> wlc4, wlc<a> wlc5, wlc<Random> wlc6, wlc<Scheduler> wlc7, wlc<kvk> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ovl a(wlc<hbj> wlc, wlc<ovf> wlc2, wlc<String> wlc3, wlc<TrackCloudShuffling> wlc4, wlc<a> wlc5, wlc<Random> wlc6, wlc<Scheduler> wlc7, wlc<kvk> wlc8) {
        ovl ovl = new ovl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ovl;
    }

    public final /* synthetic */ Object get() {
        ovk ovk = new ovk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return ovk;
    }
}
