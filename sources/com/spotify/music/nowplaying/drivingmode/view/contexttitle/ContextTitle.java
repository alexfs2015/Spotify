package com.spotify.music.nowplaying.drivingmode.view.contexttitle;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContextTitle extends LinearLayout implements szq {
    private final TextView a;
    private final TextView b;

    public final void a(a aVar) {
    }

    public ContextTitle(Context context) {
        this(context, null);
    }

    public ContextTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContextTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setGravity(17);
        this.a = new TextView(context);
        this.a.setGravity(17);
        this.a.setMaxLines(1);
        this.a.setEllipsize(TruncateAt.END);
        uuu.a(context, this.a, 2132017606);
        addView(this.a);
        this.b = new TextView(context);
        this.b.setGravity(17);
        this.b.setMaxLines(1);
        this.b.setEllipsize(TruncateAt.END);
        uuu.a(context, this.b, 2132017605);
        addView(this.b);
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public final void b(String str) {
        this.b.setVisibility(0);
        this.b.setText(str);
    }

    public final void a() {
        this.b.setVisibility(8);
    }
}
