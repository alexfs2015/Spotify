package defpackage;

import android.content.Context;

/* renamed from: nyr reason: default package */
public final class nyr extends nyz {
    private final boolean a;
    private final kko<Context, Boolean> b;

    public nyr(boolean z, kko<Context, Boolean> kko) {
        this.a = z;
        if (kko != null) {
            this.b = kko;
            return;
        }
        throw new NullPointerException("Null visible");
    }

    public final boolean a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final kko<Context, Boolean> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipNextViewData{enabled=");
        sb.append(this.a);
        sb.append(", visible=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nyz) {
            nyz nyz = (nyz) obj;
            return this.a == nyz.a() && this.b.equals(nyz.b());
        }
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
