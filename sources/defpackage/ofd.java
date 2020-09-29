package defpackage;

import android.content.Context;

/* renamed from: ofd reason: default package */
public final class ofd extends ofl {
    private final boolean a;
    private final knx<Context, Boolean> b;

    public ofd(boolean z, knx<Context, Boolean> knx) {
        this.a = z;
        if (knx != null) {
            this.b = knx;
            return;
        }
        throw new NullPointerException("Null visible");
    }

    public final boolean a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final knx<Context, Boolean> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofl) {
            ofl ofl = (ofl) obj;
            return this.a == ofl.a() && this.b.equals(ofl.b());
        }
    }

    public final int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipNextViewData{enabled=");
        sb.append(this.a);
        sb.append(", visible=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
