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

/* renamed from: itl reason: default package */
public final class itl {
    final itn a;
    final itk b;
    EventsHubModel c = EventsHubModel.EMPTY;
    boolean d;
    private final isd e;
    private final Consumer<ConcertResult> f;
    private final itp g;
    private Disposable h = Disposables.b();

    public itl(itn itn, isd isd, itk itk, itp itp, Consumer<ConcertResult> consumer) {
        Assertion.a((Object) itn);
        this.a = itn;
        this.e = isd;
        this.b = itk;
        this.g = itp;
        this.f = consumer;
    }

    public final void a() {
        b();
        this.d = true;
        this.a.c();
        this.h = this.e.a(this.g.a().mGeonameId).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$itl$h0PLklgNNKdcpcmu9C77ZXm4FCU<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wsj wsj) {
        if (!wsj.a() || wsj.b() == null) {
            this.a.al();
        } else {
            EventsHubModel eventsHubModel = (EventsHubModel) wsj.b();
            Assertion.a((Object) eventsHubModel);
            this.c = eventsHubModel;
            int numberOfConcerts = eventsHubModel.getNumberOfConcerts();
            itk itk = this.b;
            int i = numberOfConcerts;
            bf bfVar = r4;
            bf bfVar2 = new bf(null, "concerts-browse", itk.a, null, -1, null, "page", null, (double) jrf.a.a());
            itk.a(bfVar);
            if (eventsHubModel.getUserLocation() == null) {
                this.a.ak();
            } else if (i <= 0) {
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

    public final void b() {
        if (!this.h.b()) {
            this.h.bf_();
        }
    }

    private static List<EventResult> a(List<EventResult> list, SourceType sourceType) {
        return Lists.a(fcl.b(list, new $$Lambda$itl$KROWPvKb3C_cbJCDuUuOjvoh3MA(sourceType)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(SourceType sourceType, EventResult eventResult) {
        return eventResult != null && eventResult.getSourceType() == sourceType;
    }

    public final void a(ConcertResult concertResult, long j, SourceType sourceType) {
        Boolean discovery = concertResult.getDiscovery();
        if (discovery == null || !discovery.booleanValue()) {
            this.b.a(Long.valueOf(j), sourceType, concertResult.getConcert().getId());
        } else {
            this.b.b(Long.valueOf(j), sourceType, concertResult.getConcert().getId());
        }
        try {
            this.f.accept(concertResult);
        } catch (Exception e2) {
            Logger.b("Failed to perform click action for concert result: %s", e2.getMessage());
        }
    }
}
