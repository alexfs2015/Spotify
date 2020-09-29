package defpackage;

import android.os.Bundle;

/* renamed from: fgz reason: default package */
final class fgz extends fgy<Bundle> {
    fgz(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return false;
    }
}
