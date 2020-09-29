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

/* renamed from: nqd reason: default package */
public class nqd extends jor implements jol, a, udv {
    public nqj a;
    private b<ListeningHistoryModel, nqo> b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "listening-history";
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nqt nqt = new nqt(layoutInflater, viewGroup);
        this.b = kjt.a(this.a.a(), ListeningHistoryModel.a);
        this.b.a(nqt);
        return nqt.a;
    }

    public final void z() {
        super.z();
        this.b.c();
    }

    public final void A() {
        super.A();
        this.b.d();
    }

    public final void ax_() {
        super.ax_();
        this.b.b();
    }

    public static nqd ah() {
        return new nqd();
    }

    public final String b(Context context) {
        return context.getString(R.string.user_listening_history_title);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.LISTENINGHISTORY, null);
    }

    public final udr ag() {
        return udt.ao;
    }

    public final sih ae_() {
        return ViewUris.c;
    }

    public final gjf aj() {
        return PageIdentifiers.LISTENINGHISTORY;
    }
}
