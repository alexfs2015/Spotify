package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: onh reason: default package */
public final class onh implements vua<ong> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<onb> c;
    private final wlc<a> d;

    private onh(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<onb> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static onh a(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<onb> wlc3, wlc<a> wlc4) {
        return new onh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        wlc<Picasso> wlc = this.a;
        wlc<Context> wlc2 = this.b;
        wlc<onb> wlc3 = this.c;
        ong ong = new ong(wlc, wlc2, wlc3, this.d, wlc3);
        return ong;
    }
}
