package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import java.util.Iterator;
import java.util.List;

public class GlueScrollingViewBehavior extends ViewOffsetBehavior<View> {
    protected View a;

    public GlueScrollingViewBehavior() {
    }

    public GlueScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static View a(List<View> list) {
        for (View view : list) {
            if (view instanceof fwq) {
                return view;
            }
        }
        return null;
    }

    private static int b(CoordinatorLayout coordinatorLayout, View view) {
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            return a2.getMeasuredWidth();
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ int a() {
        return super.a();
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a2 = a(coordinatorLayout.b(view));
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            int b = b(coordinatorLayout, view);
            if (vgi.a((View) coordinatorLayout)) {
                int paddingLeft = coordinatorLayout.getPaddingLeft();
                int paddingTop = coordinatorLayout.getPaddingTop();
                view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
            } else {
                int paddingLeft2 = coordinatorLayout.getPaddingLeft() + b;
                int paddingTop2 = coordinatorLayout.getPaddingTop();
                view.layout(paddingLeft2, paddingTop2, view.getMeasuredWidth() + paddingLeft2, view.getMeasuredHeight() + paddingTop2);
            }
            a(view);
            Behavior b2 = b(a2);
            if (b2 instanceof HeaderBehavior) {
                super.b(((HeaderBehavior) b2).a());
            }
            return true;
        }
        boolean a3 = super.a(coordinatorLayout, view, i);
        if (a2 != null) {
            Behavior b3 = b(a2);
            if (b3 instanceof HeaderBehavior) {
                super.b(a2.getHeight() + ((HeaderBehavior) b3).a() + b());
            }
        }
        return a3;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View view2;
        List b = coordinatorLayout.b(view);
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                view2 = null;
                break;
            }
            view2 = (View) it.next();
            if (((d) view2.getLayoutParams()).a instanceof GlueHeaderAccessoryBehavior) {
                break;
            }
        }
        this.a = view2;
        int i5 = 1073741824;
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            int b2 = b(coordinatorLayout, view);
            int size = MeasureSpec.getSize(i);
            view.measure(MeasureSpec.makeMeasureSpec(((size - coordinatorLayout.getPaddingLeft()) - coordinatorLayout.getPaddingRight()) - b2, 1073741824), MeasureSpec.makeMeasureSpec((MeasureSpec.getSize(i3) - coordinatorLayout.getPaddingTop()) - coordinatorLayout.getPaddingBottom(), 1073741824));
            return true;
        }
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || b.isEmpty()) {
            return false;
        }
        View a2 = a(b);
        fwq fwq = (fwq) a2;
        if (fwq != null) {
            if (ip.t(a2)) {
                ip.b(view, true);
            }
            int size2 = MeasureSpec.getSize(i3);
            if (size2 == 0) {
                size2 = coordinatorLayout.getHeight();
            }
            int measuredHeight = size2 - (a2.getMeasuredHeight() - fwq.a());
            if (i6 != -1) {
                i5 = Integer.MIN_VALUE;
            }
            coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
            return true;
        }
        return false;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return (view2 instanceof fwq) || (((d) view2.getLayoutParams()).a instanceof GlueHeaderAccessoryBehavior);
    }

    /* access modifiers changed from: protected */
    public int b() {
        View view = this.a;
        if (view != null) {
            return view.getMeasuredHeight() / 2;
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean b(int i) {
        return super.b(i);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Behavior behavior = ((d) view2.getLayoutParams()).a;
        if (behavior instanceof HeaderBehavior) {
            if (((GlueHeaderLayout) coordinatorLayout).d) {
                super.b(((HeaderBehavior) behavior).a());
                return true;
            }
            super.b(view2.getHeight() + ((HeaderBehavior) behavior).a() + b());
        }
        return true;
    }
}
