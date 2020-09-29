package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;

public class LockableBehavior extends Behavior {
    public boolean b;

    public final void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
    }

    public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
    }

    public LockableBehavior() {
    }

    public LockableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return !this.b && super.a(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
