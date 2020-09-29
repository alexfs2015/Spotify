package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

@Deprecated
/* renamed from: fyw reason: default package */
public final class fyw {
    public static fxy a(Fragment fragment, View view) {
        kf a = a(fragment);
        fxz fxz = new fxz(a, view, gav.b(a));
        a((Activity) a, (T) fxz);
        return fxz;
    }

    static kf a(Fragment fragment) {
        if (fragment.u()) {
            return fragment.p();
        }
        throw new IllegalStateException("PrettyLists can only be created for attached fragments");
    }

    static <T extends fya> void a(Activity activity, T t) {
        t.d().setId(R.id.legacy_header_recycler_layout);
        t.a(vgl.b(activity, 16842836));
        t.a(ftc.a((Context) activity));
        if (activity instanceof fyp) {
            t.a(ftc.a((Context) activity));
        } else {
            t.a(fyh.a);
        }
    }

    public static fxy b(Fragment fragment, View view) {
        kf a = a(fragment);
        fxv fxv = new fxv(a, view);
        a((Activity) a, (T) fxv);
        return fxv;
    }
}
