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

/* renamed from: jpw reason: default package */
public final class jpw implements jpk<Void> {
    private final jon b;
    private final Activity c;
    private final fqn d;
    private final ShareEventLogger e;
    private final String f;
    private final Uri g;
    private final uqm h;
    private final sso i;
    private final jqg j;
    private final jqo<jva> k;
    private final iyz l;
    private final izn m;
    private final izp n;
    private final AndroidLibsShareProperties o;
    private final jbr p;
    private final List<AppShareDestination> q;

    public jpw(jon jon, fqn fqn, Activity activity, jqg jqg, jqo<jva> jqo, izn izn, uqm uqm, AndroidLibsShareProperties androidLibsShareProperties, jbr jbr, List<AppShareDestination> list, sso sso) {
        this.b = jon;
        this.d = (fqn) fbp.a(fqn);
        this.e = (ShareEventLogger) fbp.a(izn.a());
        this.c = (Activity) fbp.a(activity);
        this.f = (String) fbp.a(izn.d());
        this.g = (Uri) fbp.a(izn.f());
        this.i = (sso) fbp.a(sso);
        this.h = (uqm) fbp.a(uqm);
        this.j = (jqg) fbp.a(jqg);
        this.k = (jqo) fbp.a(jqo);
        this.m = (izn) fbp.a(izn);
        this.n = (izp) fbp.a(izn.b().f());
        this.l = new iyz(activity.getPackageManager());
        this.o = (AndroidLibsShareProperties) fbp.a(androidLibsShareProperties);
        this.p = jbr;
        this.q = list;
    }

    private List<izk> a(ContextMenuHelper contextMenuHelper, List<AppShareDestination> list) {
        joy joy = new joy(contextMenuHelper, this.p);
        ArrayList arrayList = new ArrayList();
        for (AppShareDestination a : list) {
            arrayList.add(joy.a(a));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, this.i, aVar.b);
    }

    private ContextMenuViewModel b(jqo<jva> jqo) {
        String str;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.g = true;
        ContextMenuHelper a = this.b.a(this.h, this.i, contextMenuViewModel, this.j, this.d);
        contextMenuViewModel.b.clear();
        jva jva = (jva) fbp.a(jqo.b());
        LinkType linkType = (LinkType) fbp.a(jva.b);
        String str2 = (String) fbp.a(jqo.d());
        Activity activity = this.c;
        String str3 = "";
        switch (AnonymousClass1.a[jva.b.ordinal()]) {
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
                sb.append(jva.b);
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
        izn izn = this.m;
        izp izp = this.n;
        fbp.a(izn);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(izn.c());
        sb4.append(' ');
        sb4.append(izn.d());
        String sb5 = sb4.toString();
        String e2 = izn.e();
        if (e2 == null || e2.isEmpty()) {
            e2 = sb5;
        }
        String a2 = izp.a();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(e2);
        sb6.append(10);
        sb6.append(a2);
        sb2.append(sb6.toString());
        String sb7 = sb2.toString();
        fuz fuz = new fuz(str2, this.f, this.g, SpotifyIconV2.PLAYLIST, linkType == LinkType.ARTIST);
        contextMenuViewModel.c = fuz;
        a aVar = new a(this.o, this.e, this.l, this.c.getPackageManager(), this.n, sb7, str2, this.f, this.g);
        ArrayList arrayList = new ArrayList(a(a, this.q));
        if (this.o.a()) {
            arrayList.add(0, new $$Lambda$jpw$xDwT_V7K9DhgfdESMLr02zJZaA4(this, a));
        } else {
            arrayList.add(new $$Lambda$jpw$5p4DMvn2NvP47gT_LChiEchxwqk(this, a));
        }
        arrayList.add(new $$Lambda$jpw$G_m5UKKzSu6A1hRg7sPlrL2bNc(this, a));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((izk) arrayList.get(i2)).addMenuItem(aVar, (long) i2);
        }
        return contextMenuViewModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, aVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ContextMenuHelper contextMenuHelper, a aVar, long j2) {
        contextMenuHelper.a(j2, this.n, aVar.b);
    }

    public final ContextMenuViewModel a(ContextMenuViewModel contextMenuViewModel, boolean z) {
        return jql.a(contextMenuViewModel, z);
    }

    public final ContextMenuViewModel a(jqo<Void> jqo) {
        return b(this.k);
    }

    public final Observable<ContextMenuViewModel> a(jqo<Void> jqo, fqn fqn) {
        return Observable.b(b(this.k));
    }
}
