package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

/* renamed from: brv reason: default package */
public final class brv extends DialogFragment {
    private Dialog a = null;
    private OnCancelListener b = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.a == null) {
            setShowsDialog(false);
        }
        return this.a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static brv a(Dialog dialog, OnCancelListener onCancelListener) {
        brv brv = new brv();
        Dialog dialog2 = (Dialog) bwx.a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        brv.a = dialog2;
        if (onCancelListener != null) {
            brv.b = onCancelListener;
        }
        return brv;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
