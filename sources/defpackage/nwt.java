package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.model.UserListeningHistoryWrapper;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Collection;

/* renamed from: nwt reason: default package */
public final class nwt {
    private final jtz a;
    private final nwk b;

    public nwt(jtz jtz, nwk nwk) {
        this.a = jtz;
        this.b = nwk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nwk nwk, jtz jtz, a aVar) {
        String str = aVar.a;
        return nwk.a(str.isEmpty() ? jtz.a() : (long) Integer.parseInt(str)).d().c((Function<? super T, ? extends R>) $$Lambda$nwt$Ww32EU6fOJqB4B1D4g3Zq1Rs4.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$nwt$oV3sEUfiT0mLIiSD728RlEF9P04.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nwr a(UserListeningHistoryWrapper userListeningHistoryWrapper) {
        return new d(ImmutableList.a((Collection<? extends E>) userListeningHistoryWrapper.getSessionList()), String.valueOf(userListeningHistoryWrapper.getLastSessionEndTime()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nwr a(Throwable th) {
        return new c();
    }

    public final ObservableTransformer<nwq, nwr> a() {
        return kok.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$nwt$8pDx3qOPasegYhEHN3PHihCb_M<G,E>(this.b, this.a)).a();
    }
}
