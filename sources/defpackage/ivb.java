package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard.Settings.TextLayout;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.spotlets.eventshub.model.Artist;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.music.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ivb reason: default package */
public final class ivb implements iva {
    private final Context a;
    private gwt b;
    private List<hcm> c;
    private final vhx d;
    private final gwm e;
    private final hbe f;
    private final fsm g;

    public ivb(Context context, vhx vhx, gwm gwm, hbe hbe, fsm fsm) {
        this.a = context;
        this.d = vhx;
        this.e = gwm;
        this.f = hbe;
        this.g = fsm;
    }

    private void a(List<Artist> list) {
        TextLayout textLayout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Artist artist : list) {
            String name = artist.getName();
            String uri = artist.getUri();
            hci a2 = gxy.a(uri, name);
            Integer monthlyListener = artist.getMonthlyListener();
            a a3 = hcy.builder().a(name);
            if (monthlyListener != null) {
                StringBuilder sb = new StringBuilder("\n");
                sb.append(this.a.getString(R.string.creator_artist_monthly_listeners_title));
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(NumberFormat.getNumberInstance().format(monthlyListener));
                sb3.append(sb2);
                a3 = a3.b(sb3.toString());
                textLayout = TextLayout.b;
            } else {
                textLayout = TextLayout.a;
            }
            String str = "click";
            String str2 = "ui:index_in_block";
            this.c.add(hcx.builder().a((hck) HubsGlueCard.NORMAL).a(a3.a()).f(textLayout.mAsBundle).c("glue:subtitleStyle", "metadata").a(str, gya.a(uri)).a("longClick", a2).a("rightAccessoryClick", a2).a(hcw.builder().a(hcz.builder().a(artist.getImageUri()).a((Enum<?>) SpotifyIconV2.ARTIST).b(Style.CIRCULAR.mSetting))).b(str2, Integer.valueOf(i)).b("ui:group", "goto-artist").a());
            i++;
        }
        List<hcm> list2 = this.c;
        gwt gwt = this.b;
        arrayList.add(hcx.builder().a((hck) HubsGlueComponent.CAROUSEL).a(list2).a());
        gwt.a((List<? extends hcm>) arrayList);
        gwt.e();
        this.d.a((a<H>) this.b, 2);
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        String str;
        List artists = concertEntityModel.getArtists();
        if (!artists.isEmpty()) {
            this.g.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_line_up));
            this.d.a((a<H>) new jog<H>(this.g.getView(), true), 1);
            this.b = new gwt(this.e);
            this.f.a(a.a(this.b));
            this.c = new ArrayList();
            if (artists.size() > 1) {
                a(artists);
                return;
            }
            Artist artist = (Artist) artists.get(0);
            Integer monthlyListener = artist.getMonthlyListener();
            if (monthlyListener != null) {
                StringBuilder sb = new StringBuilder(" ");
                sb.append(this.a.getString(R.string.creator_artist_monthly_listeners_title));
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(NumberFormat.getNumberInstance().format(monthlyListener));
                sb3.append(sb2);
                str = sb3.toString();
            } else {
                str = "";
            }
            this.c.add(hcx.builder().a((hck) HubsGlueRow.NORMAL).a(hcy.builder().a(artist.getName()).b(str)).a((hcr) hcq.a(artist.getUri())).a(hcw.builder().a(hcz.builder().a(artist.getImageUri()).b(Style.CIRCULAR.mSetting))).b("ui:index_in_block", Integer.valueOf(0)).b("ui:group", "goto-artist").a());
            this.b.a(this.c);
            this.b.e();
            this.d.a((a<H>) this.b, 2);
        }
    }
}
