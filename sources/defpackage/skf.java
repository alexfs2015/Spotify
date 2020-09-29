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

/* renamed from: skf reason: default package */
public final class skf implements rev<Button>, skj {
    final skk a;
    Button b;
    private String c;

    public final int b() {
        return R.id.low_friction_search_shuffle_button_component;
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
        haq.a((View) (Button) view, gzt, aVar, iArr);
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, b bVar) {
        Button button = (Button) view;
        this.c = (String) gzt.metadata().get("uri");
        guj.a(gum, (View) button, gzt);
    }

    public final String c() {
        return this.c;
    }

    public skf(skk skk) {
        this.a = (skk) fay.a(skk);
    }

    public final void d() {
        this.b.setText(R.string.header_shuffle_play);
    }

    public final void e() {
        this.b.setText(R.string.header_pause);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        Button button;
        final Context context = viewGroup.getContext();
        Context context2 = (Context) fay.a(viewGroup.getContext());
        if (jtc.b(context2)) {
            button = fzc.a(context2, "", SpotifyIconV2.PLAY, null);
        } else {
            fzz.a();
            button = a.a(context2);
            button.setText(R.string.header_shuffle_play);
        }
        this.b = button;
        final AnonymousClass1 r4 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                ShufflePlayHeaderView.a(new jri(), skf.this.b);
            }
        };
        this.b.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                Context context = (Context) fay.a(view.getContext());
                mc.a(context).a(r4, new IntentFilter("on-demand-restricted"));
                skf.this.a.a((skj) skf.this);
            }

            public final void onViewDetachedFromWindow(View view) {
                skf.this.a.a.bf_();
                mc.a(context).a(r4);
            }
        });
        return this.b;
    }
}
