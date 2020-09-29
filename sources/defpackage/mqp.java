package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: mqp reason: default package */
public final class mqp implements fqy {
    public final SwitchCompat a;
    public gcp<Boolean> b;
    CharSequence c;
    CharSequence d;
    CharSequence e;
    CharSequence f = null;
    private final fsb g;

    mqp(fsb fsb) {
        this.g = (fsb) fbp.a(fsb);
        TextView d2 = this.g.d();
        View view = this.g.getView();
        d2.setEllipsize(null);
        d2.setSingleLine(false);
        this.a = new SwitchCompat(view.getContext());
        this.a.setOnCheckedChangeListener(new $$Lambda$mqp$OhgXW6E3TiWhJ9tB2nDfZGOECGM(this));
        view.setOnClickListener(new $$Lambda$mqp$8WelCjVsya3ZtRsFpS_EJVe37C0(this));
        this.g.a(this.a);
        fqz.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.toggle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        gcp<Boolean> gcp = this.b;
        if (gcp != null) {
            gcp.accept(Boolean.valueOf(z));
        }
        a(z);
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
