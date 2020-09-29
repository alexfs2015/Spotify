package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;

public class ShufflePlayHeaderView extends LinearLayout {
    private View a;
    private View b;
    private LinearLayout c;
    private jri d;

    public ShufflePlayHeaderView(Context context) {
        super(context);
    }

    public ShufflePlayHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.content);
        this.d = new jri();
        this.c = (LinearLayout) findViewById(R.id.play_button_container);
    }

    public static ShufflePlayHeaderView a(Context context, ViewGroup viewGroup, OnClickListener onClickListener) {
        ShufflePlayHeaderView shufflePlayHeaderView = (ShufflePlayHeaderView) LayoutInflater.from(context).inflate(R.layout.sticky_header_shuffle_play, viewGroup, false);
        Button a2 = jqd.a(context, shufflePlayHeaderView.c);
        a2.setOnClickListener(onClickListener);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        shufflePlayHeaderView.b = a2;
        shufflePlayHeaderView.c.addView(shufflePlayHeaderView.b, layoutParams);
        new jxa(a2).a();
        return shufflePlayHeaderView;
    }

    public final void a() {
        a(this.d, this.a);
    }

    public static void a(jri jri, View view) {
        jri jri2 = jri;
        View view2 = view;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(150);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(100);
        jri2.a(view2, scaleAnimation, false);
        jri2.a(view2, scaleAnimation2, false);
        jri2.a(view2, scaleAnimation3, false);
    }
}
