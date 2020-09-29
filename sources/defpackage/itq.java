package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.Visibility;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.Location;
import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Scheduler;
import java.util.concurrent.TimeUnit;

/* renamed from: itq reason: default package */
public class itq extends kr implements OnScrollListener, a, itv, jol, a {
    public static final String b = ViewUris.ae.toString();
    itt T;
    public kyi U;
    public itk V;
    public isd W;
    public itp X;
    public Scheduler Y;
    private shr Z;
    private ContentViewManager aa;
    private ito ab;
    private LoadingView ac;
    private final a ad = new a() {
        public final void a(String str) {
            itt itt = itq.this.T;
            itt.a.aj();
            itt.a.ah();
            itt.a();
        }
    };
    private fuj ae;
    private ToolbarSearchFieldView af;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public static itq a(fpt fpt) {
        itq itq = new itq();
        fpu.a((Fragment) itq, fpt);
        return itq;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_location, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.content);
        fqb.f();
        this.ae = fum.a(n(), viewGroup2);
        viewGroup3.addView(this.ae.getView());
        this.ac = LoadingView.a(layoutInflater);
        viewGroup3.addView(this.ac);
        return viewGroup2;
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.T = new itt(this, this.W, this.X, this.V);
        c_(true);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.af = (ToolbarSearchFieldView) view.findViewById(R.id.search_toolbar);
        this.Z = ao();
        this.ab = new ito(p());
        a(this.ab);
        this.aa = new ContentViewManager.a(p(), this.ae, c()).b(SpotifyIconV2.SEARCH, R.string.concerts_location_nux_title, R.string.concerts_location_nux_subtitle).b(R.string.concerts_location_error_title, R.string.concerts_location_error_subtitle).a();
        c().setOnScrollListener(this);
    }

    public final void z() {
        super.z();
        ap();
        this.U.a((a) this);
    }

    public final void A() {
        super.A();
        this.T.b();
        this.U.b((a) this);
    }

    public final Visibility a() {
        return Visibility.HIDE;
    }

    public final void a(ListView listView, View view, int i, long j) {
        super.a(listView, view, i, j);
        itt itt = this.T;
        Location location = (Location) view.getTag();
        int indexOf = itt.f.getLocations().indexOf(location);
        itt.c.a.a().a(itp.b, location.mGeonameId).a(itp.c, location.mLocationName).a();
        itt.d.a("changelocation-select", (long) Integer.valueOf(indexOf).intValue(), (String) null);
        itt.a.ai();
    }

    public final void ai() {
        ka p = p();
        ka p2 = p();
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI");
        intent.setFlags(67108864);
        intent.putExtra("fragment_key", e());
        p.startActivity(new a((Context) fay.a(p2), intent, 0).a);
    }

    public final void ax_() {
        super.ax_();
    }

    public final String e() {
        return b;
    }

    public final udr ag() {
        return udt.F;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONCERTS_CITYSEARCH, null);
    }

    public final void aj() {
        if (u()) {
            this.aa.a(this.ac);
        }
    }

    public final void a(LocationsHolder locationsHolder) {
        if (u()) {
            this.aa.b((ContentState) null);
            this.ab.clear();
            this.ab.addAll(locationsHolder.getLocations());
        }
    }

    public final void ak() {
        if (u()) {
            this.aa.b((ContentState) null);
        }
    }

    public final void al() {
        if (u()) {
            this.aa.b((ContentState) null);
            this.aa.d(true);
        }
    }

    public final void am() {
        if (u()) {
            this.aa.b((ContentState) null);
            this.aa.c(true);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            this.T.a.ah();
        }
    }

    private shr ao() {
        qco qco = new qco(p(), this.af, false);
        qco.b((int) R.string.concerts_location_hint);
        return qco;
    }

    private void ap() {
        this.T.a(seg.a(this.Z, this.ad, this.Y).c(100, TimeUnit.MILLISECONDS));
        if (fax.a(this.Z.h())) {
            this.Z.a(100);
        }
    }

    private void aq() {
        this.T.b();
    }

    public final void an() {
        String h = this.Z.h();
        boolean f = this.Z.f();
        aq();
        this.Z = ao();
        ap();
        this.Z.b(h);
        if (f) {
            this.Z.a();
        }
    }

    public final void ah() {
        View view = this.H;
        if (view != null) {
            gac.b(view);
        }
    }
}
