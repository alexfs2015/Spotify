package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator.a;

/* renamed from: kfr reason: default package */
public final class kfr extends a {
    private final int a;
    private final int b;
    private final String c;

    public kfr(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder{start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a == aVar.a() && this.b == aVar.b() && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }
}
