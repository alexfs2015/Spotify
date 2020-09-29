package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: rwy reason: default package */
public final class rwy implements rwv {
    private final fri a;
    private final TextView b;
    private final View c;

    public rwy(View view, fri fri, TextView textView) {
        this.a = fri;
        this.b = textView;
        this.c = view;
    }

    public final TextView e() {
        return this.b;
    }

    public final void a(int i) {
        this.b.setText(String.valueOf(i));
    }

    public final void f() {
        this.b.setVisibility(8);
    }

    public final TextView b() {
        return this.a.b();
    }

    public final TextView d() {
        return this.a.d();
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.a.c(charSequence);
    }

    public final ImageView c() {
        return this.a.c();
    }

    public final void a(View view) {
        this.a.a(view);
    }

    public final View a() {
        return this.a.a();
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final View getView() {
        return this.c;
    }

    public final void c(boolean z) {
        this.a.c(z);
    }
}
