package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: nuk reason: default package */
public final class nuk implements vua<nuj> {
    private final wlc<a> a;
    private final wlc<oew> b;
    private final wlc<a> c;
    private final wlc<num> d;
    private final wlc<Context> e;
    private final wlc<Picasso> f;
    private final wlc<fpt> g;

    private nuk(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<num> wlc4, wlc<Context> wlc5, wlc<Picasso> wlc6, wlc<fpt> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static nuk a(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<num> wlc4, wlc<Context> wlc5, wlc<Picasso> wlc6, wlc<fpt> wlc7) {
        nuk nuk = new nuk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return nuk;
    }

    public final /* synthetic */ Object get() {
        nuj nuj = new nuj(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        return nuj;
    }
}
