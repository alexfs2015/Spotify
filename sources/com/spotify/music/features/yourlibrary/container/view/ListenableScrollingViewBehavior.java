package com.spotify.music.features.yourlibrary.container.view;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import java.util.HashSet;
import java.util.Set;

public class ListenableScrollingViewBehavior extends ScrollingViewBehavior {
    private final Set<a> d = new HashSet(2);

    public interface a {
        void a(View view);
    }

    public final void a(a aVar) {
        this.d.add(aVar);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.b(coordinatorLayout, view, view2);
        for (a a2 : this.d) {
            a2.a(view2);
        }
        return false;
    }
}
