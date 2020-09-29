package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: fpu reason: default package */
public final class fpu {
    public static void a(Fragment fragment, fpt fpt) {
        fay.a(fpt);
        Bundle bundle = fragment.i;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.g(bundle);
        }
        bundle.putParcelable("FlagsArgumentHelper.Flags", fpt);
    }

    public static void a(Intent intent, fpt fpt) {
        fay.a(fpt);
        intent.putExtra("FlagsArgumentHelper.Flags", fpt);
    }

    public static fpt a(Fragment fragment) {
        Assertion.a((Object) fragment);
        Bundle bundle = fragment.i;
        Assertion.a((Object) bundle, "The Fragment must have an argument Bundle");
        fpt a = a(bundle);
        Assertion.a((Object) a, "The Fragment must have a Flags argument");
        return (fpt) fay.a(a);
    }

    public static fpt a(Activity activity) {
        Assertion.a((Object) activity);
        Intent intent = activity.getIntent();
        Assertion.a((Object) intent, "The activity must have an Intent");
        return a(intent);
    }

    public static fpt a(Intent intent) {
        Assertion.a((Object) intent, "The Intent must not be null");
        fpt fpt = (fpt) intent.getParcelableExtra("FlagsArgumentHelper.Flags");
        StringBuilder sb = new StringBuilder("The Intent must have a Flags argument. Actual intent: ");
        sb.append(intent);
        Assertion.a((Object) fpt, sb.toString());
        return fpt;
    }

    public static fpt a(Bundle bundle) {
        Assertion.a((Object) bundle);
        String str = "FlagsArgumentHelper.Flags";
        Assertion.a("The Bundle must have a Flags argument", bundle.containsKey(str));
        return (fpt) bundle.getParcelable(str);
    }
}
