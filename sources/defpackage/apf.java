package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: apf reason: default package */
public abstract class apf extends ajz {
    private int b = 0;
    private boolean c = false;

    /* access modifiers changed from: protected */
    public abstract ama<aon, a> e();

    protected apf(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        this.b = isInEditMode() ? 0 : a();
        setEnabled(false);
        this.c = false;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c = true;
    }

    public final int b() {
        return this.b;
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        this.a = new OnClickListener() {
            public final void onClick(View view) {
                apf.this.a(view);
                ama e = apf.this.e();
                apf apf = apf.this;
                e.a(null);
            }
        };
    }
}
