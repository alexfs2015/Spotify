package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$krn$poNiPuVeXbfE4hfhFhiB5DaNZ-U reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krn$poNiPuVeXbfE4hfhFhiB5DaNZU implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$krn$poNiPuVeXbfE4hfhFhiB5DaNZU(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Error in reporting event: %s, error message: %s", this.f$0, ((Throwable) obj).getMessage());
    }
}
