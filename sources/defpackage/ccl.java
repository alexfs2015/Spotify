package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ccl reason: default package */
public final class ccl implements OnClickListener {
    private final /* synthetic */ efj a;

    public ccl(efj efj) {
        this.a = efj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("Operation denied by user.");
    }
}
