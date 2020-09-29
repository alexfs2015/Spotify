package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import java.io.IOException;

/* renamed from: ggt reason: default package */
public final class ggt {
    private final ObjectMapper a;

    public ggt(rnf rnf) {
        this.a = rnf.b();
    }

    public final GaiaDevice a(String str) {
        try {
            return (GaiaDevice) this.a.readValue(str, GaiaDevice.class);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(GaiaDevice gaiaDevice) {
        try {
            return this.a.writeValueAsString(gaiaDevice);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
