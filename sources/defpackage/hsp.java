package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: hsp reason: default package */
public final class hsp implements hpd {
    private boolean a;
    private final Context b;
    private final rxj c;
    private final gsy d;
    private final gkd e;
    private Disposable f = Disposables.b();
    private final hpb g;

    public hsp(Context context, rxj rxj, gsy gsy, gkd gkd, hpb hpb) {
        this.b = context;
        this.c = rxj;
        this.d = gsy;
        this.e = gkd;
        this.g = hpb;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            this.f.bf_();
        }
    }

    public final void a(String str, hpe hpe) {
        if (!a(str)) {
            hpe.a((Throwable) new IllegalArgumentException());
        } else if (this.a) {
            hpe.a((Throwable) new IllegalStateException("stopped"));
        } else {
            rxi a2 = this.c.a(str);
            a2.a(Integer.valueOf(0), Integer.valueOf(30));
            this.f.bf_();
            Single a3 = this.d.a(str).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hsp$syundvS64LOo8j0yGsivpWKO_M0<Object,Object>(a2));
            $$Lambda$hsp$KETc3eUV5r8I1HDC3elWxWljE4 r0 = new $$Lambda$hsp$KETc3eUV5r8I1HDC3elWxWljE4(this, hpe);
            hpe.getClass();
            this.f = a3.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$ciwLWVswmbKGApdvBGrOTKPJs<Object>(hpe));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(gkf gkf, uys uys) {
        char c2;
        char c3;
        String str;
        String str2;
        int i;
        gkf gkf2 = gkf;
        gkd gkd = this.e;
        Resources resources = this.b.getResources();
        boolean e2 = gkf.e();
        boolean d2 = gkf.d();
        int a2 = gkf.a();
        int b2 = gkf.b();
        if (e2 || b2 == 0) {
            c2 = 2;
        } else {
            c2 = (b2 < 0 || (!d2 && a2 - b2 <= 0)) ? (char) 0 : 1;
        }
        if (c2 == 1) {
            Object[] objArr = new Object[2];
            gke a3 = gke.a((long) gkf.b());
            if (a3.b > 0) {
                StringBuilder sb = new StringBuilder();
                c3 = 1;
                sb.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_hours, (int) a3.b, new Object[]{Long.valueOf(a3.b)}));
                sb.append(' ');
                sb.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.c, new Object[]{Long.valueOf(a3.c)}));
                str = sb.toString();
            } else {
                c3 = 1;
                str = resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.c, new Object[]{Long.valueOf(a3.c)});
            }
            objArr[0] = str;
            objArr[c3] = gkd.a(resources, gkf2);
            return resources.getString(R.string.subtitle_general_structure, objArr);
        } else if (c2 == 2) {
            return resources.getString(R.string.android_auto_podcast_episode_played);
        } else {
            Object[] objArr2 = new Object[2];
            gke a4 = gke.a((long) gkf.a());
            if (a4.b > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_hours, (int) a4.b, new Object[]{Long.valueOf(a4.b)}));
                sb2.append(' ');
                i = 1;
                sb2.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a4.c, new Object[]{Long.valueOf(a4.c)}));
                str2 = sb2.toString();
            } else {
                i = 1;
                str2 = resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a4.c, new Object[]{Long.valueOf(a4.c)});
            }
            Object[] objArr3 = new Object[i];
            objArr3[0] = str2;
            objArr2[0] = resources.getString(R.string.android_auto_podcast_episode_time_left, objArr3);
            objArr2[i] = gkd.a(resources, gkf2);
            return resources.getString(R.string.subtitle_general_structure, objArr2);
        }
    }

    public final boolean a(String str) {
        return jst.a(str).b == LinkType.SHOW_SHOW;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpe hpe, uzx uzx) {
        uys[] uysArr;
        ArrayList arrayList = new ArrayList(((uys[]) uzx.getItems()).length);
        for (uys uys : (uys[]) uzx.getItems()) {
            hpb hpb = this.g;
            a a2 = new a().b(-1).a(false).a(uys.m());
            Integer n = uys.n();
            if (n != null) {
                a2.b(n.intValue());
            }
            arrayList.add(hpb.a(uys, new $$Lambda$hsp$Xeh5fKBcxPkaG1GKTuPT1jah86g(this, a2.b(uys.o()).a(new Date(((long) uys.s()) * 1000)).a(false).a())));
        }
        hpe.a((List<MediaBrowserItem>) arrayList);
    }
}
