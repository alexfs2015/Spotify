package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: gwj reason: default package */
public final class gwj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public gwj(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.hub_card_default_text_area);
        this.b = resources.getDimensionPixelSize(R.dimen.hub_card_normal_image_height);
        this.c = resources.getDimensionPixelSize(R.dimen.hub_card_small_image_height);
        this.d = resources.getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
        this.e = resources.getDimensionPixelSize(R.dimen.category_card_max_height);
        this.f = resources.getFraction(R.fraction.category_card_width_to_height_ratio, 1, 1);
    }
}
