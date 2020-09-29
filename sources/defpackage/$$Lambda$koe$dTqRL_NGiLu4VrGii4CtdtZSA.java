package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$koe$dTqRL_NG-iLu4VrGii4CtdtZS-A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$koe$dTqRL_NGiLu4VrGii4CtdtZSA implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$koe$dTqRL_NGiLu4VrGii4CtdtZSA(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Error in reporting event: %s, error message: %s", this.f$0, ((Throwable) obj).getMessage());
    }
}
