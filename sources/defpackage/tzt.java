package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tzt reason: default package */
public final class tzt implements vua<tzs> {
    private final wlc<Picasso> a;
    private final wlc<wum> b;

    private tzt(wlc<Picasso> wlc, wlc<wum> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tzt a(wlc<Picasso> wlc, wlc<wum> wlc2) {
        return new tzt(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tzs(this.a, this.b);
    }
}
