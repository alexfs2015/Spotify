package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.google.android.material.transformation.FabTransformationBehavior.a;
import com.spotify.music.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> a;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final a a(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        a aVar = new a();
        aVar.a = ezb.a(context, i);
        aVar.b = new ezd(17, 0.0f, 0.0f);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final boolean a(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.a = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof d) && (((d) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.a;
                        if (map != null && map.containsKey(childAt)) {
                            ip.b(childAt, ((Integer) this.a.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.a.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        ip.b(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.a = null;
            }
        }
        return super.a(view, view2, z, z2);
    }
}
