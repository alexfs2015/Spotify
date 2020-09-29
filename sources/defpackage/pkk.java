package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import java.io.IOException;

/* renamed from: pkk reason: default package */
public final class pkk {
    private final ObjectMapper a;

    public pkk(rwj rwj) {
        this.a = rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final pkj a(xgo<xam> xgo) {
        try {
            xam xam = (xam) xgo.b();
            if (xgo.a() && xam != null) {
                return pkj.a((hcs) this.a.readValue(xam.e(), HubsJsonViewModel.class));
            }
            xam xam2 = xgo.b;
            return (xgo.a() || xam2 == null) ? pkj.a("Invalid body") : pkj.a((hcs) this.a.readValue(xam2.e(), HubsJsonViewModel.class));
        } catch (IOException e) {
            return pkj.a(e.getMessage());
        }
    }
}
