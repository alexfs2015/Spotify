package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import java.util.List;

/* renamed from: rmq reason: default package */
public final class rmq implements c<hcs, hcs> {
    rmq() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(hcm hcm) {
        if (!HubsGlueComponent.SHUFFLE_BUTTON.id().equals(((hcm) fbp.a(hcm)).componentId().id())) {
            return hcm;
        }
        return hcm.toBuilder().a("playButton:RoundShuffle", hcm.componentId().category()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(hcs hcs) {
        a builder = hcs.toBuilder();
        hcm header = hcs.header();
        if (header != null) {
            header = header.toBuilder().a(a(header.children())).a();
        }
        a a = builder.a(header);
        List body = hcs.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) $$Lambda$rmq$7PVIxiGBD3zsenZCAv_iEeWXvM.INSTANCE).a());
        }
        return a.a(body).a();
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        return ImmutableList.a(fcp.a((Iterable<E>) list).a((Function<? super E, T>) $$Lambda$rmq$bNkNv6yD5qEtLrWmagL7hEr8A7U.INSTANCE).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm b(hcm hcm) {
        return hcm != null ? hcm.toBuilder().a(a(hcm.children())).a() : hcm;
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) $$Lambda$rmq$AxH5EsULirQpV9RZoGkwTPfM4.INSTANCE);
    }
}
