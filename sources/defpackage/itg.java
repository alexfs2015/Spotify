package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import java.util.List;

/* renamed from: itg reason: default package */
public final class itg extends ArrayAdapter<EventResult> {
    private final jwv a;
    private final jrp b;

    public itg(Context context, List<EventResult> list, jwv jwv, jrp jrp) {
        super(context, 0, list);
        this.a = jwv;
        this.b = jrp;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        fri fri = (fri) fqb.b(view, fri.class);
        if (fri == null) {
            fqb.b();
            fri = frq.b(getContext(), viewGroup, false);
        }
        EventResult eventResult = (EventResult) getItem(i);
        Concert concert = eventResult.getPosterConcertResult().getConcert();
        fri.a(concert.getListingTitle());
        fri.b(eventResult.getMetadata(getContext(), this.b));
        String imageUri = concert.getImageUri();
        if (!fax.a(imageUri)) {
            fri.c().setVisibility(0);
            this.a.a(fri.c(), imageUri, fzg.a(getContext()), uuz.a());
        }
        return fri.getView();
    }
}
