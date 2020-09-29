package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: nlb reason: default package */
public final class nlb implements wig<wgj> {
    private final wzi<Picasso> a;
    private final wzi<Context> b;

    private nlb(wzi<Picasso> wzi, wzi<Context> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlb a(wzi<Picasso> wzi, wzi<Context> wzi2) {
        return new nlb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (wgj) wil.a(new wgj(new wgu((Picasso) this.a.get()), (Context) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
