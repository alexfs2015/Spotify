package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SolarComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;

/* renamed from: gxh reason: default package */
public final class gxh implements gul {
    private static final gbg<HubsGlue2Card> a = gbg.a(HubsGlue2Card.class, gyx.a());
    private static final gbg<HubsGlue2Row> b = gbg.a(HubsGlue2Row.class, gyx.a());
    private static final gbg<HubsGlue2SectionHeader> c = gbg.a(HubsGlue2SectionHeader.class, gyx.a());
    private static final gbg<HubsGlue2MiscComponents> d = gbg.a(HubsGlue2MiscComponents.class, gyx.a());
    private static final gbg<HubsGlue2SolarComponents> e = gbg.a(HubsGlue2SolarComponents.class, gyx.a());
    private static final gbg<HubsGlue2TrackCloud> f = gbg.a(HubsGlue2TrackCloud.class, gyx.a());

    public final int resolve(gzt gzt) {
        fay.a(gzt);
        String id = gzt.componentId().id();
        Optional b2 = a.b(id);
        if (b2.b()) {
            return ((HubsGlue2Card) b2.c()).resolve(gzt);
        }
        Optional b3 = b.b(id);
        if (b3.b()) {
            return ((HubsGlue2Row) b3.c()).resolve(gzt);
        }
        Optional b4 = c.b(id);
        if (b4.b()) {
            return ((HubsGlue2SectionHeader) b4.c()).resolve(gzt);
        }
        Optional b5 = d.b(id);
        if (b5.b()) {
            return ((HubsGlue2MiscComponents) b5.c()).resolve(gzt);
        }
        Optional b6 = e.b(id);
        if (b6.b()) {
            return ((HubsGlue2SolarComponents) b6.c()).resolve(gzt);
        }
        Optional b7 = f.b(id);
        if (b7.b()) {
            return ((HubsGlue2TrackCloud) b7.c()).resolve(gzt);
        }
        return 0;
    }
}
