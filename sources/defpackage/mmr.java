package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.connect.model.DeviceType;
import com.spotify.mobile.android.connect.model.DeviceType.GaiaTypes;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mmr reason: default package */
public final class mmr {

    /* renamed from: a */
    public static final int txt_connect_picker_subtitle = 2131100355;
    public final Context b;
    public final mmo c;
    public final Map<DeviceType, SpotifyIconV2> d;

    public mmr(Context context, mmo mmo) {
        this.b = context;
        this.c = mmo;
        HashMap hashMap = new HashMap();
        hashMap.put(GaiaTypes.UNKNOWN, SpotifyIconV2.DEVICE_SPEAKER);
        hashMap.put(GaiaTypes.COMPUTER, SpotifyIconV2.DEVICE_COMPUTER);
        hashMap.put(GaiaTypes.CHROMEBOOK, SpotifyIconV2.DEVICE_COMPUTER);
        hashMap.put(GaiaTypes.TABLET, SpotifyIconV2.DEVICE_TABLET);
        hashMap.put(GaiaTypes.SMARTPHONE, SpotifyIconV2.DEVICE_MOBILE);
        hashMap.put(GaiaTypes.SPEAKER, SpotifyIconV2.DEVICE_SPEAKER);
        hashMap.put(GaiaTypes.TV, SpotifyIconV2.DEVICE_TV);
        hashMap.put(GaiaTypes.AVR, SpotifyIconV2.DEVICE_ARM);
        hashMap.put(GaiaTypes.STB, SpotifyIconV2.DEVICE_TV);
        hashMap.put(GaiaTypes.AUDIO_DONGLE, SpotifyIconV2.DEVICE_SPEAKER);
        hashMap.put(GaiaTypes.GAME_CONSOLE, SpotifyIconV2.GAMES_CONSOLE);
        hashMap.put(GaiaTypes.CAST_VIDEO, SpotifyIconV2.DEVICE_TV);
        hashMap.put(GaiaTypes.CAST_AUDIO, SpotifyIconV2.DEVICE_SPEAKER);
        hashMap.put(GaiaTypes.SMARTWATCH, SpotifyIconV2.WATCH);
        hashMap.put(GaiaTypes.CARTHING, SpotifyIconV2.GAMES_CONSOLE);
        this.d = hashMap;
    }

    private AnimationDrawable a(int i, int i2) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Drawable a = a(SpotifyIconV2.CHROMECAST_CONNECTING_ONE, i, i2);
        Drawable a2 = a(SpotifyIconV2.CHROMECAST_CONNECTING_TWO, i, i2);
        Drawable a3 = a(SpotifyIconV2.CHROMECAST_CONNECTING_THREE, i, i2);
        animationDrawable.addFrame(a, 500);
        animationDrawable.addFrame(a2, 500);
        animationDrawable.addFrame(a3, 500);
        animationDrawable.addFrame(a2, 500);
        animationDrawable.setOneShot(false);
        animationDrawable.setBounds(i, i, i, i);
        return animationDrawable;
    }

    public final Drawable a() {
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) this.d.get(this.c.a());
        if (spotifyIconV2 == null) {
            spotifyIconV2 = SpotifyIconV2.DEVICE_MOBILE;
        }
        return a(spotifyIconV2);
    }

    public final Drawable a(View view, int i, int i2) {
        Drawable a = a(SpotifyIconV2.CHROMECAST_DISCONNECTED, i, i2);
        a.setAlpha(128);
        AnimationDrawable a2 = a(i, i2);
        a2.getClass();
        view.post(new $$Lambda$lVxAgWYl37ZdTq8wdh2i0YaSm38(a2));
        return new LayerDrawable(new Drawable[]{a2, a});
    }

    public final Drawable a(SpotifyIconV2 spotifyIconV2) {
        int b2 = vfj.b(32.0f, this.b.getResources());
        ColorStateList b3 = fr.b(this.b, (int) R.color.icn_connect_device);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, spotifyIconV2, (float) b2);
        spotifyIconDrawable.a(b3);
        return spotifyIconDrawable;
    }

    public final Drawable a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        ColorStateList b2 = fr.b(this.b, i2);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.b, spotifyIconV2, (float) vfj.b(32.0f, this.b.getResources()));
        spotifyIconDrawable.a(b2);
        spotifyIconDrawable.a((float) i);
        return spotifyIconDrawable;
    }

    public final int b() {
        return (int) TypedValue.applyDimension(1, 12.0f, this.b.getResources().getDisplayMetrics());
    }
}
