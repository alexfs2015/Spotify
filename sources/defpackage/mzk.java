package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;

/* renamed from: mzk reason: default package */
public final class mzk implements c<hcs, hcs> {
    private static hck a = hcv.create("row:downloadToggle", HubsComponentCategory.ROW.name());

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        String id = hcm.componentId().id();
        if (!("freetier:offlineSwitchComponent".equals(id) || a.id().equals(id))) {
            return hcm;
        }
        return hcx.builder().a("download-toggle").a(a).a("click", hct.builder().a("download")).a();
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).e((xiy<? super T, ? extends R>) $$Lambda$mzk$Fk6Q83mcaKaxbuVHRF0TuN8LnhM.INSTANCE).b();
    }
}
