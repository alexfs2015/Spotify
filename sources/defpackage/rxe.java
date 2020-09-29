package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show;

/* renamed from: rxe reason: default package */
final class rxe extends rxl {
    private final Show a;
    private final Optional<uys> b;

    rxe(Show show, Optional<uys> optional) {
        if (show != null) {
            this.a = show;
            if (optional != null) {
                this.b = optional;
                return;
            }
            throw new NullPointerException("Null episode");
        }
        throw new NullPointerException("Null show");
    }

    public final Show a() {
        return this.a;
    }

    public final Optional<uys> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowEntityResponse{show=");
        sb.append(this.a);
        sb.append(", episode=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rxl) {
            rxl rxl = (rxl) obj;
            return this.a.equals(rxl.a()) && this.b.equals(rxl.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
