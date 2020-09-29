package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.libs.search.offline.model.OfflineEpisode;
import com.spotify.music.libs.search.offline.model.OfflinePlaylist;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import com.spotify.music.libs.search.offline.model.OfflineTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: srk reason: default package */
public final class srk implements srf<hcs> {
    private final srg a;
    private final siv b;

    public srk(srg srg, siv siv) {
        this.a = srg;
        this.b = siv;
    }

    public final /* synthetic */ Object a(OfflineResults offlineResults) {
        List list;
        fbp.a(offlineResults);
        String str = offlineResults.searchTerm;
        List<OfflineTrack> list2 = offlineResults.tracks.hits;
        List<OfflineEpisode> list3 = offlineResults.episodes.hits;
        List<OfflinePlaylist> list4 = offlineResults.playlists.hits;
        if (list2.isEmpty() && list3.isEmpty() && list4.isEmpty()) {
            return this.b.a(str, true);
        }
        srg srg = this.a;
        if (list2.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List a2 = srg.a(list2, srg.a.a());
            for (int i = 0; i < list2.size(); i++) {
                OfflineTrack offlineTrack = (OfflineTrack) list2.get(i);
                String a3 = srg.a(i);
                StringBuilder sb = new StringBuilder();
                sb.append(offlineTrack.artists());
                if (offlineTrack.album != null) {
                    sb.append(" • ");
                    sb.append(offlineTrack.album.name);
                }
                a2.add(srg.a(a3, offlineTrack.getUri(), offlineTrack.getName(), srg.a(offlineTrack.album != null ? offlineTrack.album.getImageUri() : null, SpotifyIconV2.TRACK), sb.toString()));
            }
            list = a2;
        }
        List a4 = srg.a(list3);
        List b2 = srg.b(list4);
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(a4);
        arrayList.addAll(b2);
        return hdb.builder().b((List<? extends hcm>) arrayList).b(six.a(str)).a();
    }
}
