package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: pri reason: default package */
public final class pri {
    public static String a(Fragment fragment) {
        return (String) fbp.a(b(fragment).getString("uri"), (Object) "uri argument missing");
    }

    static Bundle b(Fragment fragment) {
        Bundle bundle = fragment.i;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        fragment.g(bundle2);
        return bundle2;
    }
}
