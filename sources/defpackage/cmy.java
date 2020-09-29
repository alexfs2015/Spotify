package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cmy reason: default package */
final /* synthetic */ class cmy implements OnClickListener {
    private final cmw a;
    private final int b;
    private final int c;
    private final int d;

    cmy(cmw cmw, int i, int i2, int i3) {
        this.a = cmw;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cmw cmw = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        if (i == i2) {
            cmw.b();
            return;
        }
        if (i == i3) {
            if (((Boolean) dpn.f().a(dsp.cM)).booleanValue()) {
                cow.a(3);
                cmb.a((Runnable) new cnb(cmw));
                return;
            }
        }
        if (i == i4) {
            if (((Boolean) dpn.f().a(dsp.cN)).booleanValue()) {
                cow.a(3);
                cmb.a((Runnable) new cnc(cmw));
            }
        }
    }
}
