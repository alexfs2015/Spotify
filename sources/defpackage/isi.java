package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.eventshub.concertentity.TicketInfoViewHolder;
import com.spotify.mobile.android.spotlets.eventshub.concertentity.TicketInfoViewHolder.Partner;
import com.spotify.mobile.android.spotlets.eventshub.concertentity.TicketInfoViewHolder.Partner.Type;
import com.spotify.mobile.android.spotlets.eventshub.model.Artist;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertPartner;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertTicketing;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.HeaderView;
import io.reactivex.SingleSource;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: isi reason: default package */
public class isi extends uee<ConcertEntityModel> implements d, fyw, isr, upu {
    public isd T;
    public gyl U;
    public Calendar V;
    public iww W;
    public gum X;
    public jjf Y;
    public kyi Z;
    uwh a;
    public jrp aa;
    public hvl ab;
    public jwv ac;
    private TextView af;
    private TextView ag;
    private View ah;
    private boolean ai;
    private int aj;
    private TicketInfoViewHolder ak;
    private TextView al;
    private sih am;
    private String an;
    private List<isw> ao = Collections.emptyList();
    /* access modifiers changed from: private */
    public iso ap;
    private fxq<fxx> aq;
    /* access modifiers changed from: private */
    public RecyclerView ar;
    private final OnClickListener as = new OnClickListener() {
        public final void onClick(View view) {
            u b = isi.this.ar.b(view);
            ConcertResult concertResult = (ConcertResult) view.getTag();
            int e = b.e() - isi.this.a.g(6);
            iso b2 = isi.this.ap;
            Integer valueOf = Integer.valueOf(e);
            isn isn = b2.a;
            String str = (String) fay.a(((ConcertEntityModel) b2.d()).getUpcomingConcertsSource());
            String str2 = (String) fay.a(concertResult.getConcert().getId());
            StringBuilder sb = new StringBuilder("related-shows");
            sb.append('-');
            sb.append(str);
            StringBuilder sb2 = new StringBuilder("spotify:concert:");
            sb2.append(str2);
            isn.a(sb.toString(), valueOf.intValue(), sb2.toString());
            b2.a().a(concertResult);
        }
    };
    private final OnClickListener at = new OnClickListener() {
        public final void onClick(View view) {
            iso b = isi.this.ap;
            b.a.a("goto-eventhub", -1, ith.a);
            b.a().ak();
        }
    };
    public isg b;

