package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fwk reason: default package */
final class fwk extends fwa implements fwj {
    private final TextView a;

    fwk(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
