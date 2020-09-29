package defpackage;

import android.os.Build.VERSION;
import android.transition.ChangeBounds;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: qvb reason: default package */
public final class qvb {
    public static void a(kr krVar, Fragment fragment, Fragment fragment2) {
        if (VERSION.SDK_INT >= 21 && (fragment instanceof qva) && (fragment2 instanceof qva)) {
            qva qva = (qva) fragment;
            qva qva2 = (qva) fragment2;
            boolean z = false;
            for (String str : qva.ai()) {
                if (qva2.d(str)) {
                    View e = qva.e(str);
                    if (e != null) {
                        krVar.a(e, str);
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
