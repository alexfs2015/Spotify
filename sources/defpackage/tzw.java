package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tzw reason: default package */
public final class tzw implements vua<tzv> {
    private final wlc<Picasso> a;
    private final wlc<wum> b;
    private final wlc<tzp> c;

    private tzw(wlc<Picasso> wlc, wlc<wum> wlc2, wlc<tzp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tzw a(wlc<Picasso> wlc, wlc<wum> wlc2, wlc<tzp> wlc3) {
        return new tzw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tzv(this.a, this.b, this.c);
    }
}
