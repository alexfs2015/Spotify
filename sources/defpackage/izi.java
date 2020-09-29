package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Destination;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Interaction;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Result;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.UserIntent;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: izi reason: default package */
public final class izi implements izh {
    private final kf a;
    private final sso b;
    private final fqn c;
    private final List<izc> d = Lists.a();
    private final jlr e;
    private final Flowable<PlayerState> f;
    private final Scheduler g;
    private final ize h;
    private final Map<Integer, Disposable> i = new HashMap();

    /* renamed from: izi$a */
    static class a implements jqg {
        private final jqg b;
        private final ShareEventLogger c;
        private boolean d;
        private final Disposable e;

        public a(jqg jqg, ShareEventLogger shareEventLogger, Disposable disposable) {
            this.b = jqg;
            this.c = shareEventLogger;
            this.e = disposable;
        }

        public final void a() {
            if (!this.d) {
                this.c.a();
            }
            Disposable disposable = this.e;
            if (disposable != null) {
                disposable.bd_();
            }
        }

        public final void a(ContextMenuEvent contextMenuEvent) {
            this.d = true;
            this.b.a(contextMenuEvent);
        }
    }

    public izi(kf kfVar, sso sso, fqn fqn, jlr jlr, Flowable<PlayerState> flowable, Scheduler scheduler, ize ize) {
        this.a = (kf) fbp.a(kfVar);
        this.b = (sso) fbp.a(sso);
        this.c = (fqn) fbp.a(fqn);
        this.e = (jlr) fbp.a(jlr);
        this.f = (Flowable) fbp.a(flowable);
        this.g = (Scheduler) fbp.a(scheduler);
        this.h = (ize) fbp.a(ize);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(izn izn, List list, jqg jqg, String str) {
        return this.h.a(this.a, this.c, izn, list, jqg, this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Uri uri, String str2, String str3, String str4, String str5, jqg jqg, List list, PlayerState playerState) {
        String str6 = str;
        String str7 = str2;
        jqg jqg2 = jqg;
        kf kfVar = this.a;
        List<izc> list2 = this.d;
        boolean z = false;
        if (!(playerState == null || playerState.track() == null || ((Map) fbp.a(playerState.track().metadata())).containsKey("is_queued"))) {
            z = true;
        }
        list2.add(new izc(z, "context", str7));
        String sso = this.b.toString();
        List<izc> list3 = this.d;
        ShareEventLogger shareEventLogger = new ShareEventLogger((String) fbp.a(sso), (String) fbp.a(str), str2, playerState, this.e);
        izn a2 = new a().a(shareEventLogger).a(izo.a(str6, str7, list3)).a((Uri) fbp.a(uri)).a((String) fbp.a(str3)).b((String) fbp.a(str4)).c(str5).a();
        ShareEventLogger a3 = a2.a();
        a3.c = true;
        a3.a((String) null, Destination.NONE, -1, Interaction.NONE, UserIntent.START_SHARE_SESSION, Result.NO_RESULT, false, false);
        a aVar = new a(jqg2, a2.a(), (Disposable) this.i.remove(Integer.valueOf(jqg.hashCode())));
        jok a4 = jok.a(kfVar, new $$Lambda$izi$M6FYCOr4n3NTZzukwdmLKMKhXSo(this, a2, list, jqg2), str6, this.b);
        if (a4 != null) {
            aVar.getClass();
            a4.Z = new $$Lambda$mCAX5ZDasRECAaCtPsif_9FCVTg(aVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th, "Exception fetching player state", new Object[0]);
        Toast.makeText(this.a.getApplicationContext(), R.string.toast_shared_to_external_app_error, 0).show();
    }

    public final List<AppShareDestination> a() {
        return AppShareDestination.i;
    }

    public final void a(String str, Uri uri, String str2, String str3, String str4, String str5, jqg jqg) {
        a(str, uri, str2, str3, str4, str5, jqg, AppShareDestination.i);
    }

    public final void a(String str, Uri uri, String str2, String str3, String str4, String str5, jqg jqg, List<AppShareDestination> list) {
        Single a2 = this.f.a(0).a(this.g);
        $$Lambda$izi$gdPySXWSbeX4uKs7D07gAx2QJSA r0 = new $$Lambda$izi$gdPySXWSbeX4uKs7D07gAx2QJSA(this, str, uri, str2, str3, str4, str5, jqg, list);
        this.i.put(Integer.valueOf(jqg.hashCode()), a2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$izi$_JyI21PeAUSVZeAN1tdrciKEpJ0<Object>(this)));
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, jqg jqg) {
        a(str, !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY, str3, str4, str5, str6, jqg, AppShareDestination.i);
    }
}
