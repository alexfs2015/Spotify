package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueEntityDecorator;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SolarComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;

/* renamed from: gvp reason: default package */
final class gvp {
    private static final guo a = a.a((guo) new gvn(), (guo) new HubsGlueEntityDecorator());
    private static final gul b = a.a((gul) new gwn(), (gul) new gxh());

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(HubsGlueCard.a(hubsGlueImageDelegate), HubsGlueComponent.a(hubsGlueImageDelegate), HubsGlueRow.a(hubsGlueImageDelegate), HubsGlueSectionHeader.a(hubsGlueImageDelegate), HubsGlue2Card.a(hubsGlueImageDelegate), HubsGlue2Row.a(hubsGlueImageDelegate), HubsGlue2MiscComponents.a(hubsGlueImageDelegate), HubsGlue2SolarComponents.a(hubsGlueImageDelegate), HubsGlue2SectionHeader.a(hubsGlueImageDelegate), HubsGlue2TrackCloud.a(hubsGlueImageDelegate));
    }

    public static gul a() {
        return b;
    }

    public static guo b() {
        return a;
    }
}
