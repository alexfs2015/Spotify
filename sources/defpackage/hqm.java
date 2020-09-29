package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import io.reactivex.Single;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.List;

/* renamed from: hqm reason: default package */
public final class hqm implements hqx {
    private final Context b;
    private final vea c;
    private final BehaviorSubject<Boolean> d = BehaviorSubject.a();

    public hqm(Context context, kxz kxz, vea vea) {
        this.b = context;
        this.c = vea;
        kxz.a().subscribe(this.d);
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        if (!this.c.a()) {
            return Single.b(a());
        }
        return Single.b(this.d.j()).f(new $$Lambda$hqm$J5oc2PSMPNag9StJhIYxsUCA_Dk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(Boolean bool) {
        if (bool.booleanValue()) {
            return a();
        }
        Context context = this.b;
        hpa hpa = new hpa("com.spotify.androidauto.offline-library");
        hpa.a = ActionType.BROWSABLE;
        hpa.b = context.getString(R.string.collection_title_your_library);
        hpa.d = gbf.a(context, R.drawable.mediaservice_yourmusic);
        hpa.f = true;
        return Collections.singletonList(hpa.b());
    }

    private List<MediaBrowserItem> a() {
        return Lists.a((E[]) new MediaBrowserItem[]{hpl.a(this.b), hpy.a(this.b), hpt.a(this.b), hqg.a(this.b)});
    }
}
