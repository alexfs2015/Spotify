package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nsk reason: default package */
public final class nsk {
    private final wzi<String> a;
    private final wzi<sso> b;
    private final wzi<jlr> c;

    public nsk(wzi<String> wzi, wzi<sso> wzi2, wzi<jlr> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final HomeMixInteractionLogger a(gkq gkq) {
        return new HomeMixInteractionLogger((String) a(this.a.get(), 1), (sso) a(this.b.get(), 2), (jlr) a(this.c.get(), 3), (gkq) a(gkq, 4));
    }
}
