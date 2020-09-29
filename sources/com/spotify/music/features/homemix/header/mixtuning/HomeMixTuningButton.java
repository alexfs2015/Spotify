package com.spotify.music.features.homemix.header.mixtuning;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public abstract class HomeMixTuningButton extends LinearLayout implements fvu {
    public HomeMixTuningButton(Context context) {
        super(context);
        a(context);
    }

    public HomeMixTuningButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private int a(int i) {
        return getContext().getResources().getDimensionPixelSize(i);
    }

    private static int a(Context context, int i) {
        return (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private void a(Context context) {
        inflate(context, R.layout.home_mix_tuning_button_view, this);
        setOrientation(1);
        setGravity(17);
        setLayoutParams(d());
        setId(a());
        int a = a(getContext(), 16);
        setPadding(a, a, a, a);
        ImageView imageView = (ImageView) findViewById(R.id.styleImage);
        TextView textView = (TextView) findViewById(R.id.styleText);
        imageView.setImageDrawable(e());
        imageView.setContentDescription(getContentDescription());
        textView.setText(c());
    }

    private int b(int i) {
        return fr.c(getContext(), i);
    }

    private Drawable e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        vhl vhl = new vhl(getContext(), b(), (float) a((int) R.dimen.mix_tuning_icon_size), (float) a((int) R.dimen.mix_tuning_button_size), b(R.color.mix_tuning_default_bg), b(R.color.whiteAlpha60));
        vhl vhl2 = new vhl(getContext(), b(), (float) a((int) R.dimen.mix_tuning_icon_size), (float) a((int) R.dimen.mix_tuning_button_size), b(R.color.white), b(R.color.textBlack));
        stateListDrawable.addState(new int[]{16842913}, vhl2);
        stateListDrawable.addState(new int[0], vhl);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract SpotifyIconV2 b();

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public abstract LayoutParams d();

    public void onScroll(float f) {
        setScaleX(f);
        setScaleY(f);
        setAlpha(f);
    }
}
