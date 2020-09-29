package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;

@cfp
/* renamed from: crz reason: default package */
public final class crz extends crs {
    public final crr a(Context context, csh csh, boolean z, dtt dtt, csg csg) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        boolean c = csh.v().c();
        csi csi = new csi(context, csh.k(), csh.g(), dtt, csh.c());
        return new crf(context, z, c, csi);
    }
}
