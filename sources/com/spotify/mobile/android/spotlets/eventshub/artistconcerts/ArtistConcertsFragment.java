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

public class ArtistConcertsFragment extends uee<ArtistConcertsModel> implements isc {
    public irz T;
    public jrp U;
    public hvl V;
    public itp W;
    isb X;
    private List<ConcertResult> Y;
    private List<ConcertResult> Z;
    public isd a;
    /* access modifiers changed from: private */
    public RecyclerView aa;
    /* access modifiers changed from: private */
    public uwh ab;
    private String ac;
    private int af;
    private String ag;
    private sih ah;
    private final OnClickListener ai = new OnClickListener() {
        public final void onClick(View view) {
            ArtistConcertsFragment.this.X.b();
        }
    };
    private frs aj;
    private final OnClickListener ak = new OnClickListener() {
        public final void onClick(View view) {
            ConcertResult concertResult = (ConcertResult) view.getTag();
            int e = ArtistConcertsFragment.this.aa.b(view).e() - ArtistConcertsFragment.this.ab.g(((Boolean) fay.a(concertResult.getNearUser())).booleanValue() ? 4 : 6);
            isb isb = ArtistConcertsFragment.this.X;
            StringBuilder sb = new StringBuilder("spotify:concert:");
            sb.append(concertResult.getConcert().getId());
            String sb2 = sb.toString();
            String str = ((Boolean) fay.a(concertResult.getNearUser())).booleanValue() ? "nearyou-listing" : "othervenues-listing";
            irz irz = isb.a;
            bh bhVar = r6;
            bh bhVar2 = new bh(isb.c, isb.b.a(), null, str, (long) e, sb2, "hit", null, (double) jrf.a.a());
            irz.a.a(bhVar);
            isb.a().a(concertResult);
        }
    };
    public kyi b;

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

    public final String b(Context context) {
        return "";
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
            if (((Boolean) fay.a(concertResult.getNearUser())).booleanValue()) {
                this.Y.add(concertResult);
            } else {
                this.Z.add(concertResult);
            }
        }
        String userLocation = artistConcertsModel.getUserLocation();
        this.aj = fqb.e().a(p(), null);
        if (fax.a(userLocation)) {
            charSequence = a((int) R.string.artist_concerts_near_you);
            str = a((int) R.string.artist_concerts_no_concerts_near_you);
        } else {
            CharSequence a2 = a(Section.ARTISTS_CONCERTS_NEAR_USER.mHeaderResId, userLocation);
            str = a((int) R.string.artist_concerts_no_concerts_near_user_location, userLocation);
            charSequence = a2;
        }
        this.aj.a(charSequence);
        this.ab.a((a<H>) new jlu<H>(this.aj.getView(), true), Section.ARTISTS_CONCERTS_NEAR_USER.mHeaderId);
        int dimension = (int) o().getResources().getDimension(R.dimen.std_8dp);
        if (this.Y.isEmpty()) {
            LinearLayout linearLayout = new LinearLayout(n());
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            linearLayout.setGravity(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(dimension, 0, dimension, dimension);
            TextView a3 = fzz.a(n());
            a3.setTextSize(2, 14.0f);
            a3.setTextColor(fr.c(n(), R.color.glue_row_subtitle_color));
            a3.setText(str);
            linearLayout.addView(a3);
            this.ab.a((a<H>) new jlu<H>(linearLayout, true), 2);
        }
        LinearLayout linearLayout2 = new LinearLayout(n());
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, 0, 0, dimension);
        linearLayout2.setLayoutParams(layoutParams2);
        Button b2 = fzz.b(p());
        b2.setLayoutParams(new LayoutParams(-2, -2));
        b2.setText(p().getString(R.string.events_hub_location_button_text));
        b2.setOnClickListener(this.ai);
        linearLayout2.addView(b2);
        this.ab.a((a<H>) new jlu<H>(linearLayout2), 3);
        Calendar f = this.U.f();
        if (this.Y.size() > 0) {
            uwh uwh = this.ab;
            iss iss = new iss(p(), this.Y, this.ak, f, new itx(o().getResources()), this.U);
            uwh.a((a<H>) iss, Section.ARTISTS_CONCERTS_NEAR_USER.mBodyId);
        }
        if (this.Z.size() > 0) {
            frs a4 = fqb.e().a(p(), null);
            a4.a((CharSequence) a(Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mHeaderResId));
            this.ab.a((a<H>) new jlu<H>(a4.getView(), true), Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mHeaderId);
            uwh uwh2 = this.ab;
            iss iss2 = new iss(p(), this.Z, this.ak, f, new itx(o().getResources()), this.U);
            uwh2.a((a<H>) iss2, Section.ARTIST_CONCERTS_OTHER_LOCATIONS.mBodyId);
        }
        this.aa.a((a) this.ab);
    }

    public static ArtistConcertsFragment b(String str) {
        fay.a(str);
        sih a2 = ViewUris.aK.a(str);
        ArtistConcertsFragment artistConcertsFragment = new ArtistConcertsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", a2);
        artistConcertsFragment.g(bundle);
        return artistConcertsFragment;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ah = (sih) fay.a(this.i.getParcelable("artist_uri"));
        this.ac = new ArtistUri(this.ah.toString()).a;
        this.af = this.W.a().mGeonameId;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.aa = new RecyclerView(p());
        this.aa.a((i) new LinearLayoutManager(p()));
        this.aa.a((h) new ist((int) o().getResources().getDimension(R.dimen.concerts_list_bottom_padding)), -1);
        this.ab = new uwh(true);
        return this.aa;
    }

    public final sih ae_() {
        return this.ah;
    }

    public final uef<ArtistConcertsModel> ah() {
        isd isd = this.a;
        this.X = new isb(wuh.a(vun.a((SingleSource<T>) isd.a.a(this.ac, isd.b(this.af), false))), vun.a((wrf<T>) this.V.a), this.T, ag());
        return this.X;
    }

    public final void aj() {
        p().startActivity(kmf.a(p(), itq.b).a);
    }

    public final void a(ConcertResult concertResult) {
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertResult.getConcert().getId());
        n().startActivity(kmf.a(n(), sb.toString()).a);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONCERTS_ARTIST, null);
    }

    public final udr ag() {
        return udt.g;
    }
}
