package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ugm reason: default package */
public final class ugm implements wig<ugl> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;

    private ugm(wzi<Context> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ugm a(wzi<Context> wzi, wzi<Picasso> wzi2) {
        return new ugm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ugl((Context) this.a.get(), (Picasso) this.b.get());
    }
}
