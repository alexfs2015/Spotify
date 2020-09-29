package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.Locale;

/* renamed from: mag reason: default package */
final class mag implements mal {
    private final FrameLayout a;
    private final Button b;

    public mag(Context context) {
        this.a = new FrameLayout(context);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        int a2 = vfj.a(8.0f, context.getResources());
        layoutParams.setMargins(a2, a2, a2, a2);
        this.a.setLayoutParams(layoutParams);
        gat.a();
        this.b = a.c((Context) fbp.a(context));
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.b.setLayoutParams(layoutParams2);
        int a3 = vfj.a(24.0f, context.getResources());
        this.b.setPadding(a3, 0, a3, 0);
        this.a.addView(this.b);
    }

    public final Button a() {
        return this.b;
    }

    public final void a(String str) {
        this.b.setText(fbo.a(str) ? "" : str.toUpperCase(Locale.getDefault()));
        this.b.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    public final View getView() {
        return this.a;
    }
}
