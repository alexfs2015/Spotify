package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rsz reason: default package */
public final class rsz implements wig<rsy> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;

    private rsz(wzi<Picasso> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rsz a(wzi<Picasso> wzi, wzi<Context> wzi2) {
        return new rsz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rsy((Picasso) this.a.get(), (Context) this.b.get());
    }
}
