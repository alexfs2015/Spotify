package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cnp reason: default package */
final /* synthetic */ class cnp implements OnClickListener {
    private final cnn a;
    private final int b;
    private final int c;
    private final int d;

    cnp(cnn cnn, int i, int i2, int i3) {
        this.a = cnn;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cnn cnn = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        if (i == i2) {
            cnn.b();
            return;
        }
        if (i == i3) {
            if (((Boolean) dqe.f().a(dtg.cM)).booleanValue()) {
                cpn.a(3);
                cms.a((Runnable) new cns(cnn));
                return;
            }
        }
        if (i == i4) {
            if (((Boolean) dqe.f().a(dtg.cN)).booleanValue()) {
                cpn.a(3);
                cms.a((Runnable) new cnt(cnn));
            }
        }
    }
}
