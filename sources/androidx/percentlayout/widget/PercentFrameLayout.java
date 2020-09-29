package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@Deprecated
public class PercentFrameLayout extends FrameLayout {
    private final nt a = new nt(this);

    @Deprecated
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams implements b {
        private a a;

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = nt.a(context, attributeSet);
        }

        public final a a() {
            if (this.a == null) {
                this.a = new a();
            }
            return this.a;
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            nt.a(this, typedArray, i, i2);
        }
    }

    public PercentFrameLayout(Context context) {
        super(context);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private static LayoutParams a() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.a.a(i, i2);
        super.onMeasure(i, i2);
        if (this.a.b()) {
            super.onMeasure(i, i2);
        }
    }
}
