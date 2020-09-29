package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: nyv reason: default package */
public final class nyv {
    public final jui a;
    final String b;
    final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    final String h;
    final String i;

    public nyv(Resources resources, jui jui) {
        this.a = (jui) fbp.a(jui);
        this.b = resources.getString(R.string.error_general_title);
        this.c = resources.getString(R.string.error_general_body);
        this.d = resources.getString(R.string.error_no_connection_title);
        this.e = resources.getString(R.string.error_no_connection_body);
        this.f = resources.getString(R.string.error_spotify_service_unavailable_title);
        this.g = resources.getString(R.string.error_spotify_service_unavailable_body);
        this.h = resources.getString(R.string.error_no_made_for_you_results_title);
        this.i = resources.getString(R.string.error_no_made_for_you_results_body);
    }

    public static hcj a(String str) {
        return HubsImmutableComponentBundle.builder().a("tag", str).a();
    }
}
