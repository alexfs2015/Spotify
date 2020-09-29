package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.eventshub.model.Artist;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.music.R;
import java.util.List;

/* renamed from: itx reason: default package */
public final class itx {
    private final Resources a;

    public itx(Resources resources) {
        this.a = resources;
    }

    public final String a(Concert concert) {
        List artists = concert.getArtists();
        int size = artists.size();
        if (size == 1) {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_one_artist), new Object[]{((Artist) artists.get(0)).getName()});
        } else if (size == 2) {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_two_artists), new Object[]{((Artist) artists.get(0)).getName(), ((Artist) artists.get(1)).getName()});
        } else if (size == 3) {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_three_artists), new Object[]{((Artist) artists.get(0)).getName(), ((Artist) artists.get(1)).getName(), ((Artist) artists.get(2)).getName()});
        } else if (size == 4) {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_four_artists), new Object[]{((Artist) artists.get(0)).getName(), ((Artist) artists.get(1)).getName(), ((Artist) artists.get(2)).getName(), ((Artist) artists.get(3)).getName()});
        } else if (size != 5) {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_one_artist), new Object[]{((Artist) artists.get(0)).getName()});
        } else {
            return String.format(this.a.getString(R.string.events_hub_concert_entity_title_five_artists), new Object[]{((Artist) artists.get(0)).getName(), ((Artist) artists.get(1)).getName(), ((Artist) artists.get(2)).getName(), ((Artist) artists.get(3)).getName(), ((Artist) artists.get(4)).getName()});
        }
    }
}
