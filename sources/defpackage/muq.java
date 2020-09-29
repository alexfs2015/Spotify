package defpackage;

import android.view.View;

/* renamed from: muq reason: default package */
public final class muq {
    public static void a(View view, hcm hcm, gwm gwm) {
        String str = "click";
        if (hcm.events().containsKey(str)) {
            a(str, hcm, gwm, view);
        }
    }

    private static void a(String str, hcm hcm, gwm gwm, View view) {
        hdl.a(gwm.c).a(str).a(hcm).a(view).a();
    }

    public static void b(View view, hcm hcm, gwm gwm) {
        String str = "entityClick";
        if (hcm.events().containsKey(str)) {
            a(str, hcm, gwm, view);
        }
    }
}
