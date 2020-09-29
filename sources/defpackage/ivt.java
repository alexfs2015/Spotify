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

/* renamed from: ivt reason: default package */
public class ivt extends jor implements jol, kyf, plm, udv {
    public pmr T;
    public pll U;
    public pls V;
    public iri W;
    public irl X;
    public Player Y;
    public Flowable<PlayerState> Z;
    public plh a;
    public tcn aa;
    public fpt ab;
    public Picasso ac;
    /* access modifiers changed from: private */
    public plk ad;
    private pmq ae;
    private QueuePlayerControlsView af;
    private AddRemoveQueueView ag;
    private pln ah;
    private FrameLayout ai;
    private Disposable aj;
    public pli b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public static ivt a(fpt fpt) {
        ivt ivt = new ivt();
        a.a((Fragment) ivt, gjb.a(udt.aD));
        fpu.a((Fragment) ivt, fpt);
        return ivt;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_queue, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(inflate.getContext()));
        recyclerView.setVisibility(0);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    ivt.this.ad.d.a(null, SectionId.CONTENT, UserIntent.SCROLL, InteractionType.SCROLL);
                }
            }
        });
        this.ai = (FrameLayout) inflate.findViewById(R.id.header_unit_container);
        this.af = (QueuePlayerControlsView) inflate.findViewById(R.id.player_controller);
        this.af.setVisibility(0);
        inflate.findViewById(R.id.btn_close).setOnClickListener(new $$Lambda$ivt$TanQd44T3ruMzg_1vhADmUKWigU(this));
        this.ag = (AddRemoveQueueView) inflate.findViewById(R.id.add_remove_container);
        this.ag.a.setOnClickListener(new $$Lambda$ivt$hEsjzCz29LHMobn5GTjy1lGtaPA(this));
        this.ag.b.setOnClickListener(new $$Lambda$ivt$wXIkdu0kMBiHx33Zz9Rg2MlDdAk(this));
        this.ae = new pmq((Player) pmr.a(this.Y, 1), (pmg) pmr.a(this.T.a.get(), 2), (pms) pmr.a(this.af, 3));
        this.af.a(this.ae);
        ConnectView connectView = this.af.a;
        if (connectView != null) {
            irk a2 = this.X.a(this.W.a(new plr(connectView)));
            pll pll = this.U;
            plk plk = new plk((gsg) pll.a(a2, 1), (pli) pll.a(pll.a.get(), 2), (pmm) pll.a(pll.b.get(), 3), (pmg) pll.a(pll.c.get(), 4), (hec) pll.a(pll.d.get(), 5), (lkn) pll.a(pll.e.get(), 6));
            this.ad = plk;
            plk plk2 = this.ad;
            plk2.f = this;
            this.b.j = plk2;
            plz plz = new plz();
            nz nzVar = new nz(plz);
            nzVar.a(recyclerView);
            plh plh = this.a;
            plk plk3 = this.ad;
            nzVar.getClass();
            pln pln = new pln(plh, plk3, new $$Lambda$RCTjH9Kijm5hqaNjKgIv9KvfoI(nzVar), this.ac, inflate.getContext(), this.ad, this.ab.a(ply.a) == RolloutFlag.ENABLED);
            this.ah = pln;
            plz.a = this.ad;
            pln pln2 = this.ah;
            plz.b = pln2;
            recyclerView.a((a) pln2);
            return inflate;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        plk plk = this.ad;
        plk.d.a(null, SectionId.CLOSE_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
        plk.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        plk plk = this.ad;
        plk.d.a(null, SectionId.TRACKS, UserIntent.REMOVE_FROM_QUEUE, InteractionType.HIT);
        ArrayList arrayList = new ArrayList();
        for (pml pml : plk.e.values()) {
            arrayList.add(pml.a);
        }
        pli pli = plk.a;
        PlayerQueue playerQueue = pli.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            pli.k.a(vun.a((ObservableSource<T>) pli.d.setQueue(new PlayerQueueUtil().removeNextTracks(playerQueue, arrayList)), BackpressureStrategy.BUFFER).a(pli.g));
        }
        plk.c();
        plk.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        plk plk = this.ad;
        plk.d.a(null, SectionId.TRACKS, UserIntent.ADD_TO_QUEUE, InteractionType.HIT);
        ArrayList arrayList = new ArrayList();
        for (pml pml : plk.e.values()) {
            arrayList.add(pml.a);
        }
        pli pli = plk.a;
        PlayerQueue playerQueue = pli.f;
        if (playerQueue == null) {
            Assertion.b("Queue is null");
        } else {
            pli.k.a(vun.a((ObservableSource<T>) pli.d.setQueue(new PlayerQueueUtil().addNextTracks(playerQueue, arrayList)), BackpressureStrategy.BUFFER).a(pli.g));
        }
        plk.c();
        plk.b();
    }

    public final void g() {
        super.g();
        this.ad.a();
        this.Y.registerPlayerStateObserver(this.ae);
        this.aj = this.Z.c((Function<? super T, ? extends R>) $$Lambda$OjU1PfnhvetzbKWiEfh3THSf28U.INSTANCE).a((Predicate<? super T>) $$Lambda$SWPRQn1M7T3VQSMkryoLhyafHZc.INSTANCE).c(1).a((Consumer<? super T>) new $$Lambda$ivt$sACp46jThNJ3iF9lfK70eoRnPBo<Object>(this), (Consumer<? super Throwable>) $$Lambda$ivt$Ho4GNYIZA6CoeYmnFcBwpfSltU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        ah();
    }

    public final void h() {
        super.h();
        this.af.b.a();
        plk plk = this.ad;
        hej.a(plk.g);
        plk.h.unsubscribe();
        plk.b.b();
        pli pli = plk.a;
        pli.a.unregisterPlayerStateObserver(pli.i);
        pli.k.a();
        plk.c.b();
        this.Y.unregisterPlayerStateObserver(this.ae);
        Disposable disposable = this.aj;
        if (disposable != null && !disposable.b()) {
            this.aj.bf_();
        }
    }

    public boolean onBackPressed() {
        plk plk = this.ad;
        plk.d.a(null, SectionId.BACK_BUTTON, UserIntent.CLOSE, InteractionType.HIT);
        plk.d();
        return true;
    }

    public final String e() {
        return PageIdentifiers.NOWPLAYING_QUEUE.name();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NOWPLAYING_QUEUE, null);
    }

    public final udr ag() {
        return udt.aD;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    public final void a(pmm pmm) {
        pmm.a(x(), this.ai);
    }

    public final void c() {
        p().finish();
    }

    public final void ah() {
        this.aa.a();
        p().finish();
    }

    public final void ai() {
        if (!jtc.b(p())) {
            this.af.setVisibility(8);
        }
        this.ag.setVisibility(0);
    }

    public final void ak() {
        this.af.setVisibility(0);
        this.ag.setVisibility(8);
    }

    public final void a(boolean z) {
        this.ag.b.setVisibility(z ? 0 : 8);
    }

    public final void i(boolean z) {
        this.ag.a.setVisibility(z ? 0 : 8);
    }

    public final void al() {
        this.ah.a.b.clear();
    }

    public final void j(boolean z) {
        this.ah.a.c = z;
    }

    public final void d(int i) {
        this.ah.d(i);
    }

    public final void a(int i, int i2) {
        this.ah.a(i, i2);
    }

    public final void e(int i) {
        this.ah.e(i);
    }

    public final void c(int i, int i2) {
        this.ah.d(i, i2);
    }
}
