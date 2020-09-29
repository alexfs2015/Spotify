package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.feedback.FeedbackValue;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: rjm reason: default package */
public final class rjm {
    private final tvn a;

    public rjm(tvn tvn) {
        this.a = tvn;
    }

    private static boolean a(String str, String str2) {
        FeedbackValue a2 = FeedbackValue.a(str);
        FeedbackValue a3 = FeedbackValue.a(str2);
        if (FeedbackValue.ON == a2 || FeedbackValue.ON == a3) {
            return true;
        }
        if (FeedbackValue.OFF == a2 || FeedbackValue.OFF == a3) {
        }
        return false;
    }

    public static boolean b(PlayerState playerState) {
        return a((String) playerState.contextMetadata().get(Metadata.LIKE_FEEDBACK_AVAILABLE), (String) playerState.contextMetadata().get(Metadata.DISLIKE_FEEDBACK_AVAILABLE));
    }

    public final boolean a(PlayerState playerState) {
        return b(playerState) || a((String) playerState.contextMetadata().get(PlayerContext.Metadata.FORMAT_LIST_TYPE));
    }

    public final boolean a(String str) {
        return this.a.a(str) == FormatListType.DAILY_MIX;
    }
}
