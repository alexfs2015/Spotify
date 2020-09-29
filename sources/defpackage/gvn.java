package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

@Deprecated
/* renamed from: gvn reason: default package */
public final class gvn implements guo {
    private static boolean a(gzt gzt) {
        return (gzt.text().title() == null && gzt.text().subtitle() == null && gzt.text().description() == null) ? false : true;
    }

    private static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public final gzt decorate(gzt gzt) {
        if (!HubsGlueComponent.CAROUSEL.id().equals(gzt.componentId().id())) {
            return gzt;
        }
        if (!(gzt.images().background() != null) && !a(gzt)) {
            return gzt;
        }
        a a = hae.builder().a((gzr) HubsGlueComponent.BACKGROUND).a(a(gzt.id(), "-container")).a(had.builder().b(gzt.images().background()));
        if (a(gzt)) {
            String id = gzt.id();
            gzv text = gzt.text();
            a = a.b(hae.builder().a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(a(id, "-header")).a(haf.builder().a(text.title()).b(text.subtitle()).d(text.description())).a());
        }
        return a.b(gzt.toBuilder().a((gzv) null).a((gzs) null).a()).a();
    }
}
