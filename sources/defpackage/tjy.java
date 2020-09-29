package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageButton;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tjy reason: default package */
final class tjy<T> {
    private final Context a;
    private final sih b;
    private final vti<jmf<T>> c;

    tjy(Context context, sih sih, vti<jmf<T>> vti) {
        this.a = context;
        this.b = sih;
        this.c = vti;
    }

    public final List<View> a(boolean z, boolean z2, T t, OnClickListener onClickListener, OnClickListener onClickListener2, boolean z3) {
        SpotifyIconV2 spotifyIconV2;
        SpotifyIconV2 spotifyIconV22;
        ArrayList a2 = Lists.a();
        int i = 0;
        a2.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? R.attr.pasteColorAccessoryGreen : 0, z ? R.string.playlist_ui_components_content_description_collection_remove : R.string.playlist_ui_components_content_description_collection_add, onClickListener));
        if (z3) {
            spotifyIconV22 = SpotifyIconV2.BLOCK;
            spotifyIconV2 = SpotifyIconV2.BLOCK;
        } else {
            spotifyIconV22 = SpotifyIconV2.BAN;
            spotifyIconV2 = SpotifyIconV2.BAN_ACTIVE;
        }
        Context context = this.a;
        if (z2) {
            spotifyIconV22 = spotifyIconV2;
        }
        if (z2) {
            i = R.attr.pasteColorAccessoryRed;
        }
        a2.add(a(context, spotifyIconV22, i, z2 ? R.string.playlist_ui_components_content_description_collection_unban : R.string.playlist_ui_components_content_description_collection_ban, onClickListener2));
        Context context2 = this.a;
        a2.add(joe.a(context2, jwz.c(context2, SpotifyIconV2.MORE_ANDROID), (jmf) this.c.get(), t, this.b));
        return a2;
    }

    public final List<View> a(boolean z, T t, OnClickListener onClickListener) {
        ArrayList a2 = Lists.a();
        a2.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? R.attr.pasteColorAccessoryGreen : 0, z ? R.string.playlist_ui_components_content_description_collection_remove : R.string.playlist_ui_components_content_description_collection_add, onClickListener));
        Context context = this.a;
        a2.add(joe.a(context, jwz.c(context, SpotifyIconV2.MORE_ANDROID), (jmf) this.c.get(), t, this.b));
        return a2;
    }

    public final List<View> a(T t) {
        Context context = this.a;
        return Collections.singletonList(joe.a(context, jwz.c(context, SpotifyIconV2.MORE_ANDROID), (jmf) this.c.get(), t, this.b));
    }

    public final OnLongClickListener b(T t) {
        return new $$Lambda$tjy$HAIpQZ1Lys6UiHO3s08CFXCwEgg(this, t);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Object obj, View view) {
        jly.a(this.a, (jmf) this.c.get(), obj, this.b);
        return true;
    }

    private static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, OnClickListener onClickListener) {
        Drawable drawable;
        if (i != 0) {
            drawable = jwz.b(context, spotifyIconV2, uuu.d(context, i));
        } else {
            drawable = jwz.c(context, spotifyIconV2);
        }
        ImageButton a2 = jwz.a(context, drawable);
        a2.setContentDescription(a2.getResources().getString(i2));
        a2.setOnClickListener(onClickListener);
        return a2;
    }
}
