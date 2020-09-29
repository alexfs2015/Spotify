package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: jyy reason: default package */
public final class jyy implements wig<jyx> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;

    private jyy(wzi<Context> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jyy a(wzi<Context> wzi, wzi<Picasso> wzi2) {
        return new jyy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jyx((Context) this.a.get(), (Picasso) this.b.get());
    }
}
