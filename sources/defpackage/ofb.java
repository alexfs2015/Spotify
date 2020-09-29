package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: ofb reason: default package */
final class ofb extends ofj {
    private final knx<Context, Drawable> a;
    private final int b;

    ofb(knx<Context, Drawable> knx, int i) {
        if (knx != null) {
            this.a = knx;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null drawable");
    }

    /* access modifiers changed from: 0000 */
    public final knx<Context, Drawable> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofj) {
            ofj ofj = (ofj) obj;
            return this.a.equals(ofj.a()) && this.b == ofj.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPauseViewData{drawable=");
        sb.append(this.a);
        sb.append(", contentDescriptionResId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
