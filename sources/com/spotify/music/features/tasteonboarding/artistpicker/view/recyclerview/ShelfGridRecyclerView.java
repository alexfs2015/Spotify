package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

public class ShelfGridRecyclerView extends RecyclerView {
    private static int M;

    public ShelfGridRecyclerView(Context context) {
        super(context);
        q();
    }

    public ShelfGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public ShelfGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q();
    }

    private void q() {
        setLayoutParams(new LayoutParams(-1, -2));
        this.q = true;
        r();
    }

    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        a c = c();
        if (size > 0 && c() != null && c.b() > 0) {
            int dimensionPixelSize = size - (getResources().getDimensionPixelSize(R.dimen.std_8dp) << 1);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.taste_picker_artist_name_height);
            M = Math.max(dimensionPixelSize / ((Math.round(((float) size) * 0.7f) / 2) - dimensionPixelSize2), 3);
            i2 = MeasureSpec.makeMeasureSpec((((dimensionPixelSize / M) + 2) + dimensionPixelSize2) << 1, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final GridLayoutManager o() {
        return (GridLayoutManager) super.d();
    }

    public static int p() {
        return M << 1;
    }

    private void r() {
        a((i) new GridLayoutManager(getContext(), 2, 0, false));
    }

    public final /* bridge */ /* synthetic */ i d() {
        return (GridLayoutManager) super.d();
    }
}
