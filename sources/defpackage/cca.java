package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cca reason: default package */
public final class cca implements OnClickListener {
    private final /* synthetic */ cby a;

    public cca(cby cby) {
        this.a = cby;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("User canceled the download.");
    }
}
