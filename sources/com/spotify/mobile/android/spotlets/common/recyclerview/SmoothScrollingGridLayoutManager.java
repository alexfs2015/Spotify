package com.spotify.mobile.android.spotlets.common.recyclerview;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;

public class SmoothScrollingGridLayoutManager extends GridLayoutManager {
    /* access modifiers changed from: private */
    public final float w;

    public final void a(RecyclerView recyclerView, s sVar, int i) {
        AnonymousClass1 r2 = new od(recyclerView.getContext()) {
            public final PointF c(int i2) {
                return SmoothScrollingGridLayoutManager.this.d(i2);
            }

            public final float a(DisplayMetrics displayMetrics) {
                return SmoothScrollingGridLayoutManager.this.w / ((float) displayMetrics.densityDpi);
            }
        };
        r2.b = i;
        a((r) r2);
    }
}
