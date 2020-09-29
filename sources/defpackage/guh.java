package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: guh reason: default package */
public final class guh {
    private final Context a;

    public guh(Context context) {
        this.a = context;
    }

    public static SpotifyIconV2 a(DeviceType deviceType, boolean z) {
        return deviceType.equals(GaiaTypes.UNKNOWN) ? SpotifyIconV2.DEVICE_SPEAKER : (deviceType.equals(GaiaTypes.COMPUTER) || deviceType.equals(GaiaTypes.CHROMEBOOK)) ? SpotifyIconV2.DEVICE_COMPUTER : deviceType.equals(GaiaTypes.TABLET) ? SpotifyIconV2.DEVICE_TABLET : deviceType.equals(GaiaTypes.SMARTPHONE) ? SpotifyIconV2.DEVICE_MOBILE : (deviceType.equals(GaiaTypes.SPEAKER) || deviceType.equals(GaiaTypes.CAST_AUDIO)) ? z ? SpotifyIconV2.DEVICE_MULTISPEAKER : SpotifyIconV2.DEVICE_SPEAKER : deviceType.equals(GaiaTypes.TV) ? SpotifyIconV2.DEVICE_TV : deviceType.equals(GaiaTypes.AVR) ? SpotifyIconV2.DEVICE_ARM : deviceType.equals(GaiaTypes.STB) ? SpotifyIconV2.DEVICE_TV : deviceType.equals(GaiaTypes.AUDIO_DONGLE) ? SpotifyIconV2.DEVICE_SPEAKER : deviceType.equals(GaiaTypes.GAME_CONSOLE) ? SpotifyIconV2.GAMES_CONSOLE : deviceType.equals(GaiaTypes.CAST_VIDEO) ? SpotifyIconV2.DEVICE_TV : deviceType.equals(GaiaTypes.SMARTWATCH) ? SpotifyIconV2.WATCH : deviceType.equals(GaiaTypes.CARTHING) ? SpotifyIconV2.DEVICE_CAR : deviceType.equals(GaiaTypes.HOMETHING) ? SpotifyIconV2.DEVICE_SPEAKER : SpotifyIconV2.DEVICE_SPEAKER;
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
