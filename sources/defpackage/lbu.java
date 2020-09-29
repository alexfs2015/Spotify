package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: lbu reason: default package */
public final class lbu implements wig<Bundle> {
    private final wzi<Fragment> a;

    private lbu(wzi<Fragment> wzi) {
        this.a = wzi;
    }

    public static lbu a(wzi<Fragment> wzi) {
        return new lbu(wzi);
    }

    public final /* synthetic */ Object get() {
        Bundle bundle = ((Fragment) this.a.get()).i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return (Bundle) wil.a(bundle, "Cannot return null from a non-@Nullable @Provides method");
    }
}
