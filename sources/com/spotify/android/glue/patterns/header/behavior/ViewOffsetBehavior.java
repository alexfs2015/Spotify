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
    fvc b;
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

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.d = v;
        this.a = coordinatorLayout;
        coordinatorLayout.b(v, i);
        a(v);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(V v) {
        if (this.b == null) {
            this.b = new fvc(v);
        }
        this.b.a();
        int i = this.c;
        if (i != 0) {
            this.b.a(i);
            this.c = 0;
        }
    }

    public boolean b(int i) {
        fvc fvc = this.b;
        if (fvc != null) {
            return fvc.a(i);
        }
        this.c = i;
        return false;
    }

    public int a() {
        fvc fvc = this.b;
        if (fvc != null) {
            return fvc.a;
        }
        return 0;
    }

    protected static Behavior<?> b(View view) {
        d dVar = (d) view.getLayoutParams();
        if (dVar != null) {
            return dVar.a;
        }
        return null;
    }
}
