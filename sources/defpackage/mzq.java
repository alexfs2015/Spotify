package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mzq reason: default package */
public final class mzq implements c<hcs, hcs> {
    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        if (!"freetier:entityTopContainer".equals(hcm.componentId().id())) {
            return hcm;
        }
        a builder = hcm.toBuilder();
        List<hcm> children = hcm.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (hcm hcm2 : children) {
            if (HubsGlueComponent.SHUFFLE_BUTTON.id().equals(hcm2.componentId().id())) {
                arrayList.add(hcm2.toBuilder().a("button:fixedSizeShuffleButton", hcm2.componentId().category()).a());
            } else {
                arrayList.add(hcm2);
            }
        }
        return builder.a((List<? extends hcm>) arrayList).a();
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) $$Lambda$mzq$3zbEJJkeXcSIvyfd1qhBNQOWU.INSTANCE).b();
    }
}
