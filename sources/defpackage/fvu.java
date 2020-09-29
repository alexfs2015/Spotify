package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fvu reason: default package */
class fvu extends fvg implements fvr {
    private final TextView a;

    fvu(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        fze.a(this.a);
        fze.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView a() {
        return this.a;
    }
}
