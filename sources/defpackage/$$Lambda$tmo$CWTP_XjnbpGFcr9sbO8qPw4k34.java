package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tmo$CWTP_XjnbpGFcr-9sbO8qPw4k34 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tmo$CWTP_XjnbpGFcr9sbO8qPw4k34 implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$tmo$CWTP_XjnbpGFcr9sbO8qPw4k34(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Failed to fetch episode context: %s", new Object[]{this.f$0}), new Object[0]);
    }
}
