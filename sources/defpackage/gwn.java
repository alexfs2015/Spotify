package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

/* renamed from: gwn reason: default package */
public final class gwn implements gul {
    private static final gbg<HubsGlueRow> a = gbg.a(HubsGlueRow.class, gyx.a());
    private static final gbg<HubsGlueCard> b = gbg.a(HubsGlueCard.class, gyx.a());
    private static final gbg<HubsGlueSectionHeader> c = gbg.a(HubsGlueSectionHeader.class, gyx.a());
    private static final gbg<HubsGlueComponent> d = gbg.a(HubsGlueComponent.class, gyx.a());

    public final int resolve(gzt gzt) {
        fay.a(gzt);
        String id = gzt.componentId().id();
        Optional b2 = a.b(id);
        if (b2.b()) {
            return ((HubsGlueRow) b2.c()).resolve(gzt);
        }
        Optional b3 = b.b(id);
        if (b3.b()) {
            return ((HubsGlueCard) b3.c()).resolve(gzt);
        }
        Optional b4 = c.b(id);
        if (b4.b()) {
            return ((HubsGlueSectionHeader) b4.c()).resolve(gzt);
        }
        Optional b5 = d.b(id);
        if (b5.b()) {
            return ((HubsGlueComponent) b5.c()).resolve(gzt);
        }
        return 0;
    }
}
