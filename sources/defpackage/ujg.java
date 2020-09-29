package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: ujg reason: default package */
public final class ujg implements a {
    private final wzi<Player> a;
    private final wzi<aqq> b;
    private final wzi<a> c;
    private final wzi<Flowable<PlayerState>> d;
    private final wzi<hgz> e;
    private final wzi<Scheduler> f;
    private final wzi<AudioManager> g;
    private final wzi<jtz> h;

    public ujg(wzi<Player> wzi, wzi<aqq> wzi2, wzi<a> wzi3, wzi<Flowable<PlayerState>> wzi4, wzi<hgz> wzi5, wzi<Scheduler> wzi6, wzi<AudioManager> wzi7, wzi<jtz> wzi8) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ujf a(a aVar) {
        uji uji = new uji((a) a(aVar, 1), (Player) a(this.a.get(), 2), (aqq) this.b.get(), (a) a(this.c.get(), 4), (Flowable) a(this.d.get(), 5), (hgz) a(this.e.get(), 6), (Scheduler) a(this.f.get(), 7), (AudioManager) a(this.g.get(), 8), (jtz) a(this.h.get(), 9));
        return uji;
    }
}
