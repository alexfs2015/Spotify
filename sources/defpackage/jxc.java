package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.BadgedDrawable.BadgePosition;

/* renamed from: jxc reason: default package */
public final class jxc implements utt {
    private final Context a;
    private final BadgesFactory b;

    public jxc(Context context, BadgesFactory badgesFactory) {
        this.a = (Context) fay.a(context);
        this.b = badgesFactory;
    }

    public final Drawable createDrawable(Bitmap bitmap) {
        BadgesFactory badgesFactory = this.b;
        Context context = this.a;
        return badgesFactory.a(context, uuz.a().createDrawable(bitmap), SpotifyIconV2.CHECK, BadgePosition.BOTTOM_RIGHT, fr.c(context, R.color.cat_white), fr.c(context, R.color.cat_light_cyan), this.a.getResources().getDimensionPixelSize(R.dimen.artist_badge_size), this.a.getResources().getDimensionPixelSize(R.dimen.artist_badge_margin));
    }
}
