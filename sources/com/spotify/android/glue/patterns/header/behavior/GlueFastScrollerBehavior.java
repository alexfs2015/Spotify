package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;

public class GlueFastScrollerBehavior extends ViewOffsetBehavior<RecyclerViewFastScroller> {
    public final /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        super.a(coordinatorLayout, recyclerViewFastScroller, i);
        RecyclerView a = a(coordinatorLayout, recyclerViewFastScroller);
        if (a == null) {
            return false;
        }
        if (uur.a((View) coordinatorLayout)) {
            recyclerViewFastScroller.layout(a.getLeft(), a.getTop(), a.getLeft() + recyclerViewFastScroller.getMeasuredWidth(), a.getBottom());
        } else {
            recyclerViewFastScroller.layout(a.getRight() - recyclerViewFastScroller.getMeasuredWidth(), a.getTop(), a.getRight(), a.getBottom());
        }
        return true;
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        RecyclerView a = a(coordinatorLayout, recyclerViewFastScroller);
        if (a == null) {
            return false;
        }
        recyclerViewFastScroller.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(a.getMeasuredHeight(), 1073741824));
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean b(int i) {
        return super.b(i);
    }

    public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) view;
        recyclerViewFastScroller.offsetTopAndBottom(view2.getTop() - recyclerViewFastScroller.getTop());
        recyclerViewFastScroller.a();
        return true;
    }

    public GlueFastScrollerBehavior() {
    }

    public GlueFastScrollerBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static RecyclerView a(CoordinatorLayout coordinatorLayout, RecyclerViewFastScroller recyclerViewFastScroller) {
        RecyclerView recyclerView = null;
        for (View view : coordinatorLayout.b((View) recyclerViewFastScroller)) {
            if (view instanceof RecyclerView) {
                recyclerView = (RecyclerView) view;
            }
        }
        return recyclerView;
    }

    public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof RecyclerView;
    }
}
