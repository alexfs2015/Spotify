package defpackage;

import android.graphics.Rect;

/* renamed from: lvd reason: default package */
final class lvd extends lvq {
    private final Rect a;
    private final String b;
    private final String c;

    lvd(Rect rect, String str, String str2) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvq) {
            lvq lvq = (lvq) obj;
            return this.a.equals(lvq.a()) && this.b.equals(lvq.b()) && this.c.equals(lvq.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
