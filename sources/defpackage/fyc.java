package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

@Deprecated
/* renamed from: fyc reason: default package */
public final class fyc {
    static <T extends fxg> void a(Activity activity, T t) {
        t.d().setId(R.id.legacy_header_recycler_layout);
        t.a(uuu.b(activity, 16842836));
        t.a(fsi.a((Context) activity));
        if (activity instanceof fxv) {
            t.a(fsi.a((Context) activity));
        } else {
            t.a(fxn.a);
        }
    }

    static ka a(Fragment fragment) {
        if (fragment.u()) {
            return fragment.p();
        }
        throw new IllegalStateException("PrettyLists can only be created for attached fragments");
    }

    public static fxe a(Fragment fragment, View view) {
        ka a = a(fragment);
        fxf fxf = new fxf(a, view, gab.b(a));
        a((Activity) a, (T) fxf);
        return fxf;
    }

    public static fxe b(Fragment fragment, View view) {
        ka a = a(fragment);
        fxb fxb = new fxb(a, view);
        a((Activity) a, (T) fxb);
        return fxb;
    }
}
