package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: -$$Lambda$izi$gdPySXWSbeX4uKs7D07gAx2QJSA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$izi$gdPySXWSbeX4uKs7D07gAx2QJSA implements Consumer {
    private final /* synthetic */ izi f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Uri f$2;
    private final /* synthetic */ String f$3;
    private final /* synthetic */ String f$4;
    private final /* synthetic */ String f$5;
    private final /* synthetic */ String f$6;
    private final /* synthetic */ jqg f$7;
    private final /* synthetic */ List f$8;

    public /* synthetic */ $$Lambda$izi$gdPySXWSbeX4uKs7D07gAx2QJSA(izi izi, String str, Uri uri, String str2, String str3, String str4, String str5, jqg jqg, List list) {
        this.f$0 = izi;
        this.f$1 = str;
        this.f$2 = uri;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$5 = str4;
        this.f$6 = str5;
        this.f$7 = jqg;
        this.f$8 = list;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (PlayerState) obj);
    }
}
