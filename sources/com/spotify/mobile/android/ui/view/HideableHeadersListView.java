package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;

public class HideableHeadersListView extends ListView {
    private LinearLayout a;
    private boolean b;
    private boolean c;
    private boolean d;

    public HideableHeadersListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinearLayout(context);
        this.a.setOrientation(1);
        this.a.setLayoutParams(new LayoutParams(-1, -2));
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        super.layoutChildren();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        this.c = true;
        super.onRestoreInstanceState(parcelable);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.d = true;
        return super.onTouchEvent(motionEvent);
    }

    public void setSelection(int i) {
        if (i != 0) {
            this.b = true;
        }
        super.setSelection(i);
    }

    public void setSelectionAfterHeaderView() {
        this.b = true;
        super.setSelectionAfterHeaderView();
    }

    public void setSelectionFromTop(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.setSelectionFromTop(i, i2);
    }

    public void smoothScrollBy(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollBy(i, i2);
    }

    public void smoothScrollToPosition(int i) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollToPosition(i);
    }

    public void smoothScrollToPosition(int i, int i2) {
        if (i != 0) {
            this.b = true;
        }
        super.smoothScrollToPosition(i, i2);
    }
}
