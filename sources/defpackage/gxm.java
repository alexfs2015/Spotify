package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: gxm reason: default package */
final class gxm {
    static void a(fqz fqz, gzt gzt, gum gum) {
        Optional a = a.a.a((String) gzt.custom().get("accessoryRightIcon"));
        if (a.b()) {
            View a2 = jwz.a(fqz.getView().getContext(), (SpotifyIconV2) a.c());
            String str = "rightAccessoryClick";
            if (gzt.events().containsKey(str)) {
                has.a(gum.c).a(str).a(gzt).a(a2).a();
            }
            fqz.a(a2);
            return;
        }
        fqz.a(null);
    }

    static void a(frd frd, gzt gzt) {
        String title = gzt.text().title();
        Assertion.a(!fax.a(title), "title is missing");
        frd.a(title);
    }

    static void a(frh frh, gzt gzt) {
        String title = gzt.text().title();
        Assertion.a(!fax.a(title), "title is missing");
        frh.a(title);
        String subtitle = gzt.text().subtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            if (faw.a("metadata", gzt.custom().string("subtitleStyle", ""))) {
                frh.c(subtitle);
            } else {
                frh.b(subtitle);
            }
        } else {
            frh.b(null);
        }
    }
}
