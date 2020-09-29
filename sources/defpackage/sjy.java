package defpackage;

import com.spotify.searchview.proto.Entity;
import java.util.Set;

/* renamed from: sjy reason: default package */
public final class sjy {
    private final wzi<skb> a;
    private final wzi<sjo> b;
    private final wzi<sjr> c;
    private final wzi<Set<skc>> d;

    public sjy(wzi<skb> wzi, wzi<sjo> wzi2, wzi<sjr> wzi3, wzi<Set<skc>> wzi4) {
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

    public final sjx a(Entity entity, int i, String str, String str2) {
        sjx sjx = new sjx((skb) a(this.a.get(), 1), (sjo) a(this.b.get(), 2), (sjr) a(this.c.get(), 3), (Set) a(this.d.get(), 4), (Entity) a(entity, 5), i, (String) a(str, 7), (String) a(str2, 8));
        return sjx;
    }
}
