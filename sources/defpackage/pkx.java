package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: pkx reason: default package */
public final class pkx extends pkw implements fsa {
    private final TextView a;

    public final /* bridge */ /* synthetic */ TextView a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ void a(CharSequence charSequence) {
        super.a(charSequence);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public final /* bridge */ /* synthetic */ View b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ void b(boolean z) {
        super.b(z);
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return super.getView();
    }

    public pkx(View view) {
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
