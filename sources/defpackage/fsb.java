package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fsb reason: default package */
final class fsb extends frt implements fsa {
    private final TextView a;

    public fsb(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        fze.a(this.a);
        fze.a(view);
    }

    public final TextView c() {
        return this.a;
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
