package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: roq reason: default package */
public final class roq {
    final Drawable a;
    final SpotifyIconDrawable b;
    final SpotifyIconDrawable c;
    final a d;
    final a e;
    private final int f;

    /* renamed from: roq$a */
    public static class a {
        final Drawable a;
        final AnimationDrawable b;

        a(Drawable drawable, AnimationDrawable animationDrawable) {
            this.b = (AnimationDrawable) fay.a(animationDrawable);
            this.a = (Drawable) fay.a(drawable);
        }
    }

    public roq(Context context) {
        this.f = context.getResources().getDimensionPixelSize(R.dimen.connect_access_button_icon_size);
        Drawable mutate = fr.a(context, (int) R.drawable.ic_connect_connecting_3).mutate();
        gm.a(mutate, fr.c(context, R.color.white));
        this.a = mutate;
        this.b = a(context, SpotifyIconV2.DEVICE_OTHER, R.color.black);
        this.c = a(context, SpotifyIconV2.CHROMECAST_CONNECTED, R.color.white);
        SpotifyIconDrawable a2 = a(context, SpotifyIconV2.CHROMECAST_DISCONNECTED, R.color.black);
        a2.setAlpha(77);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        SpotifyIconDrawable a3 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_ONE, R.color.black);
        SpotifyIconDrawable a4 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_TWO, R.color.black);
        SpotifyIconDrawable a5 = a(context, SpotifyIconV2.CHROMECAST_CONNECTING_THREE, R.color.black);
        animationDrawable.addFrame(a3, 333);
        animationDrawable.addFrame(a4, 333);
        animationDrawable.addFrame(a5, 333);
        animationDrawable.addFrame(a4, 333);
        animationDrawable.setOneShot(false);
        int i = this.f;
        animationDrawable.setBounds(i, i, i, i);
        this.d = new a(new LayerDrawable(new Drawable[]{animationDrawable, a2}), animationDrawable);
        Drawable a6 = fr.a(context, (int) R.drawable.ic_connect_connecting_3);
        if (a6 != null) {
            a6.mutate().setAlpha(77);
        }
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        Drawable a7 = fr.a(context, (int) R.drawable.ic_connect_connecting_1);
        Drawable a8 = fr.a(context, (int) R.drawable.ic_connect_connecting_2);
        Drawable a9 = fr.a(context, (int) R.drawable.ic_connect_connecting_3);
        if (!(a7 == null || a8 == null || a9 == null)) {
            animationDrawable2.addFrame(a7, 333);
            animationDrawable2.addFrame(a8, 333);
            animationDrawable2.addFrame(a9, 333);
            animationDrawable2.addFrame(a8, 333);
        }
        animationDrawable2.setOneShot(false);
        int i2 = this.f;
        animationDrawable2.setBounds(i2, i2, i2, i2);
        this.e = new a(new LayerDrawable(new Drawable[]{animationDrawable2, a6}), animationDrawable2);
    }

    private SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) this.f);
        spotifyIconDrawable.a(fr.c(context, i));
        spotifyIconDrawable.a((float) this.f);
        return spotifyIconDrawable;
    }
}
