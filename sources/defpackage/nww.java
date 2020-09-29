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

/* renamed from: nww reason: default package */
public final class nww implements kmm<ListeningHistoryModel, nwr> {
    public final ViewGroup a;
    /* access modifiers changed from: private */
    public knw<nwr> b;
    private final nwh c = new nwh();
    private final RecyclerView d = ((RecyclerView) this.a.findViewById(R.id.user_listening_history_rv));
    private final LoadingView e;
    private final fvk f;

    public nww(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_user_listening_history, viewGroup, false);
        this.f = fvm.a(this.a.getContext(), viewGroup);
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
                    nww.this.b.accept(new b());
                }
            }
        });
        this.d.setVisibility(4);
        this.e = LoadingView.a(layoutInflater, this.a.getContext(), this.d);
        LoadingView loadingView = this.e;
        loadingView.b = 1000;
        loadingView.a();
    }

    static /* synthetic */ void a(nww nww, ListeningHistoryModel listeningHistoryModel) {
        if (listeningHistoryModel.d()) {
            ImmutableList a2 = listeningHistoryModel.a();
            nwh nwh = nww.c;
            nwh.a.clear();
            nwh.a.addAll((Collection) fbp.a(a2));
            nwh.e();
            nww.d.setVisibility(0);
            nww.f.getView().setVisibility(8);
            nww.e.b();
            return;
        }
        nww.d.setVisibility(8);
        nww.f.getView().setVisibility(0);
        nww.e.b();
    }

    public final kmn<ListeningHistoryModel> connect(knw<nwr> knw) {
        if (this.b == null) {
            this.b = knw;
            return new kmn<ListeningHistoryModel>() {
                /* access modifiers changed from: private */
                public /* synthetic */ void a(ListeningHistoryModel listeningHistoryModel) {
                    nww.a(nww.this, listeningHistoryModel);
                }

                public final /* synthetic */ void accept(Object obj) {
                    new Handler(Looper.getMainLooper()).post(new $$Lambda$nww$2$bW1wXMH8dVxXLzt_qpWPSJv2Ve4(this, (ListeningHistoryModel) obj));
                }

                public final void dispose() {
                }
            };
        }
        throw new ConnectionLimitExceededException();
    }
}
