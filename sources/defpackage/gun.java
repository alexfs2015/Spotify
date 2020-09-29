package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.album.model.Album;
import com.spotify.music.libs.album.model.AlbumArtist;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gun reason: default package */
public final class gun {
    private final String a;
    private final gmm<Album> b;

    public gun(gmm<Album> gmm, String str) {
        this.b = gmm;
        this.a = (String) fbp.a(str);
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

    public final xim<List<PlayerTrack>> a() {
        return this.b.resolve(new Request(Request.GET, String.format("hm://album/v1/album-app/album/%s/android", new Object[]{this.a}))).e((xiy<? super T, ? extends R>) new $$Lambda$gun$4PiwrtsJ5LlQIx_7aWdiY60gSvA<Object,Object>(this)).a();
    }
}
