package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ueq reason: default package */
public final class ueq implements wig<uep> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<uel> c;

    private ueq(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<uel> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ueq a(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<uel> wzi3) {
        return new ueq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uep((Picasso) this.a.get(), (Context) this.b.get(), (uel) this.c.get());
    }
}
