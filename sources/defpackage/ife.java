package defpackage;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: ife reason: default package */
public final class ife {
    final ifh a;
    Sponsorships b;
    public SponsorshipAdData c;
    private final a d;
    private boolean e;
    private final gbc f = gbd.b();
    private final Runnable g = new Runnable() {
        public final void run() {
            ife.this.a();
        }
    };

    /* renamed from: ife$a */
    static class a {
        long a = (this.c.a() / 1000);
        long b = a();
        private final jrp c = gbd.a();
        private final Disposable d;

        public a(hvg hvg, gbd gbd) {
            this.d = hvg.a().a((Consumer<? super T>) new $$Lambda$ife$a$M_6GHOaKLbSrzXMHHw93fMO5pI<Object>(this), (Consumer<? super Throwable>) $$Lambda$ife$a$BQst64r1a19ghxDuHYzImmQebfA.INSTANCE);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(hvf hvf) {
            Optional call = hvf.call();
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
            this.d.bf_();
        }
    }

    public ife(hvg hvg, gbd gbd, ifh ifh) {
        this.a = ifh;
        this.d = new a(hvg, gbd);
        this.e = false;
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
            ife$a r4 = r11.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ife.a(java.lang.String):com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship");
    }

    public final boolean b(String str) {
        return !TextUtils.isEmpty(str) && a(str) != null;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.a(new defpackage.ifh.a<Sponsorships>() {
            public final void a(wsj<Sponsorships> wsj) {
                Sponsorships sponsorships = (Sponsorships) wsj.b();
                Logger.b("Ads Sponsorships data received : %s", sponsorships);
                if (sponsorships != null) {
                    sponsorships.preserveDisplayState(ife.this.b);
                    ife ife = ife.this;
                    ife.b = sponsorships;
                    try {
                        ife.b.setTTLSeconds(Long.parseLong(wsj.a.f.a("MC-TTL")));
                    } catch (NumberFormatException e) {
                        Logger.b("Ads Caught a NumberFormatException when parsing sponsorships data ttl : %s", e.getMessage());
                    }
                    ife ife2 = ife.this;
                    ife.a(ife2, ife2.b.getTTLSeconds());
                }
            }

            public final void a(Throwable th) {
                Logger.b(th, "Ads Exception when fetching Hermes Sponsorship content: %s", th.getMessage());
                ife.a(ife.this, 1800);
            }
        });
    }

    private void b() {
        this.d.b();
        this.f.a(this.g);
    }

    public static boolean a(fpt fpt) {
        return fpt != null && ((Boolean) fpt.a(hwb.a)).booleanValue();
    }

    static /* synthetic */ void a(ife ife, long j) {
        ife.b();
        gbc gbc = ife.f;
        Runnable runnable = ife.g;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gbc.c.put(runnable, gbc.a.schedule(new defpackage.gbc.a(runnable), j, timeUnit));
    }
}
