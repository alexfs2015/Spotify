package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: kqb reason: default package */
public final class kqb implements vua<kqa> {
    private final wlc<Context> a;
    private final wlc<Picasso> b;

    private kqb(wlc<Context> wlc, wlc<Picasso> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kqb a(wlc<Context> wlc, wlc<Picasso> wlc2) {
        return new kqb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kqa(this.a, this.b);
    }
}
