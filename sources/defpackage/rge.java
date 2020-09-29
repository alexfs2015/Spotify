package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rge reason: default package */
public final class rge<T> {
    public final Context a;
    public final sih b;
    public final vti<jmf<T>> c;
    public final fpt d;
    public final kxg e;

    public rge(Context context, sih sih, vti<jmf<T>> vti, fpt fpt, kxg kxg) {
        this.a = context;
        this.b = sih;
        this.c = vti;
        this.d = fpt;
        this.e = kxg;
    }

    public static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, OnClickListener onClickListener) {
        Drawable drawable;
        if (i != 0) {
            drawable = jwz.b(context, spotifyIconV2, uuu.d(context, i));
        } else {
            drawable = jwz.c(context, spotifyIconV2);
        }
        ImageButton a2 = jwz.a(context, drawable);
        a2.setContentDescription(a2.getResources().getString(i2));
        a2.setOnClickListener(onClickListener);
        return a2;
    }
}
