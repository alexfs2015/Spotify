package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.model.UserListeningHistoryWrapper;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Collection;

/* renamed from: nqq reason: default package */
public final class nqq {
    private final jrp a;
    private final nqh b;

    public nqq(jrp jrp, nqh nqh) {
        this.a = jrp;
        this.b = nqh;
    }

    public final ObservableTransformer<nqn, nqo> a() {
        return klb.a().a(a.class, (ObservableTransformer<G, E>) new $$Lambda$nqq$GfZxaEuGdqsiqLozH88lpRDDY1M<G,E>(this.b, this.a)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nqo a(UserListeningHistoryWrapper userListeningHistoryWrapper) {
        return new d(ImmutableList.a((Collection<? extends E>) userListeningHistoryWrapper.getSessionList()), String.valueOf(userListeningHistoryWrapper.getLastSessionEndTime()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(nqh nqh, jrp jrp, a aVar) {
        long j;
        String str = aVar.a;
        if (str.isEmpty()) {
            j = jrp.a();
        } else {
            j = (long) Integer.parseInt(str);
        }
        return nqh.a(j).d().c((Function<? super T, ? extends R>) $$Lambda$nqq$93H3oXZ4FBPGHEcGST4uZppKdSQ.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$nqq$bVn4DOE1yMcD_KeXbNOfk_xZusU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nqo a(Throwable th) {
        return new c();
    }
}
