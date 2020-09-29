package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: stv reason: default package */
public final class stv implements OnClickListener {
    private final sue a;
    private final String b;

    public stv(sue sue, String str) {
        this.a = sue;
        this.b = str;
    }

    public final void onClick(View view) {
        this.a.a(this.b, "popup_close");
        ((stn) view).b();
    }
}
