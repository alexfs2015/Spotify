package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.wrapped2019.stories.container.StoriesContainerActivity;

/* renamed from: kdr reason: default package */
public final class kdr implements spt {
    private final Context a;

    kdr(Context context) {
        this.a = context;
    }

    public final void a(sps sps) {
        sps.a(LinkType.WRAPPED_DATA_STORIES, "open the wrapped stories", (wuu<Intent, fpt, Intent>) new $$Lambda$kdr$l4ATrh7ghjJ42Jd53uJclSdY4uA<Intent,fpt,Intent>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fpt fpt) {
        if (fpt.b(kdq.a)) {
            return new Intent().setComponent(new ComponentName(this.a, StoriesContainerActivity.class));
        }
        return null;
    }
}
