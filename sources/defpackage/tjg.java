package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.List;

/* renamed from: tjg reason: default package */
final class tjg {
    private final tke a;

    public tjg(tke tke) {
        this.a = tke;
    }

    public final List<View> a(Context context, uzb uzb, int i) {
        ImageButton a2 = jwz.a(context, jwz.c(context, SpotifyIconV2.BAN_ACTIVE));
        a2.setOnClickListener(new $$Lambda$tjg$ZtvhDJjnJ9fqviPjD7R9Wpjhzuw(this, i, uzb));
        return ImmutableList.a(a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, uzb uzb, View view) {
        this.a.c(i, uzb);
    }
}
