package defpackage;

import com.spotify.searchview.proto.Entity;

/* renamed from: sjv reason: default package */
public final class sjv {
    private final wzi<skb> a;
    private final wzi<sjo> b;

    public sjv(wzi<skb> wzi, wzi<sjo> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final sju a(Entity entity, int i, String str, String str2) {
        sju sju = new sju((skb) a(this.a.get(), 1), (sjo) a(this.b.get(), 2), (Entity) a(entity, 3), i, (String) a(str, 5), (String) a(str2, 6));
        return sju;
    }
}
