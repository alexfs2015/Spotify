package defpackage;

import android.content.Context;
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

/* renamed from: tvq reason: default package */
final class tvq<T> {
    private final Context a;
    private final sso b;
    private final who<jor<T>> c;

    tvq(Context context, sso sso, who<jor<T>> who) {
        this.a = context;
        this.b = sso;
        this.c = who;
    }

    private static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, OnClickListener onClickListener) {
        ImageButton a2 = jyz.a(context, i != 0 ? jyz.b(context, spotifyIconV2, vgl.d(context, i)) : jyz.c(context, spotifyIconV2));
        a2.setContentDescription(a2.getResources().getString(i2));
        a2.setOnClickListener(onClickListener);
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(Object obj, View view) {
        jok.a(this.a, (jor) this.c.get(), obj, this.b);
        return true;
    }

    public final List<View> a(T t) {
        Context context = this.a;
        return Collections.singletonList(jqq.a(context, jyz.c(context, SpotifyIconV2.MORE_ANDROID), (jor) this.c.get(), t, this.b));
    }

    public final List<View> a(boolean z, T t, OnClickListener onClickListener) {
        ArrayList a2 = Lists.a();
        a2.add(a(this.a, z ? SpotifyIconV2.HEART_ACTIVE : SpotifyIconV2.HEART, z ? R.attr.pasteColorAccessoryGreen : 0, z ? R.string.playlist_ui_components_content_description_collection_remove : R.string.playlist_ui_components_content_description_collection_add, onClickListener));
        Context context = this.a;
        a2.add(jqq.a(context, jyz.c(context, SpotifyIconV2.MORE_ANDROID), (jor) this.c.get(), t, this.b));
        return a2;
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
        a2.add(jqq.a(context2, jyz.c(context2, SpotifyIconV2.MORE_ANDROID), (jor) this.c.get(), t, this.b));
        return a2;
    }

    public final OnLongClickListener b(T t) {
        return new $$Lambda$tvq$jvOdD2oqL5lTvOrYxTTo3djpZKw(this, t);
    }
}
