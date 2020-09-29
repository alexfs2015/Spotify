package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.material.internal.FlowLayout;
import com.spotify.music.R;

public class ChipGroup extends FlowLayout {
    private int d;
    private int e;
    /* access modifiers changed from: private */
    public boolean f;
    /* access modifiers changed from: private */
    public final a g;
    private b h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public boolean j;

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }
    }

    class a implements OnCheckedChangeListener {
        private a() {
        }

        /* synthetic */ a(ChipGroup chipGroup, byte b) {
            this();
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.j) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.i == -1 || ChipGroup.this.i == id || !ChipGroup.this.f)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.a(chipGroup.i, false);
                    }
                    ChipGroup.this.i = id;
                    return;
                }
                if (ChipGroup.this.i == id) {
                    ChipGroup.this.i = -1;
                }
            }
        }
    }

    class b implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */
        public OnHierarchyChangeListener a;

        private b() {
        }

        /* synthetic */ b(ChipGroup chipGroup, byte b2) {
            this();
        }

        public final void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).b = ChipGroup.this.g;
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).b = null;
            }
            OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = new a(this, 0);
        this.h = new b(this, 0);
        this.i = -1;
        this.j = false;
        TypedArray a2 = ezs.a(context, attributeSet, defpackage.eyc.a.aq, i2, 2132018001, new int[0]);
        int dimensionPixelOffset = a2.getDimensionPixelOffset(defpackage.eyc.a.as, 0);
        int dimensionPixelOffset2 = a2.getDimensionPixelOffset(defpackage.eyc.a.at, dimensionPixelOffset);
        if (this.d != dimensionPixelOffset2) {
            this.d = dimensionPixelOffset2;
            this.b = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = a2.getDimensionPixelOffset(defpackage.eyc.a.au, dimensionPixelOffset);
        if (this.e != dimensionPixelOffset3) {
            this.e = dimensionPixelOffset3;
            this.a = dimensionPixelOffset3;
            requestLayout();
        }
        this.c = a2.getBoolean(defpackage.eyc.a.av, false);
        boolean z = a2.getBoolean(defpackage.eyc.a.aw, false);
        if (this.f != z) {
            this.f = z;
            this.j = true;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.j = false;
            this.i = -1;
        }
        int resourceId = a2.getResourceId(defpackage.eyc.a.ar, -1);
        if (resourceId != -1) {
            this.i = resourceId;
        }
        a2.recycle();
        super.setOnHierarchyChangeListener(this.h);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h.a = onHierarchyChangeListener;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.i;
        if (i2 != -1) {
            a(i2, true);
            this.i = this.i;
        }
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.i;
                if (i3 != -1 && this.f) {
                    a(i3, false);
                }
                this.i = chip.getId();
            }
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: private */
    public void a(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.j = true;
            ((Chip) findViewById).setChecked(z);
            this.j = false;
        }
    }
}
