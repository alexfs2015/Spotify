package defpackage;

import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventSection;
import com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel;
import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: ivv reason: default package */
public final class ivv {
    final ivx a;
    final ivt b;
    final szp c;
    EventsHubModel d = EventsHubModel.EMPTY;
    boolean e;
    private final iug f;
    private final Consumer<ConcertResult> g;
    private final ivz h;
    private Disposable i = Disposables.b();

    public ivv(ivx ivx, iug iug, ivt ivt, ivz ivz, Consumer<ConcertResult> consumer, szp szp) {
        Assertion.a((Object) ivx);
        this.a = ivx;
        this.f = iug;
        this.b = ivt;
        this.h = ivz;
        this.g = consumer;
        this.c = szp;
    }

    private static List<EventResult> a(List<EventResult> list, SourceType sourceType) {
        return Lists.a(fdd.b(list, new $$Lambda$ivv$jzBSF2YbaWjlCQOCjb_YUu6ab_U(sourceType)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xgo xgo) {
        if (!xgo.a() || xgo.b() == null) {
            this.a.al();
        } else {
            EventsHubModel eventsHubModel = (EventsHubModel) xgo.b();
            Assertion.a((Object) eventsHubModel);
            this.d = eventsHubModel;
            int numberOfConcerts = eventsHubModel.getNumberOfConcerts();
            ivt ivt = this.b;
            int i2 = numberOfConcerts;
            be beVar = r4;
            be beVar2 = new be(null, "concerts-browse", ivt.a, null, -1, null, "page", null, (double) jtp.a.a());
            ivt.a(beVar);
            if (eventsHubModel.getUserLocation() == null) {
                this.a.ak();
            } else if (i2 <= 0) {
                this.a.aj();
            } else {
                this.a.c(eventsHubModel.getUserLocation());
                this.a.b(eventsHubModel.getHeaderImageUri());
                this.a.a(a(eventsHubModel.getEvents(), SourceType.POPULAR), EventSection.POPULAR);
                this.a.a(EventSection.POPULAR, eventsHubModel.getUserLocation());
                this.a.a(a(eventsHubModel.getEvents(), SourceType.RECOMMENDATIONS), EventSection.RECOMMENDATIONS);
                this.a.a(EventSection.RECOMMENDATIONS, new Object[0]);
                this.a.a(a(eventsHubModel.getEvents(), SourceType.ALL), EventSection.ALL);
                this.a.a(EventSection.ALL, eventsHubModel.getUserLocation());
                this.a.ai();
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(SourceType sourceType, EventResult eventResult) {
        return eventResult != null && eventResult.getSourceType() == sourceType;
    }

    public final void a() {
        b();
        this.e = true;
        this.a.c();
        this.i = this.f.a(this.h.a().mGeonameId).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$ivv$BRiE57WRrmzDEHtjH6VorrxpV64<Object>(this));
    }

    public final void a(ConcertResult concertResult, long j, SourceType sourceType) {
        Boolean discovery = concertResult.getDiscovery();
        if (discovery == null || !discovery.booleanValue()) {
            this.b.a(Long.valueOf(j), sourceType, concertResult.getConcert().getId());
        } else {
            this.b.b(Long.valueOf(j), sourceType, concertResult.getConcert().getId());
        }
        try {
            this.g.accept(concertResult);
        } catch (Exception e2) {
            Logger.b("Failed to perform click action for concert result: %s", e2.getMessage());
        }
    }

    public final void b() {
        if (!this.i.b()) {
            this.i.bd_();
        }
    }
}
