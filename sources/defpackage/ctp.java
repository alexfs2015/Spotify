package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;

@cfp
/* renamed from: ctp reason: default package */
public final class ctp {
    public static cti a(Context context, cuv cuv, String str, boolean z, boolean z2, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
        dtg.a(context);
        if (((Boolean) dqe.f().a(dtg.ax)).booleanValue()) {
            return cvb.a(context, cuv, str, z2, z, dio, cpp, dtt, bjv, bkz, dny);
        }
        try {
            ctr ctr = new ctr(context, cuv, str, z, z2, dio, cpp, dtt, bjv, bkz, dny);
            return (cti) cou.a(ctr);
        } catch (Throwable th) {
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
