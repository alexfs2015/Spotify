package defpackage;

import com.spotify.music.features.premiumreactivation.NotificationDay;

/* renamed from: ppx reason: default package */
public final class ppx {
    final ppv a;
    private final hgz b;
    private final ppw c;

    public ppx(hgz hgz, ppv ppv, ppw ppw) {
        this.b = hgz;
        this.a = ppv;
        this.c = ppw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ NotificationDay a(Integer num) {
        NotificationDay a2 = NotificationDay.a((long) num.intValue());
        if (a2 == null || this.a.a.a(a2.mPreferenceKey, false)) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(NotificationDay notificationDay) {
        return Boolean.valueOf(notificationDay != null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str) {
        return this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String b(String str) {
        if (!"1".equals(str)) {
            this.a.a.a().a(NotificationDay.ONE_DAY.mPreferenceKey).a(NotificationDay.THREE_DAYS.mPreferenceKey).a(NotificationDay.FIVE_DAYS.mPreferenceKey).b();
        }
        return str;
    }

    public final xii<NotificationDay> a() {
        return this.b.a("payments-cancel-state-interstitial").e((xiy<? super T, ? extends R>) new $$Lambda$ppx$bgwB_XjcdVUpyLhPrl0lE7HfLs<Object,Object>(this)).c((xiy<? super T, Boolean>) new $$Lambda$C8qANqYKwvsa_phYYFwkFv3_Ghw<Object,Boolean>("1")).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$ppx$9262HewMZXX9vcX765o1GzPXqJ0<Object,Object>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$ppx$F2_76eW3Bjy7cg8f5mbbyLo7V5w<Object,Object>(this)).c((xiy<? super T, Boolean>) $$Lambda$ppx$RhDoJXx7az33tr1maGHha7YzxvA.INSTANCE);
    }
}
