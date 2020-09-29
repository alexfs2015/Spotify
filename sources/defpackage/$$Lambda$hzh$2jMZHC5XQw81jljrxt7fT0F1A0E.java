package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hzh$2jMZHC5XQw81jljrxt7fT0F1A0E reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hzh$2jMZHC5XQw81jljrxt7fT0F1A0E implements Consumer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$hzh$2jMZHC5XQw81jljrxt7fT0F1A0E(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void accept(Object obj) {
        Logger.b("Failed to report event %s for ad %s.", this.f$0, this.f$1);
    }
}
