package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.R;

/* renamed from: reo reason: default package */
public final class reo implements kjd<reh, ref> {
    public final gur a;
    /* access modifiers changed from: private */
    public final gup b;
    /* access modifiers changed from: private */
    public final rek c;

    public reo(gup gup, gur gur, rek rek) {
        this.b = gup;
        this.a = gur;
        this.c = rek;
    }

    public final kje<reh> connect(kkn<ref> kkn) {
        return new kje<reh>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                reh reh = (reh) obj;
                if (!reh.a() && !reh.b().b()) {
                    gup b = reo.this.b;
                    rek a2 = reo.this.c;
                    b.a(gyi.b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(haf.builder().a(a2.a.a.getString(R.string.error_no_connection_title)).d(a2.a.a.getString(R.string.error_no_connection_body))).a()).a(), false);
                } else if (!reh.b().b()) {
                    gup b2 = reo.this.b;
                    reo.this.c;
                    b2.a(gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
                } else {
                    reo.this.b.a(reo.this.c.a((rdv) reh.b().c()), false);
                }
            }
        };
    }
}
