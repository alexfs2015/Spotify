package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iep$7FW-K15UuzxO0_S3jokDHg7cOPg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iep$7FWK15UuzxO0_S3jokDHg7cOPg implements Consumer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$iep$7FWK15UuzxO0_S3jokDHg7cOPg(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void accept(Object obj) {
        Logger.b("Failed to resolve %s for %s slot", this.f$0, this.f$1);
    }
}
