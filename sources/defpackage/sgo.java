package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show;

/* renamed from: sgo reason: default package */
final class sgo extends sgv {
    private final Show a;
    private final Optional<vkv> b;

    sgo(Show show, Optional<vkv> optional) {
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

    public final Optional<vkv> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgv) {
            sgv sgv = (sgv) obj;
            return this.a.equals(sgv.a()) && this.b.equals(sgv.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowEntityResponse{show=");
        sb.append(this.a);
        sb.append(", episode=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
