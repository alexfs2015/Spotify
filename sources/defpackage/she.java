package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: she reason: default package */
public final class she implements wig<shd> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;

    private she(wzi<Picasso> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static she a(wzi<Picasso> wzi, wzi<Context> wzi2) {
        return new she(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new shd((Picasso) this.a.get(), (Context) this.b.get());
    }
}
