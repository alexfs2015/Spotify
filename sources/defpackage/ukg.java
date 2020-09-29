package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: ukg reason: default package */
public final class ukg implements ukf {
    public final void a(gwm gwm, frt frt, hcm hcm) {
        Optional a = a.a.a(hcm.custom().string("secondary_icon"));
        String str = "rightAccessoryClick";
        if (!a.b() && hcm.events().containsKey(str)) {
            a = Optional.b(SpotifyIconV2.MORE_ANDROID);
        }
        if (a.b()) {
            View a2 = jyz.a(frt.getView().getContext(), (SpotifyIconV2) a.c());
            if (hcm.events().containsKey(str)) {
                hdl.a(gwm.c).a(str).a(hcm).a(a2).a();
            }
            frt.a(a2);
            return;
        }
        frt.a(null);
    }
}
