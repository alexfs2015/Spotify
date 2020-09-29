package defpackage;

import android.os.Build.VERSION;
import android.transition.ChangeBounds;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: qmt reason: default package */
public final class qmt {
    public static void a(km kmVar, Fragment fragment, Fragment fragment2) {
        if (VERSION.SDK_INT >= 21 && (fragment instanceof qms) && (fragment2 instanceof qms)) {
            qms qms = (qms) fragment;
            qms qms2 = (qms) fragment2;
            boolean z = false;
            for (String str : qms.ai()) {
                if (qms2.d(str)) {
                    View e = qms.e(str);
                    if (e != null) {
                        kmVar.a(e, str);
                        z = true;
                    }
                }
            }
            if (z) {
                fragment2.a_(new ChangeBounds());
            }
        }
    }
}
