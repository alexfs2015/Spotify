package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mka$UsE5_muyxY8dFFULkITVmAsiXLE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mka$UsE5_muyxY8dFFULkITVmAsiXLE implements Consumer {
    public static final /* synthetic */ $$Lambda$mka$UsE5_muyxY8dFFULkITVmAsiXLE INSTANCE = new $$Lambda$mka$UsE5_muyxY8dFFULkITVmAsiXLE();

    private /* synthetic */ $$Lambda$mka$UsE5_muyxY8dFFULkITVmAsiXLE() {
    }

    public final void accept(Object obj) {
        Logger.e("CMC - Error when subscribing to gaia state. Error: %s", ((Throwable) obj).getMessage());
    }
}
