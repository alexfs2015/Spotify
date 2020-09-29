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

/* renamed from: rqm reason: default package */
public final class rqm extends rqv {
    private final Context a;

    /* renamed from: rqm$a */
    static class a extends LayerDrawable {
        public a(Drawable[] drawableArr) {
            super(drawableArr);
        }

        public final int getIntrinsicHeight() {
            return -1;
        }

        public final int getIntrinsicWidth() {
            return -1;
        }
    }

    protected rqm(Context context, Picasso picasso, rqw rqw, hap hap, rst rst, fqn fqn) {
        super(context, picasso, rqw, hap, rst.a(fqn));
        this.a = context;
    }

    public final void a(HomeCardViewBinder homeCardViewBinder, hcm hcm) {
        hcp main = hcm.images().main();
        float b = (float) vfj.b(50.0f, this.a.getResources());
        float b2 = b / ((float) vfj.b(150.0f, this.a.getResources()));
        a aVar = new a(new Drawable[]{GlueGradients.a(this.a, Style.AQUATIC, false), new vgu(new SpotifyIconDrawable(this.a, SpotifyIconV2.HEART_ACTIVE, b), b2)});
        a(main);
        if (main != null) {
            main.custom().string("style", "default");
        }
        homeCardViewBinder.a((Drawable) aVar);
    }

    public final int b() {
        return R.id.home_card_liked_songs_component;
    }

    public final CardSize c() {
        return CardSize.SMALL;
    }
}
