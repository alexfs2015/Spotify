package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;

/* renamed from: cnw reason: default package */
final class cnw implements OnClickListener {
    private final /* synthetic */ cnv a;

    cnw(cnv cnv) {
        this.a = cnv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkc.e();
        cmu.a(this.a.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
