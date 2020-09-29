package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iga$7Lt4yY2uxcKcRyFJ0SSCtccZvHQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iga$7Lt4yY2uxcKcRyFJ0SSCtccZvHQ implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$iga$7Lt4yY2uxcKcRyFJ0SSCtccZvHQ(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.b("Error in reporting event: %s, error message: %s", this.f$0, ((Throwable) obj).getMessage());
    }
}
