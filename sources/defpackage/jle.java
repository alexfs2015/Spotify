package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: jle reason: default package */
public final class jle implements wig<jld> {
    private final wzi<Picasso> a;

    private jle(wzi<Picasso> wzi) {
        this.a = wzi;
    }

    public static jle a(wzi<Picasso> wzi) {
        return new jle(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jld((Picasso) this.a.get());
    }
}
