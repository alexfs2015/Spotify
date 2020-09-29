package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio implements Consumer {
    private final /* synthetic */ hmq f$0;
    private final /* synthetic */ AdSlot f$1;

    public /* synthetic */ $$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio(hmq hmq, AdSlot adSlot) {
        this.f$0 = hmq;
        this.f$1 = adSlot;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Response) obj);
    }
}
