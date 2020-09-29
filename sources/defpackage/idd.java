package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: idd reason: default package */
public final class idd extends ssu implements jqx, uqq {
    private SpotifyIconView a;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (p() != null) {
            p().finish();
        }
    }

    public static idd c() {
        return new idd();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.a = (SpotifyIconView) view.findViewById(R.id.learn_more_close_button);
        this.a.setOnClickListener(new $$Lambda$idd$JGmvv_g0h1Pej8abk0AE3ubVf5c(this));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.ADS, null);
    }

    public final uqm ag() {
        return uqo.a;
    }

    public final void ah() {
        if (this.W != null) {
            d("https://sponsored-recommendations.spotify.com/");
        }
    }

    public final int ai() {
        return R.layout.fragment_learn_more_webview;
    }

    public final gkq aj() {
        return PageIdentifiers.ADS;
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final String e() {
        return ViewUris.aT.toString();
    }
}
