package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mqp reason: default package */
public final class mqp implements vua<mqo> {
    private final wlc<Picasso> a;

    private mqp(wlc<Picasso> wlc) {
        this.a = wlc;
    }

    public static mqp a(wlc<Picasso> wlc) {
        return new mqp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mqo((Picasso) this.a.get());
    }
}
