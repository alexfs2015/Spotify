package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: sjo reason: default package */
public final class sjo implements OnClickListener {
    private final sjx a;
    private final String b;

    public sjo(sjx sjx, String str) {
        this.a = sjx;
        this.b = str;
    }

    public final void onClick(View view) {
        this.a.a(this.b, "popup_close");
        ((sjg) view).b();
    }
}
