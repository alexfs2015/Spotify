package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager.a;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.paste.widgets.HeaderView;
import com.squareup.picasso.Picasso;
import defpackage.fxy;

/* renamed from: psw reason: default package */
public abstract class psw<T extends fxy> extends AbstractContentFragment<RadioStationModel, View> implements fyw {
    /* access modifiers changed from: 0000 */
    public String Z;
    protected View aa;
    protected String ab;
    ugj ac;
    /* access modifiers changed from: 0000 */
    public fxq<T> ad;
    /* access modifiers changed from: 0000 */
    public jqb ae;
    Button af;
    /* access modifiers changed from: 0000 */
    public fpt ag;
    public Player ah;
    public lkn ai;
    public heg aj;
    public jmq ak;
    public Picasso al;
    private String am;
    /* access modifiers changed from: private */
    public pts an;
    private String ao;
    private HeaderView ap;
    /* access modifiers changed from: private */
    public jri aq;
    /* access modifiers changed from: private */
    public pst ar;
    /* access modifiers changed from: private */
    public ufq as;
    private wuk at = xaj.b();
    /* access modifiers changed from: private */
    public wuk au = xaj.b();
    /* access modifiers changed from: private */
    public boolean av;
    private final OnItemClickListener aw = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - psw.this.ad.e().a.getHeaderViewsCount();
            if (headerViewsCount >= 0) {
                int a2 = psw.this.ae.a(headerViewsCount);
                if (a2 == 1) {
                    int a3 = psw.this.ae.a(headerViewsCount, a2);
                    if (jsl.c(psw.this.ag)) {
                        Assertion.a((Object) psw.this.ar);
                        pst d = psw.this.ar;
                        PlayerTrack[] playerTrackArr = new PlayerTrack[d.c.getCount()];
                        for (int i2 = 0; i2 < d.c.getCount(); i2++) {
                            playerTrackArr[i2] = (PlayerTrack) d.c.getItem(i2);
                        }
                        RadioStationModel radioStationModel = (RadioStationModel) fay.a(psw.this.Y);
                        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel, new RadioStationTracksModel(playerTrackArr, uhq.a(radioStationModel.nextPageUrl, playerTrackArr)));
                        PlayerTrack playerTrack = playerTrackArr[a3];
                        if (!PlayerTrackUtil.isExplicit(playerTrack) || !psw.this.av) {
                            psw.this.Y = radioStationModel2;
                            ufq g = psw.this.as;
                            sih ae_ = psw.this.ae_();
                            psw psw = psw.this;
                            g.a(radioStationModel2, ae_, udt.aI, a.a((jol) psw.this), a3);
                            return;
                        }
                        psw.this.ai.a(playerTrack.uri(), psw.this.Z);
                    } else {
                        ShufflePlayHeaderView.a(psw.this.aq, psw.this.an.a(false));
                    }
                }
            }
        }
    };

    /* access modifiers changed from: protected */
    public abstract fxq<T> a(boolean z, HeaderView headerView);

    /* access modifiers changed from: protected */
    public abstract void a(RadioStationModel radioStationModel);

    /* access modifiers changed from: protected */
    public abstract void a(RadioStationsModel radioStationsModel);

    /* access modifiers changed from: protected */
    public void a(jqb jqb) {
    }

    /* access modifiers changed from: protected */
    public abstract Button ah();

    public final /* bridge */ /* synthetic */ boolean a(Parcelable parcelable) {
        RadioStationModel radioStationModel = (RadioStationModel) parcelable;
        return radioStationModel == null || (fax.a(radioStationModel.title) && fax.a(radioStationModel.titleUri));
    }

    public static psw<?> a(String str, String str2, fpt fpt, String str3) {
        psw<?> psw;
        sih a = ViewUris.aj.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("StationFragment.station_uri", a);
        bundle.putString("StationFragment.station_title", str2);
        bundle.putLong("StationFragment.station_random", jrf.a.a());
        bundle.putString("username", str3);
        if (ViewUris.al.b(str) || ViewUris.an.b(str)) {
            psw = new psx<>();
        } else {
            psw = new pth<>();
        }
        psw.g(bundle);
        fpu.a((Fragment) psw, fpt);
        return psw;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = ViewUris.al.b(this.Z) || ViewUris.an.b(this.Z);
        int i = z ? R.string.header_play : R.string.header_play_radio;
        int i2 = z ? R.string.header_pause : R.string.header_pause_radio;
        this.ag = fpu.a((Fragment) this);
        pts pts = new pts((Context) fay.a(p()), ae_(), viewGroup, i, i2, jtc.b(p()), udt.aX, a.a((jol) this), this.ah);
        this.an = pts;
        return super.a(layoutInflater, viewGroup, bundle);
    }

    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ka kaVar = (ka) fay.a(p());
        this.ap = new HeaderView(kaVar);
        this.af = ah();
        if (jtc.b(kaVar)) {
            this.ad = a(true, this.ap);
        } else {
            this.aa = this.an.a(false);
            this.ad = a(false, this.ap);
        }
        this.ad.a((View) null);
        this.ad.e().a.setOnItemClickListener(this.aw);
        this.ad.e().a.setOnItemLongClickListener(new jmd(kaVar, ae_()));
        return this.ad.b();
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ac = new ugj(((ka) fay.a(p())).getApplicationContext(), new RadioStateObserver() {
            public final void a() {
            }

            public final void a(ugu ugu) {
            }

            public final void a(RadioStationsModel radioStationsModel) {
                psw.this.a(radioStationsModel);
            }
        }, getClass().getSimpleName());
    }

    public void a(a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(SpotifyIconV2.RADIO, R.string.radio_station_entity_error_title, R.string.radio_station_entity_error_body).b(R.string.radio_station_entity_error_title, R.string.radio_station_entity_error_body);
    }

    public void g() {
        super.g();
        this.an.l.a();
        pst pst = this.ar;
        if (pst != null) {
            pst.e.a();
        }
        ((fxy) this.ad.a()).a(this.ao);
        this.ac.a();
    }

    public void h() {
        super.h();
        this.an.l.b();
        pst pst = this.ar;
        if (pst != null) {
            pst.e.b();
        }
        this.ac.b();
        this.au.unsubscribe();
        this.at.unsubscribe();
    }

    public final void ax_() {
        super.ax_();
    }

    public void a(AbstractContentFragment.a<RadioStationModel> aVar) {
        aVar.getClass();
        final $$Lambda$3xypVKHXtCrYUZsxkKynqoJWCx8 r0 = new $$Lambda$3xypVKHXtCrYUZsxkKynqoJWCx8(aVar);
        final $$Lambda$psw$PBIwZjuHxNksFmQkKUr8WbHLLU r1 = new $$Lambda$psw$PBIwZjuHxNksFmQkKUr8WbHLLU(aVar);
        if (this.ac.d()) {
            this.au.unsubscribe();
            this.au = this.ac.a(ae_()).a(vun.a(this.aj.c())).a((wun<? super T>) r0, (wun<Throwable>) r1);
            return;
        }
        this.ac.a(new a<RadioActionsService.a>() {
            public final void e() {
                psw.this.ac.b(this);
            }

            public final /* synthetic */ void a(Object obj) {
                psw.this.au.unsubscribe();
                psw psw = psw.this;
                psw.au = psw.ac.a(psw.this.ae_()).a(vun.a(psw.this.aj.c())).a(r0, r1);
                psw.this.ac.b(this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.av = bool.booleanValue();
        pst pst = this.ar;
        if (pst != null) {
            pss pss = pst.c;
            pss.b = bool.booleanValue();
            pss.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void a(RadioStationModel radioStationModel, View view) {
        Drawable drawable;
        pst pst = this.ar;
        if (pst != null) {
            pst.e.b();
        }
        pst pst2 = new pst((Activity) fay.a(p()), this.am, ae_(), this.ag, this.ak, ((Bundle) fay.a(this.i)).getLong("StationFragment.station_random"));
        this.ar = pst2;
        pst2.e.a();
        this.ae = new jqb(p());
        this.at.unsubscribe();
        this.at = this.ai.a().a(vun.a(this.aj.c())).a((wun<? super T>) new $$Lambda$psw$oSyNb8Rsutelha_Zo9wDLMH_xY<Object>(this), (wun<Throwable>) $$Lambda$psw$IO3BH7da78j8BQ73ncCV9_TSfo.INSTANCE);
        a(this.ae);
        View inflate = LayoutInflater.from(p()).inflate(R.layout.station_footer, this.ad.e().a, false);
        if (ViewUris.al.b(this.Z) || ViewUris.an.b(this.Z)) {
            this.ae.a((ListAdapter) pst2.c, (String) null, 1, (View) null, inflate);
        } else {
            this.ae.a((ListAdapter) pst2.c, jsl.c(this.ag) ? R.string.station_track_list_header : R.string.station_track_list_header_mft, 1, (View) null, inflate);
        }
        this.ad.e().a.setAdapter(this.ae);
        this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(uvt.a(this.ad.d(), (uvj) this.ad.g()));
        jst a = jst.a(this.am);
        ka kaVar = (ka) fay.a(p());
        switch (a.b) {
            case ALBUM:
                drawable = fzg.b(kaVar);
                break;
            case TRACK:
                drawable = fzg.d(kaVar);
                break;
            case PLAYLIST_V2:
            case PROFILE_PLAYLIST:
                drawable = fzg.e(kaVar);
                break;
            case BROWSE_GENRES:
                drawable = fzg.b((Context) kaVar, SpotifyIcon.BROWSE_32);
                break;
            case CLUSTER:
            case DAILYMIX:
                drawable = fzg.a((Context) kaVar, SpotifyIconV2.MIX, (float) uts.b(32.0f, kaVar.getResources()));
                break;
            default:
                drawable = fzg.a(kaVar);
                break;
        }
        ImageView c = this.ad.c();
        if (a.b == LinkType.ARTIST) {
            fay.a(c);
            this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(drawable).b(drawable).a(uvt.a(c));
            c.setScaleType(ScaleType.CENTER_CROP);
        } else {
            this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(drawable).b(drawable).a(c);
        }
        ((fxy) this.ad.a()).a(radioStationModel.title);
        if (!ViewUris.al.b(this.Z) && !ViewUris.an.b(this.Z)) {
            if (jtc.b(p())) {
                this.ap.a(uts.a(168.0f, o().getResources()), uts.a(168.0f, o().getResources()));
                this.ap.a.setBackgroundResource(R.drawable.station_entity_header);
                View view2 = this.ap.d;
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                layoutParams.topMargin = uts.b(-26.0f, o().getResources());
                view2.setLayoutParams(layoutParams);
                this.ap.e = uts.a(88.0f, o().getResources());
            } else {
                this.ap.a(uts.a(300.0f, o().getResources()), uts.a(210.0f, o().getResources()));
                this.ap.a.setBackgroundResource(R.drawable.station_entity_header);
                LayoutParams layoutParams2 = (LayoutParams) this.ap.c.getLayoutParams();
                layoutParams2.setMargins(0, uts.a(-26.0f, o().getResources()), 0, 0);
                this.ap.c.setLayoutParams(layoutParams2);
                this.ap.c.setPadding(0, 0, 0, 0);
                this.ap.e = uts.a(140.0f, o().getResources());
            }
        }
        a(radioStationModel);
        ((Bundle) fay.a(this.i)).putString("StationFragment.station_title", radioStationModel.title);
        D b = b(radioStationModel);
        this.Y = b;
        PlayerTrack[] playerTrackArr = b.tracks;
        if (playerTrackArr == null || playerTrackArr.length == 0) {
            this.ae.a(1);
        } else {
            Assertion.a((Object) this.ar);
            this.ar.c.clear();
            this.ar.a(playerTrackArr);
        }
        this.an.a((RadioStationModel) b);
    }

    /* access modifiers changed from: protected */
    public RadioStationModel b(RadioStationModel radioStationModel) {
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, radioStationModel.explicitSave);
        return radioStationModel2;
    }

    public String b(Context context) {
        return fax.a(this.ao) ? context.getString(R.string.radio_title) : this.ao;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public void a(fyt fyt) {
        if (jtc.b(p())) {
            pts pts = this.an;
            if (pts.b) {
                pts.a = fyt;
            }
            this.an.a(true);
        }
        fxq<T> fxq = this.ad;
        if (fxq != null) {
            fxq.a(fyt, p());
        }
    }

    public final udr ag() {
        return udt.aI;
    }

    public void b(Bundle bundle) {
        Bundle bundle2 = (Bundle) fay.a(this.i);
        sih ae_ = ae_();
        String string = bundle2.getString("StationFragment.station_title");
        this.Z = ae_.toString();
        this.ao = string;
        this.am = uhq.e(this.Z);
        super.b(bundle);
        this.ag = fpu.a((Fragment) this);
        c(true);
        this.as = (ufq) ggw.a(ufq.class);
        this.aq = new jri();
        this.ab = bundle2.getString("username", "");
    }

    public final sih ae_() {
        return (sih) fay.a(((Bundle) fay.a(this.i)).getParcelable("StationFragment.station_uri"));
    }
}
