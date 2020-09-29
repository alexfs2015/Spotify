package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fvq reason: default package */
final class fvq extends fvg implements fvp {
    private final TextView a;

    fvq(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
