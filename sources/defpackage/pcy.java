package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.io.IOException;

/* renamed from: pcy reason: default package */
public final class pcy {
    private final ObjectMapper a;

    public pcy(rnd rnd) {
        this.a = rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final pcx a(wsj<wmg> wsj) {
        try {
            wmg wmg = (wmg) wsj.b();
            if (wsj.a() && wmg != null) {
                return pcx.a((gzz) this.a.readValue(wmg.e(), HubsJsonViewModel.class));
            }
            wmg wmg2 = wsj.b;
            if (wsj.a() || wmg2 == null) {
                return pcx.a("Invalid body");
            }
            return pcx.a((gzz) this.a.readValue(wmg2.e(), HubsJsonViewModel.class));
        } catch (IOException e) {
            return pcx.a(e.getMessage());
        }
    }
}
