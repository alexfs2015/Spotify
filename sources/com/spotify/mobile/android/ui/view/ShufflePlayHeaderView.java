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
    private jts d;

    public ShufflePlayHeaderView(Context context) {
        super(context);
    }

    public ShufflePlayHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static ShufflePlayHeaderView a(Context context, ViewGroup viewGroup, OnClickListener onClickListener) {
        ShufflePlayHeaderView shufflePlayHeaderView = (ShufflePlayHeaderView) LayoutInflater.from(context).inflate(R.layout.sticky_header_shuffle_play, viewGroup, false);
        Button a2 = jso.a(context, shufflePlayHeaderView.c);
        a2.setOnClickListener(onClickListener);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        shufflePlayHeaderView.b = a2;
        shufflePlayHeaderView.c.addView(shufflePlayHeaderView.b, layoutParams);
        new jza(a2).a();
        return shufflePlayHeaderView;
    }

    public static void a(jts jts, View view) {
        jts jts2 = jts;
        View view2 = view;
        View view3 = view;
        ScaleAnimation scaleAnimation = r2;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(150);
        ScaleAnimation scaleAnimation4 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation4.setDuration(100);
        jts2.a(view3, scaleAnimation2, false);
        jts2.a(view3, scaleAnimation3, false);
        jts2.a(view3, scaleAnimation4, false);
    }

    public final void a() {
        a(this.d, this.a);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.content);
        this.d = new jts();
        this.c = (LinearLayout) findViewById(R.id.play_button_container);
    }
}
