package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.offline.model.OfflineEpisode;
import com.spotify.music.libs.search.offline.model.OfflinePlaylist;
import com.spotify.music.libs.search.offline.model.OfflineSearchEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: srg reason: default package */
public final class srg {
    final srj a;

    public srg(srj srj) {
        this.a = srj;
    }

    private static hcm a(String str) {
        return hcx.builder().a((hck) HubsGlueSectionHeader.SECTION_HEADER).a(hcy.builder().a(str).a()).a();
    }

    static hcm a(String str, String str2, String str3, hcp hcp, String str4) {
        hci a2 = gxy.a(str2, str3);
        return hcx.builder().a(str).a((hck) HubsGlueRow.NORMAL).a(hcw.builder().a(hcp)).a(hcy.builder().a(str3).b(str4).a()).a("longClick", a2).a("rightAccessoryClick", a2).a((hcr) hcq.a(str2)).c(HubsImmutableComponentBundle.create().toBuilder().a("section_id", "offline-results").a()).a();
    }

    static hcp a(String str, SpotifyIconV2 spotifyIconV2) {
        return !fbo.a(str) ? hal.a(hcz.builder().a(str).a(), str) : hcz.builder().a((Enum<?>) spotifyIconV2).a();
    }

    static String a(int i) {
        StringBuilder sb = new StringBuilder("offline-results-");
        sb.append(i);
        return sb.toString();
    }

    static <T extends OfflineSearchEntity> List<hcm> a(List<T> list, sri sri) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(a(sri.a()));
        return arrayList;
    }

    public final List<hcm> a(List<OfflineEpisode> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<hcm> a2 = a(list, this.a.b());
        for (int i = 0; i < list.size(); i++) {
            OfflineEpisode offlineEpisode = (OfflineEpisode) list.get(i);
            a2.add(a(a(i), offlineEpisode.getUri(), offlineEpisode.getName(), a(offlineEpisode.getImageUri(), SpotifyIconV2.PLAY), this.a.b().b()));
        }
        return a2;
    }

    public final List<hcm> b(List<OfflinePlaylist> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<hcm> a2 = a(list, this.a.c());
        for (int i = 0; i < list.size(); i++) {
            OfflinePlaylist offlinePlaylist = (OfflinePlaylist) list.get(i);
            a2.add(a(a(i), offlinePlaylist.getUri(), offlinePlaylist.getName(), hcz.builder().a((Enum<?>) SpotifyIconV2.PLAYLIST).a(), this.a.c().b()));
        }
        return a2;
    }
}
