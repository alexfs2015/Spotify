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
import com.spotify.music.features.radio.common.AbstractContentFragment.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.toastie.ToastieManager;
import com.squareup.picasso.Picasso;

/* renamed from: ptd reason: default package */
public class ptd extends AbstractContentFragment<RadioStationsModel, ListView> implements NavigationItem, spl {
    public jsz Z;
    public ToastieManager aa;
    public jro ab;
    public mbl ac;
    public DisplayMetrics ad;
    public Picasso ae;
    private final wun<SessionState> af = new $$Lambda$ptd$Sg8mt4_iqS16wM8ot6Tdp7KuDjI(this);
    private pto ag;
    private jqb ah;
    /* access modifiers changed from: private */
    public psp ai;
    private psp aj;
    private ptn<pso> ak;
    private String al;
    private fpt am;
    private RecyclerView an;
    private RecyclerView ao;
    private ugj ap;
    private final xag aq = new xag();

    public final void a(a<RadioStationsModel> aVar) {
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

    public final String e() {
        return "radio";
    }

    public final /* synthetic */ void a(Parcelable parcelable, View view) {
        RadioStationsModel radioStationsModel = (RadioStationsModel) parcelable;
        this.ai.a(radioStationsModel.userStations());
        this.ah.c(1);
        if (this.ai.b() == 0) {
            this.ah.a(1);
        }
        this.aj.a(radioStationsModel.recommendedStations());
        this.ah.c(2);
        ((pso) this.ak.a).setNotifyOnChange(false);
        ((pso) this.ak.a).clear();
        ((pso) this.ak.a).addAll(radioStationsModel.genreStations());
        ((pso) this.ak.a).notifyDataSetChanged();
        this.ah.c(3);
    }

    public final /* synthetic */ boolean a(Parcelable parcelable) {
        RadioStationsModel radioStationsModel = (RadioStationsModel) parcelable;
        return radioStationsModel == null || (radioStationsModel.userStations().isEmpty() && radioStationsModel.recommendedStations().isEmpty() && radioStationsModel.genreStations().isEmpty());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(SessionState sessionState) {
        ((ka) fay.a(p())).ak_();
        this.U.b(!sessionState.canStream());
    }

    public static ptd a(String str, fpt fpt, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("title", null);
        bundle.putString("username", str2);
        ptd ptd = new ptd();
        ptd.g(bundle);
        fpu.a((Fragment) ptd, fpt);
        return ptd;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.al = ((Bundle) fay.a(this.i)).getString("title");
        this.am = fpu.a((Fragment) this);
        this.ag = new pto() {
            public final boolean a(PlayerState playerState, PlayerState playerState2) {
                return b(playerState, playerState2) || c(playerState, playerState2);
            }

            public final void a(PlayerState playerState) {
                if (ptd.this.ai != null) {
                    ptd.this.ai.d = playerState.entityUri();
                    ptd.this.ai.e = !playerState.isPaused();
                    ptd.this.ai.e();
                }
            }
        };
    }

    public final void g() {
        super.g();
        this.ag.a();
        this.aq.a(vun.a((wrf<T>) this.V.a).a(this.af, (wun<Throwable>) $$Lambda$ptd$rTb4yQviiM5UwYJbpptEy7J1pI.INSTANCE));
    }

    public final void h() {
        super.h();
        this.aq.a();
        this.ag.b();
        this.ap.b();
    }

    public final boolean a(SessionState sessionState) {
        return super.a(sessionState) && sessionState.canStream();
    }

    public final void b(SessionState sessionState) {
        super.b(sessionState);
        this.ap.a();
    }

    public final void c(SessionState sessionState) {
        this.ap.b();
        if (sessionState.canStream()) {
            super.c(sessionState);
        }
    }

    public final void a(fuj fuj, ContentState contentState) {
        int i = 0;
        boolean z = contentState == ContentState.SERVICE_WARNING && this.ab.g();
        Button V_ = this.b.V_();
        if (!z) {
            i = 8;
        }
        V_.setVisibility(i);
    }

    private psp a(int i, int i2, boolean z) {
        psp psp = new psp((ka) fay.a(p()), ViewUris.d, z, this.am, this.W, this.Z, this.aa, this.ae);
        RecyclerView ao2 = ao();
        if (i2 == 1 || i2 == 2) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            ao2.a((i) linearLayoutManager);
            a(ao2, (i) linearLayoutManager);
            if (i2 == 1) {
                this.an = ao2;
            } else {
                this.ao = ao2;
            }
        }
        ao2.a((RecyclerView.a) psp);
        this.ah.a((ListAdapter) new jlv(ao2), a(i), i2);
        return psp;
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.V_().setText(R.string.header_radio_button_get_premium);
        this.b.a(true);
        ka kaVar = (ka) fay.a(p());
        this.b.V_().setOnClickListener(new $$Lambda$ptd$056ot5lbiZHJR1cPm4fUcK5ppbQ(this, kaVar));
        this.ap = new ugj(kaVar.getApplicationContext(), new RadioStateObserver() {
            public final void a(ugu ugu) {
            }

            public final void a(RadioStationsModel radioStationsModel) {
                ptd.this.a.a(radioStationsModel);
            }

            public final void a() {
                ptd.this.a.a();
            }
        }, getClass().getSimpleName());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ka kaVar, View view) {
        this.ac.a(kaVar);
    }

    public final String b(Context context) {
        String str = this.al;
        return str == null ? context.getString(R.string.radio_title) : str;
    }

    public final void a(ContentViewManager.a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.header_radio_offline_body).b(SpotifyIconV2.RADIO, R.string.error_general_title, R.string.error_general_body).b(R.string.your_radio_stations_backend_error_title, R.string.your_radio_stations_backend_error_body).a(SpotifyIconV2.RADIO, R.string.header_radio_not_available_in_region_title, R.string.header_radio_not_available_in_region_body);
    }

    public final udr ag() {
        return udt.aI;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.RADIO, null);
    }

    public final NavigationGroup ah() {
        return NavigationGroup.FIND;
    }

    private RecyclerView ao() {
        int a = uuk.a(this.ad.widthPixels, 3, o().getResources().getDimensionPixelSize(R.dimen.radio_cover_cat_height), uts.b(64.0f, o().getResources()), o().getResources().getDimensionPixelOffset(R.dimen.radio_cover_items_cat_right_gap));
        RecyclerView recyclerView = new RecyclerView((Context) fay.a(p()), null);
        recyclerView.setLayoutParams(new LayoutParams(-1, a));
        return recyclerView;
    }

    public final sih ae_() {
        return ViewUris.d;
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

    public final /* synthetic */ View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ListView listView = new ListView(viewGroup.getContext());
        ka kaVar = (ka) fay.a(p());
        this.ah = new jqb(kaVar);
        this.ah.a = new jpz(kaVar) {
            public final void a(int i, View view, String str, String str2, boolean z) {
                super.a(i, view, str, str2, z);
                ((frs) fqb.a(view, frs.class)).b(z);
            }
        };
        this.ai = a((int) R.string.radio_section_your_stations_station_entity, 1, true);
        this.aj = a((int) R.string.radio_section_recommended_stations, 2, false);
        this.ak = new ptn<>(kaVar, new pso(kaVar, this.W), o().getResources().getInteger(R.integer.genre_list_columns));
        this.ah.a((ListAdapter) this.ak, (int) R.string.radio_section_genres, 3);
        this.ah.a(1, 2, 3);
        listView.setAdapter(this.ah);
        return listView;
    }
}
