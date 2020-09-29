package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mhi$jyq1GMnR4ngEi6W481rLMlrrles reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mhi$jyq1GMnR4ngEi6W481rLMlrrles implements Consumer {
    private final /* synthetic */ grz f$0;

    public /* synthetic */ $$Lambda$mhi$jyq1GMnR4ngEi6W481rLMlrrles(grz grz) {
        this.f$0 = grz;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Couldn't transfer playback to %s", this.f$0.getName());
    }
}
