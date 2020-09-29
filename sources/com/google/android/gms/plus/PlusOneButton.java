package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

@Deprecated
public final class PlusOneButton extends FrameLayout {
    /* access modifiers changed from: private */
    public View a;
    private int b;
    private int c;
    /* access modifiers changed from: private */
    public int d;
    private b e;

    @Deprecated
    public class a implements OnClickListener, b {
        private final b a;

        @Deprecated
        public a(b bVar) {
            this.a = bVar;
        }

        @Deprecated
        public final void a(Intent intent) {
            Context context = PlusOneButton.this.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, PlusOneButton.this.d);
            }
        }

        @Deprecated
        public final void onClick(View view) {
            Intent intent = (Intent) PlusOneButton.this.a.getTag();
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(intent);
            } else {
                a(intent);
            }
        }
    }

    @Deprecated
    public interface b {
        @Deprecated
        void a(Intent intent);
    }

    @Deprecated
    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String a2 = bxv.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        int i = 2;
        int i2 = "SMALL".equalsIgnoreCase(a2) ? 0 : "MEDIUM".equalsIgnoreCase(a2) ? 1 : "TALL".equalsIgnoreCase(a2) ? 2 : 3;
        this.b = i2;
        String a3 = bxv.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if (!"INLINE".equalsIgnoreCase(a3)) {
            i = "NONE".equalsIgnoreCase(a3) ? 0 : 1;
        }
        this.c = i;
        this.d = -1;
        Context context2 = getContext();
        View view = this.a;
        if (view != null) {
            removeView(view);
        }
        this.a = exc.a(context2, this.b, this.c, null, this.d);
        b bVar = this.e;
        this.e = bVar;
        this.a.setOnClickListener(new a(bVar));
        addView(this.a);
        boolean isInEditMode = isInEditMode();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
