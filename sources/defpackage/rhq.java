package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.squareup.picasso.Picasso;

/* renamed from: rhq reason: default package */
public final class rhq extends rht {
    public static final gzr a = hac.create("home:cardSmall", HubsComponentCategory.CARD.mId);

    public final int b() {
        return R.id.home_card_small_component;
    }

    protected rhq(Context context, Picasso picasso, rhu rhu, gxw gxw) {
        super(context, picasso, rhu, gxw);
    }

    public final CardSize c() {
        return CardSize.SMALL;
    }
}
