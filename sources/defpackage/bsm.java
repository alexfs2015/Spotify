package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: bsm reason: default package */
public final class bsm extends DialogFragment {
    private Dialog a = null;
    private OnCancelListener b = null;

    public static bsm a(Dialog dialog, OnCancelListener onCancelListener) {
        bsm bsm = new bsm();
        Dialog dialog2 = (Dialog) bxo.a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bsm.a = dialog2;
        if (onCancelListener != null) {
            bsm.b = onCancelListener;
        }
        return bsm;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.a == null) {
            setShowsDialog(false);
        }
        return this.a;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
