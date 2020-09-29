package defpackage;

import io.netty.util.IllegalReferenceCountException;

/* renamed from: wrp reason: default package */
public final class wrp extends wrv implements wrz {
    private final wnb b;
    private final wsg c;
    private int d;

    private wrp(wst wst, wsr wsr, wnb wnb, boolean z, boolean z2) {
        super(wst, wsr, z, false);
        this.b = (wnb) wxq.a(wnb, "content");
        this.c = new wrr(z);
    }

    public wrp(wst wst, wsr wsr, boolean z) {
        this(wst, wsr, woc.a(0), z, false);
    }

    public final boolean B() {
        return this.b.B();
    }

    public final wnb a() {
        return this.b;
    }

    public final /* synthetic */ wvo b(Object obj) {
        this.b.b(obj);
        return this;
    }

    public final wsg c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wrp)) {
            return false;
        }
        wrp wrp = (wrp) obj;
        return super.equals(wrp) && this.b.equals(wrp.b) && this.c.equals(wrp.c);
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

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(wxt.a((Object) this));
        sb.append("(decodeResult: ");
        sb.append(b());
        sb.append(", version: ");
        sb.append(e());
        sb.append(", content: ");
        sb.append(a());
        sb.append(')');
        sb.append(wxt.a);
        wsj.a(sb, (wsp) this);
        wsj.a(sb, d());
        wsj.a(sb, c());
        wsj.a(sb);
        return sb.toString();
    }

    public final int z() {
        return this.b.z();
    }
}
