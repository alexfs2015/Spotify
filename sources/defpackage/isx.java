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

/* renamed from: isx reason: default package */
public final class isx implements isw {
    private final Context a;
    private gut b;
    private List<gzt> c;
    private final uwh d;
    private final gum e;
    private final gyl f;
    private final frs g;

    public isx(Context context, uwh uwh, gum gum, gyl gyl, frs frs) {
        this.a = context;
        this.d = uwh;
        this.e = gum;
        this.f = gyl;
        this.g = frs;
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        String str;
        List artists = concertEntityModel.getArtists();
        if (!artists.isEmpty()) {
            this.g.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_line_up));
            this.d.a((a<H>) new jlu<H>(this.g.getView(), true), 1);
            this.b = new gut(this.e);
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
            this.c.add(hae.builder().a((gzr) HubsGlueRow.NORMAL).a(haf.builder().a(artist.getName()).b(str)).a((gzy) gzx.a(artist.getUri())).a(had.builder().a(hag.builder().a(artist.getImageUri()).b(Style.CIRCULAR.mSetting))).b("ui:index_in_block", Integer.valueOf(0)).b("ui:group", "goto-artist").a());
            this.b.a(this.c);
            this.b.e();
            this.d.a((a<H>) this.b, 2);
        }
    }

    private void a(List<Artist> list) {
        TextLayout textLayout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Artist artist : list) {
            String name = artist.getName();
            String uri = artist.getUri();
            gzp a2 = gvx.a(uri, name);
            Integer monthlyListener = artist.getMonthlyListener();
            a a3 = haf.builder().a(name);
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
            this.c.add(hae.builder().a((gzr) HubsGlueCard.NORMAL).a(a3.a()).f(textLayout.mAsBundle).c("glue:subtitleStyle", "metadata").a(str, gvz.a(uri)).a("longClick", a2).a("rightAccessoryClick", a2).a(had.builder().a(hag.builder().a(artist.getImageUri()).a((Enum<?>) SpotifyIconV2.ARTIST).b(Style.CIRCULAR.mSetting))).b(str2, Integer.valueOf(i)).b("ui:group", "goto-artist").a());
            i++;
        }
        List<gzt> list2 = this.c;
        gut gut = this.b;
        arrayList.add(hae.builder().a((gzr) HubsGlueComponent.CAROUSEL).a(list2).a());
        gut.a((List<? extends gzt>) arrayList);
        gut.e();
        this.d.a((a<H>) this.b, 2);
    }
}
