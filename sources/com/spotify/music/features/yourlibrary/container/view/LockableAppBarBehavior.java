package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;

public class LockableAppBarBehavior extends Behavior {
    public boolean b;
    private boolean[] c;
    private int d;

    public LockableAppBarBehavior() {
        this.c = new boolean[2];
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        boolean z = !this.b && super.a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        this.c[i2] = z;
        return z;
    }

    public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if ((view instanceof RecyclerView) && i2 == 0) {
            ((RecyclerView) view).a(i5);
        }
        super.a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
    }

    public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.a(coordinatorLayout, appBarLayout, view, i);
        boolean[] zArr = this.c;
        boolean z = false;
        zArr[i] = false;
        if (!zArr[0] && !zArr[1]) {
            int b2 = appBarLayout.b();
            float f = ((float) (-(appBarLayout.getTop() - gaa.c(appBarLayout.getContext())))) / ((float) b2);
            if (!(f == 0.0f || f == 1.0f)) {
                int i2 = this.d;
                if (i2 == 0) {
                    if (f < 0.5f) {
                        z = true;
                    }
                    appBarLayout.a(z, true, true);
                    return;
                }
                if (f < 0.2f || (f <= 0.8f && i2 < 0)) {
                    z = true;
                }
                appBarLayout.a(z, true, true);
            }
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        this.d = i2;
    }

    public LockableAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
