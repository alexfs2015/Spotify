package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: mgb reason: default package */
public final class mgb implements Function<List<GaiaDevice>, Optional<GaiaDevice>> {
    public final /* synthetic */ Object apply(Object obj) {
        GaiaDevice gaiaDevice = null;
        for (GaiaDevice gaiaDevice2 : (List) obj) {
            if (gaiaDevice2.isBeingActivated()) {
                gaiaDevice = gaiaDevice2;
            }
        }
        if (gaiaDevice != null) {
            return Optional.b(gaiaDevice);
        }
        return Optional.e();
    }
}
