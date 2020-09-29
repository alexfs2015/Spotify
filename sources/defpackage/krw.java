package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import java.util.concurrent.Callable;

/* renamed from: krw reason: default package */
public final class krw implements krx {
    private final kru a;

    public krw(kru kru) {
        this.a = kru;
    }

    public final wuh<Optional<TracksAndResources>> a() {
        wuh a2 = wuh.a((Callable<? extends T>) new $$Lambda$krw$RVg0sEZVXYwblzBgW9nXQ_Htgvk<Object>(this));
        kru kru = this.a;
        kru.getClass();
        return wuh.a((Callable<? extends T>) new $$Lambda$dCai_wRcjGOGoZB55ThVJQGN0zA<Object>(kru)).a((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$krw$dkMkaf2flyRol4RgD8r7Lo2Xdw<Object,Object>(a2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b() {
        return Optional.b(this.a.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wuh a(wuh wuh, Boolean bool) {
        return !bool.booleanValue() ? wuh : wxt.a(Optional.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(TracksAndResources tracksAndResources) {
        kru kru = this.a;
        a a2 = kru.c.a();
        a2.a(kru.a, tracksAndResources.getTrackUris());
        a2.a(kru.b, kru.d.a());
        a2.b();
    }

    public final wub a(TracksAndResources tracksAndResources) {
        return wub.a((wum) new $$Lambda$krw$R03qRkkKXoRqx76K97Zk_Nli0(this, tracksAndResources));
    }
}
