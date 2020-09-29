package defpackage;

import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.LoadState;

/* renamed from: nws reason: default package */
public final class nws {
    public static kmw<ListeningHistoryModel, nwq> a(ListeningHistoryModel listeningHistoryModel) {
        return kmw.a(listeningHistoryModel, kmt.a(nwq.a(listeningHistoryModel.b())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ListeningHistoryModel listeningHistoryModel, a aVar) {
        return aVar.a ? kng.b(listeningHistoryModel.a(true)) : kng.b(listeningHistoryModel.a(false));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(ListeningHistoryModel listeningHistoryModel, b bVar) {
        if (!listeningHistoryModel.d()) {
            return kng.b(listeningHistoryModel.a(LoadState.FAILED));
        }
        return kng.a(listeningHistoryModel.a(LoadState.LOADING), kmt.a(nwq.a(listeningHistoryModel.b())));
    }

    public static kng<ListeningHistoryModel, nwq> a(ListeningHistoryModel listeningHistoryModel, nwr nwr) {
        return (kng) nwr.a(new $$Lambda$nws$Ej12Qv5yws5NFnr6HwmgCXt84Rc(listeningHistoryModel), new $$Lambda$nws$jYT8IrIHPE2ufwWE4Qr6UkQhqoM(listeningHistoryModel), new $$Lambda$nws$GZHX9oOjob4nTZyfXLI4r4bTr_Q(listeningHistoryModel), new $$Lambda$nws$hxm6Xb2K05RpEmlGHl_QZmo7lUw(listeningHistoryModel));
    }
}
