package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ccr reason: default package */
public final class ccr implements OnClickListener {
    private final /* synthetic */ ccp a;

    public ccr(ccp ccp) {
        this.a = ccp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("User canceled the download.");
    }
}
