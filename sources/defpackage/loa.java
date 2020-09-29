package defpackage;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineAlbum;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineTrack;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.a;
import java.util.List;

/* renamed from: loa reason: default package */
public final class loa extends a {
    private final List<OfflineTrack> a;
    private final OfflineAlbum b;

    public loa(List<OfflineTrack> list, OfflineAlbum offlineAlbum) {
        if (list != null) {
            this.a = list;
            if (offlineAlbum != null) {
                this.b = offlineAlbum;
                return;
            }
            throw new NullPointerException("Null album");
        }
        throw new NullPointerException("Null tracks");
    }

    public final List<OfflineTrack> a() {
        return this.a;
    }

    public final OfflineAlbum b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineState{tracks=");
        sb.append(this.a);
        sb.append(", album=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
