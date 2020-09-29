package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import java.util.List;

/* renamed from: ivp reason: default package */
public final class ivp extends ArrayAdapter<EventResult> {
    private final jyx a;
    private final jtz b;

    public ivp(Context context, List<EventResult> list, jyx jyx, jtz jtz) {
        super(context, 0, list);
        this.a = jyx;
        this.b = jtz;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        fsc fsc = (fsc) fqv.b(view, fsc.class);
        if (fsc == null) {
            fqv.b();
            fsc = fsk.b(getContext(), viewGroup, false);
        }
        EventResult eventResult = (EventResult) getItem(i);
        Concert concert = eventResult.getPosterConcertResult().getConcert();
        fsc.a(concert.getListingTitle());
        fsc.b(eventResult.getMetadata(getContext(), this.b));
        String imageUri = concert.getImageUri();
        if (!fbo.a(imageUri)) {
            fsc.c().setVisibility(0);
            this.a.a(fsc.c(), imageUri, gaa.a(getContext()), vgq.a());
        }
        return fsc.getView();
    }
}
