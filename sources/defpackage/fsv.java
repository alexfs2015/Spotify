package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* renamed from: fsv reason: default package */
final class fsv implements fsp {
    private final fsx a = new fsx(this.b);
    private final fso b;

    public fsv(Context context, int i, fsr fsr) {
        this.b = new fso(context, i, fsr.i);
        fsx fsx = this.a;
        fsx.a.setCancelable(fsr.e);
        fsx.a.setOnCancelListener(fsr.f);
        fsx.a.setOnDismissListener(fsr.g);
        if (!TextUtils.isEmpty(fsr.a)) {
            fsx.b = fsr.c;
            fsx.a.a(true);
        } else {
            fsx.a.a(false);
        }
        if (!TextUtils.isEmpty(fsr.b)) {
            fsx.c = fsr.d;
            fsx.a.b(true);
        } else {
            fsx.a.b(false);
        }
        fsx.a.c = (fsw) fav.a(fsr.h, fso.d);
        fso fso = this.b;
        CharSequence charSequence = fsr.a;
        $$Lambda$fsv$ULKd_sxqzWZesEdlX80ppWHAXWE r0 = new $$Lambda$fsv$ULKd_sxqzWZesEdlX80ppWHAXWE(this);
        fso.a.setText(charSequence);
        fso.a.setOnClickListener(r0);
        if (!TextUtils.isEmpty(charSequence)) {
            fso.a.setVisibility(0);
        }
        fso fso2 = this.b;
        CharSequence charSequence2 = fsr.b;
        $$Lambda$fsv$svEr4pYMNCgOVftJKuliARLz8jY r6 = new $$Lambda$fsv$svEr4pYMNCgOVftJKuliARLz8jY(this);
        fso2.b.setText(charSequence2);
        fso2.b.setOnClickListener(r6);
        if (!TextUtils.isEmpty(charSequence2)) {
            fso2.b.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        fsx fsx = this.a;
        if (fsx.b != null) {
            fsx.b.onClick(fsx.a, -1);
        }
        fsx.a.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        fsx fsx = this.a;
        if (fsx.c != null) {
            fsx.c.onClick(fsx.a, -2);
        }
        fsx.a.dismiss();
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
