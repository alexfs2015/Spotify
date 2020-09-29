package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;

/* renamed from: cnf reason: default package */
final class cnf implements OnClickListener {
    private final /* synthetic */ cne a;

    cnf(cne cne) {
        this.a = cne;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bjl.e();
        cmd.a(this.a.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
