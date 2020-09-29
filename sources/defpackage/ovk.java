package defpackage;

import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: ovk reason: default package */
final class ovk {
    final wlc<hbj> a;
    final wlc<ovf> b;
    final wlc<String> c;
    final wlc<TrackCloudShuffling> d;
    final wlc<a> e;
    final wlc<Random> f;
    final wlc<Scheduler> g;
    final wlc<kvk> h;

    ovk(wlc<hbj> wlc, wlc<ovf> wlc2, wlc<String> wlc3, wlc<TrackCloudShuffling> wlc4, wlc<a> wlc5, wlc<Random> wlc6, wlc<Scheduler> wlc7, wlc<kvk> wlc8) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
