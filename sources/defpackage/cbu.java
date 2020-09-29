package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: cbu reason: default package */
public final class cbu implements OnClickListener {
    private final /* synthetic */ ees a;

    public cbu(ees ees) {
        this.a = ees;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("Operation denied by user.");
    }
}
