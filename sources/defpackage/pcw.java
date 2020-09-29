package defpackage;

import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: pcw reason: default package */
public final class pcw implements wig<pcv> {
    private final wzi<hec> a;
    private final wzi<pcq> b;
    private final wzi<String> c;
    private final wzi<TrackCloudShuffling> d;
    private final wzi<a> e;
    private final wzi<Random> f;
    private final wzi<Scheduler> g;
    private final wzi<kyt> h;

    private pcw(wzi<hec> wzi, wzi<pcq> wzi2, wzi<String> wzi3, wzi<TrackCloudShuffling> wzi4, wzi<a> wzi5, wzi<Random> wzi6, wzi<Scheduler> wzi7, wzi<kyt> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static pcw a(wzi<hec> wzi, wzi<pcq> wzi2, wzi<String> wzi3, wzi<TrackCloudShuffling> wzi4, wzi<a> wzi5, wzi<Random> wzi6, wzi<Scheduler> wzi7, wzi<kyt> wzi8) {
        pcw pcw = new pcw(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return pcw;
    }

    public final /* synthetic */ Object get() {
        pcv pcv = new pcv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        return pcv;
    }
}
