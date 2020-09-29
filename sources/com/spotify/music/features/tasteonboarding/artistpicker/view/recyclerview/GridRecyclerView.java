package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController.AnimationParameters;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

public class GridRecyclerView extends RecyclerView {
    public GridRecyclerView(Context context) {
        super(context);
        o();
    }

    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public GridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o();
    }

    private void o() {
        setLayoutParams(new LayoutParams(-1, -1));
        this.q = true;
        setClipToPadding(false);
        r();
        p();
        q();
    }

    /* access modifiers changed from: protected */
    public void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        int i3 = ((GridLayoutManager) fay.a((GridLayoutManager) d())).a;
        AnimationParameters animationParameters = (AnimationParameters) layoutParams.layoutAnimationParameters;
        if (animationParameters == null) {
            animationParameters = new AnimationParameters();
            layoutParams.layoutAnimationParameters = animationParameters;
        }
        animationParameters.count = i2;
        animationParameters.index = i;
        animationParameters.columnsCount = i3;
        animationParameters.rowsCount = i2 / i3;
        int i4 = (i2 - 1) - i;
        animationParameters.column = (i3 - 1) - (i4 % i3);
        animationParameters.row = (animationParameters.rowsCount - 1) - (i4 / i3);
    }

    private void p() {
        a((i) new GridLayoutManager(getContext(), 3));
    }

    private void q() {
        LayoutAnimationController loadLayoutAnimation = AnimationUtils.loadLayoutAnimation(getContext(), R.anim.artist_picker_item_animation);
        loadLayoutAnimation.getAnimation().setInterpolator(new qkx());
        loadLayoutAnimation.getAnimation().setDuration(800);
        setLayoutAnimation(loadLayoutAnimation);
    }

    private void r() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.std_24dp);
        int round = Math.round(getResources().getDimension(R.dimen.solar_button_height));
        int round2 = Math.round(getResources().getDimension(R.dimen.std_8dp));
        setPadding(round2, getPaddingTop(), round2, round + dimensionPixelSize);
    }
}
