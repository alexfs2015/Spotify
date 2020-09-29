package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: fqo reason: default package */
public final class fqo {
    public static fqn a(Activity activity) {
        Assertion.a((Object) activity);
        Intent intent = activity.getIntent();
        Assertion.a((Object) intent, "The activity must have an Intent");
        return a(intent);
    }

    public static fqn a(Intent intent) {
        Assertion.a((Object) intent, "The Intent must not be null");
        fqn fqn = (fqn) intent.getParcelableExtra("FlagsArgumentHelper.Flags");
        StringBuilder sb = new StringBuilder("The Intent must have a Flags argument. Actual intent: ");
        sb.append(intent);
        Assertion.a((Object) fqn, sb.toString());
        return fqn;
    }

    public static fqn a(Bundle bundle) {
        Assertion.a((Object) bundle);
        String str = "FlagsArgumentHelper.Flags";
        Assertion.a("The Bundle must have a Flags argument", bundle.containsKey(str));
        return (fqn) bundle.getParcelable(str);
    }

    public static fqn a(Fragment fragment) {
        Assertion.a((Object) fragment);
        Bundle bundle = fragment.i;
        Assertion.a((Object) bundle, "The Fragment must have an argument Bundle");
        fqn a = a(bundle);
        Assertion.a((Object) a, "The Fragment must have a Flags argument");
        return (fqn) fbp.a(a);
    }

    public static void a(Intent intent, fqn fqn) {
        fbp.a(fqn);
        intent.putExtra("FlagsArgumentHelper.Flags", fqn);
    }

    public static void a(Fragment fragment, fqn fqn) {
        fbp.a(fqn);
        Bundle bundle = fragment.i;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.g(bundle);
        }
        bundle.putParcelable("FlagsArgumentHelper.Flags", fqn);
    }
}
