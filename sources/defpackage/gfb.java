package defpackage;

import java.util.Arrays;

/* renamed from: gfb reason: default package */
final class gfb extends gfx {
    private final String a;
    private final byte[] b;
    private final boolean c;

    gfb(String str, byte[] bArr, boolean z) {
        if (str != null) {
            this.a = str;
            if (bArr != null) {
                this.b = bArr;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null payload");
        }
        throw new NullPointerException("Null eventName");
    }

    public final String a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfx) {
            gfx gfx = (gfx) obj;
            if (this.a.equals(gfx.a())) {
                return Arrays.equals(this.b, gfx instanceof gfb ? ((gfb) gfx).b : gfx.b()) && this.c == gfx.c();
            }
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingEvent{eventName=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(Arrays.toString(this.b));
        sb.append(", authenticated=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
