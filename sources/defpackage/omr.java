package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: omr reason: default package */
public final class omr implements vua<omq> {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<oml> c;
    private final wlc<a> d;

    private omr(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<oml> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static omr a(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<oml> wlc3, wlc<a> wlc4) {
        return new omr(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new omq(this.a, this.b, this.c, this.d);
    }
}
