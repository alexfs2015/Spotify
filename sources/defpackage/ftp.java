package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* renamed from: ftp reason: default package */
final class ftp implements ftj {
    private final ftr a = new ftr(this.b);
    private final fti b;

    public ftp(Context context, int i, ftl ftl) {
        this.b = new fti(context, i, ftl.i);
        ftr ftr = this.a;
        ftr.a.setCancelable(ftl.e);
        ftr.a.setOnCancelListener(ftl.f);
        ftr.a.setOnDismissListener(ftl.g);
        if (!TextUtils.isEmpty(ftl.a)) {
            ftr.b = ftl.c;
            ftr.a.a(true);
        } else {
            ftr.a.a(false);
        }
        if (!TextUtils.isEmpty(ftl.b)) {
            ftr.c = ftl.d;
            ftr.a.b(true);
        } else {
            ftr.a.b(false);
        }
        ftr.a.c = (ftq) fbm.a(ftl.h, fti.d);
        fti fti = this.b;
        CharSequence charSequence = ftl.a;
        $$Lambda$ftp$P8uhWjUIa2GDigwT15ve7wklkEQ r0 = new $$Lambda$ftp$P8uhWjUIa2GDigwT15ve7wklkEQ(this);
        fti.a.setText(charSequence);
        fti.a.setOnClickListener(r0);
        if (!TextUtils.isEmpty(charSequence)) {
            fti.a.setVisibility(0);
        }
        fti fti2 = this.b;
        CharSequence charSequence2 = ftl.b;
        $$Lambda$ftp$mha78r2Kw3zYrpN3jvWfrnEb5FA r6 = new $$Lambda$ftp$mha78r2Kw3zYrpN3jvWfrnEb5FA(this);
        fti2.b.setText(charSequence2);
        fti2.b.setOnClickListener(r6);
        if (!TextUtils.isEmpty(charSequence2)) {
            fti2.b.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ftr ftr = this.a;
        if (ftr.c != null) {
            ftr.c.onClick(ftr.a, -2);
        }
        ftr.a.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ftr ftr = this.a;
        if (ftr.b != null) {
            ftr.b.onClick(ftr.a, -1);
        }
        ftr.a.dismiss();
    }

    public final void a() {
        this.a.a.show();
    }

    public final void b() {
        this.a.a.dismiss();
    }

    public final void c() {
        this.a.a.cancel();
    }

    public final Dialog d() {
        return this.b;
    }
}
