package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: fxo reason: default package */
final class fxo implements fxh {
    public final fxe c(Fragment fragment, View view) {
        return fyc.a(fragment, view);
    }

    public final fxe d(Fragment fragment, View view) {
        return fyc.b(fragment, view);
    }

    public final fxc a(Fragment fragment, View view) {
        ka a = fyc.a(fragment);
        fxd fxd = new fxd(a, view, gab.b(a));
        fyc.a((Activity) a, fxd);
        return fxd;
    }

    public final fxc b(Fragment fragment, View view) {
        ka a = fyc.a(fragment);
        fxa fxa = new fxa(a, view);
        fyc.a((Activity) a, fxa);
        return fxa;
    }

    public final fxc a(Fragment fragment) {
        ka a = fyc.a(fragment);
        fxj fxj = new fxj(a);
        fyc.a((Activity) a, fxj);
        return fxj;
    }

    public final fxe b(Fragment fragment) {
        ka a = fyc.a(fragment);
        fxk fxk = new fxk(a);
        fyc.a((Activity) a, fxk);
        return fxk;
    }
}
