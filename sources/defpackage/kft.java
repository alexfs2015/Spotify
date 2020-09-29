package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.wrapped2019.stories.container.StoriesContainerActivity;

/* renamed from: kft reason: default package */
public final class kft implements taa {
    private final Context a;

    kft(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fqn fqn) {
        if (fqn.b(kfs.a)) {
            return new Intent().setComponent(new ComponentName(this.a, StoriesContainerActivity.class));
        }
        return null;
    }

    public final void a(szz szz) {
        szz.a(LinkType.WRAPPED_DATA_STORIES, "open the wrapped stories", (xiz<Intent, fqn, Intent>) new $$Lambda$kft$amGuDvye_FkUjvh2AJp0jLJ2k5Q<Intent,fqn,Intent>(this));
    }
}
