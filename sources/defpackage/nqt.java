package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.collect.ImmutableList;
import com.spotify.mobius.ConnectionLimitExceededException;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import java.util.Collection;

/* renamed from: nqt reason: default package */
public final class nqt implements kjd<ListeningHistoryModel, nqo> {
    public final ViewGroup a;
    /* access modifiers changed from: private */
    public kkn<nqo> b;
    private final nqe c = new nqe();
    private final RecyclerView d = ((RecyclerView) this.a.findViewById(R.id.user_listening_history_rv));
    private final LoadingView e;
    private final fuq f;

    public nqt(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_user_listening_history, viewGroup, false);
        this.f = fus.a(this.a.getContext(), viewGroup);
        this.f.a((int) R.string.listening_history_error_offline_title);
        this.f.b((int) R.string.listening_history_error_offline_subtitle);
        this.f.getView().setVisibility(8);
        this.a.addView(this.f.getView());
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.a.getContext());
        this.d.a((a) this.c);
        this.d.a((i) linearLayoutManager);
        this.d.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i, int i2) {
                super.a(recyclerView, i, i2);
                if (linearLayoutManager.j() + linearLayoutManager.r() >= linearLayoutManager.t()) {
                    nqt.this.b.accept(new b());
                }
            }
        });
        this.d.setVisibility(4);
        this.e = LoadingView.a(layoutInflater, this.a.getContext(), this.d);
        LoadingView loadingView = this.e;
        loadingView.b = 1000;
        loadingView.a();
    }

    public final kje<ListeningHistoryModel> connect(kkn<nqo> kkn) {
        if (this.b == null) {
            this.b = kkn;
            return new kje<ListeningHistoryModel>() {
                public final void dispose() {
                }

                public final /* synthetic */ void accept(Object obj) {
                    new Handler(Looper.getMainLooper()).post(new $$Lambda$nqt$2$c2P4KtowIA0Bh2SOk3xYYkx5bL0(this, (ListeningHistoryModel) obj));
                }

                /* access modifiers changed from: private */
                public /* synthetic */ void a(ListeningHistoryModel listeningHistoryModel) {
                    nqt.a(nqt.this, listeningHistoryModel);
                }
            };
        }
        throw new ConnectionLimitExceededException();
    }

    static /* synthetic */ void a(nqt nqt, ListeningHistoryModel listeningHistoryModel) {
        if (listeningHistoryModel.d()) {
            ImmutableList a2 = listeningHistoryModel.a();
            nqe nqe = nqt.c;
            nqe.a.clear();
            nqe.a.addAll((Collection) fay.a(a2));
            nqe.e();
            nqt.d.setVisibility(0);
            nqt.f.getView().setVisibility(8);
            nqt.e.b();
            return;
        }
        nqt.d.setVisibility(8);
        nqt.f.getView().setVisibility(0);
        nqt.e.b();
    }
}
