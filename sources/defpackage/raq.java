package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.feedback.FeedbackValue;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: raq reason: default package */
public final class raq {
    private final tjv a;

    public raq(tjv tjv) {
        this.a = tjv;
    }

    public final boolean a(PlayerState playerState) {
        return b(playerState) || a((String) playerState.contextMetadata().get(Metadata.FORMAT_LIST_TYPE));
    }

    public static boolean b(PlayerState playerState) {
        return a((String) playerState.contextMetadata().get(PlayerTrack.Metadata.LIKE_FEEDBACK_AVAILABLE), (String) playerState.contextMetadata().get(PlayerTrack.Metadata.DISLIKE_FEEDBACK_AVAILABLE));
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

    public final boolean a(String str) {
        return this.a.a(str) == FormatListType.DAILY_MIX;
    }
}
