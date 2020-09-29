package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.model.ArtistModel.Track;
import com.spotify.music.artist.uri.ArtistUri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gsq reason: default package */
public final class gsq implements gst {
    private final String a;
    private final kqe b;

    public gsq(jst jst, kqe kqe) {
        this.a = jst.h();
        this.b = kqe;
    }

    public final wud<PlayerContext> resolve() {
        return this.b.a(new ArtistUri(this.a).a).f(new $$Lambda$gsq$7Mdx1MIYgv81U4zIyrQ6h5IHlI(this));
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
}
