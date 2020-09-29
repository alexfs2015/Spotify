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

/* renamed from: pnn reason: default package */
public final class pnn {
    /* access modifiers changed from: private */
    public static /* synthetic */ HubsJsonViewModel a(ObjectMapper objectMapper, String str) {
        try {
            return (HubsJsonViewModel) objectMapper.readValue(str, HubsJsonViewModel.class);
        } catch (IOException e) {
            throw Exceptions.a(e);
        }
    }

    public static ObservableTransformer<pnj, pnk> a(Single<String> single, ObjectMapper objectMapper, Scheduler scheduler, szp szp, pny pny) {
        return kok.a().a(f.class, (ObservableTransformer<G, E>) new $$Lambda$pnn$vbNdxse7iirm3tWMwvn3x3dYw<G,E>(scheduler)).a(b.class, (ObservableTransformer<G, E>) $$Lambda$pnn$feHI5FdnT07ZknYozqZiq0mh1l8.INSTANCE).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$pnn$TXH6B5tSIOq2bdlOofD8uNBrMU<G,E>(single, objectMapper)).a(d.class, (Action) new $$Lambda$pnn$0nfTEcsG9OlP4lxLXr9vG9KfD1Q(szp)).a(e.class, (Action) $$Lambda$pnn$zexS1IYEaNtVyo2nXtdOfLHRlIE.INSTANCE).a(c.class, (Consumer<G>) new $$Lambda$pnn$cuOGWnXCHfqQT4YBMHLtE4RxBs8<G>(pny)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pnk a(HubsJsonViewModel hubsJsonViewModel) {
        return new b(hubsJsonViewModel, 1234);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pnk a(Throwable th) {
        return new a(ErrorReason.SERVER_FAILURE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pnk a(b bVar) {
        return new c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(pny pny, c cVar) {
        pnm pnm = cVar.a;
        if (pnm instanceof b) {
            jlr jlr = pny.a;
            be beVar = new be(null, uqo.aG.a(), ViewUris.aQ.toString(), null, -1, null, ImpressionType.PAGE.toString(), null, (double) pny.b.a());
            jlr.a(beVar);
            return;
        }
        if (pnm instanceof a) {
            String name = ((a) pnm).a.name();
            jlr jlr2 = pny.a;
            be beVar2 = new be(null, uqo.aG.a(), ViewUris.aQ.toString(), null, -1, null, ImpressionType.ERROR.toString(), name.toLowerCase(Locale.US), (double) pny.b.a());
            jlr2.a(beVar2);
        }
    }
}
