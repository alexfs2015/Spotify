package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import io.reactivex.functions.Consumer;

/* renamed from: ivn reason: default package */
public interface ivn {

    /* renamed from: ivn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Consumer<ConcertResult> a(Context context) {
            return new $$Lambda$ivn$rhH2ywxQGBPAHReC1ht3nVwvrEs(context);
        }

        public static /* synthetic */ void a(Context context, ConcertResult concertResult) {
            StringBuilder sb = new StringBuilder("spotify:concert:");
            sb.append(concertResult.getConcert().getId());
            context.startActivity(kpo.a(context, sb.toString()).a);
        }
    }
}
