package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lir reason: default package */
public final class lir implements vua<Picasso> {
    private final wlc<uvt> a;

    private lir(wlc<uvt> wlc) {
        this.a = wlc;
    }

    public static lir a(wlc<uvt> wlc) {
        return new lir(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Picasso) vuf.a(((uvt) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
