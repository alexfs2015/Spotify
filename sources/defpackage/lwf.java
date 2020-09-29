package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.Locale;

/* renamed from: lwf reason: default package */
final class lwf implements lwk {
    private final FrameLayout a;
    private final Button b;

    public lwf(Context context) {
        this.a = new FrameLayout(context);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        int a2 = uts.a(8.0f, context.getResources());
        layoutParams.setMargins(a2, a2, a2, a2);
        this.a.setLayoutParams(layoutParams);
        fzz.a();
        this.b = a.c((Context) fay.a(context));
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.b.setLayoutParams(layoutParams2);
        int a3 = uts.a(24.0f, context.getResources());
        this.b.setPadding(a3, 0, a3, 0);
        this.a.addView(this.b);
    }

    public final View getView() {
        return this.a;
    }

    public final Button a() {
        return this.b;
    }

    public final void a(String str) {
        this.b.setText(fax.a(str) ? "" : str.toUpperCase(Locale.getDefault()));
        this.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }
}
