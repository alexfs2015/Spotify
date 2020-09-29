package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: apt reason: default package */
public abstract class apt extends akn {
    private int b = 0;
    private boolean c = false;

    protected apt(Context context, AttributeSet attributeSet, int i, String str, String str2) {
        super(context, attributeSet, i, 0, str, str2);
        this.b = isInEditMode() ? 0 : a();
        setEnabled(false);
        this.c = false;
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        this.a = new OnClickListener() {
            public final void onClick(View view) {
                apt.this.a(view);
                amo e = apt.this.e();
                apt apt = apt.this;
                e.a(null);
            }
        };
    }

    public final int b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract amo<apb, a> e();

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c = true;
    }
}
