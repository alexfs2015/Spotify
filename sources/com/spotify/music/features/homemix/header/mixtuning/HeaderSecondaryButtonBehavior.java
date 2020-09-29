package com.spotify.music.features.homemix.header.mixtuning;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;

public class HeaderSecondaryButtonBehavior extends Behavior<View> {
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof fvw;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Behavior behavior;
        if (!(view2 instanceof fvw)) {
            return false;
        }
        d dVar = (d) view2.getLayoutParams();
        if (dVar != null) {
            behavior = dVar.a;
        } else {
            behavior = null;
        }
        ip.f(view, (view2.getHeight() + ((HeaderBehavior) ((Behavior) fay.a(behavior))).a()) - view.getTop());
        return true;
    }
}
