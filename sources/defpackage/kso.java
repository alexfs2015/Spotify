package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: kso reason: default package */
public final class kso implements wig<ksn> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<sgy> c;

    private kso(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<sgy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kso a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<sgy> wzi3) {
        return new kso(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ksn((Context) this.a.get(), (Picasso) this.b.get(), (sgy) this.c.get());
    }
}
