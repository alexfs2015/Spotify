package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hot reason: default package */
public final class hot {
    public final List<MediaAction> a(PlayerState playerState, ugu ugu, tjv tjv) {
        return a(playerState, ugu, tjv, 100);
    }

    public static List<MediaAction> a(PlayerState playerState, ugu ugu, tjv tjv, int i) {
        ArrayList arrayList = new ArrayList(30);
        if (playerState == null) {
            return arrayList;
        }
        PlayerTrack track = playerState.track();
        if (track == null) {
            return arrayList;
        }
        if (playerState.isPaused()) {
            arrayList.add(MediaAction.PLAY);
        } else {
            arrayList.add(MediaAction.PAUSE);
            arrayList.add(MediaAction.STOP);
        }
        if (Boolean.valueOf((String) track.metadata().get("is_advertisement")).booleanValue()) {
            return arrayList;
        }
        if (a(track)) {
            arrayList.add(MediaAction.SEEK_15_SECONDS_BACK);
            arrayList.add(MediaAction.SEEK_15_SECONDS_FORWARD);
            arrayList.add(a(i));
            if (!a(tjv, playerState)) {
                return arrayList;
            }
        }
        if (playerState.restrictions().disallowSeekingReasons().isEmpty()) {
            arrayList.add(MediaAction.SEEK_TO);
        }
        if (playerState.restrictions().disallowSkippingNextReasons().isEmpty()) {
            arrayList.add(MediaAction.SKIP_TO_NEXT);
        }
        if (playerState.restrictions().disallowSkippingPrevReasons().isEmpty()) {
            arrayList.add(MediaAction.SKIP_TO_PREVIOUS);
        }
        if (ugu != null && uhq.g(ugu.c)) {
            a(ugu, (List<MediaAction>) arrayList);
        } else if (playerState.restrictions().disallowTogglingShuffleReasons().isEmpty()) {
            arrayList.add(MediaAction.TOGGLE_SHUFFLE);
            if (playerState.options().shufflingContext()) {
                arrayList.add(MediaAction.TURN_SHUFFLE_OFF);
            } else {
                arrayList.add(MediaAction.TURN_SHUFFLE_ON);
            }
        }
        Map metadata = track.metadata();
        boolean parseBoolean = Boolean.parseBoolean((String) metadata.get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) metadata.get("collection.in_collection"));
        if (parseBoolean) {
            if (parseBoolean2) {
                arrayList.add(MediaAction.REMOVE_FROM_COLLECTION);
            } else {
                arrayList.add(MediaAction.ADD_TO_COLLECTION);
            }
        }
        if (a(playerState, track)) {
            arrayList.add(MediaAction.START_RADIO);
        }
        if (playerState.options().repeatingContext()) {
            if (a(playerState)) {
                arrayList.add(MediaAction.TURN_REPEAT_ONE_ON);
                arrayList.add(MediaAction.TOGGLE_REPEAT);
            } else if (b(playerState)) {
                arrayList.add(MediaAction.TURN_REPEAT_ALL_OFF);
                arrayList.add(MediaAction.TOGGLE_REPEAT);
            }
        } else if (playerState.options().repeatingTrack()) {
            if (a(playerState)) {
                arrayList.add(MediaAction.TURN_REPEAT_ONE_OFF);
                arrayList.add(MediaAction.TOGGLE_REPEAT);
            }
        } else if (b(playerState)) {
            arrayList.add(MediaAction.TURN_REPEAT_ALL_ON);
            arrayList.add(MediaAction.TOGGLE_REPEAT);
        }
        if (!a(track)) {
            arrayList.add(MediaAction.SET_STANDARD_RATING);
        }
        return arrayList;
    }

    private static boolean a(PlayerTrack playerTrack) {
        LinkType linkType = jst.a(playerTrack.uri()).b;
        String str = (String) playerTrack.metadata().get("media.type");
        return linkType == LinkType.SHOW_EPISODE && (str == null || "audio".equals(str));
    }

    private static boolean a(tjv tjv, PlayerState playerState) {
        String str = (String) playerState.contextMetadata().get(Metadata.FORMAT_LIST_TYPE);
        if (tjv == null || fax.a(str) || tjv.a(str) != FormatListType.CAR_MIX) {
            return false;
        }
        return true;
    }

    private static boolean a(PlayerState playerState, PlayerTrack playerTrack) {
        return !ViewUris.bQ.b(playerState.contextUri()) && !a(playerTrack);
    }

    private static boolean a(PlayerState playerState) {
        return playerState.restrictions().disallowTogglingRepeatTrackReasons().isEmpty();
    }

    private static boolean b(PlayerState playerState) {
        return playerState.restrictions().disallowTogglingRepeatContextReasons().isEmpty();
    }

    private static void a(ugu ugu, List<MediaAction> list) {
        if (ThumbState.UP == ugu.b()) {
            list.add(MediaAction.THUMB_DOWN);
            list.add(MediaAction.THUMBS_UP_SELECTED);
        } else if (ThumbState.DOWN == ugu.b()) {
            list.add(MediaAction.THUMB_DOWN_SELECTED);
            list.add(MediaAction.THUMB_UP);
        } else {
            list.add(MediaAction.THUMB_DOWN);
            list.add(MediaAction.THUMB_UP);
        }
    }

    private static MediaAction a(int i) {
        if (i == 50) {
            return MediaAction.PLAYBACK_SPEED_0_5;
        }
        if (i == 80) {
            return MediaAction.PLAYBACK_SPEED_0_8;
        }
        if (i == 120) {
            return MediaAction.PLAYBACK_SPEED_1_2;
        }
        if (i == 150) {
            return MediaAction.PLAYBACK_SPEED_1_5;
        }
        if (i == 200) {
            return MediaAction.PLAYBACK_SPEED_2_0;
        }
        if (i != 300) {
            return MediaAction.PLAYBACK_SPEED_1_0;
        }
        return MediaAction.PLAYBACK_SPEED_3_0;
    }
}
