package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect a = new Rect();
    int b = 0;
    int c;
    private Rect d = new Rect();

    /* access modifiers changed from: 0000 */
    public float a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    public abstract View a(List<View> list);

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a2 = a(coordinatorLayout.b(view));
            if (a2 != null) {
                if (!ip.t(a2) || ip.t(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    ip.b(view, true);
                    if (ip.t(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec((size - a2.getMeasuredHeight()) + b(a2), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            d dVar = (d) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, a2.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            iw iwVar = coordinatorLayout.a;
            if (iwVar != null && ip.t(coordinatorLayout) && !ip.t(view)) {
                rect.left += iwVar.a();
                rect.right -= iwVar.c();
            }
            Rect rect2 = this.d;
            int i2 = dVar.c;
            hx.a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c2 = c(a2);
            view.layout(rect2.left, rect2.top - c2, rect2.right, rect2.bottom - c2);
            this.b = rect2.top - a2.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.b = 0;
    }

    /* access modifiers changed from: 0000 */
    public final int c(View view) {
        if (this.c == 0) {
            return 0;
        }
        float a2 = a(view);
        int i = this.c;
        return gw.a((int) (a2 * ((float) i)), 0, i);
    }

    /* access modifiers changed from: 0000 */
    public int b(View view) {
        return view.getMeasuredHeight();
    }
}
