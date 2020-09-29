package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: nos reason: default package */
public final class nos extends noo {
    private final frd a;
    private final SwitchCompat b;

    private nos(frd frd, a aVar) {
        super(frd.getView(), aVar);
        this.a = frd;
        this.b = (SwitchCompat) frd.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.toggle();
    }

    public final void a(npo npo, int i) {
        this.o.setOnClickListener(new $$Lambda$nos$GcEwd5j7BTytF1Nq5bW_P2S8Pg(this));
        this.b.setOnCheckedChangeListener(new $$Lambda$nos$PqKvV5xIxCZMH57OXNg3EOwtGbw(this, npo));
        this.a.a(npo.a());
        this.b.setChecked(npo.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(npo npo, CompoundButton compoundButton, boolean z) {
        if (z != npo.d() && !y()) {
            compoundButton.setChecked(npo.d());
        }
    }

    public final void x() {
        this.b.setOnCheckedChangeListener(null);
    }

    public nos(ViewGroup viewGroup, a aVar) {
        Context context = viewGroup.getContext();
        fqb.b();
        frd c = frq.c(context, viewGroup);
        c.a(new SwitchCompat(context));
        this(c, aVar);
    }
}
