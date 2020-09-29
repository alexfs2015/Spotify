package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lsv reason: default package */
public final class lsv implements vua<lsu> {
    private final wlc<twz> a;
    private final wlc<Picasso> b;

    private lsv(wlc<twz> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lsv a(wlc<twz> wlc, wlc<Picasso> wlc2) {
        return new lsv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lsu((twz) this.a.get(), (Picasso) this.b.get());
    }
}
