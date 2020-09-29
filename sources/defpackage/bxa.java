package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;

/* renamed from: bxa reason: default package */
public abstract class bxa implements OnClickListener {
    public static bxa a(Activity activity, Intent intent, int i) {
        return new bym(intent, activity, i);
    }

    public static bxa a(Fragment fragment, Intent intent, int i) {
        return new byn(intent, fragment, i);
    }

    public static bxa a(btm btm, Intent intent, int i) {
        return new byo(intent, btm, 2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

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
