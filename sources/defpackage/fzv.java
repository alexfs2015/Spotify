package defpackage;

import android.content.Context;
import android.view.Menu;
import androidx.fragment.app.Fragment;

/* renamed from: fzv reason: default package */
public final class fzv {
    public static fzn a(Context context, Menu menu, sso sso) {
        return new fzi(context, menu, new $$Lambda$fzv$C2mW09ti8S7w2OmX_t2gnQXdawg(sso));
    }

    public static void a(Context context, fzq fzq, Menu menu) {
        menu.clear();
        fzq.a(a(context, menu, fzq.ae_()));
    }

    public static <T extends Fragment & fzq> void a(T t, Menu menu) {
        a((Fragment) t, (fzq) t, menu);
    }

    public static void a(Fragment fragment, fzq fzq, Menu menu) {
        if (fragment.u()) {
            a((Context) fbp.a(fragment.p()), fzq, menu);
        }
    }
}
