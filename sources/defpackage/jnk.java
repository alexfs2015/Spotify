package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jnk reason: default package */
public final class jnk implements jmy<Void> {
    private final jmb b;
    private final Activity c;
    private final fpt d;
    private final ShareEventLogger e;
    private final String f;
    private final Uri g;
    private final udr h;
    private final sih i;
    private final jnu j;
    private final joc<jst> k;
    private final iwo l;
    private final ixc m;
    private final ixe n;
    private final AndroidLibsShareProperties o;
    private final izg p;
    private final List<AppShareDestination> q;

    public jnk(jmb jmb, fpt fpt, Activity activity, jnu jnu, joc<jst> joc, ixc ixc, udr udr, AndroidLibsShareProperties androidLibsShareProperties, izg izg, List<AppShareDestination> list, sih sih) {
        this.b = jmb;
        this.d = (fpt) fay.a(fpt);
        this.e = (ShareEventLogger) fay.a(ixc.a());
        this.c = (Activity) fay.a(activity);
        this.f = (String) fay.a(ixc.d());
        this.g = (Uri) fay.a(ixc.f());
        this.i = (sih) fay.a(sih);
        this.h = (udr) fay.a(udr);
        this.j = (jnu) fay.a(jnu);
        this.k = (joc) fay.a(joc);
        this.m = (ixc) fay.a(ixc);
        this.n = (ixe) fay.a(ixc.b().f());
        this.l = new iwo(activity.getPackageManager());
        this.o = (AndroidLibsShareProperties) fay.a(androidLibsShareProperties);
        this.p = izg;
        this.q = list;
    }

    private ContextMenuViewModel b(joc<jst> joc) {
        String str;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.g = true;
        ContextMenuHelper a = this.b.a(this.h, this.i, contextMenuViewModel, this.j, this.d);
        contextMenuViewModel.b.clear();
        jst jst = (jst) fay.a(joc.b());
        LinkType linkType = (LinkType) fay.a(jst.b);
        String str2 = (String) fay.a(joc.d());
        Activity activity = this.c;
        String str3 = "";
        switch (AnonymousClass1.a[jst.b.ordinal()]) {
            case 1:
            case 2:
                str = activity.getString(R.string.share_to_external_artist_title);
                break;
            case 3:
            case 4:
                str = activity.getString(R.string.share_to_external_album_title_short);
                break;
            case 5:
                str = activity.getString(R.string.share_to_external_concert_title_short);
                break;
            case 6:
                str = activity.getString(R.string.share_to_external_song_title_short);
                break;
            case 7:
            case 8:
            case 9:
                str = activity.getString(R.string.share_to_external_playlist_title_short);
                break;
            case 10:
            case 11:
                str = activity.getString(R.string.share_to_external_show_episode_title_short);
                break;
            case 12:
            case 13:
                break;
            default:
                StringBuilder sb = new StringBuilder("Unsupported link type ");
                sb.append(jst.b);
                Assertion.a(sb.toString());
                break;
        }
        str = str3;
        StringBuilder sb2 = new StringBuilder();
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(' ');
            str3 = sb3.toString();
        }
        sb2.append(str3);
        ixc ixc = this.m;
        ixe ixe = this.n;
        fay.a(ixc);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(ixc.c());
        sb4.append(' ');
        sb4.append(ixc.d());
        String sb5 = sb4.toString();
        String e2 = ixc.e();
        if (e2 == null || e2.isEmpty()) {
            e2 = sb5;
        }
        String a2 = ixe.a();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(e2);
        sb6.append(10);
        sb6.append(a2);
        sb2.append(sb6.toString());
        String sb7 = sb2.toString();
        fuf fuf = new fuf(str2, this.f, this.g, SpotifyIconV2.PLAYLIST, linkType == LinkType.ARTIST);
        contextMenuViewModel.c = fuf;
        a aVar = new a(this.o, this.e, this.l, this.c.getPackageManager(), this.n, sb7, str2, this.f, this.g);
        ArrayList arrayList = new ArrayList(a(a, this.q));
        if (this.o.a()) {
            arrayList.add(0, new $$Lambda$jnk$G8uH2Y1CKu7nqm6YfpagrABc6WQ(this, a));
        } else {
            arrayList.add(new $$Lambda$jnk$hl8_Yzy5m9gF0JzNSbGqVnFECfM(this, a));
        }
        arrayList.add(new $$Lambda$jnk$wwH2ULMZkONX708mOpgQANKr8(this, a));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((iwz) arrayList.get(i2)).addMenuItem(aVar, (long) i2);
        }
        return contextMenuViewModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, aVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, aVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, this.i, aVar.b);
    }

    private List<iwz> a(ContextMenuHelper contextMenuHelper, List<AppShareDestination> list) {
        jmm jmm = new jmm(contextMenuHelper, this.p);
        ArrayList arrayList = new ArrayList();
        for (AppShareDestination a : list) {
            arrayList.add(jmm.a(a));
        }
        return arrayList;
    }

    public final ContextMenuViewModel a(joc<Void> joc) {
        return b(this.k);
    }

    public final Observable<ContextMenuViewModel> a(joc<Void> joc, fpt fpt) {
        return Observable.b(b(this.k));
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jnz.a(contextMenuViewModel, z);
    }
}
