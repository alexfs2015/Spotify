package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: fvg reason: default package */
class fvg implements fvf {
    private final View a;
    private final TextView b;

    public boolean b() {
        return false;
    }

    fvg(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(16908308);
        fze.a(this.b);
        fze.a(view);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
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
