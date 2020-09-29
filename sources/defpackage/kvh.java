package defpackage;

import android.widget.ImageView;

/* renamed from: kvh reason: default package */
public final class kvh implements kvy {
    private final String a;
    private final jyx b;

    public kvh(String str, jyx jyx) {
        this.a = str;
        this.b = jyx;
    }

    public final void a(ImageView imageView) {
        this.b.c(imageView, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvh)) {
            return false;
        }
        return this.a.equals(((kvh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
