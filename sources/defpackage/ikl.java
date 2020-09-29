package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.artist.model.ArtistModel.ArtistInfo;
import com.spotify.music.artist.model.ArtistModel.Concert;
import com.spotify.music.artist.model.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: ikl reason: default package */
public class ikl extends ikk {
    public jrp Y;
    private final SimpleDateFormat Z = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private final SimpleDateFormat aa = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.getDefault());
    private ImageView ab;
    private TextView ac;
    private Button af;
    private ImageView ag;
    private TextView ah;
    private TextView ai;
    private TextView aj;
    private Button ak;
    private TextView al;
    private TextView am;
    private ImageView an;
    /* access modifiers changed from: private */
    public String ao;

    public final /* synthetic */ void a(Parcelable parcelable) {
        Concert concert;
        final ArtistModel artistModel = (ArtistModel) parcelable;
        List<Concert> list = artistModel.upcomingConcerts;
        String str = this.ao;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                concert = null;
                break;
            }
            concert = (Concert) it.next();
            if (faw.a(concert.id, str)) {
                break;
            }
        }
        if (concert == null) {
            a((Throwable) new Exception(String.format("Concert(%s) doesn't exist.", new Object[]{this.ao})));
            return;
        }
        ArtistInfo artistInfo = artistModel.info;
        StringBuilder sb = new StringBuilder();
        sb.append(concert.venue);
        sb.append(", ");
        sb.append(concert.city);
        final String a = gbm.a(sb.toString(), far.c);
        if (!artistInfo.portraits.isEmpty()) {
            this.U.c(this.ab, ((Image) artistInfo.portraits.get(0)).uri);
        }
        String str2 = artistInfo.name;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(p().getString(R.string.mobile_artists_concert_title));
        this.b.a(this, sb2.toString());
        this.ac.setText(str2);
        this.af.setText(str2.toUpperCase(Locale.getDefault()));
        this.af.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ikl.this.a.a(artistModel.uri);
                ikl ikl = ikl.this;
                ikl.a(kmf.a(ikl.p(), artistModel.uri).a);
            }
        });
        try {
            Date parse = this.Z.parse(concert.localtime);
            joj.a(this.ag, this.Y).a(parse, Locale.getDefault());
            this.ai.setText(this.aa.format(parse));
        } catch (ParseException e) {
            Logger.d(e, "Failed to parse date [%s] with formatter [%s]", concert.localtime, this.Z);
        }
        this.ah.setText(concert.title);
        this.aj.setText(a((int) R.string.mobile_artist_concert_location, concert.venue, concert.city));
        this.al.setText(concert.venue);
        this.am.setText(concert.city);
        StringBuilder sb3 = new StringBuilder("https://maps.googleapis.com/maps/api/staticmap?center=");
        sb3.append(a);
        sb3.append("&zoom=13&scale=2&size=600x300&maptype=roadmap&sensor=false&markers=color:red%7C");
        sb3.append(a);
        ((uvt) ggw.a(uvt.class)).a().a(sb3.toString()).a(this.an);
        this.an.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ikl.a(ikl.this, a);
            }
        });
        this.ak.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ikl ikl = ikl.this;
                ikl.b(ikl, ikl.ao);
            }
        });
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ao = (String) fay.a(this.i.getString("songkick_id"));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.mobile_artist_concert_cat, viewGroup, false);
        this.ac = (TextView) inflate.findViewById(R.id.artist_name);
        this.ab = (ImageView) inflate.findViewById(R.id.image);
        this.af = (Button) inflate.findViewById(R.id.go_to_artist);
        this.ag = (ImageView) inflate.findViewById(R.id.calendar);
        this.ah = (TextView) inflate.findViewById(R.id.concert_title);
        this.ai = (TextView) inflate.findViewById(R.id.concert_date);
        this.aj = (TextView) inflate.findViewById(R.id.full_venue_address);
        this.ak = (Button) inflate.findViewById(R.id.tickets);
        this.al = (TextView) inflate.findViewById(R.id.venue_name);
        this.am = (TextView) inflate.findViewById(R.id.venue_city);
        this.an = (ImageView) inflate.findViewById(R.id.map);
        return inflate;
    }

    public final String b(Context context) {
        return context.getString(R.string.mobile_artists_concert_title);
    }

    public final udr ag() {
        return udt.f;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.CONCERTS_CONCERT, null);
    }

    static /* synthetic */ void a(ikl ikl, String str) {
        String format = String.format("https://maps.google.com/maps?q=loc:%s", new Object[]{str});
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
        ikl.a.a(format);
        ikl.a(intent);
    }

    static /* synthetic */ void b(ikl ikl, String str) {
        String format = String.format("https://www.songkick.com/concerts/%s", new Object[]{str});
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(format));
        ikl.a.a(format);
        ikl.a(intent);
    }
}
