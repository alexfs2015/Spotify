package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.squareup.picasso.Picasso;

/* renamed from: nsb reason: default package */
public final class nsb implements wig<nsa> {
    private final wzi<Picasso> a;
    private final wzi<HomeMixInteractionLogger> b;
    private final wzi<fqn> c;
    private final wzi<String> d;

    private nsb(wzi<Picasso> wzi, wzi<HomeMixInteractionLogger> wzi2, wzi<fqn> wzi3, wzi<String> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nsb a(wzi<Picasso> wzi, wzi<HomeMixInteractionLogger> wzi2, wzi<fqn> wzi3, wzi<String> wzi4) {
        return new nsb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new nsa(this.a, this.b, this.c, this.d);
    }
}
