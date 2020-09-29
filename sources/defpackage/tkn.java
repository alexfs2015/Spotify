package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tkn reason: default package */
public final class tkn<T> implements vua<tkm<T>> {
    private final wlc<Picasso> a;
    private final wlc<tkg> b;
    private final wlc<tvx> c;
    private final wlc<twi> d;
    private final wlc<Boolean> e;
    private final wlc<tjz<T>> f;
    private final wlc<twz> g;

    private tkn(wlc<Picasso> wlc, wlc<tkg> wlc2, wlc<tvx> wlc3, wlc<twi> wlc4, wlc<Boolean> wlc5, wlc<tjz<T>> wlc6, wlc<twz> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static <T> tkn<T> a(wlc<Picasso> wlc, wlc<tkg> wlc2, wlc<tvx> wlc3, wlc<twi> wlc4, wlc<Boolean> wlc5, wlc<tjz<T>> wlc6, wlc<twz> wlc7) {
        tkn tkn = new tkn(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return tkn;
    }

    public final /* synthetic */ Object get() {
        tkm tkm = new tkm(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        return tkm;
    }
}
