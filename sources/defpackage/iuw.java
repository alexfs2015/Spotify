package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import java.util.Locale;

/* renamed from: iuw reason: default package */
public final class iuw extends a<u> {
    public final ivk a;

    public iuw(ivk ivk) {
        this.a = ivk;
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, View view) {
        ivk ivk = this.a;
        long j = (long) i;
        ConcertResult concertResult = (ConcertResult) ivk.g.get((int) j);
        Concert concert = concertResult.getConcert();
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertResult.getConcert().getId());
        String sb2 = sb.toString();
        if (concertResult.getDiscovery() != null && concertResult.getDiscovery().booleanValue()) {
            ivk.a.b(Long.valueOf(j), concertResult.getSourceType(), concert.getId());
        } else {
            ivk.a.a(Long.valueOf(j), concertResult.getSourceType(), concert.getId());
        }
        ivk.b.a(sb2);
    }

    public final int a(int i) {
        return fsb.class.hashCode();
    }

    public final u a(ViewGroup viewGroup, int i) {
        fqv.b();
        return fra.a(fsk.b(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i) {
        fsc fsc = (fsc) fqv.a(uVar.o, fsc.class);
        ive ive = new ive(fsc);
        ivk ivk = this.a;
        Concert concert = ((ConcertResult) ivk.g.get(i)).getConcert();
        if (concert.isFestival()) {
            ive.a(concert.getTitle());
        } else {
            ive.a(ivk.d.a(concert));
        }
        String a2 = iwg.a(concert.getVenue(), concert.getLocation());
        Locale locale = new Locale(gos.a(Locale.getDefault()));
        if (concert.getDateString() != null) {
            a2 = iwg.a(a2, ivk.a(concert.getDateString()), ivk.e, locale);
        }
        ive.b(a2);
        Locale locale2 = new Locale(gos.a(Locale.getDefault()));
        ive.a(ivk.f, ivk.a(concert.getDateString()), locale2);
        fsc.getView().setOnClickListener(new $$Lambda$iuw$PL7b4l_Ssj96MTb9o6qs955v5Gc(this, i));
    }

    public final int b() {
        return this.a.g.size();
    }

    public final long b(int i) {
        return (long) ((ConcertResult) this.a.g.get(i)).hashCode();
    }
}
