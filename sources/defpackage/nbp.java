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

/* renamed from: nbp reason: default package */
public class nbp extends jor implements d, jol, a {
    public nbs a;
    public ncb b;

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "golden-path-reference-top-list";
    }

    public final String b(Context context) {
        return context.getString(R.string.golden_path_title_reference_top_list);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.GOLDENPATH_REFERENCETOPLIST, null);
    }

    public final udr ag() {
        return udt.ag;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a.e();
    }

    public final sih ae_() {
        return ViewUris.aO;
    }

    public final void g() {
        super.g();
        this.b.a();
    }

    public final void h() {
        super.h();
        this.b.a.unsubscribe();
    }
}
