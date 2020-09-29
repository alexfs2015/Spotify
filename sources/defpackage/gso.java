package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumArtist;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gso reason: default package */
public final class gso {
    private final String a;
    private final gky<Album> b;

    public gso(gky<Album> gky, String str) {
        this.b = gky;
        this.a = (String) fay.a(str);
    }

    public final wuh<List<PlayerTrack>> a() {
        return this.b.resolve(new Request(Request.GET, String.format("hm://album/v1/album-app/album/%s/android", new Object[]{this.a}))).f(new $$Lambda$gso$lmOSeZAcbXvuGuW0MxooDy0Lw6M(this)).a();
    }

    /* access modifiers changed from: private */
    public List<PlayerTrack> a(Album album) {
        String uri = album.getUri();
        List<AlbumTrack> tracks = album.getTracks();
        ArrayList arrayList = new ArrayList(tracks.size());
        for (AlbumTrack albumTrack : tracks) {
            if (!albumTrack.getArtists().isEmpty()) {
                arrayList.add(PlayerTrack.create(albumTrack.getUri(), uri, ((AlbumArtist) albumTrack.getArtists().get(0)).getUri()));
            }
        }
        return arrayList;
    }
}
