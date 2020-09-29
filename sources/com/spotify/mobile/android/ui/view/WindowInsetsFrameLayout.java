package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.FrameLayout;

public class WindowInsetsFrameLayout extends FrameLayout {
    public WindowInsetsFrameLayout(Context context) {
        super(context);
        a();
    }

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setOnHierarchyChangeListener(new OnHierarchyChangeListener() {
            public final void onChildViewRemoved(View view, View view2) {
            }

            public final void onChildViewAdded(View view, View view2) {
                ip.s(view2);
            }
        });
    }
}
