package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: iss reason: default package */
public final class iss extends a<fqg<fri>> {
    private final Calendar a;
    private final OnClickListener d;
    private final itx e;
    private final jrp f;
    private Context g;
    private List<ConcertResult> h;

    public final /* synthetic */ void a(u uVar, int i) {
        String str;
        fqg fqg = (fqg) uVar;
        ConcertResult concertResult = (ConcertResult) this.h.get(i);
        fqg.o.setTag(concertResult);
        Concert concert = concertResult.getConcert();
        fri fri = (fri) fqg.a;
        Locale locale = new Locale(gnd.a(Locale.getDefault()));
        Date a2 = itw.a(concert.getDateString(), "yyyy-MM-dd'T'HH:mm:ss", locale, this.a);
        if (concert.isFestival()) {
            fri.a(concert.getTitle());
        } else {
            fri.a(this.e.a(concert));
        }
        String a3 = itw.a(concert.getVenue(), concert.getLocation());
        if (concert.getDateString() != null) {
            Calendar calendar = this.a;
            calendar.setTime(a2);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                int i2 = calendar.get(12);
                str = new SimpleDateFormat("EEE, h:mm a", locale).format(a2);
                if (i2 == 0) {
                    str = DateFormat.format("EEE, h a", a2).toString();
                }
            } else {
                String displayName = calendar.getDisplayName(7, 1, locale);
                String format = java.text.DateFormat.getTimeInstance(3, locale).format(a2);
                StringBuilder sb = new StringBuilder();
                sb.append(displayName);
                sb.append(", ");
                sb.append(format);
                str = sb.toString();
            }
            a3 = TextUtils.join(" • ", new String[]{str, a3});
        }
        fri.b(a3);
        joj.a(fri.c(), this.f).a(a2, locale);
        fri.getView().setOnClickListener(this.d);
    }

    public iss(Context context, List<ConcertResult> list, OnClickListener onClickListener, Calendar calendar, itx itx, jrp jrp) {
        this.g = (Context) fay.a(context);
        this.h = (List) fay.a(list);
        this.d = onClickListener;
        this.a = calendar;
        this.e = itx;
        this.f = jrp;
        a(true);
    }

    public final int a(int i) {
        return frh.class.hashCode();
    }

    public final long b(int i) {
        return (long) ((ConcertResult) this.h.get(i)).getConcert().hashCode();
    }

    public final int b() {
        return this.h.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqb.b();
        return fqg.a(frq.b(this.g, viewGroup, false));
    }
}
