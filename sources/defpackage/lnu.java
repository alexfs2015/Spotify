package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: lnu reason: default package */
public final class lnu implements rnx<Button> {
    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        final Context context = viewGroup.getContext();
        gat.a();
        final Button a = a.a(context);
        final AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                ShufflePlayHeaderView.a(new jts(), a);
            }
        };
        a.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                mh.a(context).a(r0, new IntentFilter("on-demand-restricted"));
            }

            public final void onViewDetachedFromWindow(View view) {
                mh.a(context).a(r0);
            }
        });
        return a;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        hdj.a((View) (Button) view, hcm, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        Button button = (Button) view;
        String icon = hcm.images().icon();
        SpotifyIconV2 spotifyIconV2 = !TextUtils.isEmpty(icon) ? (SpotifyIconV2) a.a.a(icon).d() : null;
        String title = hcm.text().title();
        Context context = button.getContext();
        if (TextUtils.isEmpty(title)) {
            title = "";
        }
        jso.a(context, button, spotifyIconV2, title);
        gwj.a(gwm, (View) button, hcm);
    }

    public final int b() {
        return R.id.fixed_size_hubs_shuffle_button;
    }
}
