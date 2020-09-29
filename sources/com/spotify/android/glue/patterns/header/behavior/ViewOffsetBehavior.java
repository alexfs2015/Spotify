package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private CoordinatorLayout a;
    fvw b;
    protected int c;
    private V d;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected static boolean a(CoordinatorLayout coordinatorLayout) {
        return ((GlueHeaderLayout) coordinatorLayout).d;
    }

    protected static Behavior<?> b(View view) {
        d dVar = (d) view.getLayoutParams();
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }

    public int a() {
        fvw fvw = this.b;
        if (fvw != null) {
            return fvw.a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void a(V v) {
        if (this.b == null) {
            this.b = new fvw(v);
        }
        this.b.a();
        int i = this.c;
        if (i != 0) {
            this.b.a(i);
            this.c = 0;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.d = v;
        this.a = coordinatorLayout;
        coordinatorLayout.b(v, i);
        a(v);
        return true;
    }

    public boolean b(int i) {
        fvw fvw = this.b;
        if (fvw != null) {
            return fvw.a(i);
        }
        this.c = i;
        return false;
    }
}
