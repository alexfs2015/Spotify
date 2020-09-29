package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.squareup.picasso.Picasso;

/* renamed from: han reason: default package */
public final class han implements wig<ham> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<BadgesFactory> c;

    private han(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<BadgesFactory> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static han a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<BadgesFactory> wzi3) {
        return new han(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ham((Context) this.a.get(), (Picasso) this.b.get(), (BadgesFactory) this.c.get());
    }
}
