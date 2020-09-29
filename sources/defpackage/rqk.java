package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rqk reason: default package */
public final class rqk extends rqv {
    protected rqk(Context context, Picasso picasso, rqw rqw, hap hap, rst rst, fqn fqn) {
        super(context, picasso, rqw, hap, rst.a(fqn));
    }

    public final int b() {
        return R.id.home_card_large_component;
    }

    public final CardSize c() {
        return CardSize.LARGE;
    }
}
