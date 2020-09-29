package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.glue.gradients.GlueGradients;
import com.spotify.android.glue.gradients.GlueGradients.Style;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

/* renamed from: rhk reason: default package */
public final class rhk extends rht {
    private final Context a;

    /* renamed from: rhk$a */
    static class a extends LayerDrawable {
        public final int getIntrinsicHeight() {
            return -1;
        }

        public final int getIntrinsicWidth() {
            return -1;
        }

        public a(Drawable[] drawableArr) {
            super(drawableArr);
        }
    }

    public final int b() {
        return R.id.home_card_liked_songs_component;
    }

    protected rhk(Context context, Picasso picasso, rhu rhu, gxw gxw) {
        super(context, picasso, rhu, gxw);
        this.a = context;
    }

    public final CardSize c() {
        return CardSize.SMALL;
    }

    public final void a(HomeCardViewBinder homeCardViewBinder, gzt gzt) {
        gzw main = gzt.images().main();
        float b = (float) uts.b(50.0f, this.a.getResources());
        float b2 = b / ((float) uts.b(150.0f, this.a.getResources()));
        a aVar = new a(new Drawable[]{GlueGradients.a(this.a, Style.AQUATIC, false), new uvd(new SpotifyIconDrawable(this.a, SpotifyIconV2.HEART_ACTIVE, b), b2)});
        a(main);
        if (main != null) {
            main.custom().string("style", "default");
        }
        homeCardViewBinder.a((Drawable) aVar);
    }
}
