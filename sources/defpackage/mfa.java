package defpackage;

import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.R;

/* renamed from: mfa reason: default package */
final class mfa {
    private final Resources a;
    private final xim<HubsJsonViewModel> b;
    private final xil c;
    private final xil d;
    private final rof e;

    mfa(Resources resources, xim<HubsJsonViewModel> xim, xil xil, xil xil2, rof rof) {
        this.a = resources;
        this.b = xim;
        this.c = xil;
        this.d = xil2;
        this.e = rof;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(Throwable th) {
        return hbb.a(SpotifyIconV2.WARNING, this.a.getString(R.string.error_general_title), this.a.getString(R.string.error_general_body));
    }

    public final xii<hcs> a() {
        xii g = xim.a(this.b).a((c<? super T, ? extends R>) this.e).g(new $$Lambda$mfa$8YIv57OCVv9j24DOKjus4E3iNgQ(this));
        a aVar = new a(hbb.a(), this.d);
        aVar.a = 300;
        return g.a((c<? super T, ? extends R>) aVar.a()).a(this.c);
    }
}
