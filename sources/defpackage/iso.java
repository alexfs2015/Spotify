package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;

/* renamed from: iso reason: default package */
public final class iso extends uef<ConcertEntityModel> {
    final isn a;
    private final itx b;

    public final /* synthetic */ void a(Parcelable parcelable) {
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) parcelable;
        super.a(concertEntityModel);
        isn isn = this.a;
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertEntityModel.getConcertResult().getConcert().getId());
        isn.c = sb.toString();
        isn isn2 = this.a;
        jjf jjf = isn2.a;
        bf bfVar = new bf(null, isn2.b, isn2.c, null, -1, null, "page", null, (double) jrf.a.a());
        jjf.a(bfVar);
    }

    public iso(wud<ConcertEntityModel> wud, wud<SessionState> wud2, isn isn, itx itx) {
        super(wud, wud2);
        this.a = (isn) fay.a(isn);
        this.b = itx;
    }

    public final isr a() {
        return (isr) super.c();
    }

    public final String a(ConcertEntityModel concertEntityModel) {
        Concert concert = concertEntityModel.getConcertResult().getConcert();
        if (concert.isFestival()) {
            return concert.getTitle();
        }
        return this.b.a(concert);
    }

    public final /* bridge */ /* synthetic */ ued c() {
        return (isr) super.c();
    }
}
