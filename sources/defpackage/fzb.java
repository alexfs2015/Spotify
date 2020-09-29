package defpackage;

import android.content.Context;
import android.view.Menu;
import androidx.fragment.app.Fragment;

/* renamed from: fzb reason: default package */
public final class fzb {
    public static fyt a(Context context, Menu menu, sih sih) {
        return new fyo(context, menu, new $$Lambda$fzb$5OocYMEZzPca6l77ng9R6oVIJfI(sih));
    }

    public static <T extends Fragment & fyw> void a(T t, Menu menu) {
        a((Fragment) t, (fyw) t, menu);
    }

    public static void a(Fragment fragment, fyw fyw, Menu menu) {
        if (fragment.u()) {
            a((Context) fay.a(fragment.p()), fyw, menu);
        }
    }

    public static void a(Context context, fyw fyw, Menu menu) {
        menu.clear();
        fyw.a(a(context, menu, fyw.ae_()));
    }
}
