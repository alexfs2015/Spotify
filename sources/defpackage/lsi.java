package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: lsi reason: default package */
public final class lsi extends lsj {
    private final Album a;
    private final lsl b;
    private final boolean c;
    private final boolean d;
    private final isy e;

    public lsi(Album album, lsl lsl, boolean z, boolean z2, isy isy) {
        if (album != null) {
            this.a = album;
            if (lsl != null) {
                this.b = lsl;
                this.c = z;
                this.d = z2;
                if (isy != null) {
                    this.e = isy;
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

    public final lsl b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final isy e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsj) {
            lsj lsj = (lsj) obj;
            return this.a.equals(lsj.a()) && this.b.equals(lsj.b()) && this.c == lsj.c() && this.d == lsj.d() && this.e.equals(lsj.e());
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
}
