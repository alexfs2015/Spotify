package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.ContentViewManager.a;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.toastie.ToastieManager;
import com.squareup.picasso.Picasso;

/* renamed from: qbw reason: default package */
public class qbw extends AbstractContentFragment<urw, RecyclerView> {
    public static final String Z = ViewUris.bd.toString();
    public jvf aa;
    public ToastieManager ab;
    public Picasso ac;
    public hjw ad;
    qbm ae;
    private urx af;
    private fqn ag;
    /* access modifiers changed from: private */
    public String ah;
    private qck ai;

    public static qbw a(fqn fqn) {
        qbw qbw = new qbw();
        fqo.a((Fragment) qbw, fqn);
        return qbw;
    }

    public final /* synthetic */ void a(Parcelable parcelable, View view) {
        urw urw = (urw) parcelable;
        qbm qbm = this.ae;
        qbm.e = urw.a();
        qbm.e();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.af = new urx(((kf) fbp.a(p())).getApplicationContext(), new RadioStateObserver() {
            public final void a() {
                qbw.this.a.a();
            }

            public final void a(RadioStationsModel radioStationsModel) {
                if (qbw.this.a != null) {
                    if (!(radioStationsModel == null || (radioStationsModel.recommendedStations().isEmpty() && radioStationsModel.genreStations().isEmpty()))) {
                        urw urw = null;
                        if (radioStationsModel.savedStations().size() > 0) {
                            urw = urw.a(radioStationsModel.savedStations());
                        }
                        qbw.this.a.a(urw);
                    }
                }
            }

            public final void a(usi usi) {
            }
        }, getClass().getSimpleName(), this.ad);
    }

    public final void a(a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(SpotifyIconV2.RADIO, R.string.collection_stations_empty_title, R.string.collection_stations_empty_body).b(R.string.your_radio_stations_backend_error_title, R.string.your_radio_stations_backend_error_body);
    }

    public final void a(AbstractContentFragment.a<urw> aVar) {
        this.af.a();
    }

    public final void a(fvd fvd, ContentState contentState) {
        if (contentState == ContentState.EMPTY_CONTENT) {
            if (jvi.b(p())) {
                fvd.a().a(false);
            } else {
                fvd.a().a(true);
            }
            if (this.ag.b(url.f)) {
                fvd.c().setVisibility(8);
            } else {
                fvd.c().setVisibility(0);
                fvd.a(true);
                return;
            }
        }
        fvd.a(false);
    }

    public final void aP_() {
        super.aP_();
        urx urx = this.af;
        if (urx != null) {
            urx.a();
        }
        this.ai.a();
    }

    public final sso ae_() {
        return ViewUris.bd;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_RADIO, null);
    }

    public final uqm ag() {
        return uqo.z;
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_start_stations_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.ah = bundle.getString("playing-station-seed");
        }
        this.ag = fqo.a((Fragment) this);
        this.ai = new qck() {
            public final void a(PlayerState playerState) {
                qbw.this.ah = ute.c(playerState.entityUri());
                qbw.this.ae.a(qbw.this.ah);
            }

            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2);
            }
        };
    }

    public final /* synthetic */ View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kf kfVar = (kf) fbp.a(p());
        qbn qbn = new qbn(kfVar, uqo.z, this.ag, this.W, this.aa, this.ab, true);
        qbm qbm = new qbm(kfVar, null, qbn.f, this.W, this.ac);
        this.ae = qbm;
        qbm qbm2 = new qbm(kfVar, null, qbn.f, this.W, this.ac);
        this.ae = qbm2;
        this.ae.a(this.ah);
        RecyclerView recyclerView = new RecyclerView((Context) fbp.a(p()), null);
        recyclerView.a((i) new LinearLayoutManager(((kf) fbp.a(p())).getApplicationContext()));
        recyclerView.a((RecyclerView.a) this.ae);
        return recyclerView;
    }

    public final String e() {
        return Z;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("playing-station-seed", this.ah);
    }

    public final void h() {
        super.h();
        urx urx = this.af;
        if (urx != null) {
            urx.b();
        }
        this.ai.b();
    }
}
