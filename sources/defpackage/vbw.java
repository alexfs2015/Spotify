package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;

/* renamed from: vbw reason: default package */
public interface vbw extends a, uqq {

    /* renamed from: vbw$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(vbw vbw, boolean z) {
            if (z) {
                vbw.f().c(true);
            }
        }

        public static vbu $default$f(vbw vbw) {
            Fragment fragment = vbw.ae().w;
            if (fragment instanceof vbv) {
                return ((vbv) fragment).a(vbw);
            }
            kf p = vbw.ae().p();
            if (p instanceof vbv) {
                return ((vbv) p).a(vbw);
            }
            throw new AssertionError("Parent fragment/activity is null or not a YourLibraryDelegateProvider. Are you sure that your page has been added to Your Library?");
        }

        public static ImmutableList $default$g(vbw vbw) {
            return ImmutableList.d();
        }
    }

    void a(boolean z);

    Fragment ae();

    void am();

    vbu f();

    ImmutableList<View> g();
}
