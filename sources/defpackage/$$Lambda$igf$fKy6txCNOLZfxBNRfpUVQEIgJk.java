package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$igf$fK-y6txCNOLZfxBNRfpUVQEIgJk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$igf$fKy6txCNOLZfxBNRfpUVQEIgJk implements Consumer {
    private final /* synthetic */ Format f$0;

    public /* synthetic */ $$Lambda$igf$fKy6txCNOLZfxBNRfpUVQEIgJk(Format format) {
        this.f$0 = format;
    }

    public final void accept(Object obj) {
        Logger.c("subscribed to %s", this.f$0.getCosmosEndpoint());
    }
}
