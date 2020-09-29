package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ix reason: default package */
public final class ix extends ClickableSpan {
    private final int a;
    private final ja b;
    private final int c;

    public ix(int i, ja jaVar, int i2) {
        this.a = i;
        this.b = jaVar;
        this.c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        ja jaVar = this.b;
        int i = this.c;
        if (VERSION.SDK_INT >= 16) {
            jaVar.a.performAction(i, bundle);
        }
    }
}
