package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HidingHeaderListView extends ListView {
    public boolean a;
    private final View b;
    private final LayoutParams c;
    private final DataSetObserver d;

    public HidingHeaderListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public HidingHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new LayoutParams(-1, 0);
        this.d = new DataSetObserver() {
            public final void onChanged() {
                if (HidingHeaderListView.this.a) {
                    HidingHeaderListView.this.requestLayout();
                }
            }

            public final void onInvalidated() {
                if (HidingHeaderListView.this.a) {
                    HidingHeaderListView.this.requestLayout();
                }
            }
        };
        this.b = new View(context);
        this.b.setLayoutParams(this.c);
    }

    private boolean a() {
        return getAdapter().getCount() > 2 && getFirstVisiblePosition() <= 1 && 1 <= getLastVisiblePosition();
    }

    private boolean b() {
        int count = getAdapter().getCount() - 2;
        return count > 0 && getFirstVisiblePosition() <= count && count <= getLastVisiblePosition();
    }

    private boolean c() {
        return getAdapter().getCount() == 2;
    }

    private boolean d() {
        return getLastVisiblePosition() == getAdapter().getCount() - 1;
    }

    private int e() {
        int childCount = getChildCount();
        int i = childCount - 1;
        return getChildAt(i) == this.b ? i : childCount;
    }

    private View f() {
        return getChildAt(e() - 1);
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        int i;
        int i2;
        if (!this.a || getAdapter() == null || getAdapter().getCount() < 2) {
            this.c.height = 0;
            super.layoutChildren();
            return;
        }
        int i3 = 1;
        boolean z = getFirstVisiblePosition() > 0 && c();
        this.c.height = getHeight();
        super.layoutChildren();
        boolean z2 = !a() && (b() || d()) && !c();
        if (z2) {
            setSelectionFromTop(1, 0);
            super.layoutChildren();
        }
        int bottom = e() > 0 ? f().getBottom() : 0;
        boolean a2 = a();
        boolean b2 = b();
        if ((!a2 || !b2) && !c()) {
            i = 0;
        } else {
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (c()) {
                i2 = 0;
            } else {
                if (getFirstVisiblePosition() != 0) {
                    i3 = 0;
                }
                i2 = f().getBottom() - getChildAt(i3).getTop();
            }
            i = height - i2;
        }
        this.c.height = i;
        if (d() && !z && !z2) {
            this.b.layout(getLeft(), bottom, getRight(), i + bottom);
        }
        if (z) {
            setSelectionFromTop(0, -getChildAt(0).getHeight());
            super.layoutChildren();
            return;
        }
        if (z2) {
            setSelectionFromTop(getAdapter().getCount() - 2, 0);
            super.layoutChildren();
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            addFooterView(this.b, null, false);
        } else {
            adapter.unregisterDataSetObserver(this.d);
        }
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.d);
        }
        super.setAdapter(listAdapter);
    }
}
