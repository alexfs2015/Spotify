package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.libs.search.offline.model.OfflineEpisode;
import com.spotify.music.libs.search.offline.model.OfflineSearchEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qag reason: default package */
public final class qag {
    final shc a;

    public qag(shc shc) {
        this.a = shc;
    }

    public final List<gzt> a(List<OfflineEpisode> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        List<gzt> a2 = a(list, this.a.b());
        for (int i = 0; i < list.size(); i++) {
            OfflineEpisode offlineEpisode = (OfflineEpisode) list.get(i);
            String b = this.a.b().b();
            a2.add(a(a(i), i, offlineEpisode.getUri(), offlineEpisode.getName(), a(offlineEpisode.getImageUri(), SpotifyIconV2.PLAY), b));
        }
        return a2;
    }

    static <T extends OfflineSearchEntity> List<gzt> a(List<T> list, shb shb) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(a(shb.a()));
        return arrayList;
    }

    static gzt a(String str, int i, String str2, String str3, gzw gzw, String str4) {
        gzp a2 = gvx.a(str2, str3);
        a a3 = hae.builder().a(str).a((gzr) HubsGlueRow.NORMAL).a(had.builder().a(gzw)).a(haf.builder().a(str3).b(str4).a()).a("longClick", a2).a("rightAccessoryClick", a2);
        String str5 = "offline-results";
        return a3.a("click", pzn.a(str2, i, str5)).a((gzy) gzx.a(str2)).c(HubsImmutableComponentBundle.create().toBuilder().a("section_id", str5).a()).a();
    }

    static String a(int i) {
        StringBuilder sb = new StringBuilder("offline-results-");
        sb.append(i);
        return sb.toString();
    }

    private static gzt a(String str) {
        return hae.builder().a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(haf.builder().a(str).a()).a();
    }

    static gzw a(String str, SpotifyIconV2 spotifyIconV2) {
        if (!fax.a(str)) {
            return gxs.a(hag.builder().a(str).a(), str);
        }
        return hag.builder().a((Enum<?>) spotifyIconV2).a();
    }
}
