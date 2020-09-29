package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8 implements Consumer {
    public static final /* synthetic */ $$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8 INSTANCE = new $$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8();

    private /* synthetic */ $$Lambda$jbm$VmSCqjlr3gPajpAbFx3nokNo6m8() {
    }

    public final void accept(Object obj) {
        Logger.b("Something bad happened error: %s", (Throwable) obj);
    }
}
