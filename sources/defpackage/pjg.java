package defpackage;

import com.spotify.music.features.premiumreactivation.NotificationDay;

/* renamed from: pjg reason: default package */
public final class pjg {
    final pje a;
    private final hed b;
    private final pjf c;

    public pjg(hed hed, pje pje, pjf pjf) {
        this.b = hed;
        this.a = pje;
        this.c = pjf;
    }

    public final wud<NotificationDay> a() {
        return this.b.a("payments-cancel-state-interstitial").f(new $$Lambda$pjg$8T5bZAatH5IUYb4xOAa0FgreSJI(this)).c((wut<? super T, Boolean>) new $$Lambda$57qjxmYDaaOcXK34YDXTPaU2AA<Object,Boolean>("1")).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$pjg$RyWmaYsnhnfQyN8puK8WqSBZzlI<Object,Object>(this)).f(new $$Lambda$pjg$miaAG8RRyKz1HzdG54KRUHmzkXQ(this)).c((wut<? super T, Boolean>) $$Lambda$pjg$SQljIKkJc_6gWqMyBMPkLVK5sw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String b(String str) {
        if (!"1".equals(str)) {
            this.a.a.a().a(NotificationDay.ONE_DAY.mPreferenceKey).a(NotificationDay.THREE_DAYS.mPreferenceKey).a(NotificationDay.FIVE_DAYS.mPreferenceKey).b();
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str) {
        return this.c.a();
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
}
