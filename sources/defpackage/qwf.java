package defpackage;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: qwf reason: default package */
public final class qwf {
    private final Context a;
    private boolean b;

    /* renamed from: qwf$a */
    public interface a {
        void onClick();
    }

    public qwf(Context context) {
        this.a = context;
    }

    public final void a(String str, String str2, String str3, a aVar) {
        if (!this.b) {
            this.b = true;
            fsr a2 = fsy.a(this.a, str, str2).a(str3, new $$Lambda$qwf$D4BuyK_jHMGZHRQNvNtdijI8oA(this, aVar));
            a2.e = true;
            a2.f = new $$Lambda$qwf$JfPxCiT2PGOJ2F8NwoMRa_qF4yw(this);
            a2.a().a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
        this.b = false;
        aVar.onClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.b = false;
    }
}
