package defpackage;

import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.service.media.RestrictedMediaAction;
import com.spotify.mobile.android.service.media.RestrictedMediaAction.AnonymousClass1;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rtt reason: default package */
public final class rtt {
    final rtc a;
    private final MediaSessionCompat b;
    private rta c;
    private String d;
    private boolean e;
    private Disposable f = Disposables.a();
    private Disposable g = Disposables.a();
    private Disposable h = Disposables.a();
    private final Consumer<rte> i = new $$Lambda$rtt$zCHCA2LoB68IU2fMbUL8vQKLprc(this);
    private final BiFunction<htp, rte, rte> j = new $$Lambda$rtt$Pq_n0gb9FuCjJmVbt0phB60B90(this);

    /* renamed from: rtt$a */
    static class a implements BiFunction<RestrictedMediaAction, rte, Optional<PlaybackStateCompat>> {
        private final rta a;

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Optional optional;
            RestrictedMediaAction restrictedMediaAction = (RestrictedMediaAction) obj;
            rte rte = (rte) obj2;
            if (restrictedMediaAction.b.contains(DisallowReasons.MFT)) {
                int i = AnonymousClass1.a[restrictedMediaAction.a.ordinal()];
                if (i == 1) {
                    optional = Optional.b(Integer.valueOf(9));
                } else if (i == 2 || i == 3) {
                    optional = Optional.b(Integer.valueOf(4));
                } else {
                    Logger.e("Unhandled MFT  action: %s", restrictedMediaAction.a);
                    optional = Optional.e();
                }
            } else {
                Logger.e("Unhandled restricted action: %s", restrictedMediaAction.a);
                optional = Optional.e();
            }
            if (optional.b()) {
                return Optional.b(new android.support.v4.media.session.PlaybackStateCompat.a(rte.a(this.a)).a(((Integer) optional.c()).intValue(), restrictedMediaAction.a.toString()).a());
            }
            return Optional.e();
        }

        public a(rta rta) {
            this.a = rta;
        }
    }

    public rtt(MediaSessionCompat mediaSessionCompat, Context context, rtc rtc) {
        Assertion.a((Object) mediaSessionCompat);
        this.b = mediaSessionCompat;
        MediaSessionCompat mediaSessionCompat2 = this.b;
        mediaSessionCompat2.a.a((CharSequence) context.getString(R.string.playqueue_title));
        this.a = rtc;
    }

    public final void a(hne hne) {
        this.c = new rtb();
        Flowable c2 = this.a.a(hne).h().c();
        this.f = c2.a(this.i, (Consumer<? super Throwable>) $$Lambda$rtt$mcvQFLHKCEAnRDnmKLFLKHgnas0.INSTANCE);
        this.g = vun.a(hne.d().c()).a((wrf<? extends U>) c2, (BiFunction<? super T, ? super U, ? extends R>) new a<Object,Object,Object>(this.c)).a((Consumer<? super T>) new $$Lambda$rtt$rYHsehx8IKJHQrh6BzxNiUKKjzk<Object>(this), (Consumer<? super Throwable>) $$Lambda$rtt$_EduGf79EJymMlQNofk4qRUTV_Q.INSTANCE);
        this.h = hne.f().c().a(BackpressureStrategy.DROP).a((wrf<? extends U>) c2, this.j).a(this.i, (Consumer<? super Throwable>) $$Lambda$rtt$CDZLE0bF5qZhAXrAEx89K8VNzzg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional) {
        if (optional.b()) {
            Logger.b("Setting PlaybackState from restricted action %s", ((PlaybackStateCompat) optional.c()).toString());
            this.b.a((PlaybackStateCompat) optional.c());
        }
    }

    public final void a() {
        if (!this.f.b()) {
            this.f.bf_();
        }
        if (!this.g.b()) {
            this.g.bf_();
        }
        if (!this.h.b()) {
            this.h.bf_();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ defpackage.rte a(defpackage.htp r5, defpackage.rte r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.d()
            java.lang.String r1 = r4.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0014
            r4.d = r0
        L_0x0012:
            r0 = 1
            goto L_0x001e
        L_0x0014:
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x001d
            r4.d = r0
            goto L_0x0012
        L_0x001d:
            r0 = 0
        L_0x001e:
            boolean r1 = r5.a()
            if (r1 == 0) goto L_0x0027
            if (r0 != 0) goto L_0x0027
            r2 = 1
        L_0x0027:
            java.lang.String r1 = r5.b()
            boolean r1 = defpackage.fax.a(r1)
            if (r1 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0039
        L_0x0035:
            java.lang.String r5 = r5.b()
        L_0x0039:
            htp r5 = defpackage.htp.a(r2, r5)
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0049
            rte$d r5 = new rte$d
            r5.<init>()
            return r5
        L_0x0049:
            java.lang.String r0 = r5.b()
            boolean r0 = defpackage.fax.a(r0)
            if (r0 != 0) goto L_0x005c
            rte$b r6 = new rte$b
            java.lang.String r5 = r5.b()
            r6.<init>(r5)
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtt.a(htp, rte):rte");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rte rte) {
        List list;
        rts c2 = rte.c();
        if (c2.b.size() <= 15) {
            list = new ArrayList(c2.b);
        } else {
            list = c2.b.subList(0, 15);
        }
        boolean z = !list.isEmpty();
        if (z) {
            this.b.a(list);
        } else if (this.e) {
            this.b.a(Collections.emptyList());
        }
        this.e = z;
        MediaMetadataCompat b2 = rte.b();
        PlaybackStateCompat a2 = rte.a(this.c);
        Logger.b("Setting state %s and metadata %s", a2.toString(), rte.toString());
        this.b.a.e(rte.e());
        this.b.a.c(2);
        MediaSessionCompat mediaSessionCompat = this.b;
        mediaSessionCompat.a.d(rte.a());
        this.b.a(b2);
        this.b.a(a2);
    }
}
