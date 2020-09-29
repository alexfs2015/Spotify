package defpackage;

import android.view.View;

/* renamed from: guj reason: default package */
public final class guj {
    private static boolean a(gzt gzt) {
        return gzt.target() != null || gzt.events().containsKey("click");
    }

    public static void a(gum gum, View view, gzt gzt) {
        view.setOnClickListener(a(gzt) ? new $$Lambda$guj$ZblwbwLPTIrvDnTHCv5fBW9eD9A(gzt, gum) : null);
        boolean a = a(gzt);
        view.setClickable(a);
        view.setFocusable(a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(gzt gzt, gum gum, View view) {
        String str = "click";
        if (gzt.events().containsKey(str)) {
            gum.c.a(guy.a(str, gzt));
            return;
        }
        gzy target = gzt.target();
        if (target != null) {
            gum.b.onClick(target, gzt);
        }
    }
}
