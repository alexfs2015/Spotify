package defpackage;

import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;

/* renamed from: nxh reason: default package */
abstract class nxh extends Track {
    final String a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final Type g;

    nxh(String str, String str2, String str3, String str4, boolean z, boolean z2, Type type) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = z;
                        this.f = z2;
                        if (type != null) {
                            this.g = type;
                            return;
                        }
                        throw new NullPointerException("Null type");
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null uid");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final Type g() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Track{uid=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", canAddToCollection=");
        sb.append(this.e);
        sb.append(", isInCollection=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return this.a.equals(track.a()) && this.b.equals(track.b()) && this.c.equals(track.c()) && this.d.equals(track.d()) && this.e == track.e() && this.f == track.f() && this.g.equals(track.g());
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }
}
