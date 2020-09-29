package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE implements Consumer {
    public static final /* synthetic */ $$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE INSTANCE = new $$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE();

    private /* synthetic */ $$Lambda$mig$lYcPesPQrBGxZRAK5i_ux4aWSwE() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to subscribe to ArtistDataLoader for list of tracks", new Object[0]);
    }
}
