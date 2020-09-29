package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;

/* renamed from: rup reason: default package */
public final class rup {
    public static Intent a(Intent intent, PlayerState playerState) {
        b(intent, playerState);
        boolean z = true;
        intent.putExtra("playing", !playerState.isPaused() && playerState.isPlaying());
        if (playerState.isPaused() || !playerState.isPlaying()) {
            z = false;
        }
        intent.putExtra("playstate", z);
        return intent;
    }

    public static void b(Intent intent, PlayerState playerState) {
        PlayerTrack track = playerState.track();
        String str = "";
        intent.putExtra("id", track != null ? track.uri() : str);
        intent.putExtra(TrackData.TYPE_TRACK, track != null ? (String) track.metadata().get("title") : str);
        intent.putExtra("artist", track != null ? (String) track.metadata().get("artist_name") : str);
        intent.putExtra("album", track != null ? (String) track.metadata().get("album_title") : str);
        if (track != null) {
            str = (String) track.metadata().get("album_uri");
        }
        intent.putExtra("albumId", str);
        intent.putExtra("duration", playerState.duration());
        intent.putExtra("position", playerState.currentPlaybackPosition());
        intent.putExtra("length", (int) playerState.duration());
        intent.putExtra("playbackPosition", (int) playerState.currentPlaybackPosition());
    }
}
