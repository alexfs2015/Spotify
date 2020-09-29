package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;

@Deprecated
/* renamed from: gxn reason: default package */
public final class gxn implements gwo {
    private static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    private static boolean a(hcm hcm) {
        return (hcm.text().title() == null && hcm.text().subtitle() == null && hcm.text().description() == null) ? false : true;
    }

    public final hcm decorate(hcm hcm) {
        if (!HubsGlueComponent.CAROUSEL.id().equals(hcm.componentId().id())) {
            return hcm;
        }
        if (!(hcm.images().background() != null) && !a(hcm)) {
            return hcm;
        }
        a a = hcx.builder().a((hck) HubsGlueComponent.BACKGROUND).a(a(hcm.id(), "-container")).a(hcw.builder().b(hcm.images().background()));
        if (a(hcm)) {
            String id = hcm.id();
            hco text = hcm.text();
            a = a.b(hcx.builder().a((hck) HubsGlueSectionHeader.SECTION_HEADER).a(a(id, "-header")).a(hcy.builder().a(text.title()).b(text.subtitle()).d(text.description())).a());
        }
        return a.b(hcm.toBuilder().a((hco) null).a((hcl) null).a()).a();
    }
}
