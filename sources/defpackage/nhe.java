package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nhe reason: default package */
public class nhe extends jrd implements d, jqx, a {
    public nhh a;
    public nhq b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a.e();
    }

    public final void aP_() {
        super.aP_();
        this.b.a();
    }

    public final Fragment ae() {
        return this;
    }

    public final sso ae_() {
        return ViewUris.aN;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.GOLDENPATH_REFERENCETOPLIST, null);
    }

    public final uqm ag() {
        return uqo.ag;
    }

    public final String b(Context context) {
        return context.getString(R.string.golden_path_title_reference_top_list);
    }

    public final String e() {
        return "golden-path-reference-top-list";
    }

    public final void h() {
        super.h();
        this.b.a.unsubscribe();
    }
}
