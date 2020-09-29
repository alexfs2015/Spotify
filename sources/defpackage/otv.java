package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: otv reason: default package */
public final class otv implements wig<otu> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<otp> c;
    private final wzi<a> d;

    private otv(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<otp> wzi3, wzi<a> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static otv a(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<otp> wzi3, wzi<a> wzi4) {
        return new otv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new otu(this.a, this.b, this.c, this.d);
    }
}
