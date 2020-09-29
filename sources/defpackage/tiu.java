package defpackage;

import com.google.common.base.Function;
import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: tiu reason: default package */
public final class tiu {
    public final guz a;
    public final OnDemandSharingUtils b;
    public boolean c;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(gzt gzt) {
        return gzt != null;
    }

    public tiu(guz guz, OnDemandSharingUtils onDemandSharingUtils) {
        this.a = guz;
        this.b = onDemandSharingUtils;
    }

    public static gzt a(gzz gzz) {
        return (gzt) fbx.a((Iterable<E>) gzz.body()).a((Function<? super E, T>) $$Lambda$tiu$SPr2Jmu2dpfvcrS1IUb5jPpBtY.INSTANCE).c($$Lambda$tiu$saEzSgdzp9c0JXjpuSv0gOHuvoE.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        return (gzt) fbx.a((Iterable<E>) gzt.children()).c($$Lambda$tiu$54Xq8gNWwskWpfionbAYmj6mlk.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static boolean b(gzt gzt) {
        return gzt != null && gzt.componentId().id().equals("onDemandSharingPlayback:shuffleButton");
    }
}