    public final String b(Context context) {
        return "";
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        String str;
        String str2;
        String str3;
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) parcelable;
        this.Z.ap_();
        ((fxx) this.aq.a()).a(this.ap.a(concertEntityModel));
        Concert concert = (Concert) fay.a(concertEntityModel.getConcertResult().getConcert());
        String venue = concert.getVenue();
        String location = concert.getLocation();
        String dateString = concert.getDateString();
        Locale locale = new Locale(gnd.a(Locale.getDefault()));
        Date a2 = dateString != null ? itw.a(dateString, "yyyy-MM-dd'T'HH:mm:ss", locale, this.V) : null;
        String a3 = itw.a(venue, location);
        Calendar calendar = this.V;
        calendar.setTime(a2);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            str2 = DateFormat.format("EEE, MMM dd", a2).toString();
            int i = calendar.get(12);
            str = new SimpleDateFormat("h:mm a", locale).format(a2);
            if (i == 0) {
                str = DateFormat.format("h a", a2).toString();
            }
        } else {
            str = java.text.DateFormat.getTimeInstance(3, locale).format(a2);
            str2 = java.text.DateFormat.getDateInstance(0, locale).format(a2);
        }
        boolean z = true;
        String join = TextUtils.join(" • ", new String[]{str2, str});
        String ticketAvailability = concertEntityModel.getTicketAvailability();
        this.af.setText(join);
        this.ag.setText(a3);
        List partnerConcerts = concert.getPartnerConcerts();
        List ticketing = concert.getTicketing();
        String str4 = "";
        String partnerId = (partnerConcerts == null || partnerConcerts.isEmpty()) ? str4 : ((ConcertPartner) partnerConcerts.get(0)).getPartnerId();
        if (ticketing != null && !ticketing.isEmpty()) {
            str4 = ((ConcertTicketing) ticketing.get(0)).getMinPrice();
        }
        Calendar f = this.aa.f();
        String str5 = ConcertEntityModel.TICKETS_NOT_AVAILABLE;
        if (a2 == null || !a2.before(f.getTime())) {
            TicketInfoViewHolder ticketInfoViewHolder = this.ak;
            Partner a4 = Partner.a(partnerId);
            Type b2 = a4.mType;
            Type type = Type.b;
            String str6 = ConcertEntityModel.FEW_TICKETS_LEFT;
            if (b2 == type && ticketAvailability.equals(str6)) {
                ticketInfoViewHolder.b = fzz.a(ticketInfoViewHolder.a);
                isq.a(ticketInfoViewHolder.b, ticketInfoViewHolder.a, fr.c(ticketInfoViewHolder.a, R.color.concert_sunflower_yellow));
                ticketInfoViewHolder.b.setVisibility(8);
                ticketInfoViewHolder.d.addView(ticketInfoViewHolder.b);
                ticketInfoViewHolder.b.setVisibility(0);
                ticketInfoViewHolder.b.setText(ticketInfoViewHolder.a.getText(R.string.events_hub_concert_entity_ticket_selling_fast));
                str3 = ticketInfoViewHolder.a.getString(R.string.events_hub_concert_entity_ticketing_partner_preposition, new Object[]{a4.mName});
                if (!ticketInfoViewHolder.e) {
                    StringBuilder sb = new StringBuilder(" ");
                    sb.append(str3);
                    str3 = sb.toString();
                }
            } else {
                if (a4.mType == Type.b && ticketAvailability.equals(str5)) {
                    str3 = ticketInfoViewHolder.a.getString(R.string.events_hub_concert_entity_sold_out_text, new Object[]{a4.mName});
                } else {
                    if (a4.mType == Type.b && !fax.a(str4)) {
                        str3 = ticketInfoViewHolder.a.getString(R.string.events_hub_concert_entity_ticket_price_with_partner, new Object[]{str4, a4.mName});
                    } else {
                        if (a4.mType == Type.b && !ticketAvailability.equals(str6) && !ticketAvailability.equals(str5)) {
                            str3 = ticketInfoViewHolder.a.getString(R.string.events_hub_concert_entity_ticket_partner, new Object[]{a4.mName});
                        } else {
                            if (a4.mType == Type.a) {
                                str3 = ticketInfoViewHolder.a.getString(R.string.events_hub_concert_entity_ticket_aggregator, new Object[]{a4.mName});
                            }
                        }
                    }
                }
            }
            ticketInfoViewHolder.c = fzz.a(ticketInfoViewHolder.a);
            isq.a(ticketInfoViewHolder.c, ticketInfoViewHolder.a, fr.c(ticketInfoViewHolder.a, R.color.glue_row_subtitle_color));
            ticketInfoViewHolder.c.setText(str3);
            ticketInfoViewHolder.d.addView(ticketInfoViewHolder.c);
        } else {
            this.al.setText(R.string.events_hub_concert_entity_past_concert);
            a(false);
        }
        if (!(ticketAvailability == null || ticketAvailability.isEmpty()) && ticketAvailability.equals(str5)) {
            z = false;
        }
        a(z);
        this.ar.a((h) new isu(this.aj));
        this.ac.a(this.aq.d(), Uri.parse(concertEntityModel.getConcertResult().getConcert().getImageUri()), (uvj) this.aq.g());
        for (isw a5 : this.ao) {
            a5.a(concertEntityModel);
        }
        joj a6 = joj.a((ImageView) fay.a(this.aq.c()), this.aa);
        Resources resources = o().getResources();
        int b3 = uts.b(2.13116544E9f, resources);
        a6.a.setLayoutParams(new LayoutParams(b3, b3));
        ((TextView) a6.a.findViewById(R.id.month)).setTextSize(0, resources.getDimension(R.dimen.concert_entity_header_calendar_month_text_size));
        ((TextView) a6.a.findViewById(R.id.day)).setTextSize(0, resources.getDimension(R.dimen.concert_entity_header_calendar_day_text_size));
        a6.a(a2, locale);
        this.ar.a((a) this.a);
        isg isg = this.b;
        Context n = n();
        Uri parse = Uri.parse(concertEntityModel.getConcertResult().getClickThroughUrl());
        if (n != null && parse != null) {
            isg.a.a(parse);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(true);
    }

    public final void g() {
        super.g();
        this.U.a();
    }

    public final void B() {
        super.B();
        this.ac.a();
    }

    public final Uri au_() {
        return Uri.parse(this.am.toString());
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        String str;
        String str2;
        Uri uri;
        if (u()) {
            fxq<fxx> fxq = this.aq;
            if (fxq != null) {
                fxq.a(fyt, p());
            }
            ConcertEntityModel concertEntityModel = (ConcertEntityModel) (this.ad == null ? null : this.ad.d());
            String str3 = "";
            Uri parse = !TextUtils.isEmpty(str3) ? Uri.parse(str3) : Uri.EMPTY;
            if (concertEntityModel != null) {
                String a2 = this.ap.a(concertEntityModel);
                if (!concertEntityModel.getArtists().isEmpty()) {
                    str3 = ((Artist) concertEntityModel.getArtists().get(0)).getImageUri();
                }
                Uri parse2 = !TextUtils.isEmpty(str3) ? Uri.parse(str3) : Uri.EMPTY;
                str = concertEntityModel.getConcertResult().getConcert().getVenue();
                str2 = a2;
                uri = parse2;
            } else {
                str2 = str3;
                str = str2;
                uri = parse;
            }
            fyt.a(str3, SpotifyIconV2.ARTIST, true);
            fyt.b(str2);
            fyt.c(str);
            String sih = this.am.toString();
            fyu a3 = fyt.a(R.id.actionbar_item_share_concert, fyt.a().getString(R.string.actionbar_item_share)).a((Drawable) new SpotifyIconDrawable(fyt.a(), SpotifyIconV2.SHARE_ANDROID, (float) fyt.a().getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size)));
            $$Lambda$isi$ZVXrLX5kGX26ffPLaak6ZCyDiYY r2 = new $$Lambda$isi$ZVXrLX5kGX26ffPLaak6ZCyDiYY(this, sih, uri, str2, str);
            a3.a((Runnable) r2);
        }
    }

    public final sih ae_() {
        return this.am;
    }

    public final uef<ConcertEntityModel> ah() {
        isn isn = new isn(this.Y, ag().a(), this.am.toString());
        isd isd = this.T;
        this.ap = new iso(wuh.a(vun.a((SingleSource<T>) isd.a.a(this.an))), vun.a((wrf<T>) this.ab.a), isn, new itx(p().getResources()));
        return this.ap;
    }

    public final udr ag() {
        return udt.ak;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONCERTS_CONCERT, null);
    }

    public static isi a(fpt fpt, String str, String str2) {
        sih a2 = ViewUris.ad.a(str);
        isi isi = new isi();
        fpu.a((Fragment) isi, fpt);
        Bundle bundle = isi.i;
        bundle.putParcelable("concert_uri", a2);
        bundle.putString("concert_id", str2);
        return isi;
    }

    public final void a(ConcertResult concertResult) {
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertResult.getConcert().getId());
        n().startActivity(kmf.a(n(), sb.toString()).a);
    }

    public final void ak() {
        n().startActivity(kmf.a(n(), ith.a).a);
    }

    public final void a(Uri uri) {
        p().startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    private void a(boolean z) {
        if (z) {
            this.aq.b(this.ah);
            this.aj = (int) o().getResources().getDimension(R.dimen.concerts_entity_recyclerview_top_padding);
            return;
        }
        this.ah.setVisibility(8);
        this.aq.b((View) null);
        this.aj = 0;
    }

    public final void h() {
        this.U.b();
        fpg fpg = this.b.a;
        Logger.b("stop", new Object[0]);
        if (fpg.b != null) {
            fpg.b.bf_();
            fpg.b = null;
        }
        super.h();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Uri uri, String str2, String str3) {
        String str4 = str;
        new isn(this.Y, udt.ak.a(), str).a("share-concert", -1, "");
        this.W.a(str4, uri, (String) null, str2, str3, (String) null, jnu.a);
    }

    public final void a(Context context) {
        this.am = (sih) fay.a(this.i.getParcelable("concert_uri"));
        this.an = (String) fay.a(this.i.getString("concert_id"));
        super.a(context);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c cVar;
        Button f = fzz.f(p());
        f.setText(R.string.events_hub_concert_entity_find_tickets_button);
        this.ah = f;
        this.ah.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                Uri uri;
                iso b = isi.this.ap;
                ConcertEntityModel concertEntityModel = (ConcertEntityModel) b.d();
                if (concertEntityModel != null) {
                    uri = Uri.parse(concertEntityModel.getConcertResult().getClickThroughUrl());
                } else {
                    uri = Uri.EMPTY;
                }
                b.a.a("findtickets", -1, String.valueOf(uri));
                b.a().a(uri);
            }
        });
        if (jtc.b(p())) {
            cVar = fxq.b((Context) p());
            this.ai = true;
        } else {
            cVar = fxq.a((Context) p());
            this.ai = false;
        }
        HeaderView headerView = new HeaderView(p(), null);
        b a2 = cVar.a();
        a2.a(null, 0, 5);
        this.aq = new a(a2.a, a2.b).b(true).b(this.ah).a((uvx) headerView).a((Fragment) this);
        Context n = n();
        int dimension = (int) n.getResources().getDimension(R.dimen.concert_entity_calendar_icon_size);
        headerView.e = dimension;
        ((FrameLayout) ((ImageView) fay.a(this.aq.c())).getParent()).setLayoutParams(new LinearLayout.LayoutParams(dimension, dimension));
        LinearLayout a3 = ((fxx) this.aq.a()).a();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        a3.setLayoutParams(layoutParams);
        a3.setOrientation(1);
        int c = fr.c(n(), R.color.glue_row_subtitle_color);
        int dimension2 = (int) n.getResources().getDimension(R.dimen.concert_entity_subtitle_text_line_spacing);
        this.af = fzz.a(n);
        isq.a(this.af, n, c);
        a3.addView(this.af);
        this.ag = fzz.a(n);
        isq.a(this.ag, n, c);
        a3.addView(this.ag);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ag.getLayoutParams();
        layoutParams2.setMargins(0, dimension2, 0, dimension2);
        this.ag.setLayoutParams(layoutParams2);
        this.ak = new TicketInfoViewHolder(n(), this.ai);
        a3.addView(this.ak.d);
        this.al = fzz.a(n);
        isq.a(this.al, n, c);
        a3.addView(this.al);
        this.ar = this.aq.f();
        this.ar.a((i) gvt.b(p(), this.X));
        this.ar.a((h) new ist((int) o().getResources().getDimension(R.dimen.concerts_list_bottom_padding)));
        this.a = new uwh(true);
        ((ImageView) fay.a(this.aq.c())).setScaleType(ScaleType.CENTER_CROP);
        isx isx = new isx(p(), this.a, this.X, this.U, fqb.e().a(p(), null));
        isv isv = new isv(p(), this.a, this.X, fqb.e().a(p(), null));
        isy isy = new isy(p(), this.a, this.V, this.as, this.at, fqb.e().a(p(), null), this.aa);
        this.ao = Collections.unmodifiableList(Arrays.asList(new isw[]{isx, isv, isy}));
        return this.aq.b();
    }
}
