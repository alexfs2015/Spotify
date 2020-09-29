package defpackage;

import io.netty.util.IllegalReferenceCountException;

/* renamed from: wdj reason: default package */
public final class wdj extends wdp implements wdt {
    private final vyv b;
    private final wea c;
    private int d;

    public wdj(wen wen, wel wel, boolean z) {
        this(wen, wel, vzw.a(0), z, false);
    }

    private wdj(wen wen, wel wel, vyv vyv, boolean z, boolean z2) {
        super(wen, wel, z, false);
        this.b = (vyv) wjk.a(vyv, "content");
        this.c = new wdl(z);
    }

    public final wea c() {
        return this.c;
    }

    public final vyv a() {
        return this.b;
    }

    public final int z() {
        return this.b.z();
    }

    public final boolean B() {
        return this.b.B();
    }

    public final int hashCode() {
        int i;
        int i2 = this.d;
        if (i2 != 0) {
            return i2;
        }
        if (this.b.z() != 0) {
            try {
                i = this.b.hashCode() + 31;
            } catch (IllegalReferenceCountException unused) {
            }
            int hashCode = (((i * 31) + this.c.hashCode()) * 31) + super.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        i = 31;
        int hashCode2 = (((i * 31) + this.c.hashCode()) * 31) + super.hashCode();
        this.d = hashCode2;
        return hashCode2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wdj)) {
            return false;
        }
        wdj wdj = (wdj) obj;
        if (!super.equals(wdj) || !this.b.equals(wdj.b) || !this.c.equals(wdj.c)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(wjn.a((Object) this));
        sb.append("(decodeResult: ");
        sb.append(b());
        sb.append(", version: ");
        sb.append(e());
        sb.append(", content: ");
        sb.append(a());
        sb.append(')');
        sb.append(wjn.a);
        wed.a(sb, (wej) this);
        wed.a(sb, d());
        wed.a(sb, c());
        wed.a(sb);
        return sb.toString();
    }

    public final /* synthetic */ whi b(Object obj) {
        this.b.b(obj);
        return this;
    }
}
