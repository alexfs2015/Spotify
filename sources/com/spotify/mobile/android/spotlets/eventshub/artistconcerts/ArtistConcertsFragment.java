package com.spotify.mobile.android.spotlets.eventshub.artistconcerts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.music.R;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ArtistConcertsFragment extends mis<ArtistConcertsModel> implements iuf {
    public iuc T;
    public jtz U;
    public hxx V;
    public ivz W;
    iue X;
    private List<ConcertResult> Y;
    private List<ConcertResult> Z;
    public iug a;
    /* access modifiers changed from: private */
    public RecyclerView aa;
    /* access modifiers changed from: private */
    public vhx ab;
    private String ac;
    private int af;
    private String ag;
    private sso ah;
    private final OnClickListener ai = new OnClickListener() {
        public final void onClick(View view) {
            ArtistConcertsFragment.this.X.b();
        }
    };
    private fsm aj;
    private final OnClickListener ak = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            ConcertResult concertResult = (ConcertResult) view.getTag();
            int e = ArtistConcertsFragment.this.aa.b(view).e() - ArtistConcertsFragment.this.ab.g(((Boolean) fbp.a(concertResult.getNearUser())).booleanValue() ? 4 : 6);
            iue iue = ArtistConcertsFragment.this.X;
            StringBuilder sb = new StringBuilder("spotify:concert:");
            sb.append(concertResult.getConcert().getId());
            String sb2 = sb.toString();
            if (((Boolean) fbp.a(concertResult.getNearUser())).booleanValue()) {
                str = "nearyou-listing";
            } else {
                String str2 = "uesvgteeoiistlnsrnh";
                str = "othervenues-listing";
            }
            String str3 = str;
            String str4 = str;
            iuc iuc = iue.a;
            String str5 = "ith";
            bg bgVar = r6;
            bg bgVar2 = r6;
            bg bgVar3 = r6;
            bg bgVar4 = new bg(iue.c, iue.b.a(), null, str4, (long) e, sb2, "hit", null, (double) jtp.a.a());
            iuc.a.a(bgVar3);
            iue.a().a(concertResult);
        }
    };
    public lbr b;

    enum Section {
        ARTISTS_CONCERTS_NEAR_USER(R.string.artist_concerts_near_user_location, 1, 4),
        ARTIST_CONCERTS_OTHER_LOCATIONS(R.string.artist_concerts_other_locations, 5, 6);
        
        public final int mBodyId;
        public final int mHeaderId;
        public final int mHeaderResId;

        private Section(int i, int i2, int i3) {
            this.mHeaderResId = i;
            this.mHeaderId = i2;
            this.mBodyId = i3;
        }
    }

    public static ArtistConcertsFragment b(String str) {
        fbp.a(str);
        sso a2 = ViewUris.aJ.a(str);
        ArtistConcertsFragment artistConcertsFragment = new ArtistConcertsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", a2);
        artistConcertsFragment.g(bundle);
        return artistConcertsFragment;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.aa = new RecyclerView(p());
        this.aa.a((i) new LinearLayoutManager(p()));
        this.aa.a((h) new iux((int) o().getResources().getDimension(R.dimen.concerts_list_bottom_padding)), -1);
        this.ab = new vhx(true);
        return this.aa;
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        CharSequence charSequence;
        String str;
        ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) parcelable;
        this.ag = artistConcertsModel.getArtist().getName();
        this.b.a(this, this.ag);
        List<ConcertResult> concerts = artistConcertsModel.getConcerts();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        for (ConcertResult concertResult : concerts) {
            if (((Boolean) fbp.a(concertResult.getNearUser())).booleanValue()) {
                this.Y.add(concertResult);
            } else {
                this.Z.add(concertResult);
            }
        }
        String userLocation = artistConcertsModel.getUserLocation();
        this.aj = fqv.e().a(p(), null);
        if (fbo.a(userLocation)) {
            charSequence = a((int) R.string.artist_concerts_near_you);
            str = a((int) R.string.artist_concerts_no_concerts_near_you);
        } else {
            String a2 = a(Section.ARTISTS_CONCERTS_NEAR_USER.mHeaderResId, userLocation);
            String a3 = a((int) R.string.artist_concerts_no_concerts_near_user_location, userLocation);
            CharSequence charSequence2 = a2;
            CharSequence charSequence3 = a2;
            CharSequence charSequence4 = a3;
            str = a3;
            CharSequence charSequence5 = charSequence3;
            charSequence = charSequence3;
        }
        this.aj.a(charSequence);
        this.ab.a((a<H>) new jog<H>(this.aj.getView(), true), Section.ARTISTS_CONCERTS_NEAR_USER.mHeaderId);
        int dimension = (int) o().getResources().getDimension(R.dimen.std_8dp);
        if (this.Y.isEmpty()) {
            LinearLayout linearLayout = new LinearLayout(n());
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            linearLayout.setGravity(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(dimension, 0, dimension, dimension);
            TextView a4 = gat.a(n());
            a4.setTextSize(2, 14.0f);
            a4.setTextColor(fr.c(n(), R.color.glue_row_subtitle_color));
            a4.setText(str);
            linearLayout.addView(a4);
            this.ab.a((a<H>) new jog<H>(linearLayout, true), 2);
        }
        LinearLayout linearLayout2 = new LinearLayout(n());
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, 0, 0, dimension);
        linearLayout2.setLayoutParams(layoutParams2);
        Button b2 = gat.b(p());
        b2.setLayoutParams(new LayoutParams(-2, -2));
        b2.setText(p().getString(R.string.events_hub_location_button_text));
        b2.setOnClickListener(this.ai);
        linearLayout2.addView(b2);
        this.ab.a((a<H>) new jog<H>(linearLayout2), 3);
        Calendar f = this.U.f();
        if (this.Y.size() > 0) {
            vhx vhx = this.ab;
            iuv iuv = r4;
            Calendar calendar = f;
            iuv iuv2 = new iuv(p(), this.Y, this.ak, f, new iwh(o().getResources()), this.U);
            vhx.a((a<H>) iuv2, Section.ARTISTS_CONCERTS_NEAR_USER.mBodyId);
        }
        if (this.Z.size() > 0) {
            fsm a5 = fqv.e().a(p(), null);
            a5.a((CharSequence) a(Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mHeaderResId));
            this.ab.a((a<H>) new jog<H>(a5.getView(), true), Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mHeaderId);
            vhx vhx2 = this.ab;
            iuv iuv3 = r4;
            Calendar calendar2 = f;
            iuv iuv4 = new iuv(p(), this.Z, this.ak, f, new iwh(o().getResources()), this.U);
            vhx2.a((a<H>) iuv4, Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mBodyId);
        }
        this.aa.a((a) this.ab);
    }

    public final void a(ConcertResult concertResult) {
        String str = "posy:n:tfiroctsc";
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertResult.getConcert().getId());
        n().startActivity(kpo.a(n(), sb.toString()).a);
    }

    public final sso ae_() {
        return this.ah;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.CONCERTS_ARTIST, null);
    }

    public final uqm ag() {
        return uqo.g;
    }

    public final mit<ArtistConcertsModel> ah() {
        iug iug = this.a;
        this.X = new iue(xim.a(wit.a((SingleSource<T>) iug.a.a(this.ac, iug.b(this.af), false))), wit.a((xfk<T>) this.V.a), this.T, ag());
        return this.X;
    }

    public final void aj() {
        p().startActivity(kpo.a(p(), iwa.b).a);
    }

    public final String b(Context context) {
        String str = "";
        return "";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ah = (sso) fbp.a(this.i.getParcelable("artist_uri"));
        this.ac = new ArtistUri(this.ah.toString()).a;
        this.af = this.W.a().mGeonameId;
    }
}
