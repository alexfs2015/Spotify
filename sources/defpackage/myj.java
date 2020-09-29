package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: myj reason: default package */
public final class myj implements c<gzz, gzz> {
    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f($$Lambda$myj$5HLZP_YS41eYveacAMGAcOPsq6c.INSTANCE);
    }

    myj() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(gzz gzz) {
        gzt header = gzz.header();
        if (header == null) {
            return gzz;
        }
        List<gzt> children = header.children();
        ArrayList arrayList = new ArrayList(children.size());
        for (gzt gzt : children) {
            if (HubsGlueComponent.SHUFFLE_BUTTON.id().equals(gzt.componentId().id())) {
                arrayList.add(gzt.toBuilder().a("button:fixedSizeShuffleButton", gzt.componentId().category()).a());
            } else {
                arrayList.add(gzt);
            }
        }
        return gzz.toBuilder().a(header.toBuilder().a((List<? extends gzt>) arrayList).a()).a();
    }
}
