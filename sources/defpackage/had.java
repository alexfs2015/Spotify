package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: had reason: default package */
final class had {
    static void a(frt frt, hcm hcm, gwm gwm) {
        Optional a = a.a.a((String) hcm.custom().get("accessoryRightIcon"));
        if (a.b()) {
            View a2 = jyz.a(frt.getView().getContext(), (SpotifyIconV2) a.c());
            String str = "rightAccessoryClick";
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(a2).a();
            }
            frt.a(a2);
            return;
        }
        frt.a(null);
    }

    static void a(frx frx, hcm hcm) {
        String title = hcm.text().title();
        Assertion.a(!fbo.a(title), "title is missing");
        frx.a(title);
    }

    static void a(fsb fsb, hcm hcm) {
        String title = hcm.text().title();
        Assertion.a(!fbo.a(title), "title is missing");
        fsb.a(title);
        String subtitle = hcm.text().subtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            if (fbn.a("metadata", hcm.custom().string("subtitleStyle", ""))) {
                fsb.c(subtitle);
            } else {
                fsb.b(subtitle);
            }
        } else {
            fsb.b(null);
        }
    }
}
