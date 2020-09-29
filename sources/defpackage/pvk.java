package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pvk reason: default package */
public final class pvk {
    private pvk() {
    }

    public static jol a(String str, boolean z, boolean z2, String str2, fpt fpt, shj shj, boolean z3, String str3, boolean z4, boolean z5) {
        jol jol;
        b bVar = new b(str, z, z4, z2, z3, str3);
        if (z5) {
            jol = new pzt();
        } else {
            jol = new pvj();
        }
        fpt fpt2 = fpt;
        shj shj2 = shj;
        jol jol2 = jol;
        String str4 = str2;
        a(jol2, bVar, str2, shj, fpt);
        return jol2;
    }

    private static void a(jol jol, b bVar, String str, shj shj, fpt fpt) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(pvk.class.getClassLoader());
        bundle.putParcelable("search_params", bVar);
        bundle.putString("username", str);
        Fragment ae = ((jol) fay.a(jol)).ae();
        ae.g(bundle);
        a.a(ae, rju.w);
        fpu.a(ae, (fpt) fay.a(fpt));
        shi.a(ae, shj);
    }

    public static jol a(jst jst, boolean z, boolean z2, boolean z3, String str, String str2, fpt fpt, shj shj, boolean z4, boolean z5) {
        jst jst2 = jst;
        if ((jst2.b == LinkType.SEARCH_ROOT && jst.a() <= 2) || jst2.b == LinkType.SEARCH_QUERY) {
            return a(jst.a(1, ":"), false, z2, str2, fpt, shj, z3, str, z4, z5);
        }
        if (jst2.b != LinkType.SEARCH_ROOT || jst.a() != 3) {
            return spm.b;
        }
        a aVar = new a((String) fay.a(jst.h()), z4, z2, z3, str);
        pvi pvi = new pvi();
        Bundle bundle = new Bundle();
        bundle.setClassLoader(pvk.class.getClassLoader());
        bundle.putParcelable("search_params", aVar);
        bundle.putString("username", str2);
        Fragment ae = ((jol) fay.a(pvi)).ae();
        ae.g(bundle);
        a.a(ae, rju.x);
        fpu.a(ae, (fpt) fay.a(fpt));
        return pvi;
    }
}
