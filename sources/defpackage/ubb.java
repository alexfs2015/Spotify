package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ubb reason: default package */
public final class ubb implements wig<uba> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<sgy> c;

    private ubb(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<sgy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ubb a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<sgy> wzi3) {
        return new ubb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uba((Context) this.a.get(), (Picasso) this.b.get(), (sgy) this.c.get());
    }
}
