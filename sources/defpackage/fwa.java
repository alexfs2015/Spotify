package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fwa reason: default package */
class fwa implements fvz {
    private final View a;
    private final TextView b;

    fwa(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        fzy.a(this.b);
        fzy.a(view);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public boolean b() {
        return false;
    }

    public int c() {
        return this.a.getMeasuredWidth() / 2;
    }

    public int d() {
        return this.a.getHeight() / 2;
    }

    public View getView() {
        return this.a;
    }
}
