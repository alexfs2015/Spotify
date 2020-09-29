package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.video.model.PlayerError;
import java.util.Set;

/* renamed from: hbs reason: default package */
public final class hbs {
    public static PlayOptions a(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        PlayOptionsSkipTo b = b(hcj.bundle("skip_to"));
        Long longValue = hcj.longValue("seek_to");
        boolean boolValue = hcj.boolValue("initially_paused", false);
        PlayerOptionsOverrides d = d(hcj.bundle("player_options_override"));
        PlayerSuppressions c = c(hcj.bundle("suppressions"));
        return new Builder().skipTo(b).seekTo(longValue).initiallyPaused(boolValue).playerOptionsOverride(d).suppressions(c).allowSeeking(hcj.boolValue("allow_seeking", false)).build();
    }

    private static PlayOptionsSkipTo b(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(hcj.string("page_url"), (int) hcj.longValue("page_index", 0), hcj.string("track_uid"), hcj.string(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY), (int) hcj.longValue("track_index", 0));
        return playOptionsSkipTo;
    }

    private static PlayerSuppressions c(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        String[] stringArray = hcj.stringArray("providers");
        if (stringArray == null) {
            return null;
        }
        return new PlayerSuppressions((Set<String>) ImmutableSet.a((E[]) stringArray));
    }

    private static PlayerOptionsOverrides d(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        return PlayerOptionsOverrides.create(hcj.boolValue("shuffling_context"), hcj.boolValue("repeating_context"), hcj.boolValue("repeating_track"));
    }
}
