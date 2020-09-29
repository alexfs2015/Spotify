package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: gzb reason: default package */
public final class gzb {
    static PlayerContextPage[] a(gzq[] gzqArr) {
        if (gzqArr == null) {
            return null;
        }
        PlayerContextPage[] playerContextPageArr = new PlayerContextPage[gzqArr.length];
        for (int i = 0; i < gzqArr.length; i++) {
            playerContextPageArr[i] = a(gzqArr[i]);
        }
        return playerContextPageArr;
    }

    private static PlayerContextPage a(gzq gzq) {
        return new PlayerContextPage(gzq.string("page_url"), gzq.string("next_page_url"), gze.a(gzq.bundleArray("tracks")), gzc.a(gzq.bundle("metadata")));
    }

    public static gzq[] a(PlayerContextPage[] playerContextPageArr) {
        if (playerContextPageArr == null) {
            return null;
        }
        gzq[] gzqArr = new gzq[playerContextPageArr.length];
        for (int i = 0; i < playerContextPageArr.length; i++) {
            gzqArr[i] = a(playerContextPageArr[i]);
        }
        return gzqArr;
    }

    private static gzq a(PlayerContextPage playerContextPage) {
        return HubsImmutableComponentBundle.builder().a("page_url", playerContextPage.pageUrl()).a("next_page_url", playerContextPage.nextPageUrl()).a("tracks", gze.a(playerContextPage.tracks())).a("metadata", gzc.a(playerContextPage.metadata())).a();
    }
}
