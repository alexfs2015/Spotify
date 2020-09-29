package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: uoj reason: default package */
public final class uoj implements wig<uoi> {
    private final wzi<Context> a;
    private final wzi<jyx> b;
    private final wzi<Picasso> c;
    private final wzi<uom> d;

    private uoj(wzi<Context> wzi, wzi<jyx> wzi2, wzi<Picasso> wzi3, wzi<uom> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uoj a(wzi<Context> wzi, wzi<jyx> wzi2, wzi<Picasso> wzi3, wzi<uom> wzi4) {
        return new uoj(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new uoi((Context) this.a.get(), (jyx) this.b.get(), (Picasso) this.c.get(), (uom) this.d.get());
    }
}
