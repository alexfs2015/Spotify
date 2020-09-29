package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering.a;

/* renamed from: rff reason: default package */
public final class rff extends a {
    private final String a;
    private final String b;
    private final Boolean c;

    public rff(String str, String str2, Boolean bool) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (bool != null) {
                    this.c = bool;
                    return;
                }
                throw new NullPointerException("Null state");
            }
            throw new NullPointerException("Null filter");
        }
        throw new NullPointerException("Null uri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterStateUpdate{uri=");
        sb.append(this.a);
        sb.append(", filter=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
