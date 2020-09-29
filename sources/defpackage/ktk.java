package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ktk reason: default package */
public final class ktk implements wig<ktj> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;

    private ktk(wzi<Context> wzi, wzi<Picasso> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ktk a(wzi<Context> wzi, wzi<Picasso> wzi2) {
        return new ktk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ktj(this.a, this.b);
    }
}
