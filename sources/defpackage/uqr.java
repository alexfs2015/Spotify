package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;

/* renamed from: uqr reason: default package */
public interface uqr extends a, udv {

    /* renamed from: uqr$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(uqr _this, boolean z) {
            if (z) {
                _this.aR_().c(true);
            }
        }

        public static uqp $default$aR_(uqr _this) {
            Fragment fragment = _this.ae().w;
            if (fragment instanceof uqq) {
                return ((uqq) fragment).a(_this);
            }
            throw new AssertionError("Parent fragment is null or not a YourLibraryDelegateProvider, are you sure your page has been added to Your Library");
        }

        public static ImmutableList $default$f(uqr _this) {
            return ImmutableList.d();
        }
    }

    void a(boolean z);

    uqp aR_();

    Fragment ae();

    void am();

    ImmutableList<View> f();
}
