package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: mdl reason: default package */
public final class mdl {
    private final Context a;

    public mdl(Context context) {
        this.a = (Context) fbp.a(context);
    }

    public static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a("browse-placeholder", str).a();
    }

    public static boolean a(hcs hcs) {
        String str = "browse-no-network-empty-view";
        return a(hcs, str) || str.equals(hcs.custom().string("browse-placeholder"));
    }

    public static boolean a(hcs hcs, String str) {
        return hbb.a(hcs) && str.equals(hcs.custom().string("browse-placeholder"));
    }

    public final hcs a() {
        a aVar = new a();
        aVar.a = this.a.getString(R.string.find_error_title);
        aVar.b = this.a.getString(R.string.find_error_body);
        hcm a2 = aVar.a();
        return hbb.b().a(a2).a(a("browse-error-empty-view")).a();
    }

    public final hcs b() {
        a aVar = new a();
        aVar.a = this.a.getString(R.string.find_error_no_connection_title);
        aVar.b = this.a.getString(R.string.find_error_no_connection_body);
        hcm a2 = aVar.a();
        return hbb.b().a(a2).a(a("browse-no-network-empty-view")).a();
    }
}
