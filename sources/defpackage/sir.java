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

/* renamed from: sir reason: default package */
public final class sir extends Fragment implements jol {
    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "internal:licenses";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = (WebView) layoutInflater.inflate(R.layout.fragment_show_licenses, viewGroup, false);
        webView.loadUrl("file:///android_asset/licenses.xhtml");
        return webView;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    public final String b(Context context) {
        return context.getString(R.string.licenses_title);
    }

    public final udr ag() {
        return udt.an;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS_THIRD_PARTY_LIBRARIES, null);
    }
}
