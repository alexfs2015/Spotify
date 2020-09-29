package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: iuv reason: default package */
public final class iuv extends a<fra<fsc>> {
    private final Calendar a;
    private final OnClickListener d;
    private final iwh e;
    private final jtz f;
    private Context g;
    private List<ConcertResult> h;

    public iuv(Context context, List<ConcertResult> list, OnClickListener onClickListener, Calendar calendar, iwh iwh, jtz jtz) {
        this.g = (Context) fbp.a(context);
        this.h = (List) fbp.a(list);
        this.d = onClickListener;
        this.a = calendar;
        this.e = iwh;
        this.f = jtz;
        a(true);
    }

    public final int a(int i) {
        return fsb.class.hashCode();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqv.b();
        return fra.a(fsk.b(this.g, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        fra fra = (fra) uVar;
        ConcertResult concertResult = (ConcertResult) this.h.get(i);
        fra.o.setTag(concertResult);
        Concert concert = concertResult.getConcert();
        fsc fsc = (fsc) fra.a;
        Locale locale = new Locale(gos.a(Locale.getDefault()));
        Date a2 = iwg.a(concert.getDateString(), "yyyy-MM-dd'T'HH:mm:ss", locale, this.a);
        if (concert.isFestival()) {
            fsc.a(concert.getTitle());
        } else {
            fsc.a(this.e.a(concert));
        }
        String a3 = iwg.a(concert.getVenue(), concert.getLocation());
        if (concert.getDateString() != null) {
            a3 = iwg.a(a3, a2, this.a, locale);
        }
        fsc.b(a3);
        jqv.a(fsc.c(), this.f).a(a2, locale);
        fsc.getView().setOnClickListener(this.d);
    }

    public final int b() {
        return this.h.size();
    }

    public final long b(int i) {
        return (long) ((ConcertResult) this.h.get(i)).getConcert().hashCode();
    }
}
