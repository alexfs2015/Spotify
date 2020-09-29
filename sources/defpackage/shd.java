package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.libs.search.offline.model.OfflineEpisode;
import com.spotify.music.libs.search.offline.model.OfflinePlaylist;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import com.spotify.music.libs.search.offline.model.OfflineTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: shd reason: default package */
public final class shd implements sgy<gzz> {
    private final sgz a;
    private final rzh b;

    public shd(sgz sgz, rzh rzh) {
        this.a = sgz;
        this.b = rzh;
    }

    public final /* synthetic */ Object a(OfflineResults offlineResults) {
        List list;
        fay.a(offlineResults);
        String str = offlineResults.searchTerm;
        List<OfflineTrack> list2 = offlineResults.tracks.hits;
        List<OfflineEpisode> list3 = offlineResults.episodes.hits;
        List<OfflinePlaylist> list4 = offlineResults.playlists.hits;
        if (list2.isEmpty() && list3.isEmpty() && list4.isEmpty()) {
            return this.b.a(str, true);
        }
        sgz sgz = this.a;
        if (list2.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List a2 = sgz.a(list2, sgz.a.a());
            for (int i = 0; i < list2.size(); i++) {
                OfflineTrack offlineTrack = (OfflineTrack) list2.get(i);
                String a3 = sgz.a(i);
                StringBuilder sb = new StringBuilder();
                sb.append(offlineTrack.artists());
                if (offlineTrack.album != null) {
                    sb.append(" • ");
                    sb.append(offlineTrack.album.name);
                }
                a2.add(sgz.a(a3, offlineTrack.getUri(), offlineTrack.getName(), sgz.a(offlineTrack.album != null ? offlineTrack.album.getImageUri() : null, SpotifyIconV2.TRACK), sb.toString()));
            }
            list = a2;
        }
        List a4 = sgz.a(list3);
        List b2 = sgz.b(list4);
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(a4);
        arrayList.addAll(b2);
        return hai.builder().b((List<? extends gzt>) arrayList).b(rzj.a(str)).a();
    }
}
