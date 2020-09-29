package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bgc reason: default package */
final class bgc implements bgl<csr> {
    bgc() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        WindowManager windowManager = (WindowManager) csr.getContext().getSystemService("window");
        bjl.e();
        View view = (View) csr;
        DisplayMetrics a = cmd.a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        csr.a("locationReady", (Map<String, ?>) hashMap);
        cow.a(5);
    }
}
