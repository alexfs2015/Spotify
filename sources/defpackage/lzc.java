package defpackage;

import android.graphics.Rect;

/* renamed from: lzc reason: default package */
final class lzc extends lzp {
    private final Rect a;
    private final String b;
    private final String c;

    lzc(Rect rect, String str, String str2) {
        if (rect != null) {
            this.a = rect;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null accessibilityText");
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null viewBounds");
    }

    public final Rect a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzp) {
            lzp lzp = (lzp) obj;
            return this.a.equals(lzp.a()) && this.b.equals(lzp.b()) && this.c.equals(lzp.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFieldButtonData{viewBounds=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}