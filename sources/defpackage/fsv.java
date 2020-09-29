package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fsv reason: default package */
final class fsv extends fsn implements fsu {
    private final TextView a;

    public fsv(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908309);
        fzy.a(this.a);
        fzy.a(view);
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final TextView c() {
        return this.a;
    }
}
