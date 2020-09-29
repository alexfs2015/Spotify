package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: nyp reason: default package */
final class nyp extends nyx {
    private final kko<Context, Drawable> a;
    private final int b;

    nyp(kko<Context, Drawable> kko, int i) {
        if (kko != null) {
            this.a = kko;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null drawable");
    }

    /* access modifiers changed from: 0000 */
    public final kko<Context, Drawable> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPauseViewData{drawable=");
        sb.append(this.a);
        sb.append(", contentDescriptionResId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nyx) {
            nyx nyx = (nyx) obj;
            return this.a.equals(nyx.a()) && this.b == nyx.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
