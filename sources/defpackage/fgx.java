package defpackage;

import android.os.Bundle;
import com.google.firebase.iid.zzal;

/* renamed from: fgx reason: default package */
public final class fgx extends fgy<Void> {
    public fgx(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            a(new zzal(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return true;
    }
}
