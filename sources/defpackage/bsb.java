package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: bsb reason: default package */
public final class bsb extends jz {
    private Dialog T = null;
    private OnCancelListener U = null;

    public final Dialog a(Bundle bundle) {
        if (this.T == null) {
            this.a = false;
        }
        return this.T;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.U;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static bsb a(Dialog dialog, OnCancelListener onCancelListener) {
        bsb bsb = new bsb();
        Dialog dialog2 = (Dialog) bwx.a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bsb.T = dialog2;
        if (onCancelListener != null) {
            bsb.U = onCancelListener;
        }
        return bsb;
    }

    public final void a(kf kfVar, String str) {
        super.a(kfVar, str);
    }
}
