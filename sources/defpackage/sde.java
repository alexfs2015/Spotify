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

/* renamed from: sde reason: default package */
public final class sde {
    final scj a;
    private final MediaSessionCompat b;
    private sch c;
    private String d;
    private boolean e;
    private Disposable f = Disposables.a();
    private Disposable g = Disposables.a();
    private Disposable h = Disposables.a();
    private final Consumer<scl> i = new $$Lambda$sde$RypSXfhD2CqPWDXIYTQSisqoACI(this);
    private final BiFunction<hwb, scl, scl> j = new $$Lambda$sde$WcJNNccN43hspP4IKW1UQHiDPGU(this);

    /* renamed from: sde$a */
    static class a implements BiFunction<RestrictedMediaAction, scl, Optional<PlaybackStateCompat>> {
        private final sch a;

        public a(sch sch) {
            this.a = sch;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Optional optional;
            RestrictedMediaAction restrictedMediaAction = (RestrictedMediaAction) obj;
            scl scl = (scl) obj2;
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
            return optional.b() ? Optional.b(new android.support.v4.media.session.PlaybackStateCompat.a(scl.a(this.a)).a(((Integer) optional.c()).intValue(), restrictedMediaAction.a.toString()).a()) : Optional.e();
        }
    }

    public sde(MediaSessionCompat mediaSessionCompat, Context context, scj scj) {
        Assertion.a((Object) mediaSessionCompat);
        this.b = mediaSessionCompat;
        MediaSessionCompat mediaSessionCompat2 = this.b;
        mediaSessionCompat2.a.a((CharSequence) context.getString(R.string.playqueue_title));
        this.a = scj;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ defpackage.scl a(defpackage.hwb r5, defpackage.scl r6) {
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
            boolean r1 = defpackage.fbo.a(r1)
            if (r1 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0039
        L_0x0035:
            java.lang.String r5 = r5.b()
        L_0x0039:
            hwb r5 = defpackage.hwb.a(r2, r5)
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0049
            scl$d r5 = new scl$d
            r5.<init>()
            return r5
        L_0x0049:
            java.lang.String r0 = r5.b()
            boolean r0 = defpackage.fbo.a(r0)
            if (r0 != 0) goto L_0x005c
            scl$b r6 = new scl$b
            java.lang.String r5 = r5.b()
            r6.<init>(r5)
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.a(hwb, scl):scl");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Optional optional) {
        if (optional.b()) {
            Logger.b("Setting PlaybackState from restricted action %s", ((PlaybackStateCompat) optional.c()).toString());
            this.b.a((PlaybackStateCompat) optional.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(scl scl) {
        sdd c2 = scl.c();
        List arrayList = c2.b.size() <= 15 ? new ArrayList(c2.b) : c2.b.subList(0, 15);
        boolean z = !arrayList.isEmpty();
        if (z) {
            this.b.a(arrayList);
        } else if (this.e) {
            this.b.a(Collections.emptyList());
        }
        this.e = z;
        MediaMetadataCompat b2 = scl.b();
        PlaybackStateCompat a2 = scl.a(this.c);
        Logger.b("Setting state %s and metadata %s", a2.toString(), scl.toString());
        this.b.a.e(scl.e());
        this.b.a.c(2);
        this.b.a.d(scl.a());
        this.b.a(b2);
        this.b.a(a2);
    }

    public final void a() {
        if (!this.f.b()) {
            this.f.bd_();
        }
        if (!this.g.b()) {
            this.g.bd_();
        }
        if (!this.h.b()) {
            this.h.bd_();
        }
    }

    public final void a(hpt hpt) {
        this.c = new sci();
        Flowable c2 = this.a.a(hpt).h().c();
        this.f = c2.a(this.i, (Consumer<? super Throwable>) $$Lambda$sde$pm91WyjXwCNc4UqUSTNrR9zqKJg.INSTANCE);
        this.g = wit.a(hpt.d().c()).a((xfk<? extends U>) c2, (BiFunction<? super T, ? super U, ? extends R>) new a<Object,Object,Object>(this.c)).a((Consumer<? super T>) new $$Lambda$sde$V0tzM6aCUlR5pGkZwxSC_7NVqk<Object>(this), (Consumer<? super Throwable>) $$Lambda$sde$0fNVOk3JzRAJDDX8cfsKvVtDTE.INSTANCE);
        this.h = hpt.f().b().a(BackpressureStrategy.DROP).a((xfk<? extends U>) c2, this.j).a(this.i, (Consumer<? super Throwable>) $$Lambda$sde$uFTPeeKPqJ8BEuZZap5IjDuVESY.INSTANCE);
    }
}
