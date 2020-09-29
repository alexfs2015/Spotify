package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;

/* renamed from: mfy reason: default package */
public final class mfy implements Function<GaiaDevice, mfz> {
    public final /* synthetic */ Object apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        mfz mfz = new mfz(gaiaDevice.getState(), gaiaDevice.isActive(), gaiaDevice.isBeingActivated(), gaiaDevice.getIdentifier(), gaiaDevice.getName());
        return mfz;
    }
}
