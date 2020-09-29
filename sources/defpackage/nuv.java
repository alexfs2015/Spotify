package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: nuv reason: default package */
public final class nuv extends nur {
    private final frx a;
    private final SwitchCompat b;

    public nuv(ViewGroup viewGroup, a aVar) {
        Context context = viewGroup.getContext();
        fqv.b();
        frx c = fsk.c(context, viewGroup);
        c.a(new SwitchCompat(context));
        this(c, aVar);
    }

    private nuv(frx frx, a aVar) {
        super(frx.getView(), aVar);
        this.a = frx;
        this.b = (SwitchCompat) frx.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.toggle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nvr nvr, CompoundButton compoundButton, boolean z) {
        if (z != nvr.d() && !z()) {
            compoundButton.setChecked(nvr.d());
        }
    }

    public final void a(nvr nvr, int i) {
        this.o.setOnClickListener(new $$Lambda$nuv$7Mn3chYc2hUVdyj0DcWVIVpJ8NE(this));
        this.b.setOnCheckedChangeListener(new $$Lambda$nuv$1EWxb_YlLcFDBsqIn2ti_o2KI0(this, nvr));
        this.a.a(nvr.a());
        this.b.setChecked(nvr.d());
    }

    public final void y() {
        this.b.setOnCheckedChangeListener(null);
    }
}
