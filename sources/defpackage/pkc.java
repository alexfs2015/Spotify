package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: pkc reason: default package */
public final class pkc implements SpotifyServiceIntentProcessor, c {
    private final Context a;
    private final NotificationManager b;
    private final vcu c;
    private final hec d;
    private final pko e;
    private final rcu f;
    private final FollowManager g;
    private final uxt h;
    private final CompositeDisposable i = new CompositeDisposable();

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public final String c() {
        return "PushNotificationIntentProcessor";
    }

    public pkc(Context context, hec hec, NotificationManager notificationManager, vcu vcu, pko pko, rcu rcu, FollowManager followManager, uxt uxt) {
        this.a = context;
        this.b = notificationManager;
        this.d = hec;
        this.c = vcu;
        this.e = pko;
        this.f = rcu;
        this.g = followManager;
        this.h = uxt;
    }

    public final Result a(boolean z, Intent intent) {
        pkm pkm = (pkm) intent.getParcelableExtra("push_data");
        if (pkm instanceof pkn) {
            pkn pkn = (pkn) pkm;
            Logger.b("Processing acton %s", pkn);
            this.b.cancel(pkn.a());
            if (jst.a(pkn.d(), LinkType.ALBUM, LinkType.TRACK, LinkType.SHOW_SHOW)) {
                this.i.a(this.d.a().c(1).a((Consumer<? super T>) new $$Lambda$pkc$m8s1J_yUQpRVaBe0_k7LPQZsv0<Object>(this, pkn.d()), (Consumer<? super Throwable>) $$Lambda$pkc$gNJWdriEyJ7DEBn4oJaE5I7xR8.INSTANCE));
            } else if (jst.a(pkn.d(), LinkType.ARTIST)) {
                String d2 = pkn.d();
                FollowManager.a a2 = this.g.a(d2);
                if (a2 == null) {
                    this.i.a(this.f.a(d2).c(1).a((Consumer<? super T>) new $$Lambda$pkc$N6WIAsqxv_rP77hsWovHnYw71E<Object>(this, d2), (Consumer<? super Throwable>) new $$Lambda$pkc$wA5dBoQcHsF0KgqeUYo4OCXuK7g<Object>(d2)));
                } else if (!a2.d) {
                    this.g.a(d2, true);
                    Logger.b("Artist/Profile with uri %s was followed", d2);
                }
            } else {
                if (jst.a(pkn.d(), LinkType.PLAYLIST_V2, LinkType.PROFILE_PLAYLIST)) {
                    this.i.a(this.h.a(pkn.d()).a((Action) $$Lambda$pkc$auy4B0RXDLdPLcC6xvy76PSQzU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pkc$oMQHC94NX4qddCbG0DcipNIGCJw.INSTANCE));
                }
            }
            this.c.a("quick_action_save", pkn.b(), pkn.c(), pkn.d());
        }
        return Result.IGNORABLE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, fpt fpt) {
        new kxq(this.a, ViewUris.bC, fpt).a(str, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, FollowManager.a aVar) {
        this.g.a(aVar);
        if (!aVar.d) {
            this.g.a(str, true);
            Logger.b("Artist/Profile with uri %s was followed", str);
        }
    }

    public final void ai_() {
        this.i.c();
        Logger.b("Session has started", new Object[0]);
    }

    public final void aj_() {
        this.i.c();
        Logger.b("Session has ended", new Object[0]);
    }
}
