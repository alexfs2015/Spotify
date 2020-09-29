package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: kyl reason: default package */
public final class kyl implements vua<Bundle> {
    private final wlc<Fragment> a;

    private kyl(wlc<Fragment> wlc) {
        this.a = wlc;
    }

    public static kyl a(wlc<Fragment> wlc) {
        return new kyl(wlc);
    }

    public final /* synthetic */ Object get() {
        Bundle bundle = ((Fragment) this.a.get()).i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return (Bundle) vuf.a(bundle, "Cannot return null from a non-@Nullable @Provides method");
    }
}
