package com.spotify.mobile.android.storylines.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.music.R;

public class StorylinesCardView extends FrameLayout {
    public ImageView a;
    public a b;

    public interface a {
        void a(jil jil);

        void b(jil jil);

        void c(jil jil);
    }

    public StorylinesCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StorylinesCardView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) ip.c(LayoutInflater.from(getContext()).inflate(R.layout.storylines_card_view, this), (int) R.id.storylines_card_image);
    }
}
