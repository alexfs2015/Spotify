package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: bss reason: default package */
public final class bss extends ke {
    private Dialog T = null;
    private OnCancelListener U = null;

    public static bss a(Dialog dialog, OnCancelListener onCancelListener) {
        bss bss = new bss();
        Dialog dialog2 = (Dialog) bxo.a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bss.T = dialog2;
        if (onCancelListener != null) {
            bss.U = onCancelListener;
        }
        return bss;
    }

    public final Dialog a(Bundle bundle) {
        if (this.T == null) {
            this.a = false;
        }
        return this.T;
    }

    public final void a(kk kkVar, String str) {
        super.a(kkVar, str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.U;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
