package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

/* renamed from: ssy reason: default package */
public final class ssy extends Fragment implements jqx {
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = (WebView) layoutInflater.inflate(R.layout.fragment_show_licenses, viewGroup, false);
        webView.loadUrl("file:///android_asset/licenses.xhtml");
        return webView;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS_THIRD_PARTY_LIBRARIES, null);
    }

    public final uqm ag() {
        return uqo.an;
    }

    public final String b(Context context) {
        return context.getString(R.string.licenses_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final String e() {
        return "internal:licenses";
    }
}
