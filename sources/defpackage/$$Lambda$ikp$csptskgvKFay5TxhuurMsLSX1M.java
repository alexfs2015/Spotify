package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$ikp$c-sptskgvKFay5TxhuurMsLSX1M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikp$csptskgvKFay5TxhuurMsLSX1M implements b {
    public static final /* synthetic */ $$Lambda$ikp$csptskgvKFay5TxhuurMsLSX1M INSTANCE = new $$Lambda$ikp$csptskgvKFay5TxhuurMsLSX1M();

    private /* synthetic */ $$Lambda$ikp$csptskgvKFay5TxhuurMsLSX1M() {
    }

    public final Observable serve(ikn ikn, JacksonModel jacksonModel) {
        return ikn.d.a((Rating) jacksonModel);
    }
}
