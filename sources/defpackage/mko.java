package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: mko reason: default package */
public final class mko implements Function<List<GaiaDevice>, Optional<GaiaDevice>> {
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
        return gaiaDevice != null ? Optional.b(gaiaDevice) : gaiaDevice2 != null ? Optional.b(gaiaDevice2) : gaiaDevice3 != null ? Optional.b(gaiaDevice3) : Optional.e();
    }
}
