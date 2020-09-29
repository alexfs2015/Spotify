package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: ivk reason: default package */
public final class ivk {
    public final ivt a;
    public final szp b;
    final EventResult c;
    public final iwh d;
    public final Calendar e;
    public final jtz f;
    public List<ConcertResult> g = Lists.a();

    public ivk(ivt ivt, szp szp, EventResult eventResult, iwh iwh, Calendar calendar, jtz jtz) {
        this.a = ivt;
        this.b = szp;
        this.c = eventResult;
        this.d = iwh;
        this.e = calendar;
        this.f = jtz;
    }

    public Date a(String str) {
        return iwg.a(str, "yyyy-MM-dd'T'HH:mm:ss", new Locale(gos.a(Locale.getDefault())), this.e);
    }
}
