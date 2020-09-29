package defpackage;

import com.google.common.base.Optional;

/* renamed from: vqz reason: default package */
public final class vqz extends vre {
    private final Optional<wat> a;
    private final Optional<wat> b;

    public vqz(Optional<wat> optional, Optional<wat> optional2) {
        if (optional != null) {
            this.a = optional;
            if (optional2 != null) {
                this.b = optional2;
                return;
            }
            throw new NullPointerException("Null espresso");
        }
        throw new NullPointerException("Null cassette");
    }

    public final Optional<wat> a() {
        return this.a;
    }

    public final Optional<wat> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NettyTestChannelHandlers{cassette=");
        sb.append(this.a);
        sb.append(", espresso=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vre) {
            vre vre = (vre) obj;
            return this.a.equals(vre.a()) && this.b.equals(vre.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
