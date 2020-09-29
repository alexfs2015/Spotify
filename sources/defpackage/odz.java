package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.nowplayingbar.domain.model.Track;

/* renamed from: odz reason: default package */
public final class odz extends oef {
    private final Optional<Track> a;
    private final Track b;
    private final Optional<Track> c;

    public odz(Optional<Track> optional, Track track, Optional<Track> optional2) {
        if (optional != null) {
            this.a = optional;
            if (track != null) {
                this.b = track;
                if (optional2 != null) {
                    this.c = optional2;
                    return;
                }
                throw new NullPointerException("Null next");
            }
            throw new NullPointerException("Null current");
        }
        throw new NullPointerException("Null previous");
    }

    public final Optional<Track> a() {
        return this.a;
    }

    public final Track b() {
        return this.b;
    }

    public final Optional<Track> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oef) {
            oef oef = (oef) obj;
            return this.a.equals(oef.a()) && this.b.equals(oef.b()) && this.c.equals(oef.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tracks{previous=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", next=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
