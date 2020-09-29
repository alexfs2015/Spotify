package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: nwg reason: default package */
public class nwg extends jrd implements jqx, a, uqq {
    public nwm a;
    private b<ListeningHistoryModel, nwr> b;

    public static nwg ah() {
        return new nwg();
    }

    public final void A() {
        super.A();
        this.b.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nww nww = new nww(layoutInflater, viewGroup);
        this.b = knc.a(this.a.a(), ListeningHistoryModel.a);
        this.b.a(nww);
        return nww.a;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.b;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.LISTENINGHISTORY, null);
    }

    public final uqm ag() {
        return uqo.ao;
    }

    public final gkq aj() {
        return PageIdentifiers.LISTENINGHISTORY;
    }

    public final void aw_() {
        super.aw_();
        this.b.b();
    }

    public final String b(Context context) {
        return context.getString(R.string.user_listening_history_title);
    }

    public final String e() {
        return "listening-history";
    }

    public final void z() {
        super.z();
        this.b.c();
    }
}
