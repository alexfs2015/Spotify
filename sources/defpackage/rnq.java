package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.R;

/* renamed from: rnq reason: default package */
public final class rnq implements kmm<rnj, rnh> {
    public final gwr a;
    /* access modifiers changed from: private */
    public final gwp b;
    /* access modifiers changed from: private */
    public final rnm c;

    public rnq(gwp gwp, gwr gwr, rnm rnm) {
        this.b = gwp;
        this.a = gwr;
        this.c = rnm;
    }

    public final kmn<rnj> connect(knw<rnh> knw) {
        return new kmn<rnj>() {
            public final /* synthetic */ void accept(Object obj) {
                rnj rnj = (rnj) obj;
                if (!rnj.a() && !rnj.b().b()) {
                    gwp b = rnq.this.b;
                    rnm a2 = rnq.this.c;
                    b.a(hbb.b().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) SpotifyIconV2.OFFLINE)).a(hcy.builder().a(a2.a.a.getString(R.string.error_no_connection_title)).d(a2.a.a.getString(R.string.error_no_connection_body))).a()).a(), false);
                } else if (!rnj.b().b()) {
                    gwp b2 = rnq.this.b;
                    rnq.this.c;
                    b2.a(hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
                } else {
                    rnq.this.b.a(rnq.this.c.a((rmx) rnj.b().c()), false);
                }
            }

            public final void dispose() {
            }
        };
    }
}
