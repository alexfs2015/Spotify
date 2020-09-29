package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: irl reason: default package */
public final class irl {
    private final wlc<hip> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<gqx> c;
    private final wlc<uav> d;

    public irl(wlc<hip> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<gqx> wlc3, wlc<uav> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    public final irk a(men men) {
        irk irk = new irk((hip) a(this.a.get(), 1), (men) a(men, 2), (Flowable) a(this.b.get(), 3), (gqx) a(this.c.get(), 4), (uav) a(this.d.get(), 5));
        return irk;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
