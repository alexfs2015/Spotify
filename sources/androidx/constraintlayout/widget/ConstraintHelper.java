package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {
    private Context a;
    protected int[] b = new int[32];
    protected int c;
    protected el d;
    protected boolean e = false;
    private String f;

    public void d() {
    }

    public void onDraw(Canvas canvas) {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.a = context;
        a((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        a(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == b.j) {
                    this.f = obtainStyledAttributes.getString(index);
                    b(this.f);
                }
            }
        }
    }

    public final int[] b() {
        return Arrays.copyOf(this.b, this.c);
    }

    public final void a(int[] iArr) {
        this.c = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.c + 1;
        int[] iArr = this.b;
        if (i2 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void c() {
        if (this.d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).aj = this.d;
            }
        }
    }

    private void a(String str) {
        int i;
        if (str != null && this.a != null) {
            String trim = str.trim();
            try {
                i = a.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.a.getResources().getIdentifier(trim, "id", this.a.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a2 = ((ConstraintLayout) getParent()).a(0, (Object) trim);
                if (a2 != null && (a2 instanceof Integer)) {
                    i = ((Integer) a2).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            StringBuilder sb = new StringBuilder("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
        }
    }

    private void b(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            b(this.f);
        }
        el elVar = this.d;
        if (elVar != null) {
            elVar.A();
            for (int i = 0; i < this.c; i++) {
                View a2 = constraintLayout.a(this.b[i]);
                if (a2 != null) {
                    this.d.a(constraintLayout.a(a2));
                }
            }
        }
    }
}
