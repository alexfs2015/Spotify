package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: ttr reason: default package */
public final class ttr implements rnx<Button>, ttv {
    final ttw a;
    Button b;
    private String c;

    public ttr(ttw ttw) {
        this.a = ttw;
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        Button button;
        final Context context = viewGroup.getContext();
        Context context2 = (Context) fbp.a(viewGroup.getContext());
        if (jvi.b(context2)) {
            button = fzw.a(context2, "", SpotifyIconV2.PLAY, null);
        } else {
            gat.a();
            button = a.a(context2);
            button.setText(R.string.header_shuffle_play);
        }
        this.b = button;
        final AnonymousClass1 r4 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                ShufflePlayHeaderView.a(new jts(), ttr.this.b);
            }
        };
        this.b.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                Context context = (Context) fbp.a(view.getContext());
                mh.a(context).a(r4, new IntentFilter("on-demand-restricted"));
                ttr.this.a.a((ttv) ttr.this);
            }

            public final void onViewDetachedFromWindow(View view) {
                ttr.this.a.a.bd_();
                mh.a(context).a(r4);
            }
        });
        return this.b;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
        hdj.a((View) (Button) view, hcm, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        Button button = (Button) view;
        this.c = (String) hcm.metadata().get("uri");
        gwj.a(gwm, (View) button, hcm);
    }

    public final int b() {
        return R.id.on_demand_sharing_shuffle_button_component;
    }

    public final String c() {
        return this.c;
    }

    public final void d() {
        this.b.setText(R.string.header_shuffle_play);
    }

    public final void e() {
        this.b.setText(R.string.header_pause);
    }
}
