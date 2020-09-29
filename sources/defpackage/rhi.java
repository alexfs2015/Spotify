package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: rhi reason: default package */
public final class rhi {
    public final wzi<rhr> a;
    public final wzi<CollectionStateProvider> b;
    public final wzi<sso> c;
    public final wzi<rgf> d;
    public final wzi<lbi> e;

    public rhi(wzi<rhr> wzi, wzi<CollectionStateProvider> wzi2, wzi<sso> wzi3, wzi<rgf> wzi4, wzi<lbi> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
