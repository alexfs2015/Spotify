package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ndk reason: default package */
public final class ndk implements c<hcs, hcs> {
    ndk() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(hcs hcs) {
        hcm header = hcs.header();
        if (header == null) {
            return hcs;
        }
        List<hcm> children = header.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (hcm hcm : children) {
            if (HubsGlueComponent.SHUFFLE_BUTTON.id().equals(hcm.componentId().id())) {
                arrayList.add(hcm.toBuilder().a("button:fixedSizeShuffleButton", hcm.componentId().category()).a());
            } else {
                arrayList.add(hcm);
            }
        }
        return hcs.toBuilder().a(header.toBuilder().a((List<? extends hcm>) arrayList).a()).a();
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) $$Lambda$ndk$qvbB7aKA9nkXfTPniZQ9jI6xjw.INSTANCE);
    }
}
