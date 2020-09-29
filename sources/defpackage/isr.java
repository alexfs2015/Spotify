package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;

/* renamed from: isr reason: default package */
public interface isr extends ued<ConcertEntityModel> {
    void a(Uri uri);

    void a(ConcertResult concertResult);

    void ak();
}
