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
import defpackage.fys;

/* renamed from: qbs reason: default package */
public abstract class qbs<T extends fys> extends AbstractContentFragment<RadioStationModel, View> implements fzq {
    /* access modifiers changed from: 0000 */
    public String Z;
    protected View aa;
    protected String ab;
    urx ac;
    /* access modifiers changed from: 0000 */
    public fyk<T> ad;
    /* access modifiers changed from: 0000 */
    public jsm ae;
    Button af;
    /* access modifiers changed from: 0000 */
    public fqn ag;
    public Player ah;
    public lon ai;
    public hhc aj;
    public jpc ak;
    public Picasso al;
    public hjw am;
    public ure an;
    public heg ao;
    private String ap;
    /* access modifiers changed from: private */
    public qco aq;
    private String ar;
    private HeaderView as;
    /* access modifiers changed from: private */
    public jts at;
    /* access modifiers changed from: private */
    public qbp au;
    private xip av = xon.b();
    /* access modifiers changed from: private */
    public xip aw = xon.b();
    /* access modifiers changed from: private */
    public boolean ax;
    private final OnItemClickListener ay = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - qbs.this.ad.e().a.getHeaderViewsCount();
            if (headerViewsCount >= 0) {
                int a2 = qbs.this.ae.a(headerViewsCount);
                if (a2 == 1) {
                    int a3 = qbs.this.ae.a(headerViewsCount, a2);
                    if (jus.c(qbs.this.ag)) {
                        Assertion.a((Object) qbs.this.au);
                        qbp d = qbs.this.au;
                        PlayerTrack[] playerTrackArr = new PlayerTrack[d.c.getCount()];
                        for (int i2 = 0; i2 < d.c.getCount(); i2++) {
                            playerTrackArr[i2] = (PlayerTrack) d.c.getItem(i2);
                        }
                        RadioStationModel radioStationModel = (RadioStationModel) fbp.a(qbs.this.Y);
                        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel, new RadioStationTracksModel(playerTrackArr, ute.a(radioStationModel.nextPageUrl, playerTrackArr)));
                        PlayerTrack playerTrack = playerTrackArr[a3];
                        if (!PlayerTrackUtil.isExplicit(playerTrack) || !qbs.this.ax) {
                            qbs.this.Y = radioStationModel2;
                            ure ure = qbs.this.an;
                            sso ae_ = qbs.this.ae_();
                            qbs qbs = qbs.this;
                            ure.a(radioStationModel2, ae_, uqo.aI, a.a((jqx) qbs.this), a3);
                            return;
                        }
                        qbs.this.ai.a(playerTrack.uri(), qbs.this.Z);
                    } else {
                        ShufflePlayHeaderView.a(qbs.this.at, qbs.this.aq.a(false));
                    }
                }
            }
        }
    };

    public static qbs<?> a(String str, String str2, fqn fqn, String str3) {
        sso a = ViewUris.ai.a(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("StationFragment.station_uri", a);
        bundle.putString("StationFragment.station_title", str2);
        bundle.putLong("StationFragment.station_random", jtp.a.a());
        bundle.putString("username", str3);
        qbs<?> qbt = (ViewUris.ak.b(str) || ViewUris.am.b(str)) ? new qbt<>() : new qcd<>();
        qbt.g(bundle);
        fqo.a((Fragment) qbt, fqn);
        return qbt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.ax = bool.booleanValue();
        qbp qbp = this.au;
        if (qbp != null) {
            qbo qbo = qbp.c;
            qbo.b = bool.booleanValue();
            qbo.notifyDataSetChanged();
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = ViewUris.ak.b(this.Z) || ViewUris.am.b(this.Z);
        int i = z ? R.string.header_play : R.string.header_play_radio;
        int i2 = z ? R.string.header_pause : R.string.header_pause_radio;
        this.ag = fqo.a((Fragment) this);
        qco qco = new qco((Context) fbp.a(p()), ae_(), viewGroup, i, i2, jvi.b(p()), uqo.aX, a.a((jqx) this), this.ah, this.an, this.ao.a());
        this.aq = qco;
        return super.a(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: protected */
    public abstract fyk<T> a(boolean z, HeaderView headerView);

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ac = new urx(((kf) fbp.a(p())).getApplicationContext(), new RadioStateObserver() {
            public final void a() {
            }

            public final void a(RadioStationsModel radioStationsModel) {
                qbs.this.a(radioStationsModel);
            }

            public final void a(usi usi) {
            }
        }, getClass().getSimpleName(), this.am);
    }

    public void a(a aVar) {
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(SpotifyIconV2.RADIO, R.string.radio_station_entity_error_title, R.string.radio_station_entity_error_body).b(R.string.radio_station_entity_error_title, R.string.radio_station_entity_error_body);
    }

    public void a(AbstractContentFragment.a<RadioStationModel> aVar) {
        aVar.getClass();
        final $$Lambda$zxQEUqEeYaD0C0nmTrLuhKfwCNI r0 = new $$Lambda$zxQEUqEeYaD0C0nmTrLuhKfwCNI(aVar);
        final $$Lambda$qbs$HehPEF3tTLaSgjHqUO8ExNIUT7o r1 = new $$Lambda$qbs$HehPEF3tTLaSgjHqUO8ExNIUT7o(aVar);
        if (this.ac.c()) {
            this.aw.unsubscribe();
            this.aw = this.ac.a(ae_()).a(wit.a(this.aj.c())).a((xis<? super T>) r0, (xis<Throwable>) r1);
            return;
        }
        this.ac.a(new a<RadioActionsService.a>() {
            public final /* synthetic */ void a(Object obj) {
                qbs.this.aw.unsubscribe();
                qbs qbs = qbs.this;
                qbs.aw = qbs.ac.a(qbs.this.ae_()).a(wit.a(qbs.this.aj.c())).a(r0, r1);
                qbs.this.ac.b(this);
            }

            public final void e() {
                qbs.this.ac.b(this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public abstract void a(RadioStationModel radioStationModel);

    /* access modifiers changed from: protected */
    public void a(RadioStationModel radioStationModel, View view) {
        Drawable drawable;
        qbp qbp = this.au;
        if (qbp != null) {
            qbp.e.b();
        }
        qbp qbp2 = new qbp((Activity) fbp.a(p()), this.ap, ae_(), this.ag, this.ak, ((Bundle) fbp.a(this.i)).getLong("StationFragment.station_random"));
        this.au = qbp2;
        qbp2.e.a();
        this.ae = new jsm(p());
        this.av.unsubscribe();
        this.av = this.ai.a().a(wit.a(this.aj.c())).a((xis<? super T>) new $$Lambda$qbs$YaXP3i3illCgWGFLsgKARWGifI<Object>(this), (xis<Throwable>) $$Lambda$qbs$tJPW_s7JXC5hvCqF4kBgdud7k.INSTANCE);
        a(this.ae);
        View inflate = LayoutInflater.from(p()).inflate(R.layout.station_footer, this.ad.e().a, false);
        if (ViewUris.ak.b(this.Z) || ViewUris.am.b(this.Z)) {
            this.ae.a((ListAdapter) qbp2.c, (String) null, 1, (View) null, inflate);
        } else {
            this.ae.a((ListAdapter) qbp2.c, jus.c(this.ag) ? R.string.station_track_list_header : R.string.station_track_list_header_mft, 1, (View) null, inflate);
        }
        this.ad.e().a.setAdapter(this.ae);
        this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(vhj.a(this.ad.d(), (vha) this.ad.g()));
        jva a = jva.a(this.ap);
        kf kfVar = (kf) fbp.a(p());
        switch (a.b) {
            case ALBUM:
                drawable = gaa.b(kfVar);
                break;
            case TRACK:
                drawable = gaa.d(kfVar);
                break;
            case PLAYLIST_V2:
            case PROFILE_PLAYLIST:
                drawable = gaa.e(kfVar);
                break;
            case BROWSE_GENRES:
                drawable = gaa.b((Context) kfVar, SpotifyIcon.BROWSE_32);
                break;
            case CLUSTER:
            case DAILYMIX:
                drawable = gaa.a((Context) kfVar, SpotifyIconV2.MIX, (float) vfj.b(32.0f, kfVar.getResources()));
                break;
            default:
                drawable = gaa.a(kfVar);
                break;
        }
        ImageView c = this.ad.c();
        if (a.b == LinkType.ARTIST) {
            fbp.a(c);
            this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(drawable).b(drawable).a(vhj.a(c));
            c.setScaleType(ScaleType.CENTER_CROP);
        } else {
            this.al.a(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).a(drawable).b(drawable).a(c);
        }
        ((fys) this.ad.a()).a(radioStationModel.title);
        if (!ViewUris.ak.b(this.Z) && !ViewUris.am.b(this.Z)) {
            if (jvi.b(p())) {
                this.as.a(vfj.a(168.0f, o().getResources()), vfj.a(168.0f, o().getResources()));
                this.as.a.setBackgroundResource(R.drawable.station_entity_header);
                View view2 = this.as.d;
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                layoutParams.topMargin = vfj.b(-26.0f, o().getResources());
                view2.setLayoutParams(layoutParams);
                this.as.e = vfj.a(88.0f, o().getResources());
            } else {
                this.as.a(vfj.a(300.0f, o().getResources()), vfj.a(210.0f, o().getResources()));
                this.as.a.setBackgroundResource(R.drawable.station_entity_header);
                LayoutParams layoutParams2 = (LayoutParams) this.as.c.getLayoutParams();
                layoutParams2.setMargins(0, vfj.a(-26.0f, o().getResources()), 0, 0);
                this.as.c.setLayoutParams(layoutParams2);
                this.as.c.setPadding(0, 0, 0, 0);
                this.as.e = vfj.a(140.0f, o().getResources());
            }
        }
        a(radioStationModel);
        ((Bundle) fbp.a(this.i)).putString("StationFragment.station_title", radioStationModel.title);
        D b = b(radioStationModel);
        this.Y = b;
        PlayerTrack[] playerTrackArr = b.tracks;
        if (playerTrackArr == null || playerTrackArr.length == 0) {
            this.ae.a(1);
        } else {
            Assertion.a((Object) this.au);
            this.au.c.clear();
            this.au.a(playerTrackArr);
        }
        this.aq.a((RadioStationModel) b);
    }

    /* access modifiers changed from: protected */
    public abstract void a(RadioStationsModel radioStationsModel);

    public void a(fzn fzn) {
        if (jvi.b(p())) {
            qco qco = this.aq;
            if (qco.b) {
                qco.a = fzn;
            }
            this.aq.a(true);
        }
        fyk<T> fyk = this.ad;
        if (fyk != null) {
            fyk.a(fzn, p());
        }
    }

    /* access modifiers changed from: protected */
    public void a(jsm jsm) {
    }

    public final /* bridge */ /* synthetic */ boolean a(Parcelable parcelable) {
        RadioStationModel radioStationModel = (RadioStationModel) parcelable;
        return radioStationModel == null || (fbo.a(radioStationModel.title) && fbo.a(radioStationModel.titleUri));
    }

    public void aP_() {
        super.aP_();
        this.aq.l.a();
        qbp qbp = this.au;
        if (qbp != null) {
            qbp.e.a();
        }
        ((fys) this.ad.a()).a(this.ar);
        this.ac.a();
    }

    public final sso ae_() {
        return (sso) fbp.a(((Bundle) fbp.a(this.i)).getParcelable("StationFragment.station_uri"));
    }

    public final uqm ag() {
        return uqo.aI;
    }

    /* access modifiers changed from: protected */
    public abstract Button ah();

    public final void aw_() {
        super.aw_();
    }

    /* access modifiers changed from: protected */
    public RadioStationModel b(RadioStationModel radioStationModel) {
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, radioStationModel.explicitSave);
        return radioStationModel2;
    }

    public String b(Context context) {
        return fbo.a(this.ar) ? context.getString(R.string.radio_title) : this.ar;
    }

    public void b(Bundle bundle) {
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        sso ae_ = ae_();
        String string = bundle2.getString("StationFragment.station_title");
        this.Z = ae_.toString();
        this.ar = string;
        this.ap = ute.d(this.Z);
        super.b(bundle);
        this.ag = fqo.a((Fragment) this);
        c(true);
        this.at = new jts();
        this.ab = bundle2.getString("username", "");
    }

    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kf kfVar = (kf) fbp.a(p());
        this.as = new HeaderView(kfVar);
        this.af = ah();
        if (jvi.b(kfVar)) {
            this.ad = a(true, this.as);
        } else {
            this.aa = this.aq.a(false);
            this.ad = a(false, this.as);
        }
        this.ad.a((View) null);
        this.ad.e().a.setOnItemClickListener(this.ay);
        this.ad.e().a.setOnItemLongClickListener(new jop(kfVar, ae_()));
        return this.ad.b();
    }

    public void h() {
        super.h();
        this.aq.l.b();
        qbp qbp = this.au;
        if (qbp != null) {
            qbp.e.b();
        }
        this.ac.b();
        this.aw.unsubscribe();
        this.av.unsubscribe();
    }
}
