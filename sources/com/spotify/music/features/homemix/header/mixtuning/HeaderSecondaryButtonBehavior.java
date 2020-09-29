package com.spotify.music.features.homemix.header.mixtuning;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;

public class HeaderSecondaryButtonBehavior extends Behavior<View> {
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof fwq;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view2 instanceof fwq)) {
            return false;
        }
        d dVar = (d) view2.getLayoutParams();
        ip.g(view, (view2.getHeight() + ((HeaderBehavior) ((Behavior) fbp.a(dVar != null ? dVar.a : null))).a()) - view.getTop());
        return true;
    }
}
