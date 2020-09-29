package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;

/* renamed from: mkm reason: default package */
public final class mkm implements Function<GaiaDevice, mkn> {
    public final /* synthetic */ Object apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        mkn mkn = new mkn(gaiaDevice.getState(), gaiaDevice.isActive(), gaiaDevice.isBeingActivated(), gaiaDevice.getIdentifier(), gaiaDevice.getName());
        return mkn;
    }
}
