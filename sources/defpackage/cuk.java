package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;

@cey
/* renamed from: cuk reason: default package */
public final class cuk {
    public static csr a(Context context, cue cue, String str, boolean z, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        try {
            cul cul = new cul(context, cue, str, z, z2, dhx, coy, dtc, bje, bki, dnh);
            return (csr) cod.a(cul);
        } catch (Throwable th) {
            bjl.i().a(th, "AdWebViewFactory.newAdWebView2");
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
