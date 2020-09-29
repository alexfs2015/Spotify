package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.toastie.ToastieManager;
import com.squareup.picasso.Picasso;

/* renamed from: qbz reason: default package */
public class qbz extends AbstractContentFragment<RadioStationsModel, ListView> implements NavigationItem, szs {
    public jvf Z;
    public ToastieManager aa;
    public jty ab;
    public mfo ac;
    public DisplayMetrics ad;
    public Picasso ae;
    public hjw af;
    private final xis<SessionState> ag = new $$Lambda$qbz$Rp0tDJCjCNkU7Wjx1hGRJdL9sV0(this);
    private qck ah;
    private jsm ai;
    /* access modifiers changed from: private */
    public qbl aj;
    private qbl ak;
    private qcj<qbk> al;
    private String am;
    private fqn an;
    private RecyclerView ao;
    private RecyclerView ap;
    private urx aq;
    private final xok ar = new xok();

    private qbl a(int i, int i2, boolean z) {
        qbl qbl = new qbl((kf) fbp.a(p()), ViewUris.c, z, this.an, this.W, this.Z, this.aa, this.ae);
        RecyclerView ao2 = ao();
        if (i2 == 1 || i2 == 2) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            ao2.a((i) linearLayoutManager);
            a(ao2, (i) linearLayoutManager);
            if (i2 == 1) {
                this.ao = ao2;
            } else {
                this.ap = ao2;
            }
        }
        ao2.a((a) qbl);
        this.ai.a((ListAdapter) new joh(ao2), a(i), i2);
        return qbl;
    }

    public static qbz a(String str, fqn fqn, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", null);
        bundle.putString("username", str2);
        qbz qbz = new qbz();
        qbz.g(bundle);
        fqo.a((Fragment) qbz, fqn);
        return qbz;
    }

    private void a(RecyclerView recyclerView, i iVar) {
        final int dimensionPixelSize = o().getResources().getDimensionPixelSize(R.dimen.hugs_card_row_gap);
        final int i = dimensionPixelSize / 2;
        final RecyclerView recyclerView2 = recyclerView;
        final i iVar2 = iVar;
        AnonymousClass3 r2 = new h() {
            public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                super.a(rect, view, recyclerView, sVar);
                int f = RecyclerView.f(view);
                rect.set(f == 0 ? dimensionPixelSize : i, 0, f == iVar2.t() + -1 ? dimensionPixelSize : i, 0);
            }
        };
        recyclerView.a((h) r2, -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kf kfVar, View view) {
        this.ac.a(kfVar);
    }

    private RecyclerView ao() {
        int a = vgb.a(this.ad.widthPixels, 3, o().getResources().getDimensionPixelSize(R.dimen.radio_cover_cat_height), vfj.b(64.0f, o().getResources()), o().getResources().getDimensionPixelOffset(R.dimen.radio_cover_items_cat_right_gap));
        RecyclerView recyclerView = new RecyclerView((Context) fbp.a(p()), null);
        recyclerView.setLayoutParams(new LayoutParams(-1, a));
        return recyclerView;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(SessionState sessionState) {
        ((kf) fbp.a(p())).e();
        this.U.b(!sessionState.canStream());
    }

    public final /* synthetic */ void a(Parcelable parcelable, View view) {
        RadioStationsModel radioStationsModel = (RadioStationsModel) parcelable;
        this.aj.a(radioStationsModel.userStations());
        this.ai.c(1);
        if (this.aj.b() == 0) {
            this.ai.a(1);
        }
        this.ak.a(radioStationsModel.recommendedStations());
        this.ai.c(2);
        ((qbk) this.al.a).setNotifyOnChange(false);
        ((qbk) this.al.a).clear();
        ((qbk) this.al.a).addAll(radioStationsModel.genreStations());
        ((qbk) this.al.a).notifyDataSetChanged();
        this.ai.c(3);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.V_().setText(R.string.header_radio_button_get_premium);
        this.b.a(true);
        kf kfVar = (kf) fbp.a(p());
        this.b.V_().setOnClickListener(new $$Lambda$qbz$m0jqan6W2iSGloYu5iRWjDfzkgc(this, kfVar));
        this.aq = new urx(kfVar.getApplicationContext(), new RadioStateObserver() {
            public final void a() {
                qbz.this.a.a();
            }

            public final void a(RadioStationsModel radioStationsModel) {
                qbz.this.a.a(radioStationsModel);
            }

            public final void a(usi usi) {
            }
        }, getClass().getSimpleName(), this.af);
    }

    public final void a(ContentViewManager.a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.header_radio_offline_body).b(SpotifyIconV2.RADIO, R.string.error_general_title, R.string.error_general_body).b(R.string.your_radio_stations_backend_error_title, R.string.your_radio_stations_backend_error_body).a(SpotifyIconV2.RADIO, R.string.header_radio_not_available_in_region_title, R.string.header_radio_not_available_in_region_body);
    }

    public final void a(AbstractContentFragment.a<RadioStationsModel> aVar) {
    }

    public final void a(fvd fvd, ContentState contentState) {
        int i = 0;
        boolean z = contentState == ContentState.SERVICE_WARNING && this.ab.g();
        Button V_ = this.b.V_();
        if (!z) {
            i = 8;
        }
        V_.setVisibility(i);
    }

    public final /* synthetic */ boolean a(Parcelable parcelable) {
        RadioStationsModel radioStationsModel = (RadioStationsModel) parcelable;
        return radioStationsModel == null || (radioStationsModel.userStations().isEmpty() && radioStationsModel.recommendedStations().isEmpty() && radioStationsModel.genreStations().isEmpty());
    }

    public final boolean a(SessionState sessionState) {
        return super.a(sessionState) && sessionState.canStream();
    }

    public final void aP_() {
        super.aP_();
        this.ah.a();
        this.ar.a(wit.a((xfk<T>) this.V.a).a(this.ag, (xis<Throwable>) $$Lambda$qbz$VFbcc8yLOqkYPk5xPJbYpvEIVpg.INSTANCE));
    }

    public final sso ae_() {
        return ViewUris.c;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.RADIO, null);
    }

    public final uqm ag() {
        return uqo.aI;
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    public final boolean ai() {
        return false;
    }

    public final boolean aj() {
        return false;
    }

    public final boolean ak() {
        return false;
    }

    public final boolean al() {
        return false;
    }

    public final String b(Context context) {
        String str = this.am;
        return str == null ? context.getString(R.string.radio_title) : str;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.am = ((Bundle) fbp.a(this.i)).getString("title");
        this.an = fqo.a((Fragment) this);
        this.ah = new qck() {
            public final void a(PlayerState playerState) {
                if (qbz.this.aj != null) {
                    qbz.this.aj.d = playerState.entityUri();
                    qbz.this.aj.e = !playerState.isPaused();
                    qbz.this.aj.e();
                }
            }

            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2) || c(playerState, playerState2);
            }
        };
    }

    public final void b(SessionState sessionState) {
        super.b(sessionState);
        this.aq.a();
    }

    public final /* synthetic */ View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ListView listView = new ListView(viewGroup.getContext());
        kf kfVar = (kf) fbp.a(p());
        this.ai = new jsm(kfVar);
        this.ai.a = new jsk(kfVar) {
            public final void a(int i, View view, String str, String str2, boolean z) {
                super.a(i, view, str, str2, z);
                ((fsm) fqv.a(view, fsm.class)).b(z);
            }
        };
        this.aj = a((int) R.string.radio_section_your_stations_station_entity, 1, true);
        this.ak = a((int) R.string.radio_section_recommended_stations, 2, false);
        this.al = new qcj<>(kfVar, new qbk(kfVar, this.W), o().getResources().getInteger(R.integer.genre_list_columns));
        this.ai.a((ListAdapter) this.al, (int) R.string.radio_section_genres, 3);
        this.ai.a(1, 2, 3);
        listView.setAdapter(this.ai);
        return listView;
    }

    public final void c(SessionState sessionState) {
        this.aq.b();
        if (sessionState.canStream()) {
            super.c(sessionState);
        }
    }

    public final String e() {
        return "radio";
    }

    public final void h() {
        super.h();
        this.ar.a();
        this.ah.b();
        this.aq.b();
    }
}
