package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fwo reason: default package */
class fwo extends fwa implements fwl {
    private final TextView a;

    fwo(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final TextView a() {
        return this.a;
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
