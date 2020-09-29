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

/* renamed from: isy reason: default package */
public final class isy implements isw {
    private final Context a;
    private final uwh b;
    private final Calendar c;
    private final OnClickListener d;
    private final OnClickListener e;
    private final frs f;
    private final jrp g;

    public isy(Context context, uwh uwh, Calendar calendar, OnClickListener onClickListener, OnClickListener onClickListener2, frs frs, jrp jrp) {
        this.a = context;
        this.b = uwh;
        this.c = calendar;
        this.d = onClickListener;
        this.e = onClickListener2;
        this.f = frs;
        this.g = jrp;
    }

    public final void a(ConcertEntityModel concertEntityModel) {
        ImmutableList a2 = gbp.a(concertEntityModel.getUpcomingConcerts());
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
            this.b.a((a<H>) new jlu<H>(this.f.getView(), true), 5);
            uwh uwh = this.b;
            Context context = this.a;
            iss iss = new iss(context, subList, this.d, this.c, new itx(context.getResources()), this.g);
            uwh.a((a<H>) iss, 6);
            fqb.b();
            frd a3 = frq.a(this.a, null);
            a3.a(this.a.getText(R.string.events_hub_concert_entity_see_more_concerts));
            a3.getView().setOnClickListener(this.e);
            this.b.a((a<H>) new jlu<H>(a3.getView(), true), 7);
            return;
        }
        if (userLocation != null) {
            this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_user_location, new Object[]{userLocation}));
        } else {
            this.f.a((CharSequence) this.a.getString(R.string.events_hub_concert_entity_more_near_you));
        }
        this.b.a((a<H>) new jlu<H>(this.f.getView(), true), 5);
        fqb.b();
        frb a4 = frq.a(this.a, (ViewGroup) null, 2);
        a4.a(this.a.getText(R.string.events_hub_concert_entity_see_more_concerts_with_no_concert_to_show));
        a4.getView().setOnClickListener(this.e);
        this.b.a((a<H>) new jlu<H>(a4.getView(), true), 8);
    }
}
