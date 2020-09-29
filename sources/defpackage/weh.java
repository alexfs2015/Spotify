package defpackage;

import com.google.common.base.Optional;

/* renamed from: weh reason: default package */
public final class weh extends wem {
    private final Optional<woz> a;
    private final Optional<woz> b;

    public weh(Optional<woz> optional, Optional<woz> optional2) {
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

    public final Optional<woz> a() {
        return this.a;
    }

    public final Optional<woz> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wem) {
            wem wem = (wem) obj;
            return this.a.equals(wem.a()) && this.b.equals(wem.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NettyTestChannelHandlers{cassette=");
        sb.append(this.a);
        sb.append(", espresso=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
