package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements OnItemClickListener, b, be {
    private static final int[] a = {16842964, 16843049};
    private ax b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        cp a2 = cp.a(context, attributeSet, a, i, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.a.recycle();
    }

    public final void a(ax axVar) {
        this.b = axVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean a(az azVar) {
        return this.b.a((MenuItem) azVar, (bd) null, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((az) getAdapter().getItem(i));
    }
}
