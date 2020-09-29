package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bgt reason: default package */
final class bgt implements bhc<cti> {
    bgt() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        WindowManager windowManager = (WindowManager) cti.getContext().getSystemService("window");
        bkc.e();
        View view = (View) cti;
        DisplayMetrics a = cmu.a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        cti.a("locationReady", (Map<String, ?>) hashMap);
        cpn.a(5);
    }
}
