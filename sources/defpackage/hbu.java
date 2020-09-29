package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: hbu reason: default package */
public final class hbu {
    private static PlayerContextPage a(hcj hcj) {
        return new PlayerContextPage(hcj.string("page_url"), hcj.string("next_page_url"), hbx.a(hcj.bundleArray("tracks")), hbv.a(hcj.bundle("metadata")));
    }

    private static hcj a(PlayerContextPage playerContextPage) {
        return HubsImmutableComponentBundle.builder().a("page_url", playerContextPage.pageUrl()).a("next_page_url", playerContextPage.nextPageUrl()).a("tracks", hbx.a(playerContextPage.tracks())).a("metadata", hbv.a(playerContextPage.metadata())).a();
    }

    static PlayerContextPage[] a(hcj[] hcjArr) {
        if (hcjArr == null) {
            return null;
        }
        PlayerContextPage[] playerContextPageArr = new PlayerContextPage[hcjArr.length];
        for (int i = 0; i < hcjArr.length; i++) {
            playerContextPageArr[i] = a(hcjArr[i]);
        }
        return playerContextPageArr;
    }

    public static hcj[] a(PlayerContextPage[] playerContextPageArr) {
        if (playerContextPageArr == null) {
            return null;
        }
        hcj[] hcjArr = new hcj[playerContextPageArr.length];
        for (int i = 0; i < playerContextPageArr.length; i++) {
            hcjArr[i] = a(playerContextPageArr[i]);
        }
        return hcjArr;
    }
}
