package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;

@cfp
/* renamed from: cvb reason: default package */
public final class cvb {
    public static cti a(Context context, cuv cuv, String str, boolean z, boolean z2, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
        try {
            cvc cvc = new cvc(context, cuv, str, z, z2, dio, cpp, dtt, bjv, bkz, dny);
            return (cti) cou.a(cvc);
        } catch (Throwable th) {
            bkc.i().a(th, "AdWebViewFactory.newAdWebView2");
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
