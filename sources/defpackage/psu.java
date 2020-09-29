package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: psu reason: default package */
public final class psu implements SpotifyServiceIntentProcessor, c {
    private final Context a;
    private final NotificationManager b;
    private final puc c;
    private final vpn d;
    private final hgy e;
    private final ptg f;
    private final rls g;
    private final FollowManager h;
    private final vjv i;
    private final CompositeDisposable j = new CompositeDisposable();

    public psu(Context context, hgy hgy, NotificationManager notificationManager, puc puc, vpn vpn, ptg ptg, rls rls, FollowManager followManager, vjv vjv) {
        this.a = context;
        this.b = notificationManager;
        this.e = hgy;
        this.c = puc;
        this.d = vpn;
        this.f = ptg;
        this.g = rls;
        this.h = followManager;
        this.i = vjv;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void b(ptf ptf) {
        this.d.a("quick_action_save", ptf.b(), ptf.c(), ptf.d());
        this.c.a("SAVE_ENTITY", ptf.b(), ptf.c(), ptf.d());
    }

    private void a(ptf ptf, a aVar) {
        if (!aVar.d) {
            this.h.a(ptf.d(), true);
            Logger.b("Artist/Profile with uri %s was followed", ptf.d());
        } else {
            Logger.b("Artist/Profile with uri %s was already followed", ptf.d());
        }
        b(ptf);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ptf ptf, fqn fqn) {
        Context context = this.a;
        String d2 = ptf.d();
        new laz(context, ViewUris.bB, fqn).a(d2, d2);
        b(ptf);
    }

    private void a(ptf ptf, String str) {
        this.c.a("SAVE_ENTITY", ptf.b(), ptf.c(), ptf.d(), str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ptf ptf, Throwable th) {
        String format = String.format("Failed to change playlist follow state %s", new Object[]{th.toString()});
        Logger.b(format, new Object[0]);
        a(ptf, format);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ptf ptf, a aVar) {
        this.h.a(aVar);
        a(ptf, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ptf ptf, Throwable th) {
        String format = String.format("Error, unable to save content: %s", new Object[]{th.toString()});
        Logger.b(format, new Object[0]);
        a(ptf, format);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ptf ptf, Throwable th) {
        String format = String.format("Error, unable to save content: %s", new Object[]{th.toString()});
        Logger.b(format, new Object[0]);
        a(ptf, format);
    }

    public final Result a(boolean z, Intent intent) {
        pte pte = (pte) intent.getParcelableExtra("push_data");
        if (pte instanceof ptf) {
            ptf ptf = (ptf) pte;
            Logger.b("Processing acton %s", ptf);
            this.b.cancel(ptf.a());
            if (jva.a(ptf.d(), LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
                this.j.a(this.e.a().c(1).a((Consumer<? super T>) new $$Lambda$psu$VGTx19Dg_CZS6YyNeKm20LWlwak<Object>(this, ptf), (Consumer<? super Throwable>) new $$Lambda$psu$tuCMhhlT4LXlaSI3Q4ruUEYaIBw<Object>(this, ptf)));
            } else if (jva.a(ptf.d(), LinkType.ARTIST)) {
                a a2 = this.h.a(ptf.d());
                if (a2 != null) {
                    a(ptf, a2);
                } else {
                    this.j.a(this.g.a(ptf.d()).c(1).a((Consumer<? super T>) new $$Lambda$psu$sfU2R3tzo_jKLoeKSnwGe9klc<Object>(this, ptf), (Consumer<? super Throwable>) new $$Lambda$psu$HGBMb6WDAOFbMqCukSgrud0oZP0<Object>(this, ptf)));
                }
            } else {
                if (jva.a(ptf.d(), LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                    this.j.a(this.i.a(ptf.d()).a((Action) new $$Lambda$psu$SShpgm_iUEFBxGVu7sOsDGIjIt4(this, ptf), (Consumer<? super Throwable>) new $$Lambda$psu$pXfDF9_3liuPnkHouzeZJIgENys<Object>(this, ptf)));
                }
            }
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public final void ai_() {
        this.j.c();
        Logger.b("Session has started", new Object[0]);
    }

    public final void aj_() {
        this.j.c();
        Logger.b("Session has ended", new Object[0]);
    }

    public final String c() {
        return "PushNotificationIntentProcessor";
    }
}
