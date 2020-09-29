package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rhm reason: default package */
public final class rhm extends rht {
    public final int b() {
        return R.id.home_card_medium_component;
    }

    protected rhm(Context context, Picasso picasso, rhu rhu, gxw gxw) {
        super(context, picasso, rhu, gxw);
    }

    public final CardSize c() {
        return CardSize.MEDIUM;
    }
}
