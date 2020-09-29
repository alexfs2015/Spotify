package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fvm reason: default package */
final class fvm extends fvi implements fvl {
    private final TextView a;

    fvm(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        this.a.setVisibility(0);
        fze.a(this.a);
        fze.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView e() {
        return this.a;
    }
}
