package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: mlw reason: default package */
public final class mlw implements fqe {
    public final SwitchCompat a;
    public gbr<Boolean> b;
    CharSequence c;
    CharSequence d;
    CharSequence e;
    CharSequence f = null;
    private final frh g;

    mlw(frh frh) {
        this.g = (frh) fay.a(frh);
        TextView d2 = this.g.d();
        View view = this.g.getView();
        d2.setEllipsize(null);
        d2.setSingleLine(false);
        this.a = new SwitchCompat(view.getContext());
        this.a.setOnCheckedChangeListener(new $$Lambda$mlw$3njPmPN0yXVEvIk29TwfoN5SCh0(this));
        view.setOnClickListener(new $$Lambda$mlw$tbGp0NTT8MZ7RHm8GHNP9gb2Grs(this));
        this.g.a(this.a);
        fqf.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        gbr<Boolean> gbr = this.b;
        if (gbr != null) {
            gbr.accept(Boolean.valueOf(z));
        }
        a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.toggle();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.g.a(z ? this.c : this.d);
        this.g.b(z ? this.e : this.f);
    }

    public final View getView() {
        return this.g.getView();
    }
}
