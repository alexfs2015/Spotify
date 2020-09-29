package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rrm reason: default package */
public final class rrm implements wig<rrl> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<hap> c;

    private rrm(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<hap> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rrm a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<hap> wzi3) {
        return new rrm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rrl((Context) this.a.get(), (Picasso) this.b.get(), (hap) this.c.get());
    }
}
