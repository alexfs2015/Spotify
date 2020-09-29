package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gul reason: default package */
public final class gul {
    private static final Map<String, Drawable> d = new HashMap(8);
    final Context a;
    final int b;
    int c;

    public gul(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        this.c = i2;
    }

    static Drawable a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        String a2 = a(spotifyIconV2, i, i2);
        Drawable drawable = (Drawable) d.get(a2);
        if (drawable != null) {
            return drawable;
        }
        SpotifyIconDrawable b2 = b(context, spotifyIconV2, i, i2);
        d.put(a2, b2);
        return b2;
    }

    private static String a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(spotifyIconV2.name());
        sb.append('_');
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        return sb.toString();
    }

    private static SpotifyIconDrawable b(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        ColorStateList b2 = fr.b(context, i2);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) vfj.b(32.0f, context.getResources()));
        spotifyIconDrawable.a(b2);
        spotifyIconDrawable.a((float) i);
        return spotifyIconDrawable;
    }

    public static void b() {
        d.clear();
    }

    public final Drawable a() {
        return a(this.a, SpotifyIconV2.DEVICE_OTHER, this.b, this.c);
    }

    public final Drawable a(final View view) {
        Drawable a2 = a(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_ONE, this.b, this.c);
        Drawable a3 = a(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_TWO, this.b, this.c);
        Drawable a4 = a(this.a, SpotifyIconV2.CHROMECAST_CONNECTING_THREE, this.b, this.c);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(a2, 500);
        animationDrawable.addFrame(a3, 500);
        animationDrawable.addFrame(a4, 500);
        animationDrawable.addFrame(a3, 500);
        animationDrawable.setOneShot(false);
        final $$Lambda$gul$1iklhIKrikZSaQQHH9JibXl69U r1 = new $$Lambda$gul$1iklhIKrikZSaQQHH9JibXl69U(animationDrawable);
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                r1.accept(view);
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        int i = this.b;
        animationDrawable.setBounds(i, i, i, i);
        Drawable a5 = a(this.a, SpotifyIconV2.CHROMECAST_DISCONNECTED, this.b, this.c);
        a5.setAlpha(128);
        return new LayerDrawable(new Drawable[]{animationDrawable, a5});
    }
}
