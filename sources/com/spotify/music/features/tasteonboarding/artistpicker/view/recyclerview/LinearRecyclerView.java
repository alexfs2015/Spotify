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
        o();
    }

    public LinearRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public LinearRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o();
    }

    private void o() {
        setLayoutParams(new LayoutParams(-1, -1));
        this.q = true;
        setClipToPadding(false);
        p();
        q();
    }

    private void p() {
        a((i) new LinearLayoutManager(getContext()));
    }

    private void q() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.std_16dp);
        gac.a((View) this, dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.solar_button_height) + getResources().getDimensionPixelSize(R.dimen.std_16dp));
    }
}
