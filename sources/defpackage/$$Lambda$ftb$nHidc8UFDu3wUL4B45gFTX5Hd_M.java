package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: -$$Lambda$ftb$nHidc8UFDu3wUL4B45gFTX5Hd_M reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ftb$nHidc8UFDu3wUL4B45gFTX5Hd_M implements OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ $$Lambda$ftb$nHidc8UFDu3wUL4B45gFTX5Hd_M(DialogInterface.OnClickListener onClickListener, int i) {
        this.f$0 = onClickListener;
        this.f$1 = i;
    }

    public final void onClick(View view) {
        this.f$0.onClick(null, this.f$1);
    }
}
