package defpackage;

import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat.a;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sdd reason: default package */
public final class sdd {
    public static final sdd a = new sdd();
    final List<QueueItem> b;

    private sdd() {
        this.b = new ArrayList(0);
    }

    public sdd(hre hre, PlayerQueue playerQueue) {
        int i;
        PlayerTrack track = playerQueue.track();
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        this.b = new ArrayList(nextTracks.length + (track == null ? 0 : 1));
        if (track != null) {
            this.b.add(a(hre, track, 0));
            i = 1;
        } else {
            i = 0;
        }
        for (PlayerTrack a2 : nextTracks) {
            this.b.add(a(hre, a2, (long) i));
            i++;
        }
    }

    private QueueItem a(hre hre, PlayerTrack playerTrack, long j) {
        Uri a2 = hre.a(a(playerTrack));
        a aVar = new a();
        aVar.f = a2;
        aVar.b = (CharSequence) playerTrack.metadata().get("title");
        aVar.c = (CharSequence) playerTrack.metadata().get("artist_name");
        aVar.g = new gqn().a(Boolean.valueOf((String) playerTrack.metadata().get("is_explicit"))).a;
        aVar.a = playerTrack.uri();
        return new QueueItem(aVar.a(), j);
    }

    private static String a(PlayerTrack playerTrack) {
        String str = "image_small_url";
        if (playerTrack.metadata().containsKey(str)) {
            return (String) playerTrack.metadata().get(str);
        }
        String str2 = "image_url";
        return playerTrack.metadata().containsKey(str2) ? (String) playerTrack.metadata().get(str2) : "";
    }
}
