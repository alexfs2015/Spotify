package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: loi reason: default package */
public final class loi extends loj {
    private final Album a;
    private final lol b;
    private final boolean c;
    private final boolean d;
    private final iql e;

    public loi(Album album, lol lol, boolean z, boolean z2, iql iql) {
        if (album != null) {
            this.a = album;
            if (lol != null) {
                this.b = lol;
                this.c = z;
                this.d = z2;
                if (iql != null) {
                    this.e = iql;
                    return;
                }
                throw new NullPointerException("Null getDownloadableAlbum");
            }
            throw new NullPointerException("Null getToolbarModel");
        }
        throw new NullPointerException("Null getAlbum");
    }

    public final Album a() {
        return this.a;
    }

    public final lol b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final iql e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewAlbumViewModel{getAlbum=");
        sb.append(this.a);
        sb.append(", getToolbarModel=");
        sb.append(this.b);
        sb.append(", isInCollection=");
        sb.append(this.c);
        sb.append(", shouldDisableExplicitTracks=");
        sb.append(this.d);
        sb.append(", getDownloadableAlbum=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof loj) {
            loj loj = (loj) obj;
            return this.a.equals(loj.a()) && this.b.equals(loj.b()) && this.c == loj.c() && this.d == loj.d() && this.e.equals(loj.e());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.e.hashCode();
    }
}
