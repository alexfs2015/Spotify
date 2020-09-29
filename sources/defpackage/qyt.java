package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: qyt reason: default package */
public final class qyt {
    public final wlc<qzc> a;
    public final wlc<CollectionStateProvider> b;
    public final wlc<sih> c;
    public final wlc<qxq> d;
    public final wlc<kxz> e;

    public qyt(wlc<qzc> wlc, wlc<CollectionStateProvider> wlc2, wlc<sih> wlc3, wlc<qxq> wlc4, wlc<kxz> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
