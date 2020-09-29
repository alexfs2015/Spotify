package defpackage;

import android.app.Activity;
import android.view.View;

/* renamed from: djp reason: default package */
public final class djp extends dkn {
    private final Activity d;
    private final View e;

    public djp(djc djc, String str, String str2, dci dci, int i, View view, Activity activity) {
        super(djc, str, str2, dci, i, 62);
        this.e = view;
        this.d = activity;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.e != null) {
            boolean booleanValue = ((Boolean) dqe.f().a(dtg.bD)).booleanValue();
            Object[] objArr = (Object[]) this.c.invoke(null, new Object[]{this.e, this.d, Boolean.valueOf(booleanValue)});
            synchronized (this.b) {
                this.b.Q = Long.valueOf(((Long) objArr[0]).longValue());
                this.b.R = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.b.S = (String) objArr[2];
                }
            }
        }
    }
}
