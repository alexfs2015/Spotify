package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.music.R;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: hti reason: default package */
public final class hti implements hth {
    private final Context b;
    private final sgt c;
    private final gux d;
    private final hrc e;
    private final glo f;

    public hti(Context context, sgt sgt, gux gux, glo glo, hrc hrc) {
        this.b = context;
        this.c = sgt;
        this.d = gux;
        this.f = glo;
        this.e = hrc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(glr glr, vkv vkv) {
        char c2;
        char c3;
        String str;
        String str2;
        int i;
        glr glr2 = glr;
        glo glo = this.f;
        Resources resources = this.b.getResources();
        boolean e2 = glr.e();
        boolean d2 = glr.d();
        int a = glr.a();
        int b2 = glr.b();
        if (e2 || b2 == 0) {
            c2 = 2;
        } else {
            c2 = (b2 < 0 || (!d2 && a - b2 <= 0)) ? (char) 0 : 1;
        }
        if (c2 == 1) {
            Object[] objArr = new Object[2];
            glq a2 = glq.a((long) glr.b());
            if (a2.b > 0) {
                StringBuilder sb = new StringBuilder();
                c3 = 1;
                sb.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_hours, (int) a2.b, new Object[]{Long.valueOf(a2.b)}));
                sb.append(' ');
                sb.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a2.c, new Object[]{Long.valueOf(a2.c)}));
                str = sb.toString();
            } else {
                c3 = 1;
                str = resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a2.c, new Object[]{Long.valueOf(a2.c)});
            }
            objArr[0] = str;
            objArr[c3] = glo.a(resources, glr2);
            return resources.getString(R.string.subtitle_general_structure, objArr);
        } else if (c2 == 2) {
            return resources.getString(R.string.android_auto_podcast_episode_played);
        } else {
            Object[] objArr2 = new Object[2];
            glq a3 = glq.a((long) glr.a());
            if (a3.b > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_hours, (int) a3.b, new Object[]{Long.valueOf(a3.b)}));
                sb2.append(' ');
                i = 1;
                sb2.append(resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.c, new Object[]{Long.valueOf(a3.c)}));
                str2 = sb2.toString();
            } else {
                i = 1;
                str2 = resources.getQuantityString(R.plurals.android_auto_podcast_episode_time_format_min, (int) a3.c, new Object[]{Long.valueOf(a3.c)});
            }
            Object[] objArr3 = new Object[i];
            objArr3[0] = str2;
            objArr2[0] = resources.getString(R.string.android_auto_podcast_episode_time_left, objArr3);
            objArr2[i] = glo.a(resources, glr2);
            return resources.getString(R.string.subtitle_general_structure, objArr2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(vml vml) {
        vkv[] vkvArr;
        ArrayList arrayList = new ArrayList(((vkv[]) vml.getItems()).length);
        for (vkv vkv : (vkv[]) vml.getItems()) {
            hrc hrc = this.e;
            a a = new a().b(-1).a(false).a(vkv.m());
            Integer n = vkv.n();
            if (n != null) {
                a.b(n.intValue());
            }
            arrayList.add(hrc.a(vkv, new $$Lambda$hti$46Gc0RtCGfbxPV_w1KNHS7SBE6k(this, a.b(vkv.o()).a(new Date(((long) vkv.s()) * 1000)).a(false).a())));
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        sgs a = this.c.a(huo.b());
        a.a(Integer.valueOf(0), Integer.valueOf(30));
        a.a(false, !z, false);
        return this.d.a(huo.b()).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hti$nAdv2Hw5VkLG7S6xsltYGchcVmU<Object,Object>(a)).f(new $$Lambda$hti$wdbD4ZQA0xSoofHtkKCuna6Hac(this));
    }
}
