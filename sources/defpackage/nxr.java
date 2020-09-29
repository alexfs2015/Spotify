package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;
import java.util.Map;

/* renamed from: nxr reason: default package */
public final class nxr {
    public static Track a(PlayerTrack playerTrack) {
        String str;
        Map metadata = playerTrack.metadata();
        String str2 = (String) playerTrack.metadata().get("context_uri");
        StringBuilder sb = new StringBuilder();
        sb.append(playerTrack.uid());
        sb.append(str2);
        String sb2 = sb.toString();
        String uri = playerTrack.uri();
        String b = fax.b((String) metadata.get("title"));
        if (b(playerTrack) == Type.AD) {
            str = fax.b((String) playerTrack.metadata().get("advertiser"));
        } else {
            str = fax.b((String) playerTrack.metadata().get("artist_name"));
        }
        return Track.a(sb2, uri, b, str, Boolean.parseBoolean((String) metadata.get("collection.can_add")), Boolean.parseBoolean((String) metadata.get("collection.in_collection")), b(playerTrack));
    }

    private static Type b(PlayerTrack playerTrack) {
        if (PlayerTrackUtil.isInterruptionFromAds(playerTrack)) {
            return Type.INTERRUPTION;
        }
        if (PlayerTrackUtil.isAd(playerTrack)) {
            return Type.AD;
        }
        return Type.TRACK;
    }
}
