package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;

/* renamed from: nmv reason: default package */
public final class nmv {
    private final wlc<String> a;
    private final wlc<sih> b;
    private final wlc<jjf> c;

    public nmv(wlc<String> wlc, wlc<sih> wlc2, wlc<jjf> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public final HomeMixInteractionLogger a(gjf gjf) {
        return new HomeMixInteractionLogger((String) a(this.a.get(), 1), (sih) a(this.b.get(), 2), (jjf) a(this.c.get(), 3), (gjf) a(gjf, 4));
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
