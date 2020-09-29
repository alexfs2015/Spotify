package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ifw reason: default package */
public final class ifw {
    private final Picasso a;
    private final int b;

    public ifw(Picasso picasso, int i) {
        this.a = picasso;
        this.b = i;
    }

    public final ifv a(String str) {
        return new ifu(str, this.a, this.b);
    }
}
