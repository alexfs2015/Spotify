package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mna reason: default package */
public final class mna {
    private final wzi<gtb> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<gsw> c;
    private final wzi<unq> d;

    public mna(wzi<gtb> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<gsw> wzi3, wzi<unq> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final mmz a(mix mix) {
        mmz mmz = new mmz((gtb) a(this.a.get(), 1), (mix) a(mix, 2), (Flowable) a(this.b.get(), 3), (gsw) a(this.c.get(), 4), (unq) a(this.d.get(), 5));
        return mmz;
    }
}
