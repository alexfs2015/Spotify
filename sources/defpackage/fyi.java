package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: fyi reason: default package */
final class fyi implements fyb {
    public final fxw a(Fragment fragment) {
        kf a = fyw.a(fragment);
        fyd fyd = new fyd(a);
        fyw.a((Activity) a, fyd);
        return fyd;
    }

    public final fxw a(Fragment fragment, View view) {
        kf a = fyw.a(fragment);
        fxx fxx = new fxx(a, view, gav.b(a));
        fyw.a((Activity) a, fxx);
        return fxx;
    }

    public final fxw b(Fragment fragment, View view) {
        kf a = fyw.a(fragment);
        fxu fxu = new fxu(a, view);
        fyw.a((Activity) a, fxu);
        return fxu;
    }

    public final fxy b(Fragment fragment) {
        kf a = fyw.a(fragment);
        fye fye = new fye(a);
        fyw.a((Activity) a, fye);
        return fye;
    }

    public final fxy c(Fragment fragment, View view) {
        return fyw.a(fragment, view);
    }

    public final fxy d(Fragment fragment, View view) {
        return fyw.b(fragment, view);
    }
}
