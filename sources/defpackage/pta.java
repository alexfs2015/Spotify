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

/* renamed from: pta reason: default package */
public class pta extends AbstractContentFragment<ugi, RecyclerView> {
    public static final String Z = ViewUris.be.toString();
    public jsz aa;
    public ToastieManager ab;
    public Picasso ac;
    psq ad;
    private ugj ae;
    private fpt af;
    /* access modifiers changed from: private */
    public String ag;
    private pto ah;

    public final /* synthetic */ void a(Parcelable parcelable, View view) {
        ugi ugi = (ugi) parcelable;
        psq psq = this.ad;
        psq.e = ugi.a();
        psq.e();
    }

    public static pta a(fpt fpt) {
        pta pta = new pta();
        fpu.a((Fragment) pta, fpt);
        return pta;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.ag = bundle.getString("playing-station-seed");
        }
        this.af = fpu.a((Fragment) this);
        this.ah = new pto() {
            public final void a(PlayerState playerState) {
                pta.this.ag = uhq.d(playerState.entityUri());
                pta.this.ad.a(pta.this.ag);
            }

            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2);
            }
        };
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("playing-station-seed", this.ag);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ae = new ugj(((ka) fay.a(p())).getApplicationContext(), new RadioStateObserver() {
            public final void a(ugu ugu) {
            }

            public final void a(RadioStationsModel radioStationsModel) {
                if (pta.this.a != null) {
                    if (!(radioStationsModel == null || (radioStationsModel.recommendedStations().isEmpty() && radioStationsModel.genreStations().isEmpty()))) {
                        ugi ugi = null;
                        if (radioStationsModel.savedStations().size() > 0) {
                            ugi = ugi.a(radioStationsModel.savedStations());
                        }
                        pta.this.a.a(ugi);
                    }
                }
            }

            public final void a() {
                pta.this.a.a();
            }
        }, getClass().getSimpleName());
    }

    public final void a(fuj fuj, ContentState contentState) {
        if (contentState == ContentState.EMPTY_CONTENT) {
            if (jtc.b(p())) {
                fuj.a().a(false);
            } else {
                fuj.a().a(true);
            }
            if (this.af.b(ufx.f)) {
                fuj.c().setVisibility(8);
            } else {
                fuj.c().setVisibility(0);
                fuj.a(true);
                return;
            }
        }
        fuj.a(false);
    }

    public final void a(a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(SpotifyIconV2.RADIO, R.string.collection_stations_empty_title, R.string.collection_stations_empty_body).b(R.string.your_radio_stations_backend_error_title, R.string.your_radio_stations_backend_error_body);
    }

    public final void g() {
        super.g();
        ugj ugj = this.ae;
        if (ugj != null) {
            ugj.a();
        }
        this.ah.a();
    }

    public final void h() {
        super.h();
        ugj ugj = this.ae;
        if (ugj != null) {
            ugj.b();
        }
        this.ah.b();
    }

    public final sih ae_() {
        return ViewUris.be;
    }

    public final void a(AbstractContentFragment.a<ugi> aVar) {
        this.ae.a();
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_start_stations_title);
    }

    public final String e() {
        return Z;
    }

    public final udr ag() {
        return udt.z;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_RADIO, null);
    }

    public final /* synthetic */ View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ka kaVar = (ka) fay.a(p());
        psr psr = new psr(kaVar, udt.z, this.af, this.W, this.aa, this.ab, true);
        psq psq = new psq(kaVar, null, psr.f, this.W, this.ac);
        this.ad = psq;
        psq psq2 = new psq(kaVar, null, psr.f, this.W, this.ac);
        this.ad = psq2;
        this.ad.a(this.ag);
        RecyclerView recyclerView = new RecyclerView((Context) fay.a(p()), null);
        recyclerView.a((i) new LinearLayoutManager(((ka) fay.a(p())).getApplicationContext()));
        recyclerView.a((RecyclerView.a) this.ad);
        return recyclerView;
    }
}
