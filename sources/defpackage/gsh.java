package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: gsh reason: default package */
public final class gsh {
    private final Context a;

    public gsh(Context context) {
        this.a = context;
    }

    public static SpotifyIconV2 a(DeviceType deviceType, boolean z) {
        if (deviceType.equals(GaiaTypes.UNKNOWN)) {
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
        if (deviceType.equals(GaiaTypes.COMPUTER)) {
            return SpotifyIconV2.DEVICE_COMPUTER;
        }
        if (deviceType.equals(GaiaTypes.TABLET)) {
            return SpotifyIconV2.DEVICE_TABLET;
        }
        if (deviceType.equals(GaiaTypes.SMARTPHONE)) {
            return SpotifyIconV2.DEVICE_MOBILE;
        }
        if (deviceType.equals(GaiaTypes.SPEAKER) || deviceType.equals(GaiaTypes.CAST_AUDIO)) {
            if (z) {
                return SpotifyIconV2.DEVICE_MULTISPEAKER;
            }
            return SpotifyIconV2.DEVICE_SPEAKER;
        } else if (deviceType.equals(GaiaTypes.TV)) {
            return SpotifyIconV2.DEVICE_TV;
        } else {
            if (deviceType.equals(GaiaTypes.AVR)) {
                return SpotifyIconV2.DEVICE_ARM;
            }
            if (deviceType.equals(GaiaTypes.STB)) {
                return SpotifyIconV2.DEVICE_TV;
            }
            if (deviceType.equals(GaiaTypes.AUDIO_DONGLE)) {
                return SpotifyIconV2.DEVICE_SPEAKER;
            }
            if (deviceType.equals(GaiaTypes.GAME_CONSOLE)) {
                return SpotifyIconV2.GAMES_CONSOLE;
            }
            if (deviceType.equals(GaiaTypes.CAST_VIDEO)) {
                return SpotifyIconV2.DEVICE_TV;
            }
            if (deviceType.equals(GaiaTypes.SMARTWATCH)) {
                return SpotifyIconV2.WATCH;
            }
            if (deviceType.equals(GaiaTypes.CARTHING)) {
                return SpotifyIconV2.DEVICE_CAR;
            }
            if (deviceType.equals(GaiaTypes.HOMETHING)) {
                return SpotifyIconV2.DEVICE_SPEAKER;
            }
            return SpotifyIconV2.DEVICE_SPEAKER;
        }
    }

    public final Drawable a(GaiaDevice gaiaDevice, int i, float f) {
        return a(a(gaiaDevice.getType(), gaiaDevice.isGrouped()), i, f);
    }

    public SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, f);
        spotifyIconDrawable.a(i);
        return spotifyIconDrawable;
    }
}
