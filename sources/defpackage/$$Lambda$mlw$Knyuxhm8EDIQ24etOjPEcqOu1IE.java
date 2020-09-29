package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mlw$Knyuxhm8EDIQ24etOjPEcqOu1IE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mlw$Knyuxhm8EDIQ24etOjPEcqOu1IE implements Consumer {
    private final /* synthetic */ gtz f$0;

    public /* synthetic */ $$Lambda$mlw$Knyuxhm8EDIQ24etOjPEcqOu1IE(gtz gtz) {
        this.f$0 = gtz;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Couldn't transfer playback to %s", this.f$0.getName());
    }
}
