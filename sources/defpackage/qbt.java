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
import com.spotify.music.contentviewstate.ContentViewManager.a;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.features.user.model.DecoratedUser;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.paste.widgets.HeaderView;

/* renamed from: qbt reason: default package */
public class qbt extends qbs<fyu> implements d {
    public RxResolver ap;
    public xil aq;
    public xil ar;
    private RadioStationsModel as;
    private boolean at;
    private String au;
    private xip av = xon.a();
    private qxg aw;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DecoratedUser decoratedUser) {
        this.au = decoratedUser.displayName;
        ai();
    }

    private void ai() {
        String str = this.au;
        if (str != null) {
            ((fyu) this.ad.a()).b(a((int) R.string.cluster_radio_title_made_for, str));
        }
    }

    /* access modifiers changed from: protected */
    public final fyk<fyu> a(boolean z, HeaderView headerView) {
        return z ? fyk.b((Context) p()).b().a(this.af, 1, false, 8).a((vhn) headerView).a((Fragment) this) : fyk.a((Context) p()).b().a(this.af, 1, true, 4).b(this.aa).a((vhn) headerView).a(true).a((Fragment) this);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public final void a(a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.cluster_radio_offline).b(SpotifyIconV2.MIX, R.string.cluster_radio_empty_title, R.string.cluster_radio_empty_subtitle).b(R.string.cluster_radio_error_title, R.string.cluster_radio_error_description);
    }

    public final void a(AbstractContentFragment.a<RadioStationModel> aVar) {
        if (this.as == null) {
            this.at = true;
            return;
        }
        this.at = false;
        super.a(aVar);
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationModel radioStationModel) {
        ai();
        ((fyu) this.ad.a()).c(radioStationModel.subtitle);
        ((fyu) this.ad.a()).b().setGravity(49);
    }

    /* access modifiers changed from: protected */
    public final void a(RadioStationsModel radioStationsModel) {
        this.as = radioStationsModel;
        this.af.setTag(radioStationsModel);
        this.af.setVisibility(8);
        if (radioStationsModel.clusterStations().isEmpty() || this.at) {
            this.at = false;
            am();
        }
    }

    public final void aP_() {
        super.aP_();
        this.av = this.aw.a(this.ab, (Policy) null).a(this.aq).a((xis<? super T>) new $$Lambda$qbt$lxxpbd0IyIY1idZ9Wtzpng2_8<Object>(this), (xis<Throwable>) $$Lambda$qbt$aCKoyyt3UF6snsUgkIkpLq5lh0.INSTANCE);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.RADIO_DASHBOARD_MIXES, null);
    }

    /* access modifiers changed from: protected */
    public final Button ah() {
        return (Button) LayoutInflater.from(p()).inflate(R.layout.header_small_tune_button, null);
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aw = qxg.a(this.ap, this.ar, this.aq);
    }

    public final String e() {
        return "cluster-station";
    }

    public final void h() {
        this.av.unsubscribe();
        super.h();
    }
}
