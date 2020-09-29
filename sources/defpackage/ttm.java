package defpackage;

import com.google.common.base.Function;
import com.spotify.music.ondemandsharing.OnDemandSharingUtils;

/* renamed from: ttm reason: default package */
public final class ttm {
    public final gwz a;
    public final OnDemandSharingUtils b;
    public boolean c;

    public ttm(gwz gwz, OnDemandSharingUtils onDemandSharingUtils) {
        this.a = gwz;
        this.b = onDemandSharingUtils;
    }

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        return (hcm) fcp.a((Iterable<E>) hcm.children()).c($$Lambda$ttm$n0EHvoFHCuTttUwC0JJATWVIzw.INSTANCE).d();
    }

    public static hcm a(hcs hcs) {
        return (hcm) fcp.a((Iterable<E>) hcs.body()).a((Function<? super E, T>) $$Lambda$ttm$TcBLuWb13eWs0YXr4XgXVrpxtqY.INSTANCE).c($$Lambda$ttm$bFcucNLsKGmOhBamQ2o1Um4qnbU.INSTANCE).d();
    }

    /* access modifiers changed from: private */
    public static boolean b(hcm hcm) {
        return hcm != null && hcm.componentId().id().equals("onDemandSharingPlayback:shuffleButton");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(hcm hcm) {
        return hcm != null;
    }
}
