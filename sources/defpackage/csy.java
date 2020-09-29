package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;

@cey
/* renamed from: csy reason: default package */
public final class csy {
    public static csr a(Context context, cue cue, String str, boolean z, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        dsp.a(context);
        if (((Boolean) dpn.f().a(dsp.ax)).booleanValue()) {
            return cuk.a(context, cue, str, z2, z, dhx, coy, dtc, bje, bki, dnh);
        }
        try {
            cta cta = new cta(context, cue, str, z, z2, dhx, coy, dtc, bje, bki, dnh);
            return (csr) cod.a(cta);
        } catch (Throwable th) {
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
