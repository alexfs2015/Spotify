package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;

/* renamed from: jrs reason: default package */
public final class jrs {
    public final int a;
    public final String b;

    public jrs(PlayerError playerError, boolean z) {
        int i = 2;
        if (playerError.error() == ErrorType.TOGGLE_SHUFFLE_RESTRICTED) {
            i = 16;
        } else {
            String str = "explicit_content_filtered";
            if (playerError.error() == ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED) {
                if (playerError.reasons().equals("user_capping_reached")) {
                    i = 14;
                } else if (!playerError.reasons().equals("not_available")) {
                    if (!playerError.reasons().equals("user_streaming_disallowed")) {
                        if (playerError.reasons().equals(str)) {
                            i = 29;
                        }
                        i = 99;
                    }
                }
            } else if (playerError.error() == ErrorType.SKIP_TO_NEXT_RESTRICTED && playerError.reasons().equals(DisallowReasons.MFT)) {
                i = 15;
            } else if (playerError.error() == ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED) {
                if (playerError.reasons().contains("not_available_offline")) {
                    if (z) {
                        i = 17;
                    }
                } else if (playerError.reasons().contains(str)) {
                    i = 30;
                } else if (playerError.reasons().contains("banned_by_user")) {
                    i = 31;
                } else if (!z) {
                    i = 6;
                }
            } else if (playerError.error() == ErrorType.VIDEO_PLAYBACK_ERROR) {
                i = 20;
            } else if (playerError.error() == ErrorType.VIDEO_GEORESTRICTED) {
                i = 21;
            } else if (playerError.error() == ErrorType.VIDEO_UNSUPPORTED_PLATFORM_VERSION) {
                i = 22;
            } else if (playerError.error() == ErrorType.VIDEO_UNSUPPORTED_CLIENT_VERSION) {
                i = 23;
            } else if (playerError.error() == ErrorType.VIDEO_MANIFEST_DELETED) {
                i = 24;
            } else if (playerError.error() == ErrorType.VIDEO_COUNTRY_RESTRICTED) {
                i = 26;
            } else if (playerError.error() == ErrorType.VIDEO_UNAVAILABLE) {
                i = 27;
            } else if (playerError.error() == ErrorType.VIDEO_CATALOGUE_RESTRICTED) {
                i = 28;
            } else {
                if (playerError.error() == ErrorType.PLAY_RESTRICTED && playerError.reasons().equals("gaia.content_not_supported")) {
                    i = 25;
                }
                i = 99;
            }
            i = 3;
        }
        this.a = i;
        this.b = playerError.trackUri();
    }
}
