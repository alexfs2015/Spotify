package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import java.util.Iterator;

public class GlueHeaderAccessoryBehavior extends ViewOffsetBehavior<View> {
    public final /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ boolean b(int i) {
        return super.b(i);
    }

    public GlueHeaderAccessoryBehavior() {
    }

    public GlueHeaderAccessoryBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof fvw;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Behavior b = b(view2);
        if (!(b instanceof HeaderBehavior)) {
            return false;
        }
        super.b(view2.getHeight() + ((HeaderBehavior) b).a());
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        int paddingTop = coordinatorLayout.getPaddingTop();
        int measuredWidth = (coordinatorLayout.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2);
        view.layout(measuredWidth, paddingTop - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + measuredWidth, paddingTop + (view.getMeasuredHeight() / 2));
        a(view);
        Iterator it = coordinatorLayout.b(view).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view2 = (View) it.next();
            if (view2 instanceof fvw) {
                this.b.a(view2.getMeasuredHeight() - ((fvw) view2).a(), Integer.MAX_VALUE);
                break;
            }
        }
        View e = ((GlueHeaderLayout) coordinatorLayout).e(true);
        if (e != null) {
            Behavior b = b(e);
            if (b instanceof HeaderBehavior) {
                super.b(e.getHeight() + ((HeaderBehavior) b).a());
            }
        }
        return true;
    }
}
