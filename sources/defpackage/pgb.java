package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.features.premiumdestination.domain.ErrorReason;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.Locale;

/* renamed from: pgb reason: default package */
public final class pgb {
    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public static ObservableTransformer<pfx, pfy> a(Single<String> single, ObjectMapper objectMapper, Scheduler scheduler, spi spi, phh phh) {
        return klb.a().a(f.class, (ObservableTransformer<G, E>) new $$Lambda$pgb$KeREBXKb1FQb1x4YxMUlLjpD7Qo<G,E>(scheduler)).a(b.class, (ObservableTransformer<G, E>) $$Lambda$pgb$MOiWifbOiYr2MmWKUht4Se_HDk.INSTANCE).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$pgb$P5mWC41RT5BPeEi9YPJ8cMYzph8<G,E>(single, objectMapper)).a(d.class, (Action) new $$Lambda$pgb$S7Y3wUwr2BTxd6KWUhg9o8_REOA(spi)).a(e.class, (Action) $$Lambda$pgb$9Ed8bpaMm3h9RAdYA6HfGZfpej8.INSTANCE).a(c.class, (Consumer<G>) new $$Lambda$pgb$pGctm7UQ4FWGzshtaNi9_UYdw<G>(phh)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ HubsJsonViewModel a(ObjectMapper objectMapper, String str) {
        try {
            return (HubsJsonViewModel) objectMapper.readValue(str, HubsJsonViewModel.class);
        } catch (IOException e) {
            throw Exceptions.a(e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pfy a(Throwable th) {
        return new a(ErrorReason.SERVER_FAILURE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(phh phh, c cVar) {
        pga pga = cVar.a;
        if (pga instanceof b) {
            jjf jjf = phh.a;
            bf bfVar = new bf(null, udt.aG.a(), ViewUris.aR.toString(), null, -1, null, ImpressionType.PAGE.toString(), null, (double) phh.b.a());
            jjf.a(bfVar);
            return;
        }
        if (pga instanceof a) {
            String name = ((a) pga).a.name();
            jjf jjf2 = phh.a;
            bf bfVar2 = new bf(null, udt.aG.a(), ViewUris.aR.toString(), null, -1, null, ImpressionType.ERROR.toString(), name.toLowerCase(Locale.US), (double) phh.b.a());
            jjf2.a(bfVar2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pfy a(HubsJsonViewModel hubsJsonViewModel) {
        return new b(hubsJsonViewModel, 1234);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pfy a(b bVar) {
        return new c();
    }
}
