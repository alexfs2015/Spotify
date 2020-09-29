package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mup reason: default package */
public final class mup implements c<gzz, gzz> {
    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f($$Lambda$mup$yGXNoLoT4b6AAdO4d0Bl4APArQ.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        if (!"freetier:entityTopContainer".equals(gzt.componentId().id())) {
            return gzt;
        }
        a builder = gzt.toBuilder();
        List<gzt> children = gzt.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (gzt gzt2 : children) {
            if (HubsGlueComponent.SHUFFLE_BUTTON.id().equals(gzt2.componentId().id())) {
                arrayList.add(gzt2.toBuilder().a("button:fixedSizeShuffleButton", gzt2.componentId().category()).a());
            } else {
                arrayList.add(gzt2);
            }
        }
        return builder.a((List<? extends gzt>) arrayList).a();
    }
}
