package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;

/* renamed from: iso reason: default package */
public final class iso {
    public final wzi<CollectionStateProvider> a;
    public final wzi<iss> b;

    public iso(wzi<CollectionStateProvider> wzi, wzi<iss> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
