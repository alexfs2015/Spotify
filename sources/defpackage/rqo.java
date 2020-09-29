package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rqo reason: default package */
public final class rqo extends rqv {
    protected rqo(Context context, Picasso picasso, rqw rqw, hap hap, rst rst, fqn fqn) {
        super(context, picasso, rqw, hap, rst.a(fqn));
    }

    public final int b() {
        return R.id.home_card_medium_component;
    }

    public final CardSize c() {
        return CardSize.MEDIUM;
    }
}
