package defpackage;

import android.widget.ImageView;

/* renamed from: kry reason: default package */
public final class kry implements ksp {
    private final String a;
    private final jwv b;

    public kry(String str, jwv jwv) {
        this.a = str;
        this.b = jwv;
    }

    public final void a(ImageView imageView) {
        this.b.c(imageView, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kry)) {
            return false;
        }
        return this.a.equals(((kry) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
