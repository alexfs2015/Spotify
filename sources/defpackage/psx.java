package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.features.radio.common.AbstractContentFragment.a;
import com.spotify.music.features.user.model.DecoratedUser;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.paste.widgets.HeaderView;

/* renamed from: psx reason: default package */
public class psx extends psw<fya> implements d {
    public RxResolver am;
    public wug an;
    public wug ao;
    private RadioStationsModel ap;
    private boolean aq;
    private String ar;
    private wuk as = xaj.a();
    private qox at;

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "cluster-station";
    }

    /* access modifiers changed from: protected */
    public final fxq<fya> a(boolean z, HeaderView headerView) {
        if (z) {
            return fxq.b((Context) p()).b().a(this.af, 1, false, 8).a((uvx) headerView).a((Fragment) this);
        }
        return fxq.a((Context) p()).b().a(this.af, 1, true, 4).b(this.aa).a((uvx) headerView).a(true).a((Fragment) this);
    }

    /* access modifiers changed from: protected */
    public final Button ah() {
        return (Button) LayoutInflater.from(p()).inflate(R.layout.header_small_tune_button, null);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.at = qox.a(this.am, this.ao, this.an);
    }

    public final void g() {
        super.g();
        this.as = this.at.a(this.ab, (Policy) null).a(this.an).a((wun<? super T>) new $$Lambda$psx$6sO0tX1flzaGEqfVx09XnLcg90<Object>(this), (wun<Throwable>) $$Lambda$psx$Itt59vG9hWS3uuCoMyVF0qOOdZc.INSTANCE);
    }

    public final void h() {
        this.as.unsubscribe();
        super.h();
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationsModel radioStationsModel) {
        this.ap = radioStationsModel;
        this.af.setTag(radioStationsModel);
        this.af.setVisibility(8);
        if (radioStationsModel.clusterStations().isEmpty() || this.aq) {
            this.aq = false;
            am();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationModel radioStationModel) {
        ai();
        ((fya) this.ad.a()).c(radioStationModel.subtitle);
        ((fya) this.ad.a()).b().setGravity(49);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DecoratedUser decoratedUser) {
        this.ar = decoratedUser.displayName;
        ai();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.RADIO_DASHBOARD_MIXES, null);
    }

    public final void a(a<RadioStationModel> aVar) {
        if (this.ap == null) {
            this.aq = true;
            return;
        }
        this.aq = false;
        super.a(aVar);
    }

    public final void a(ContentViewManager.a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.cluster_radio_offline).b(SpotifyIconV2.MIX, R.string.cluster_radio_empty_title, R.string.cluster_radio_empty_subtitle).b(R.string.cluster_radio_error_title, R.string.cluster_radio_error_description);
    }

    private void ai() {
        String str = this.ar;
        if (str != null) {
            ((fya) this.ad.a()).b(a((int) R.string.cluster_radio_title_made_for, str));
        }
    }
}
