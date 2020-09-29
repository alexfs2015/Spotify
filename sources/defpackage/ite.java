package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import io.reactivex.functions.Consumer;

/* renamed from: ite reason: default package */
public interface ite {

    /* renamed from: ite$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Consumer<ConcertResult> a(Context context) {
            return new $$Lambda$ite$AB_f6IVz4oPk6ftSpjq0vCRI7qc(context);
        }

        public static /* synthetic */ void a(Context context, ConcertResult concertResult) {
            StringBuilder sb = new StringBuilder("spotify:concert:");
            sb.append(concertResult.getConcert().getId());
            context.startActivity(kmf.a(context, sb.toString()).a);
        }
    }
}
