package defpackage;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: reu reason: default package */
public final class reu {
    private final Context a;
    private boolean b;

    /* renamed from: reu$a */
    public interface a {
        void onClick();
    }

    public reu(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.b = false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
        this.b = false;
        aVar.onClick();
    }

    public final void a(String str, String str2, String str3, a aVar) {
        if (!this.b) {
            this.b = true;
            ftl a2 = fts.a(this.a, str, str2).a(str3, new $$Lambda$reu$moxUdRMRmkI09t3BqWOXeyIhxIA(this, aVar));
            a2.e = true;
            a2.f = new $$Lambda$reu$WUyEzPMYeGCpG2uG4IJyjAhDPwk(this);
            a2.a().a();
        }
    }
}
