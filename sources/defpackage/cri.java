package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

@cey
/* renamed from: cri reason: default package */
public final class cri extends crb {
    public final cra a(Context context, crq crq, boolean z, dtc dtc, crp crp) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        boolean c = crq.v().c();
        crr crr = new crr(context, crq.k(), crq.g(), dtc, crq.c());
        return new cqo(context, z, c, crr);
    }
}
