package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ids$yqzSOI_rL9k7AH1byErXYeZFDRw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ids$yqzSOI_rL9k7AH1byErXYeZFDRw implements Consumer {
    private final /* synthetic */ Format f$0;

    public /* synthetic */ $$Lambda$ids$yqzSOI_rL9k7AH1byErXYeZFDRw(Format format) {
        this.f$0 = format;
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", this.f$0.getCosmosEndpoint());
    }
}
