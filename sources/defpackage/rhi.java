package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rhi reason: default package */
public final class rhi extends rht {
    public final int b() {
        return R.id.home_card_large_component;
    }

    protected rhi(Context context, Picasso picasso, rhu rhu, gxw gxw) {
        super(context, picasso, rhu, gxw);
    }

    public final CardSize c() {
        return CardSize.LARGE;
    }
}
