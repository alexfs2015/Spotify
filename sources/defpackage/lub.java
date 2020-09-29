package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: lub reason: default package */
public final class lub implements afj {
    final xag a = new xag();
    afh b;
    String c;
    String d;
    String e;
    private final Context f;
    private final hne g;
    private final hos h;
    private final Scheduler i;
    private final Scheduler j;
    private final hot k;
    private final luc l;
    private lug m;

    public lub(Context context, hop hop, hne hne, Scheduler scheduler, Scheduler scheduler2, luc luc) {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = context;
        this.g = hne;
        this.i = scheduler;
        this.j = scheduler2;
        this.k = new hot();
        this.h = new hos(hop.d(), hne);
        this.l = luc;
    }

    public final void a(int i2) {
        afh afh = this.b;
        if (afh != null) {
            MediaAction mediaAction = (MediaAction) afh.a(i2).e();
            if (mediaAction != null) {
                this.h.a(mediaAction.name());
            }
        }
    }

    public final void a(acc acc) {
        this.b = (afh) acc;
        afh afh = this.b;
        if (afh != null) {
            afh.a(this.f.getString(R.string.app_name));
            this.m = new lug(this.f, this.b);
            this.m.c.a((acd) this.l);
        }
    }

    public final void a() {
        if (this.b == null) {
            Logger.c("onEnterCalled before onCreate", new Object[0]);
            return;
        }
        wud e2 = this.g.d().a().c((wut<? super T, Boolean>) $$Lambda$lub$oGSSu1PZPWIM3trTFWgJfFQVKJU.INSTANCE).d().e();
        tjv j2 = this.g.j();
        this.a.a(wud.a(e2, vun.a((wrf<T>) this.g.g().a), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$Dm8fKCdyeZQrSHZjsWhABGLjpig.INSTANCE).b(vun.a(this.i)).a(vun.a(this.j)).a((wun<? super T>) new $$Lambda$lub$EEnDbK7bYG4FwbKuKqJhZOYzF0<Object>(this), (wun<Throwable>) $$Lambda$lub$JQZZCFxA1JiTFlVVTO4om3e7nt4.INSTANCE));
        this.a.a(wud.a(e2, this.g.e().a(), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$lub$r0EantkVBkh0v6CcheZm3lmAfW8<Object,Object,Object>(this, j2)).b().b(vun.a(this.i)).a(vun.a(this.j)).a((wun<? super T>) new $$Lambda$lub$nW5fYki8seqt6jB5ANruyp5lV8<Object>(this), (wun<Throwable>) $$Lambda$lub$x6gyIGBqKSokRcnA_Pslucrfic.INSTANCE));
        afh afh = this.b;
        if (afh != null) {
            afh.b().a(this.c);
            this.b.c().a(this.d);
            this.b.d().a(this.e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(tjv tjv, PlayerState playerState, ugu ugu) {
        return this.k.a(playerState, ugu, tjv);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        lug lug = this.m;
        if (lug != null) {
            Logger.b("populateMenu", new Object[0]);
            afy a2 = lug.b.a(6);
            if (list.contains(MediaAction.START_RADIO)) {
                a2.b(true);
                a2.c(true);
            } else {
                a2.b(false);
                a2.c(false);
            }
            afy a3 = lug.b.a(1);
            if (list.contains(MediaAction.ADD_TO_COLLECTION)) {
                a3.a(1002);
                a3.a((Object) MediaAction.ADD_TO_COLLECTION);
                a3.a(lug.a.getString(R.string.bmw_tooltip_save));
                a3.b(true);
                a3.c(true);
            } else if (list.contains(MediaAction.REMOVE_FROM_COLLECTION)) {
                a3.a(1003);
                a3.a((Object) MediaAction.REMOVE_FROM_COLLECTION);
                a3.a(lug.a.getString(R.string.bmw_tooltip_unsave));
                a3.b(true);
                a3.c(true);
            } else {
                a3.a(1002);
                a3.b(false);
                a3.c(false);
            }
            afy a4 = lug.b.a(2);
            if (list.contains(MediaAction.THUMB_UP)) {
                a4.a(lug.a.getString(R.string.bmw_tooltip_thumb_up));
                a4.a(1004);
                a4.a((Object) MediaAction.THUMB_UP);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.THUMBS_UP_SELECTED)) {
                a4.a(lug.a.getString(R.string.bmw_tooltip_thumb_up));
                a4.a(1005);
                a4.a((Object) MediaAction.THUMBS_UP_SELECTED);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.TURN_SHUFFLE_ON)) {
                a4.a(lug.a.getString(R.string.bmw_tooltip_turn_shuffle_on));
                a4.a(1014);
                a4.a((Object) MediaAction.TURN_SHUFFLE_ON);
                a4.c(true);
                a4.b(true);
            } else if (list.contains(MediaAction.TURN_SHUFFLE_OFF)) {
                a4.a(lug.a.getString(R.string.bmw_tooltip_turn_shuffle_off));
                a4.a(1013);
                a4.a((Object) MediaAction.TURN_SHUFFLE_OFF);
                a4.c(true);
                a4.b(true);
            } else {
                a4.a(lug.a.getString(R.string.bmw_tooltip_turn_shuffle_on));
                a4.a(1013);
                a4.a((Object) MediaAction.TURN_SHUFFLE_OFF);
                a4.c(false);
                a4.b(false);
            }
            afy a5 = lug.b.a(3);
            if (list.contains(MediaAction.THUMB_DOWN)) {
                a5.a(lug.a.getString(R.string.bmw_tooltip_thumb_down));
                a5.a(1006);
                a5.a((Object) MediaAction.THUMB_DOWN);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ALL_ON)) {
                a5.a(lug.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1015);
                a5.a((Object) MediaAction.TURN_REPEAT_ALL_ON);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ONE_ON)) {
                a5.a(lug.a.getString(R.string.bmw_tooltip_turn_repeat_one_on));
                a5.a(1007);
                a5.a((Object) MediaAction.TURN_REPEAT_ONE_ON);
                a5.b(true);
                a5.c(true);
            } else if (list.contains(MediaAction.TURN_REPEAT_ONE_OFF)) {
                a5.a(lug.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1008);
                a5.a((Object) MediaAction.TURN_REPEAT_ALL_ON);
                a5.b(true);
                a5.c(true);
            } else {
                a5.a(lug.a.getString(R.string.bmw_tooltip_turn_repeat_all_on));
                a5.a(1015);
                a5.b(false);
                a5.c(false);
            }
            afy a6 = lug.b.a(4);
            if (list.contains(MediaAction.SKIP_TO_PREVIOUS) || list.contains(MediaAction.SEEK_15_SECONDS_BACK)) {
                a6.b(true);
                a6.c(true);
            } else {
                a6.b(false);
                a6.c(false);
            }
            afy a7 = lug.b.a(5);
            if (list.contains(MediaAction.SKIP_TO_NEXT) || list.contains(MediaAction.SEEK_15_SECONDS_FORWARD)) {
                a7.b(true);
                a7.c(true);
                return;
            }
            a7.b(false);
            a7.c(false);
        }
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
            r0 = 2131952938(0x7f13052a, float:1.9542333E38)
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
            r0 = 2131952997(0x7f130565, float:1.9542453E38)
            java.lang.String r3 = r7.getString(r0)
            goto L_0x0029
        L_0x0049:
            android.content.Context r7 = r6.f
            r0 = 2131952998(0x7f130566, float:1.9542455E38)
            java.lang.String r3 = r7.getString(r0)
            goto L_0x0029
        L_0x0053:
            r7 = r3
            goto L_0x0067
        L_0x0055:
            android.content.Context r7 = r6.f
            r0 = 2131951716(0x7f130064, float:1.9539854E38)
            java.lang.String r3 = r7.getString(r0)
            android.content.Context r7 = r6.f
            r0 = 2131951717(0x7f130065, float:1.9539856E38)
            java.lang.String r7 = r7.getString(r0)
        L_0x0067:
            if (r3 == 0) goto L_0x009f
            if (r7 == 0) goto L_0x009f
            afh r0 = r6.b
            if (r0 == 0) goto L_0x009f
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            r0[r1] = r7
            java.lang.String r1 = "updateSessionStateInfo: %s, %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            afh r0 = r6.b
            afh$c r0 = r0.d()
            r0.a(r4)
            afh r0 = r6.b
            afh$b r0 = r0.b()
            r0.a(r3)
            afh r0 = r6.b
            afh$a r0 = r0.c()
            r0.a(r7)
            afh r7 = r6.b
            afx r7 = r7.e()
            r7.a(r2)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lub.a(ho):void");
    }

    public final void b() {
        this.a.a();
    }

    public final void c() {
        this.a.a();
    }
}
