package defpackage;

import android.view.View;

/* renamed from: gwj reason: default package */
public final class gwj {
    public static void a(gwm gwm, View view, hcm hcm) {
        view.setOnClickListener(a(hcm) ? new $$Lambda$gwj$sl7PRzWWdGsOytx6n9C4Az7lw(hcm, gwm) : null);
        boolean a = a(hcm);
        view.setClickable(a);
        view.setFocusable(a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hcm hcm, gwm gwm, View view) {
        String str = "click";
        if (hcm.events().containsKey(str)) {
            gwm.c.a(gwy.a(str, hcm));
            return;
        }
        hcr target = hcm.target();
        if (target != null) {
            gwm.b.onClick(target, hcm);
        }
    }

    private static boolean a(hcm hcm) {
        return hcm.target() != null || hcm.events().containsKey("click");
    }
}
