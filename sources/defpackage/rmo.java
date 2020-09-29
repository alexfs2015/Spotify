package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rmo reason: default package */
public final class rmo implements rnx<View> {
    private final a a;
    private final heg b;

    public rmo(a aVar, heg heg) {
        this.a = aVar;
        this.b = heg;
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        final Context context = viewGroup.getContext();
        gmu a2 = this.a.a(context);
        a2.a(!this.b.b());
        final View a3 = a2.a();
        final AnonymousClass1 r0 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                ShufflePlayHeaderView.a(new jts(), a3);
            }
        };
        a3.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                mh.a(context).a(r0, new IntentFilter("on-demand-restricted"));
            }

            public final void onViewDetachedFromWindow(View view) {
                mh.a(context).a(r0);
            }
        });
        return a3;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        gwj.a(gwm, view, hcm);
    }

    public final int b() {
        return R.id.round_shuffle_play_button;
    }
}
