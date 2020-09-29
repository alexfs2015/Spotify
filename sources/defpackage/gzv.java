package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SolarComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;

/* renamed from: gzv reason: default package */
public final class gzv implements gwl {
    private static final gce<HubsGlue2Card> a = gce.a(HubsGlue2Card.class, hbq.a());
    private static final gce<HubsGlue2Row> b = gce.a(HubsGlue2Row.class, hbq.a());
    private static final gce<HubsGlue2SectionHeader> c = gce.a(HubsGlue2SectionHeader.class, hbq.a());
    private static final gce<HubsGlue2MiscComponents> d = gce.a(HubsGlue2MiscComponents.class, hbq.a());
    private static final gce<HubsGlue2SolarComponents> e = gce.a(HubsGlue2SolarComponents.class, hbq.a());
    private static final gce<HubsGlue2TrackCloud> f = gce.a(HubsGlue2TrackCloud.class, hbq.a());

    public final int resolve(hcm hcm) {
        fbp.a(hcm);
        String id = hcm.componentId().id();
        Optional b2 = a.b(id);
        if (b2.b()) {
            return ((HubsGlue2Card) b2.c()).resolve(hcm);
        }
        Optional b3 = b.b(id);
        if (b3.b()) {
            return ((HubsGlue2Row) b3.c()).resolve(hcm);
        }
        Optional b4 = c.b(id);
        if (b4.b()) {
            return ((HubsGlue2SectionHeader) b4.c()).resolve(hcm);
        }
        Optional b5 = d.b(id);
        if (b5.b()) {
            return ((HubsGlue2MiscComponents) b5.c()).resolve(hcm);
        }
        Optional b6 = e.b(id);
        if (b6.b()) {
            return ((HubsGlue2SolarComponents) b6.c()).resolve(hcm);
        }
        Optional b7 = f.b(id);
        if (b7.b()) {
            return ((HubsGlue2TrackCloud) b7.c()).resolve(hcm);
        }
        return 0;
    }
}
