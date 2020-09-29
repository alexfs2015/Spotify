package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mlw$17-v66PsGnWvLkw7aIo2hjueYxI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mlw$17v66PsGnWvLkw7aIo2hjueYxI implements Consumer {
    private final /* synthetic */ gtz f$0;

    public /* synthetic */ $$Lambda$mlw$17v66PsGnWvLkw7aIo2hjueYxI(gtz gtz) {
        this.f$0 = gtz;
    }

    public final void accept(Object obj) {
        ((ConnectManager) obj).c(this.f$0.getIdentifier());
    }
}
