package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;

public class LegacyHeaderBehavior extends HeaderBehavior<PrettyHeaderView> {
    private float d = -1.0f;

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (!((GlueHeaderLayout) coordinatorLayout).d) {
            return super.a(coordinatorLayout, prettyHeaderView, i);
        }
        if (uur.a((View) coordinatorLayout)) {
            int measuredWidth = (coordinatorLayout.getMeasuredWidth() - ip.j(prettyHeaderView)) - prettyHeaderView.getMeasuredWidth();
            int paddingTop = coordinatorLayout.getPaddingTop();
            prettyHeaderView.layout(measuredWidth, paddingTop, prettyHeaderView.getMeasuredWidth() + measuredWidth, prettyHeaderView.getMeasuredHeight() + paddingTop);
        } else {
            int i2 = ip.i(prettyHeaderView);
            int paddingTop2 = coordinatorLayout.getPaddingTop();
            prettyHeaderView.layout(i2, paddingTop2, prettyHeaderView.getMeasuredWidth() + i2, prettyHeaderView.getMeasuredHeight() + paddingTop2);
        }
        if (this.b == null) {
            this.b = new fvc(prettyHeaderView);
        }
        this.b.a();
        if (this.c != 0) {
            this.b.a(this.c);
            this.c = 0;
        }
        this.b.a(0, 0);
        return true;
    }

    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (!((GlueHeaderLayout) coordinatorLayout).d) {
            return super.a(coordinatorLayout, prettyHeaderView, i, i2, i3, i4);
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i3);
        int paddingLeft = ((size - coordinatorLayout.getPaddingLeft()) - coordinatorLayout.getPaddingRight()) / 3;
        prettyHeaderView.d((size2 - coordinatorLayout.getPaddingTop()) - coordinatorLayout.getPaddingBottom());
        prettyHeaderView.measure(MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
        this.a = 0;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view) {
        return !((GlueHeaderLayout) coordinatorLayout).d && super.b(coordinatorLayout, (PrettyHeaderView) view);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int d(CoordinatorLayout coordinatorLayout, View view) {
        PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
        if (((GlueHeaderLayout) coordinatorLayout).d) {
            return 0;
        }
        return super.d(coordinatorLayout, prettyHeaderView);
    }

    public LegacyHeaderBehavior() {
    }

    public LegacyHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void a(CoordinatorLayout coordinatorLayout, float f) {
        fxn fxn = ((GlueHeaderLayout) coordinatorLayout).e;
        if (fxn != null) {
            float max = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
            if (Math.abs(this.d - max) >= 0.01f) {
                this.d = max;
                fxn.a(max);
            }
        }
    }
}
