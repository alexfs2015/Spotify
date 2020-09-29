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
        void a(jlb jlb);

        void b(jlb jlb);

        void c(jlb jlb);
    }

    public StorylinesCardView(Context context) {
        super(context);
    }

    public StorylinesCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) ip.d(LayoutInflater.from(getContext()).inflate(R.layout.storylines_card_view, this), (int) R.id.storylines_card_image);
    }
}
