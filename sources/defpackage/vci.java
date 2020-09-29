package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: vci reason: default package */
public final class vci {
    public static Bundle a(Fragment fragment) {
        Bundle bundle = fragment.i;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        fragment.g(bundle2);
        return bundle2;
    }
}
