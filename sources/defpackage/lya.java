package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: lya reason: default package */
public final class lya implements afx {
    final xok a = new xok();
    afv b;
    String c;
    String d;
    String e;
    private final Context f;
    private final hpt g;
    private final hqw h;
    private final Scheduler i;
    private final Scheduler j;
    private final hqx k;
    private final lyb l;
    private lyf m;

    public lya(Context context, hqr hqr, hpt hpt, Scheduler scheduler, Scheduler scheduler2, lyb lyb) {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = context;
        this.g = hpt;
        this.i = scheduler;
        this.j = scheduler2;
        this.k = new hqx();
        this.h = new hqw(hqr.d(), hpt);
        this.l = lyb;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(tvn tvn, PlayerState playerState, usi usi) {
        return this.k.a(playerState, usi, tvn);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.ho<com.spotify.mobile.android.cosmos.player.v2.PlayerState, com.spotify.mobile.android.service.session.SessionState> r7) {
        /*
            r6 = this;
            F r0 = r7.a
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = (com.spotify.mobile.android.cosmos.player.v2.PlayerState) r0
            S r7 = r7.b
            com.spotify.mobile.android.service.session.SessionState r7 = (com.spotify.mobile.android.service.session.SessionState) r7
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r0.track()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r3 = 0
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x0055
            boolean r5 = r7.loggingIn()
            if (r5 == 0) goto L_0x002b
            android.content.Context r7 = r6.f
            r0 = 2131952948(0x7f130534, float:1.9542353E38)
            java.lang.String r3 = r7.getString(r0)
        L_0x0029:
            r7 = r4
            goto L_0x0067
        L_0x002b:
            boolean r5 = r7.loggedIn()
            if (r5 == 0) goto L_0x0055
            boolean r5 = r7.connected()
            if (r5 != 0) goto L_0x0053
            if (r0 != 0) goto L_0x0053
            boolean r7 = r7.canConnect()
            if (r7 == 0) goto L_0x0049
            android.content.Context r7 = r6.f
            r0 = 2131953007(0x7f13056f, float:1.9542473E38)
            java.lang.String r3 = r7.getString(r0)
            goto L_0x0029
        L_0x0049:
            android.content.Context r7 = r6.f
            r0 = 2131953008(0x7f130570, float:1.9542475E38)
            java.lang.String r3 = r7.getString(r0)
            goto L_0x0029
        L_0x0053:
            r7 = r3
            goto L_0x0067
        L_0x0055:
            android.content.Context r7 = r6.f
            r0 = 2131951719(0x7f130067, float:1.953986E38)
            java.lang.String r3 = r7.getString(r0)
            android.content.Context r7 = r6.f
            r0 = 2131951720(0x7f130068, float:1.9539862E38)
            java.lang.String r7 = r7.getString(r0)
        L_0x0067:
            if (r3 == 0) goto L_0x009f
            if (r7 == 0) goto L_0x009f
            afv r0 = r6.b
            if (r0 == 0) goto L_0x009f
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            r0[r1] = r7
            java.lang.String r1 = "updateSessionStateInfo: %s, %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            afv r0 = r6.b
            afv$c r0 = r0.d()
            r0.a(r4)
            afv r0 = r6.b
            afv$b r0 = r0.b()
            r0.a(r3)
            afv r0 = r6.b
            afv$a r0 = r0.c()
            r0.a(r7)
            afv r7 = r6.b
            agl r7 = r7.e()
            r7.a(r2)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lya.a(ho):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        lyf lyf = this.m;
        if (lyf != null) {
            Logger.b("populateMenu", new Object[0]);
            agm a2 = lyf.b.a(6);
            if (list.contains(MediaAction.START_RADIO)) {
                a2.b(true);
                a2.c(true);
            } else {
                a2.b(false);
                a2.c(false);
            }
            agm a3 = lyf.b.a(1);
            if (list.contains(MediaAction.ADD_TO_COLLECTION)) {
                a3.a(1002);
                a3.a((Object) MediaAction.ADD_TO_COLLECTION);
                a3.a(lyf.a.getString(R.string.bmw_tooltip_save));
                a3.b(true);
                a3.c(true);
            } else if (list.contains(MediaAction.REMOVE_FROM_COLLECTION)) {
                a3.a(1003);
                a3.a((Object) MediaAction.REMOVE_FROM_COLLECTION);
                a3.a(lyf.a.getString(R.string.bmw_tooltip_unsave));
                a3.b(true);
                a3.c(true);
            } else {
                a3.a(1002);
                a3.b(false);
                a3.c(false);
            }
            agm a4 = lyf.b.a(2);
            if (list.contains(MediaAction.THUMB_UP)) {
                a4.a(lyf.a.getString(R.string.bmw_tooltip_thumb_up));
                a4.a(1004);
                a4.a((Object) MediaAction.THUMB_UP);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.THUMBS_UP_SELECTED)) {
                a4.a(lyf.a.getString(R.string.bmw_tooltip_thumb_up));
                a4.a(1005);
                a4.a((Object) MediaAction.THUMBS_UP_SELECTED);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.TURN_SHUFFLE_ON)) {
                a4.a(lyf.a.getString(R.string.bmw_tooltip_turn_shuffle_on));
                a4.a(1014);
                a4.a((Object) MediaAction.TURN_SHUFFLE_ON);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.TURN_SHUFFLE_OFF)) {
                a4.a(lyf.a.getString(R.string.bmw_tooltip_turn_shuffle_off));
                a4.a(1013);
                a4.a((Object) MediaAction.TURN_SHUFFLE_OFF);
                a4.c(true);
                a4.b(true);
            } else {
                a4.a(lyf.a.getString(R.string.bmw_tooltip_turn_shuffle_on));
                a4.a(1013);
                a4.a((Object) MediaAction.TURN_SHUFFLE_OFF);
                a4.c(false);
                a4.b(false);
            }
            agm a5 = lyf.b.a(3);
            if (list.contains(MediaAction.THUMB_DOWN)) {
                a5.a(lyf.a.getString(R.string.bmw_tooltip_thumb_down));
                a5.a(1006);
                a5.a((Object) MediaAction.THUMB_DOWN);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ALL_ON)) {
                a5.a(lyf.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1015);
                a5.a((Object) MediaAction.TURN_REPEAT_ALL_ON);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ONE_ON)) {
                a5.a(lyf.a.getString(R.string.bmw_tooltip_turn_repeat_one_on));
                a5.a(1007);
                a5.a((Object) MediaAction.TURN_REPEAT_ONE_ON);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ONE_OFF)) {
                a5.a(lyf.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1008);
                a5.a((Object) MediaAction.TURN_REPEAT_ALL_ON);
                a5.b(true);
                a5.c(true);
            } else {
                a5.a(lyf.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1015);
                a5.b(false);
                a5.c(false);
            }
            agm a6 = lyf.b.a(4);
            if (list.contains(MediaAction.SKIP_TO_PREVIOUS) || list.contains(MediaAction.SEEK_15_SECONDS_BACK)) {
                a6.b(true);
                a6.c(true);
            } else {
                a6.b(false);
                a6.c(false);
            }
            agm a7 = lyf.b.a(5);
            if (list.contains(MediaAction.SKIP_TO_NEXT) || list.contains(MediaAction.SEEK_15_SECONDS_FORWARD)) {
                a7.b(true);
                a7.c(true);
                return;
            }
            a7.b(false);
            a7.c(false);
        }
    }

    public final void a() {
        if (this.b == null) {
            Logger.c("onEnterCalled before onCreate", new Object[0]);
            return;
        }
        xii e2 = this.g.d().a().c((xiy<? super T, Boolean>) $$Lambda$lya$x3ZpXyxpCYTOFqhhMdT4yIZiny4.INSTANCE).d().e();
        tvn j2 = this.g.j();
        this.a.a(xii.a(e2, wit.a((xfk<T>) this.g.g().a), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$SEhnnwopXSuPpLEM1HVJ99lwS4I.INSTANCE).b(wit.a(this.i)).a(wit.a(this.j)).a((xis<? super T>) new $$Lambda$lya$BOJn_0susq0uSUAYlNK7YdU1ik<Object>(this), (xis<Throwable>) $$Lambda$lya$KI7BnbYNiY6xXJuT1mAQ14aVDdg.INSTANCE));
        this.a.a(xii.a(e2, this.g.e().a(), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$lya$pn4SXGBQCGkGkVIxtCf1deez26E<Object,Object,Object>(this, j2)).b().b(wit.a(this.i)).a(wit.a(this.j)).a((xis<? super T>) new $$Lambda$lya$Xf0pSik3_Rfv5zs7CWoIbT8QMbA<Object>(this), (xis<Throwable>) $$Lambda$lya$cXpelh5uQAoqgn50_PECbpzG4c.INSTANCE));
        afv afv = this.b;
        if (afv != null) {
            afv.b().a(this.c);
            this.b.c().a(this.d);
            this.b.d().a(this.e);
        }
    }

    public final void a(int i2) {
        afv afv = this.b;
        if (afv != null) {
            MediaAction mediaAction = (MediaAction) afv.a(i2).e();
            if (mediaAction != null) {
                try {
                    this.h.a(MediaAction.valueOf(mediaAction.name()), null);
                } catch (IllegalArgumentException e2) {
                    Logger.e(e2, "Media action %s is not supported", mediaAction.name());
                }
            }
        }
    }

    public final void a(acq acq) {
        this.b = (afv) acq;
        afv afv = this.b;
        if (afv != null) {
            afv.a(this.f.getString(R.string.app_name));
            this.m = new lyf(this.f, this.b);
            this.m.c.a((acr) this.l);
        }
    }

    public final void b() {
        this.a.a();
    }

    public final void c() {
        this.a.a();
    }
}
