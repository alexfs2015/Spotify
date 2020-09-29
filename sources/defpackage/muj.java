package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;

/* renamed from: muj reason: default package */
public final class muj implements c<gzz, gzz> {
    private static gzr a = hac.create("row:downloadToggle", HubsComponentCategory.ROW.name());

    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).f($$Lambda$muj$Iwi9lTaYIRFoGFCxnj9smgDrnHM.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        String id = gzt.componentId().id();
        if (!("freetier:offlineSwitchComponent".equals(id) || a.id().equals(id))) {
            return gzt;
        }
        return hae.builder().a("download-toggle").a(a).a("click", haa.builder().a("download")).a();
    }
}
