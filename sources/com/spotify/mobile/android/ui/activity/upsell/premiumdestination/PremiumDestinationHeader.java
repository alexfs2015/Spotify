package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.music.R;

public class PremiumDestinationHeader extends GlueHeaderView {
    public jmy b;

    public PremiumDestinationHeader(Context context) {
        this(context, null);
    }

    public PremiumDestinationHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PremiumDestinationHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fsy a = ftc.a(getContext(), this);
        a.a((CharSequence) getResources().getString(R.string.in_app_premium_destination_nav_title_go_premium));
        a(a);
        this.b = new jmy(getContext(), this);
        fxc a2 = fxf.a(this);
        a2.a(this.b);
        a((getResources().getDimensionPixelSize(R.dimen.cat_button_height) / 2) + getResources().getDimensionPixelSize(R.dimen.std_16dp));
        a((fxe) a2);
        c().setScaleType(ScaleType.CENTER_CROP);
        c().setImageResource(R.drawable.bg_premium_destination);
    }
}
