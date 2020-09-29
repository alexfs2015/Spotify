package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

public class LinearRecyclerView extends RecyclerView {
    public LinearRecyclerView(Context context) {
        super(context);
        n();
    }

    public LinearRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n();
    }

    public LinearRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n();
    }

    private void n() {
        setLayoutParams(new LayoutParams(-1, -1));
        this.q = true;
        setClipToPadding(false);
        o();
        p();
    }

    private void o() {
        a((i) new LinearLayoutManager(getContext()));
    }

    private void p() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.std_16dp);
        gaw.a((View) this, dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.solar_button_height) + getResources().getDimensionPixelSize(R.dimen.std_16dp));
    }
}
