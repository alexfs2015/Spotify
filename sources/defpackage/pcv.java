package defpackage;

import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import io.reactivex.Scheduler;
import java.util.Random;

/* renamed from: pcv reason: default package */
final class pcv {
    final wzi<hec> a;
    final wzi<pcq> b;
    final wzi<String> c;
    final wzi<TrackCloudShuffling> d;
    final wzi<a> e;
    final wzi<Random> f;
    final wzi<Scheduler> g;
    final wzi<kyt> h;

    pcv(wzi<hec> wzi, wzi<pcq> wzi2, wzi<String> wzi3, wzi<TrackCloudShuffling> wzi4, wzi<a> wzi5, wzi<Random> wzi6, wzi<Scheduler> wzi7, wzi<kyt> wzi8) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
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
