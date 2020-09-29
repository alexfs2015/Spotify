package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.model.ArtistModel.Track;
import com.spotify.music.artist.uri.ArtistUri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gup reason: default package */
public final class gup implements gus {
    private final String a;
    private final ktn b;

    public gup(jva jva, ktn ktn) {
        this.a = jva.h();
        this.b = ktn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(ArtistModel artistModel) {
        String str = artistModel.uri;
        List<Track> list = artistModel.topTracks;
        ArrayList arrayList = new ArrayList(list.size());
        for (Track track : list) {
            arrayList.add(PlayerTrack.create(track.uri, null, str, null, null));
        }
        return PlayerContext.create(this.a, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[arrayList.size()]));
    }

    public final xii<PlayerContext> resolve() {
        return this.b.a(new ArtistUri(this.a).a).e((xiy<? super T, ? extends R>) new $$Lambda$gup$NWhwdWU3bLyzMJrw0d8LlaoZMVM<Object,Object>(this));
    }
}
