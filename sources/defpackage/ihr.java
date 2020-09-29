package defpackage;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: ihr reason: default package */
public final class ihr {
    final ihu a;
    Sponsorships b;
    public SponsorshipAdData c;
    private final a d;
    private boolean e;
    private final gca f = new gca();
    private final Runnable g = new Runnable() {
        public final void run() {
            ihr.this.a();
        }
    };

    /* renamed from: ihr$a */
    static class a {
        long a = (this.c.a() / 1000);
        long b = a();
        private final jtz c = jtp.a;
        private final Disposable d;

        public a(hxs hxs, gcb gcb) {
            this.d = hxs.a().a((Consumer<? super T>) new $$Lambda$ihr$a$e9lZ0dVkGn4wrIfRqShpNmto2aQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$ihr$a$rpsgmV3eBzpUKA0AmX1MK4qQC2w.INSTANCE);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(hxr hxr) {
            Optional call = hxr.call();
            if (call.b()) {
                Logger.b("Cosmos: Ads ServerTimeProvider serverTime: %s", call);
                this.a = ((Long) call.c()).longValue();
                this.b = a();
            }
        }

        /* access modifiers changed from: 0000 */
        public long a() {
            return this.c.c() / 1000;
        }

        public final void b() {
            this.d.bd_();
        }
    }

    public ihr(hxs hxs, gcb gcb, ihu ihu) {
        this.a = ihu;
        this.d = new a(hxs, gcb);
        this.e = false;
    }

    static /* synthetic */ void a(ihr ihr, long j) {
        ihr.b();
        gca gca = ihr.f;
        Runnable runnable = ihr.g;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gca.c.put(runnable, gca.a.schedule(new defpackage.gca.a(runnable), j, timeUnit));
    }

    public static boolean a(fqn fqn) {
        return fqn != null && ((Boolean) fqn.a(hyn.a)).booleanValue();
    }

    private void b() {
        this.d.b();
        this.f.a(this.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship a(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = r11.e
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0011
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r12
            java.lang.String r12 = "Sponsorships are not enabled : %s"
            com.spotify.base.java.logging.Logger.b(r12, r0)
            return r1
        L_0x0011:
            com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships r0 = r11.b
            if (r0 == 0) goto L_0x001a
            com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship r0 = r0.getSponsorship(r12)
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            ihr$a r4 = r11.d
            if (r0 == 0) goto L_0x0056
            long r5 = r4.a
            long r7 = r4.a()
            long r5 = r5 + r7
            long r7 = r4.b
            long r5 = r5 - r7
            java.lang.Long r4 = r0.endTime()
            long r7 = r4.longValue()
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            java.lang.Long r7 = r0.startTime()
            long r7 = r7.longValue()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0056
            if (r4 != 0) goto L_0x0054
            java.lang.Long r4 = r0.endTime()
            long r7 = r4.longValue()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0056
        L_0x0054:
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r12
            java.lang.String r12 = "Sponsorship is active : %s"
            com.spotify.base.java.logging.Logger.b(r12, r1)
            return r0
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihr.a(java.lang.String):com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship");
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.a(new defpackage.ihu.a<Sponsorships>() {
            public final void a(Throwable th) {
                Logger.b(th, "Ads Exception when fetching Hermes Sponsorship content: %s", th.getMessage());
                ihr.a(ihr.this, 1800);
            }

            public final void a(xgo<Sponsorships> xgo) {
                Sponsorships sponsorships = (Sponsorships) xgo.b();
                Logger.b("Ads Sponsorships data received : %s", sponsorships);
                if (sponsorships != null) {
                    sponsorships.preserveDisplayState(ihr.this.b);
                    ihr ihr = ihr.this;
                    ihr.b = sponsorships;
                    try {
                        ihr.b.setTTLSeconds(Long.parseLong(xgo.a.f.a("MC-TTL")));
                    } catch (NumberFormatException e) {
                        Logger.b("Ads Caught a NumberFormatException when parsing sponsorships data ttl : %s", e.getMessage());
                    }
                    ihr ihr2 = ihr.this;
                    ihr.a(ihr2, ihr2.b.getTTLSeconds());
                }
            }
        });
    }

    public final void a(boolean z) {
        this.e = z;
        if (this.e) {
            a aVar = this.d;
            Sponsorships sponsorships = this.b;
            boolean z2 = true;
            if (sponsorships != null) {
                if (sponsorships.getTTLSeconds() + aVar.b >= aVar.a()) {
                    z2 = false;
                }
            }
            if (z2) {
                a();
            }
            return;
        }
        this.b = null;
        b();
    }

    public final boolean b(String str) {
        return !TextUtils.isEmpty(str) && a(str) != null;
    }
}
