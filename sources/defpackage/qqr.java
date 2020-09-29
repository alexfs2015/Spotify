package defpackage;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

/* renamed from: qqr reason: default package */
public final class qqr implements wig<qqq> {
    private final wzi<LayoutInflater> a;
    private final wzi<Picasso> b;

    private qqr(wzi<LayoutInflater> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qqr a(wzi<LayoutInflater> wzi, wzi<Picasso> wzi2) {
        return new qqr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qqq((LayoutInflater) this.a.get(), (Picasso) this.b.get());
    }
}
