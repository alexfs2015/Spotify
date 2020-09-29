package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: uhi reason: default package */
public final class uhi {

    /* renamed from: uhi$a */
    public static class a implements b {
        public final PlayerTrack[] a(PlayerState playerState, PlayerTrack[] playerTrackArr) {
            PlayerTrack[] reverse;
            PlayerTrack[] future;
            HashSet hashSet = new HashSet(playerTrackArr.length);
            for (PlayerTrack uri : playerTrackArr) {
                hashSet.add(uri.uri());
            }
            ArrayList arrayList = new ArrayList();
            for (PlayerTrack playerTrack : playerState.reverse()) {
                if (!hashSet.contains(playerTrack.uri())) {
                    arrayList.add(playerTrack);
                }
            }
            PlayerTrack track = playerState.track();
            if (track != null && !hashSet.contains(track.uri())) {
                arrayList.add(track);
            }
            for (PlayerTrack playerTrack2 : playerState.future()) {
                if (!hashSet.contains(playerTrack2.uri())) {
                    arrayList.add(playerTrack2);
                }
            }
            return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
        }
    }

    /* renamed from: uhi$b */
    public interface b {
        PlayerTrack[] a(PlayerState playerState, PlayerTrack[] playerTrackArr);
    }

    /* renamed from: uhi$c */
    public static class c implements b {
        public final PlayerTrack[] a(PlayerState playerState, PlayerTrack[] playerTrackArr) {
            PlayerTrack[] reverse;
            PlayerTrack[] future;
            HashSet hashSet = new HashSet(playerTrackArr.length);
            for (PlayerTrack uri : playerTrackArr) {
                hashSet.add(uri.uri());
            }
            ArrayList arrayList = new ArrayList();
            for (PlayerTrack playerTrack : playerState.reverse()) {
                if (hashSet.contains(playerTrack.uri())) {
                    arrayList.add(playerTrack);
                }
            }
            PlayerTrack track = playerState.track();
            if (track != null && hashSet.contains(track.uri())) {
                arrayList.add(track);
            }
            for (PlayerTrack playerTrack2 : playerState.future()) {
                if (hashSet.contains(playerTrack2.uri())) {
                    arrayList.add(playerTrack2);
                }
            }
            return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
        }
    }
}
