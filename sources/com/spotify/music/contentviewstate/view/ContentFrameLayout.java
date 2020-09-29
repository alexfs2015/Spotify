package com.spotify.music.contentviewstate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class ContentFrameLayout<T extends View> extends FrameLayout {
    public fuj a;
    public LoadingView b;
    public T c;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = LoadingView.a(LayoutInflater.from(context));
        fqb.f();
        this.a = fum.a(context, this);
        addView(this.a.getView());
        addView(this.b);
    }

    public final void a(T t) {
        T t2 = this.c;
        if (t2 != null) {
            removeView(t2);
            this.c = null;
        }
        if (t != null) {
            gac.d(t);
            this.c = t;
            addView(this.c, 0);
        }
    }
}
