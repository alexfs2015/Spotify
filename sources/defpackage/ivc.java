package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.music.R;
import java.util.Calendar;
import java.util.List;

/* renamed from: ivc reason: default package */
public final class ivc implements iva {
    private final Context a;
    private final vhx b;
    private final Calendar c;
    private final OnClickListener d;
    private final OnClickListener e;
    private final fsm f;
    private final jtz g;

    public ivc(Context context, vhx vhx, Calendar calendar, OnClickListener onClickListener, OnClickListener onClickListener2, fsm fsm, jtz jtz) {
        this.a = context;
        this.b = vhx;
        this.c = calendar;
        this.d = onClickListener;
        this.e = onClickListener2;
        this.f = fsm;
        this.g = jtz;
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        ImmutableList a2 = gcn.a(concertEntityModel.getUpcomingConcerts());
        List subList = a2.subList(0, Math.min(3, a2.size()));
        String upcomingConcertsSource = concertEntityModel.getUpcomingConcertsSource();
        String userLocation = concertEntityModel.getUserLocation();
        if (!subList.isEmpty()) {
            if (upcomingConcertsSource.equals("recommendations")) {
                this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_recommended_for_you));
            } else if (!upcomingConcertsSource.equals("artist_concerts") || userLocation == null) {
                this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_you));
            } else {
                this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_user_location, new Object[]{userLocation}));
            }
            this.b.a((a<H>) new jog<H>(this.f.getView(), true), 5);
            vhx vhx = this.b;
            Context context = this.a;
            iuv iuv = new iuv(context, subList, this.d, this.c, new iwh(context.getResources()), this.g);
            vhx.a((a<H>) iuv, 6);
            fqv.b();
            frx a3 = fsk.a(this.a, null);
            a3.a(this.a.getText(R.string.events_hub_concert_entity_see_more_concerts));
            a3.getView().setOnClickListener(this.e);
            this.b.a((a<H>) new jog<H>(a3.getView(), true), 7);
            return;
        }
        if (userLocation != null) {
            this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_user_location, new Object[]{userLocation}));
        } else {
            this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_you));
        }
        this.b.a((a<H>) new jog<H>(this.f.getView(), true), 5);
        fqv.b();
        frv a4 = fsk.a(this.a, (ViewGroup) null, 2);
        a4.a(this.a.getText(R.string.events_hub_concert_entity_see_more_concerts_with_no_concert_to_show));
        a4.getView().setOnClickListener(this.e);
        this.b.a((a<H>) new jog<H>(a4.getView(), true), 8);
    }
}
