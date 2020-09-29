package com.spotify.music.features.premiumdestination.legacy.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class PremiumOffersHeaderBackground extends AppCompatImageView implements fuv {
    private fwv a;

    public final View a() {
        return this;
    }

    public final void a(int i) {
    }

    public final ImageView c() {
        return this;
    }

    public PremiumOffersHeaderBackground(Context context) {
        super(context, null);
    }

    public PremiumOffersHeaderBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public PremiumOffersHeaderBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new fwv(this);
    }

    public final void a(int i, float f) {
        fwv fwv = this.a;
        if (fwv != null) {
            fwv.a(i);
        }
    }

    public final void b() {
        setImageDrawable(null);
    }

    public final void a(boolean z) {
        this.a.a = z;
    }
}
