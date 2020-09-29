package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.squareup.picasso.Picasso;

/* renamed from: nml reason: default package */
public final class nml {
    final wlc<Picasso> a;
    final wlc<HomeMixInteractionLogger> b;
    final wlc<fpt> c;

    public nml(wlc<Picasso> wlc, wlc<HomeMixInteractionLogger> wlc2, wlc<fpt> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
