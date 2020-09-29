package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: -$$Lambda$ftv$2heR_mI9kZh3mUv3AgQ2K2cTbMU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ftv$2heR_mI9kZh3mUv3AgQ2K2cTbMU implements OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ $$Lambda$ftv$2heR_mI9kZh3mUv3AgQ2K2cTbMU(DialogInterface.OnClickListener onClickListener, int i) {
        this.f$0 = onClickListener;
        this.f$1 = i;
    }

    public final void onClick(View view) {
        this.f$0.onClick(null, this.f$1);
    }
}
