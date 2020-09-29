package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;

/* renamed from: iur reason: default package */
public final class iur extends mit<ConcertEntityModel> {
    final iuq a;
    private final iwh b;

    public iur(xii<ConcertEntityModel> xii, xii<SessionState> xii2, iuq iuq, iwh iwh) {
        super(xii, xii2);
        this.a = (iuq) fbp.a(iuq);
        this.b = iwh;
    }

    public final iuu a() {
        return (iuu) super.c();
    }

    public final String a(ConcertEntityModel concertEntityModel) {
        Concert concert = concertEntityModel.getConcertResult().getConcert();
        return concert.isFestival() ? concert.getTitle() : this.b.a(concert);
    }

    public final /* synthetic */ void a(Parcelable parcelable) {
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) parcelable;
        super.a(concertEntityModel);
        iuq iuq = this.a;
        StringBuilder sb = new StringBuilder("spotify:concert:");
        sb.append(concertEntityModel.getConcertResult().getConcert().getId());
        iuq.c = sb.toString();
        iuq iuq2 = this.a;
        jlr jlr = iuq2.a;
        be beVar = new be(null, iuq2.b, iuq2.c, null, -1, null, "page", null, (double) jtp.a.a());
        jlr.a(beVar);
    }

    public final /* bridge */ /* synthetic */ mir c() {
        return (iuu) super.c();
    }
}
