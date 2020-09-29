package com.spotify.mobile.android.wrapped2019.stories.templates.stack;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class ParallaxView extends ConstraintLayout {
    private View b;
    private View c;
    private View d;
    private View e;

    public ParallaxView(Context context) {
        super(context);
        b();
    }

    public ParallaxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ParallaxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        inflate(getContext(), R.layout.parallax_view, this);
        this.b = ip.c((View) this, (int) R.id.view_front);
        this.c = ip.c((View) this, (int) R.id.view_mid_front);
        this.d = ip.c((View) this, (int) R.id.view_mid_back);
        this.e = ip.c((View) this, (int) R.id.view_back);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
