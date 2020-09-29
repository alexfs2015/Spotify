package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: bwj reason: default package */
public abstract class bwj implements OnClickListener {
    /* access modifiers changed from: protected */
    public abstract void a();

    public static bwj a(Activity activity, Intent intent, int i) {
        return new bxv(intent, activity, i);
    }

    public static bwj a(Fragment fragment, Intent intent, int i) {
        return new bxw(intent, fragment, i);
    }

    public static bwj a(bsv bsv, Intent intent, int i) {
        return new bxx(intent, bsv, 2);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
