package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {
    et a;

    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        public float al;
        public boolean am;
        public float an;
        public float ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;

        public LayoutParams(int i, int i2) {
            super(-2, -2);
            this.al = 1.0f;
            this.am = false;
            this.an = 0.0f;
            this.ao = 0.0f;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 1.0f;
            this.as = 1.0f;
            this.at = 0.0f;
            this.au = 0.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.al = 1.0f;
            this.am = false;
            this.an = 0.0f;
            this.ao = 0.0f;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 1.0f;
            this.as = 1.0f;
            this.at = 0.0f;
            this.au = 0.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.al);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == b.av) {
                    this.al = obtainStyledAttributes.getFloat(index, this.al);
                } else if (index == b.aI) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                    this.am = true;
                } else if (index == b.aD) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                } else if (index == b.aE) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == b.aC) {
                    this.ao = obtainStyledAttributes.getFloat(index, this.ao);
                } else if (index == b.aA) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == b.aB) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == b.aw) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == b.ax) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == b.ay) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == b.az) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else if (index == b.aH) {
                    this.av = obtainStyledAttributes.getFloat(index, 0.0f);
                }
            }
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
