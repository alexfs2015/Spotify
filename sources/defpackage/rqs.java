package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rqs reason: default package */
public final class rqs extends rqv {
    public static final hck a = hcv.create("home:cardSmall", HubsComponentCategory.CARD.mId);

    protected rqs(Context context, Picasso picasso, rqw rqw, hap hap, rst rst, fqn fqn) {
        super(context, picasso, rqw, hap, rst.a(fqn));
    }

    public final int b() {
        return R.id.home_card_small_component;
    }

    public final CardSize c() {
        return CardSize.SMALL;
    }
}
