package defpackage;

import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.LoadState;

/* renamed from: nqp reason: default package */
public final class nqp {
    public static kjn<ListeningHistoryModel, nqn> a(ListeningHistoryModel listeningHistoryModel) {
        return kjn.a(listeningHistoryModel, kjk.a(nqn.a(listeningHistoryModel.b())));
    }

    public static kjx<ListeningHistoryModel, nqn> a(ListeningHistoryModel listeningHistoryModel, nqo nqo) {
        return (kjx) nqo.a(new $$Lambda$nqp$8JPBOSDvmm2abPk1tPS_FZa8eTk(listeningHistoryModel), new $$Lambda$nqp$6xbUtYJ7tEHGh0Bw8IMAo3jHzeM(listeningHistoryModel), new $$Lambda$nqp$hngNADv768RkdkEyjalePnZ7fVk(listeningHistoryModel), new $$Lambda$nqp$1U3OAV2OLLMdxTESQKxTwsQzvU(listeningHistoryModel));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ListeningHistoryModel listeningHistoryModel, a aVar) {
        if (aVar.a) {
            return kjx.b(listeningHistoryModel.a(true));
        }
        return kjx.b(listeningHistoryModel.a(false));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(ListeningHistoryModel listeningHistoryModel, b bVar) {
        if (!listeningHistoryModel.d()) {
            return kjx.b(listeningHistoryModel.a(LoadState.FAILED));
        }
        return kjx.a(listeningHistoryModel.a(LoadState.LOADING), kjk.a(nqn.a(listeningHistoryModel.b())));
    }
}
