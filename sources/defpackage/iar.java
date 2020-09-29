package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: iar reason: default package */
public final class iar extends sin implements jol, udv {
    private SpotifyIconView a;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final int ai() {
        return R.layout.fragment_learn_more_webview;
    }

    public final String b(Context context) {
        return "";
    }

    public static iar c() {
        return new iar();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.a = (SpotifyIconView) view.findViewById(R.id.learn_more_close_button);
        this.a.setOnClickListener(new $$Lambda$iar$qkexiZaOUhNVCxyFqtGS7vhTggg(this));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final String e() {
        return ViewUris.aU.toString();
    }

    public final udr ag() {
        return udt.a;
    }

    public final gjf aj() {
        return PageIdentifiers.ADS;
    }

    public final void ah() {
        if (this.W != null) {
            d("https://sponsored-recommendations.spotify.com/");
        }
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.ADS, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (p() != null) {
            p().finish();
        }
    }
}
