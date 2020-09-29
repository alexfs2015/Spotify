package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

/* renamed from: gyp reason: default package */
public final class gyp implements gwl {
    private static final gce<HubsGlueRow> a = gce.a(HubsGlueRow.class, hbq.a());
    private static final gce<HubsGlueCard> b = gce.a(HubsGlueCard.class, hbq.a());
    private static final gce<HubsGlueSectionHeader> c = gce.a(HubsGlueSectionHeader.class, hbq.a());
    private static final gce<HubsGlueComponent> d = gce.a(HubsGlueComponent.class, hbq.a());

    public final int resolve(hcm hcm) {
        fbp.a(hcm);
        String id = hcm.componentId().id();
        Optional b2 = a.b(id);
        if (b2.b()) {
            return ((HubsGlueRow) b2.c()).resolve(hcm);
        }
        Optional b3 = b.b(id);
        if (b3.b()) {
            return ((HubsGlueCard) b3.c()).resolve(hcm);
        }
        Optional b4 = c.b(id);
        if (b4.b()) {
            return ((HubsGlueSectionHeader) b4.c()).resolve(hcm);
        }
        Optional b5 = d.b(id);
        if (b5.b()) {
            return ((HubsGlueComponent) b5.c()).resolve(hcm);
        }
        return 0;
    }
}
