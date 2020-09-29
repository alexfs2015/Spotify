package defpackage;

import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$nmf$gSJ6V7GDC_IyoE23ipwvzU9H2dA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nmf$gSJ6V7GDC_IyoE23ipwvzU9H2dA implements Consumer {
    private final /* synthetic */ nmf f$0;
    private final /* synthetic */ Style f$1;

    public /* synthetic */ $$Lambda$nmf$gSJ6V7GDC_IyoE23ipwvzU9H2dA(nmf nmf, Style style) {
        this.f$0 = nmf;
        this.f$1 = style;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, (Boolean) obj);
    }
}
