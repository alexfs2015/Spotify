package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.spotlets.eventshub.model.Album;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: isv reason: default package */
public final class isv implements isw {
    private final Context a;
    private final uwh b;
    private final gum c;
    private final frs d;
    private gut e;
    private List<gzt> f;

    public isv(Context context, uwh uwh, gum gum, frs frs) {
        this.a = context;
        this.b = uwh;
        this.c = gum;
        this.d = frs;
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        List albumsForConcert = concertEntityModel.getAlbumsForConcert();
        if (albumsForConcert != null && !albumsForConcert.isEmpty()) {
            this.d.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_albums_for_concert));
            this.b.a((a<H>) new jlu<H>(this.d.getView(), true), 3);
            this.e = new gut(this.c);
            this.f = new ArrayList();
            boolean z = false;
            if (albumsForConcert.size() > 1) {
                if (concertEntityModel.getArtists().size() > 1) {
                    z = true;
                }
                a(z, albumsForConcert);
                return;
            }
            Album album = (Album) albumsForConcert.get(0);
            this.f.add(hae.builder().a((gzr) HubsGlueRow.NORMAL).a(haf.builder().a(album.getName()).b(album.getArtistName())).a((gzy) gzx.a(album.getUri())).a(had.builder().a(hag.builder().a(album.getImageUri()))).b("ui:index_in_block", Integer.valueOf(0)).b("ui:group", "goto-album").a());
            this.e.a(this.f);
            this.e.e();
            this.b.a((a<H>) this.e, 4);
        }
    }

    private void a(boolean z, List<Album> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Album album : list) {
            if (z) {
                str = album.getArtistName();
            } else {
                str = "";
            }
            this.f.add(hae.builder().a((gzr) HubsGlueCard.NORMAL).a(haf.builder().a(album.getName()).b(str)).a((gzy) gzx.a(album.getUri())).a(had.builder().a(hag.builder().a(album.getImageUri()))).b("ui:index_in_block", Integer.valueOf(i)).b("ui:group", "goto-album").a());
            i++;
        }
        List<gzt> list2 = this.f;
        gut gut = this.e;
        arrayList.add(hae.builder().a((gzr) HubsGlueComponent.CAROUSEL).a(list2).a());
        gut.a((List<? extends gzt>) arrayList);
        gut.e();
        this.b.a((a<H>) this.e, 4);
    }
}
