package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.io.IOException;

/* renamed from: phx reason: default package */
public final class phx {
    private final ObjectMapper a;

    public phx(rwj rwj) {
        this.a = rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final phw a(xgo<xam> xgo) {
        try {
            xam xam = (xam) xgo.b();
            if (xgo.a() && xam != null) {
                return phw.a((hcs) this.a.readValue(xam.e(), HubsJsonViewModel.class));
            }
            xam xam2 = xgo.b;
            return (xgo.a() || xam2 == null) ? phw.a("Invalid body") : phw.a((hcs) this.a.readValue(xam2.e(), HubsJsonViewModel.class));
        } catch (IOException e) {
            return phw.a(e.getMessage());
        }
    }
}
