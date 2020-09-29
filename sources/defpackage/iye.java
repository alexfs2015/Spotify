package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerQueueUtil;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.queue.logging.QueueLogConstants.SectionId;
import com.spotify.music.features.queue.logging.QueueLogConstants.UserIntent;
import com.spotify.music.features.queue.playcontrols.QueuePlayerControlsView;
import com.spotify.music.features.queue.view.AddRemoveQueueView;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.squareup.picasso.Picasso;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;

/* renamed from: iye reason: default package */
public class iye extends jrd implements jqx, lbp, pui, uqq {
    public pvn T;
    public puh U;
    public puo V;
    public mmx W;
    public mna X;
    public Player Y;
    public Flowable<PlayerState> Z;
    public pud a;
    public tmu aa;
    public fqn ab;
    public Picasso ac;
    /* access modifiers changed from: private */
    public pug ad;
    private pvm ae;
    private QueuePlayerControlsView af;
    private AddRemoveQueueView ag;
    private puj ah;
    private FrameLayout ai;
    private Disposable aj;
    public pue b;

    public static iye a(fqn fqn) {
        iye iye = new iye();
        a.a((Fragment) iye, gkm.a(uqo.aD));
        fqo.a((Fragment) iye, fqn);
        return iye;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        pug pug = this.ad;
        pug.d.a(null, SectionId.TRACKS, UserIntent.ADD_TO_QUEUE, InteractionType.HIT);
        ArrayList arrayList = new ArrayList();
        for (pvh pvh : pug.e.values()) {
            arrayList.add(pvh.a);
        }
        pue pue = pug.a;
        PlayerQueue playerQueue = pue.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            pue.k.a(wit.a((ObservableSource<T>) pue.d.setQueue(new PlayerQueueUtil().addNextTracks(playerQueue, arrayList)), BackpressureStrategy.BUFFER).a(pue.g));
        }
        pug.c();
        pug.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        ah();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        pug pug = this.ad;
        pug.d.a(null, SectionId.TRACKS, UserIntent.REMOVE_FROM_QUEUE, InteractionType.HIT);
        ArrayList arrayList = new ArrayList();
        for (pvh pvh : pug.e.values()) {
            arrayList.add(pvh.a);
        }
        pue pue = pug.a;
        PlayerQueue playerQueue = pue.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            pue.k.a(wit.a((ObservableSource<T>) pue.d.setQueue(new PlayerQueueUtil().removeNextTracks(playerQueue, arrayList)), BackpressureStrategy.BUFFER).a(pue.g));
        }
        pug.c();
        pug.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        pug pug = this.ad;
        pug.d.a(null, SectionId.CLOSE_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
        pug.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_queue, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(inflate.getContext()));
        recyclerView.setVisibility(0);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    iye.this.ad.d.a(null, SectionId.CONTENT, UserIntent.SCROLL, InteractionType.SCROLL);
                }
            }
        });
        this.ai = (FrameLayout) inflate.findViewById(R.id.header_unit_container);
        this.af = (QueuePlayerControlsView) inflate.findViewById(R.id.player_controller);
        this.af.setVisibility(0);
        inflate.findViewById(R.id.btn_close).setOnClickListener(new $$Lambda$iye$2q78w9treG3lKxzwbOsjoD28jM(this));
        this.ag = (AddRemoveQueueView) inflate.findViewById(R.id.add_remove_container);
        this.ag.a.setOnClickListener(new $$Lambda$iye$oeDxyQsfslFE0bRYTOv8I0ObR1s(this));
        this.ag.b.setOnClickListener(new $$Lambda$iye$S5qvuu6eNEprARUp9i3ODDpY3CM(this));
        this.ae = new pvm((Player) pvn.a(this.Y, 1), (pvc) pvn.a(this.T.a.get(), 2), (pvo) pvn.a(this.af, 3));
        this.af.a(this.ae);
        puo puo = this.V;
        mmz a2 = this.X.a(this.W.a(new pun((gto) puo.a(puo.a.get(), 1), (fqn) puo.a(puo.b.get(), 2), (ConnectView) puo.a(this.af.a, 3))));
        puh puh = this.U;
        pug pug = new pug((gug) puh.a(a2, 1), (pue) puh.a(puh.a.get(), 2), (pvi) puh.a(puh.b.get(), 3), (pvc) puh.a(puh.c.get(), 4), (hgy) puh.a(puh.d.get(), 5), (lon) puh.a(puh.e.get(), 6));
        this.ad = pug;
        pug pug2 = this.ad;
        pug2.f = this;
        this.b.j = pug2;
        puv puv = new puv();
        oe oeVar = new oe(puv);
        oeVar.a(recyclerView);
        pud pud = this.a;
        pug pug3 = this.ad;
        oeVar.getClass();
        puj puj = new puj(pud, pug3, new $$Lambda$iqfifjm23ghzYLyew22g6s_uQz8(oeVar), this.ac, inflate.getContext(), this.ad, this.ab.a(puu.a) == RolloutFlag.ENABLED);
        this.ah = puj;
        puv.a = this.ad;
        puj puj2 = this.ah;
        puv.b = puj2;
        recyclerView.a((a) puj2);
        return inflate;
    }

    public final void a(int i, int i2) {
        this.ah.a(i, i2);
    }

    public final void a(pvi pvi) {
        pvi.a(x(), this.ai);
    }

    public final void a(boolean z) {
        this.ag.b.setVisibility(z ? 0 : 8);
    }

    public final void aP_() {
        super.aP_();
        this.ad.a();
        this.Y.registerPlayerStateObserver(this.ae);
        this.aj = this.Z.c((Function<? super T, ? extends R>) $$Lambda$OjU1PfnhvetzbKWiEfh3THSf28U.INSTANCE).a((Predicate<? super T>) $$Lambda$0QahmBtQC4I52b5gAcVkaLWiU.INSTANCE).c(1).a((Consumer<? super T>) new $$Lambda$iye$PZn78O4cc3TfWTqiyMeQo_fCNTc<Object>(this), (Consumer<? super Throwable>) $$Lambda$iye$umsOmhScyxY_LWfPEtj_PL8YBQ.INSTANCE);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.NOWPLAYING_QUEUE, null);
    }

    public final uqm ag() {
        return uqo.aD;
    }

    public final void ah() {
        this.aa.a();
        p().finish();
    }

    public final void ai() {
        if (!jvi.b(p())) {
            this.af.setVisibility(8);
        }
        this.ag.setVisibility(0);
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    public final void ak() {
        this.af.setVisibility(0);
        this.ag.setVisibility(8);
    }

    public final void al() {
        this.ah.a.b.clear();
    }

    public final String b(Context context) {
        return "";
    }

    public final void c() {
        p().finish();
    }

    public final void c(int i, int i2) {
        this.ah.d(i, i2);
    }

    public final void d(int i) {
        this.ah.d(i);
    }

    public final String e() {
        return PageIdentifiers.NOWPLAYING_QUEUE.name();
    }

    public final void e(int i) {
        this.ah.e(i);
    }

    public final void h() {
        super.h();
        this.af.b.a();
        pug pug = this.ad;
        hhf.a(pug.g);
        pug.h.unsubscribe();
        pug.b.b();
        pue pue = pug.a;
        pue.a.unregisterPlayerStateObserver(pue.i);
        pue.k.a();
        pug.c.b();
        this.Y.unregisterPlayerStateObserver(this.ae);
        Disposable disposable = this.aj;
        if (disposable != null && !disposable.b()) {
            this.aj.bd_();
        }
    }

    public final void i(boolean z) {
        this.ag.a.setVisibility(z ? 0 : 8);
    }

    public final void j(boolean z) {
        this.ah.a.c = z;
    }

    public boolean onBackPressed() {
        pug pug = this.ad;
        pug.d.a(null, SectionId.BACK_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
        pug.d();
        return true;
    }
}
