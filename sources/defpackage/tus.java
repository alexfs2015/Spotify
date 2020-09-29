package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.List;

/* renamed from: tus reason: default package */
final class tus {
    private final tvw a;

    public tus(tvw tvw) {
        this.a = tvw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, vle vle, View view) {
        this.a.c(i, vle);
    }

    public final List<View> a(Context context, vle vle, int i) {
        ImageButton a2 = jyz.a(context, jyz.c(context, SpotifyIconV2.BAN_ACTIVE));
        a2.setOnClickListener(new $$Lambda$tus$PtKZI_gLhLTBDxAZMi957EQm4HE(this, i, vle));
        return ImmutableList.a(a2);
    }
}
