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

/* renamed from: iwx reason: default package */
public final class iwx implements iww {
    private final ka a;
    private final sih b;
    private final fpt c;
    private final List<iwr> d = Lists.a();
    private final jjf e;
    private final Flowable<PlayerState> f;
    private final Scheduler g;
    private final iwt h;
    private final Map<Integer, Disposable> i = new HashMap();

    /* renamed from: iwx$a */
    static class a implements jnu {
        private final jnu b;
        private final ShareEventLogger c;
        private boolean d;
        private final Disposable e;

        public a(jnu jnu, ShareEventLogger shareEventLogger, Disposable disposable) {
            this.b = jnu;
            this.c = shareEventLogger;
            this.e = disposable;
        }

        public final void a(ContextMenuEvent contextMenuEvent) {
            this.d = true;
            this.b.a(contextMenuEvent);
        }

        public final void a() {
            if (!this.d) {
                this.c.a();
            }
            Disposable disposable = this.e;
            if (disposable != null) {
                disposable.bf_();
            }
        }
    }

    public iwx(ka kaVar, sih sih, fpt fpt, jjf jjf, Flowable<PlayerState> flowable, Scheduler scheduler, iwt iwt) {
        this.a = (ka) fay.a(kaVar);
        this.b = (sih) fay.a(sih);
        this.c = (fpt) fay.a(fpt);
        this.e = (jjf) fay.a(jjf);
        this.f = (Flowable) fay.a(flowable);
        this.g = (Scheduler) fay.a(scheduler);
        this.h = (iwt) fay.a(iwt);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, jnu jnu) {
        a(str, !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY, str3, str4, str5, str6, jnu, AppShareDestination.i);
    }

    public final void a(String str, Uri uri, String str2, String str3, String str4, String str5, jnu jnu, List<AppShareDestination> list) {
        Single a2 = this.f.a(0).a(this.g);
        $$Lambda$iwx$j04GER6o5GrcUGgHME8tkdbxe7U r0 = new $$Lambda$iwx$j04GER6o5GrcUGgHME8tkdbxe7U(this, str, uri, str2, str3, str4, str5, jnu, list);
        this.i.put(Integer.valueOf(jnu.hashCode()), a2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$iwx$cgG5Vd0m95NBdqu0Kux2MkLYLFI<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Uri uri, String str2, String str3, String str4, String str5, jnu jnu, List list, PlayerState playerState) {
        String str6 = str;
        String str7 = str2;
        jnu jnu2 = jnu;
        ka kaVar = this.a;
        List<iwr> list2 = this.d;
        boolean z = false;
        if (!(playerState == null || playerState.track() == null || ((Map) fay.a(playerState.track().metadata())).containsKey("is_queued"))) {
            z = true;
        }
        list2.add(new iwr(z, "context", str7));
        String sih = this.b.toString();
        List<iwr> list3 = this.d;
        ShareEventLogger shareEventLogger = new ShareEventLogger((String) fay.a(sih), (String) fay.a(str), str2, playerState, this.e);
        ixc a2 = new a().a(shareEventLogger).a(ixd.a(str6, str7, list3)).a((Uri) fay.a(uri)).a((String) fay.a(str3)).b((String) fay.a(str4)).c(str5).a();
        ShareEventLogger a3 = a2.a();
        a3.c = true;
        a3.a((String) null, Destination.NONE, -1, Interaction.NONE, UserIntent.START_SHARE_SESSION, Result.NO_RESULT, false, false);
        a aVar = new a(jnu2, a2.a(), (Disposable) this.i.remove(Integer.valueOf(jnu.hashCode())));
        jly a4 = jly.a(kaVar, new $$Lambda$iwx$mnNroJ4pRe6V5vcimMG9bOoTL8(this, a2, list, jnu2), str6, this.b);
        if (a4 != null) {
            aVar.getClass();
            a4.X = new $$Lambda$hqTH2NZZSUVW2pZl0LMdJT2kq5o(aVar);
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

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(ixc ixc, List list, jnu jnu, String str) {
        return this.h.a(this.a, this.c, ixc, list, jnu, this.b);
    }

    public final void a(String str, Uri uri, String str2, String str3, String str4, String str5, jnu jnu) {
        a(str, uri, str2, str3, str4, str5, jnu, AppShareDestination.i);
    }
}
