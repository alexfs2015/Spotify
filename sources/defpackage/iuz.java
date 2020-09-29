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

/* renamed from: iuz reason: default package */
public final class iuz implements iva {
    private final Context a;
    private final vhx b;
    private final gwm c;
    private final fsm d;
    private gwt e;
    private List<hcm> f;

    public iuz(Context context, vhx vhx, gwm gwm, fsm fsm) {
        this.a = context;
        this.b = vhx;
        this.c = gwm;
        this.d = fsm;
    }

    private void a(boolean z, List<Album> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Album album : list) {
            this.f.add(hcx.builder().a((hck) HubsGlueCard.NORMAL).a(hcy.builder().a(album.getName()).b(z ? album.getArtistName() : "")).a((hcr) hcq.a(album.getUri())).a(hcw.builder().a(hcz.builder().a(album.getImageUri()))).b("ui:index_in_block", Integer.valueOf(i)).b("ui:group", "goto-album").a());
            i++;
        }
        List<hcm> list2 = this.f;
        gwt gwt = this.e;
        arrayList.add(hcx.builder().a((hck) HubsGlueComponent.CAROUSEL).a(list2).a());
        gwt.a((List<? extends hcm>) arrayList);
        gwt.e();
        this.b.a((a<H>) this.e, 4);
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        List albumsForConcert = concertEntityModel.getAlbumsForConcert();
        if (albumsForConcert != null && !albumsForConcert.isEmpty()) {
            this.d.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_albums_for_concert));
            this.b.a((a<H>) new jog<H>(this.d.getView(), true), 3);
            this.e = new gwt(this.c);
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
            this.f.add(hcx.builder().a((hck) HubsGlueRow.NORMAL).a(hcy.builder().a(album.getName()).b(album.getArtistName())).a((hcr) hcq.a(album.getUri())).a(hcw.builder().a(hcz.builder().a(album.getImageUri()))).b("ui:index_in_block", Integer.valueOf(0)).b("ui:group", "goto-album").a());
            this.e.a(this.f);
            this.e.e();
            this.b.a((a<H>) this.e, 4);
        }
    }
}
