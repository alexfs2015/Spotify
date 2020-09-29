package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import java.util.concurrent.Callable;

/* renamed from: kvf reason: default package */
public final class kvf implements kvg {
    private final kvd a;

    public kvf(kvd kvd) {
        this.a = kvd;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xim a(xim xim, Boolean bool) {
        return !bool.booleanValue() ? xim : xly.a(Optional.e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional b() {
        return Optional.b(this.a.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(TracksAndResources tracksAndResources) {
        kvd kvd = this.a;
        a a2 = kvd.c.a();
        a2.a(kvd.a, tracksAndResources.getTrackUris());
        a2.a(kvd.b, kvd.d.a());
        a2.b();
    }

    public final xig a(TracksAndResources tracksAndResources) {
        return xig.a((xir) new $$Lambda$kvf$4GI0bbFOVmHwZsAr77nBOgkVzk(this, tracksAndResources));
    }

    public final xim<Optional<TracksAndResources>> a() {
        xim a2 = xim.a((Callable<? extends T>) new $$Lambda$kvf$5RN65eIg4CZV0mPPcdEhTtljDaM<Object>(this));
        kvd kvd = this.a;
        kvd.getClass();
        return xim.a((Callable<? extends T>) new $$Lambda$YPjr94m8A556bNXla9eYry5YEEM<Object>(kvd)).a((xiy<? super T, ? extends xim<? extends R>>) new $$Lambda$kvf$I6mbUCzNaj2CxfymnJQfHm15rY<Object,Object>(a2));
    }
}
