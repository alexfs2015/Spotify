package com.spotify.mobile.android.wrapped2019.stories.sharing;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ShareOptionMenuItem extends ConstraintLayout {
    public TextView b;
    public ImageView c;

    public ShareOptionMenuItem(Context context) {
        super(context);
        a(context);
    }

    public ShareOptionMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ShareOptionMenuItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.share_menu_item, this, true);
        this.b = (TextView) ip.d(getRootView(), (int) R.id.share_destination_label);
        this.c = (ImageView) ip.d(getRootView(), (int) R.id.share_destination_icon);
        ((ImageView) ip.d(getRootView(), (int) R.id.share_destination_chevron)).setImageDrawable(b(context));
    }

    private static Drawable b(Context context) {
        return new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_RIGHT, (float) vfj.b(20.0f, context.getResources()));
    }
}
