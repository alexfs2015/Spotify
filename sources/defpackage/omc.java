package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: omc reason: default package */
public final class omc implements vua<omb> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<olt> c;
    private final wlc<a> d;

    private omc(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<olt> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static omc a(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<olt> wlc3, wlc<a> wlc4) {
        return new omc(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        wlc<Picasso> wlc = this.a;
        wlc<Context> wlc2 = this.b;
        wlc<olt> wlc3 = this.c;
        omb omb = new omb(wlc, wlc2, wlc3, this.d, wlc3);
        return omb;
    }
}
