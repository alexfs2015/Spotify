package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ouf reason: default package */
public final class ouf implements vua<oue> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<otz> c;
    private final wlc<jxn> d;

    private ouf(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<otz> wlc3, wlc<jxn> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ouf a(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<otz> wlc3, wlc<jxn> wlc4) {
        return new ouf(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oue(this.a, this.b, this.c, this.d);
    }
}
