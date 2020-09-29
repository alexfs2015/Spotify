package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.video.model.PlayerError;
import java.util.Set;

/* renamed from: gyz reason: default package */
public final class gyz {
    public static PlayOptions a(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        PlayOptionsSkipTo b = b(gzq.bundle("skip_to"));
        Long longValue = gzq.longValue("seek_to");
        boolean boolValue = gzq.boolValue("initially_paused", false);
        PlayerOptionsOverrides d = d(gzq.bundle("player_options_override"));
        PlayerSuppressions c = c(gzq.bundle("suppressions"));
        return new Builder().skipTo(b).seekTo(longValue).initiallyPaused(boolValue).playerOptionsOverride(d).suppressions(c).allowSeeking(gzq.boolValue("allow_seeking", false)).build();
    }

    private static PlayOptionsSkipTo b(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(gzq.string("page_url"), (int) gzq.longValue("page_index", 0), gzq.string("track_uid"), gzq.string(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY), (int) gzq.longValue("track_index", 0));
        return playOptionsSkipTo;
    }

    private static PlayerSuppressions c(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        String[] stringArray = gzq.stringArray("providers");
        if (stringArray == null) {
            return null;
        }
        return new PlayerSuppressions((Set<String>) ImmutableSet.a((E[]) stringArray));
    }

    private static PlayerOptionsOverrides d(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        return PlayerOptionsOverrides.create(gzq.boolValue("shuffling_context"), gzq.boolValue("repeating_context"), gzq.boolValue("repeating_track"));
    }
}
