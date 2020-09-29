package defpackage;

import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import io.reactivex.schedulers.Schedulers;

/* renamed from: nwm reason: default package */
public final class nwm {
    private final nwt a;
    private final nwu b;

    public nwm(nwt nwt, nwu nwu) {
        this.a = nwt;
        this.b = nwu;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe b() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe c() {
        return new kom(Schedulers.a());
    }

    public c<ListeningHistoryModel, nwr, nwq> a() {
        return kok.a((kni<M, E, F>) $$Lambda$ot3DD9rbab26ejt6pEtn9fgCHK8.INSTANCE, this.a.a()).b($$Lambda$nwm$qge3j0HvRfQQIawvzhES77lKw.INSTANCE).a((kny<koe>) $$Lambda$nwm$LkJPck0ZzA94LZnEyccxXKPDQw.INSTANCE).a(this.b.a()).a((kmx<M, F>) $$Lambda$aw16O7Y14NLoXgmFVEFp0QJ6k0.INSTANCE).a(knq.a("ListeningHistory"));
    }
}
