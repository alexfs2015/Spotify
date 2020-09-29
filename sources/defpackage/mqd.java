package defpackage;

import android.view.View;

/* renamed from: mqd reason: default package */
public final class mqd {
    public static void a(View view, gzt gzt, gum gum) {
        String str = "click";
        if (gzt.events().containsKey(str)) {
            a(str, gzt, gum, view);
        }
    }

    public static void b(View view, gzt gzt, gum gum) {
        String str = "entityClick";
        if (gzt.events().containsKey(str)) {
            a(str, gzt, gum, view);
        }
    }

    private static void a(String str, gzt gzt, gum gum, View view) {
        has.a(gum.c).a(str).a(gzt).a(view).a();
    }
}
