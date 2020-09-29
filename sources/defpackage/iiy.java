package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: iiy reason: default package */
public final class iiy implements vua<iix> {
    private final wlc<Picasso> a;

    private iiy(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static iiy a(wlc<Picasso> wlc) {
        return new iiy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new iix((Picasso) this.a.get());
    }
}
