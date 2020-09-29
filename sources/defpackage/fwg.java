package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fwg reason: default package */
final class fwg extends fwc implements fwf {
    private final TextView a;

    fwg(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        this.a.setVisibility(0);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView e() {
        return this.a;
    }
}
