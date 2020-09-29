package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qeg reason: default package */
public final class qeg {
    private qeg() {
    }

    public static jqx a(String str, boolean z, boolean z2, String str2, fqn fqn, srq srq, boolean z3, String str3, boolean z4, boolean z5) {
        b bVar = new b(str, z, z4, z2, z3, str3);
        fqn fqn2 = fqn;
        srq srq2 = srq;
        jqx qir = z5 ? new qir() : new qef();
        String str4 = str2;
        a(qir, bVar, str2, srq, fqn);
        return qir;
    }

    public static jqx a(jva jva, boolean z, boolean z2, boolean z3, String str, String str2, fqn fqn, srq srq, boolean z4, boolean z5) {
        jva jva2 = jva;
        if ((jva2.b == LinkType.SEARCH_ROOT && jva.a() <= 2) || jva2.b == LinkType.SEARCH_QUERY) {
            return a(jva.a(1, ":"), false, z2, str2, fqn, srq, z3, str, z4, z5);
        }
        if (jva2.b != LinkType.SEARCH_ROOT || jva.a() != 3) {
            return szt.b;
        }
        a aVar = new a((String) fbp.a(jva.h()), z4, z2, z3, str);
        qee qee = new qee();
        Bundle bundle = new Bundle();
        bundle.setClassLoader(qeg.class.getClassLoader());
        bundle.putParcelable("search_params", aVar);
        bundle.putString("username", str2);
        Fragment ae = ((jqx) fbp.a(qee)).ae();
        ae.g(bundle);
        a.a(ae, rta.x);
        fqo.a(ae, (fqn) fbp.a(fqn));
        return qee;
    }

    private static void a(jqx jqx, b bVar, String str, srq srq, fqn fqn) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(qeg.class.getClassLoader());
        bundle.putParcelable("search_params", bVar);
        bundle.putString("username", str);
        Fragment ae = ((jqx) fbp.a(jqx)).ae();
        ae.g(bundle);
        a.a(ae, rta.w);
        fqo.a(ae, (fqn) fbp.a(fqn));
        srp.a(ae, srq);
    }
}
