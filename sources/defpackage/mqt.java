package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mqt reason: default package */
public final class mqt implements vua<mqs> {
    private final wlc<Picasso> a;

    private mqt(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static mqt a(wlc<Picasso> wlc) {
        return new mqt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqs((Picasso) this.a.get());
    }
}
