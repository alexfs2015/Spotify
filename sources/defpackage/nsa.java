package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.squareup.picasso.Picasso;

/* renamed from: nsa reason: default package */
public final class nsa {
    final wzi<Picasso> a;
    final wzi<HomeMixInteractionLogger> b;
    final wzi<fqn> c;
    final wzi<String> d;

    public nsa(wzi<Picasso> wzi, wzi<HomeMixInteractionLogger> wzi2, wzi<fqn> wzi3, wzi<String> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
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
