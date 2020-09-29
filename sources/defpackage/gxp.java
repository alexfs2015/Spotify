package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueEntityDecorator;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SolarComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;

/* renamed from: gxp reason: default package */
public final class gxp {
    private static final gwo d = a.a((gwo) new gxn(), (gwo) new HubsGlueEntityDecorator());
    private static final gwl e = a.a((gwl) new gyp(), (gwl) new gzv());
    private final HubsGlueImageDelegate a;
    private final a b;
    private final HubsGlue2Row.a c;

    gxp(HubsGlueImageDelegate hubsGlueImageDelegate, a aVar, HubsGlue2Row.a aVar2) {
        this.a = hubsGlueImageDelegate;
        this.b = aVar;
        this.c = aVar2;
    }

    public static gwl b() {
        return e;
    }

    public static gwo c() {
        return d;
    }

    public final gwk a() {
        return a.a(HubsGlueCard.a(this.a), this.b, HubsGlueRow.a(this.a), HubsGlueSectionHeader.a(this.a), HubsGlue2Card.a(this.a), this.c, HubsGlue2MiscComponents.a(this.a), HubsGlue2SolarComponents.a(this.a), HubsGlue2SectionHeader.a(this.a), HubsGlue2TrackCloud.a(this.a));
    }
}
