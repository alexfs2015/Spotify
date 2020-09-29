package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    public int a;
    private int f;
    private ef g;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public final void a(int i) {
        this.a = i;
        this.f = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.a;
            if (i2 == 5) {
                this.f = 0;
            } else if (i2 == 6) {
                this.f = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.a;
                if (i3 == 5) {
                    this.f = 1;
                } else if (i3 == 6) {
                    this.f = 0;
                }
            } else {
                int i4 = this.a;
                if (i4 == 5) {
                    this.f = 0;
                } else if (i4 == 6) {
                    this.f = 1;
                }
            }
        }
        this.g.a = this.f;
    }

    /* access modifiers changed from: protected */
    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.g = new ef();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == b.h) {
                    a(obtainStyledAttributes.getInt(index, 0));
                } else if (index == b.g) {
                    this.g.b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.d = this.g;
        c();
    }

    public final void a(boolean z) {
        this.g.b = z;
    }

    public final boolean a() {
        return this.g.b;
    }
}
