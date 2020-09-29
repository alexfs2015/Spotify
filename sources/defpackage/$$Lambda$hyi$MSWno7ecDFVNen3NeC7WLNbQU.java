package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hyi$MSWno7ecDFVNen--3NeC7WLNbQU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hyi$MSWno7ecDFVNen3NeC7WLNbQU implements Consumer {
    private final /* synthetic */ hyi f$0;
    private final /* synthetic */ Activity f$1;
    private final /* synthetic */ fqa f$2;
    private final /* synthetic */ Uri f$3;
    private final /* synthetic */ String f$4;

    public /* synthetic */ $$Lambda$hyi$MSWno7ecDFVNen3NeC7WLNbQU(hyi hyi, Activity activity, fqa fqa, Uri uri, String str) {
        this.f$0 = hyi;
        this.f$1 = activity;
        this.f$2 = fqa;
        this.f$3 = uri;
        this.f$4 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, (RolloutFlag) obj);
    }
}
