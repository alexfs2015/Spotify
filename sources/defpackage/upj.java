package defpackage;

import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: upj reason: default package */
public final class upj {
    public static InteractionAction a(String str, boolean z) {
        switch (jst.a(str).b) {
            case ALBUM:
            case FORMAT_LIST_DATA_SAVER:
            case FORMAT_LIST_HOME_MIX:
            case FORMAT_LIST_PERSONALIZED_SETS:
            case PLAYLIST_AUTOPLAY:
            case PLAYLIST_ENTITY_EXAMPLE:
            case PLAYLIST_V2:
            case PLAYLIST_V2_AUTOPLAY:
            case PROFILE_PLAYLIST:
            case TRACK:
                return z ? InteractionAction.LIKE : InteractionAction.UNLIKE;
            case ARTIST:
            case SHOW_SHOW:
            case SHOW_PODCAST:
            case PROFILE:
                if (z) {
                    return InteractionAction.FOLLOW;
                }
                return InteractionAction.UNFOLLOW;
            default:
                return null;
        }
    }
}
