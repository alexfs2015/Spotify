package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ivn$rhH2ywxQGBPAHReC1ht3nVwvrEs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ivn$rhH2ywxQGBPAHReC1ht3nVwvrEs implements Consumer {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$ivn$rhH2ywxQGBPAHReC1ht3nVwvrEs(Context context) {
        this.f$0 = context;
    }

    public final void accept(Object obj) {
        CC.a(this.f$0, (ConcertResult) obj);
    }
}
