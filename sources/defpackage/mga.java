package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: mga reason: default package */
public final class mga implements Function<List<GaiaDevice>, Optional<GaiaDevice>> {
    public final /* synthetic */ Object apply(Object obj) {
        GaiaDevice gaiaDevice = null;
        GaiaDevice gaiaDevice2 = null;
        GaiaDevice gaiaDevice3 = null;
        for (GaiaDevice gaiaDevice4 : (List) obj) {
            if (gaiaDevice4.isBeingActivated()) {
                gaiaDevice = gaiaDevice4;
            }
            if (gaiaDevice4.isActive()) {
                gaiaDevice2 = gaiaDevice4;
            }
            if (gaiaDevice4.isSelf()) {
                gaiaDevice3 = gaiaDevice4;
            }
        }
        if (gaiaDevice != null) {
            return Optional.b(gaiaDevice);
        }
        if (gaiaDevice2 != null) {
            return Optional.b(gaiaDevice2);
        }
        if (gaiaDevice3 != null) {
            return Optional.b(gaiaDevice3);
        }
        return Optional.e();
    }
}
