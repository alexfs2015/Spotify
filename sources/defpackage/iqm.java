package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iqm reason: default package */
public final class iqm {
    public static final b<Object, Boolean> a = b.b("albums_show_only_offlined_content");
    public static final b<Object, Boolean> b = b.b("artists_show_only_offlined_content");
    public static final b<Object, Boolean> c = b.b("tracks_show_only_offlined_content");
    private static b<Object, Boolean> f = b.b("playlists_show_only_offlined_content");
    public final List<upp> d;
    public a e;
    /* access modifiers changed from: private */
    public final upp g;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> h;
    /* access modifiers changed from: private */
    public final b<Object, Boolean> i;
    /* access modifiers changed from: private */
    public final jsz j;
    private final Context k;
    private final boolean l;
    /* access modifiers changed from: private */
    public final CollectionLogger m;
    private final BroadcastReceiver n = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            iqm.this.g.a = iqm.this.h.a(iqm.this.i, false);
            if (iqm.this.e != null) {
                iqm.this.e.onFilterChanged();
            }
        }
    };
    private final defpackage.upp.a o = new defpackage.upp.a() {
        public final void a(upp upp) {
            iqm.this.h.a().a(iqm.this.i, upp.a).b();
            String str = "filter";
            if (upp.a) {
                iqm.this.m.a(null, str, InteractionType.HIT, UserIntent.SHOW_ONLY_OFFLINED_CONTENT);
                iqm.this.j.a((int) R.string.toast_showing_offlined_content_only, 0, new Object[0]);
            } else {
                iqm.this.m.a(null, str, InteractionType.HIT, UserIntent.SHOW_ALL_CONTENT);
                iqm.this.j.a((int) R.string.toast_showing_all_content, 0, new Object[0]);
            }
            if (iqm.this.e != null) {
                iqm.this.e.onFilterChanged();
            }
        }
    };

    /* renamed from: iqm$a */
    public interface a {
        void onFilterChanged();
    }

    public iqm(Context context, CollectionLogger collectionLogger, boolean z, SpSharedPreferences<Object> spSharedPreferences, b<Object, Boolean> bVar, jsz jsz) {
        this.j = jsz;
        this.g = new upp(this.o, R.string.filter_show_only_offlined_content);
        this.d = new ArrayList();
        this.l = z;
        if (z) {
            this.d.add(this.g);
        }
        this.k = context;
        this.m = collectionLogger;
        this.h = spSharedPreferences;
        this.i = bVar;
        this.g.a = this.h.a(bVar, false);
        context.registerReceiver(this.n, new IntentFilter("com.spotify.mobile.android.spotlets.collection.util.OFFLINE_MODE_CHANGED"));
    }

    public final void a(upp upp) {
        this.d.add(upp);
    }

    public final void a() {
        this.k.unregisterReceiver(this.n);
    }

    public final void b() {
        this.h.a().a(this.i, false).b();
        this.g.a = false;
        this.m.a(null, "filter", InteractionType.HIT, UserIntent.SHOW_ALL_CONTENT);
        a aVar = this.e;
        if (aVar != null) {
            aVar.onFilterChanged();
        }
    }

    public final boolean c() {
        return this.l && this.g.a;
    }

    public static void a(Context context, boolean z, String str) {
        ((jvy) ggw.a(jvy.class)).c(context).a().a(a, z).a(b, z).a(c, z).a(f, z).b();
        context.sendBroadcast(new Intent("com.spotify.mobile.android.spotlets.collection.util.OFFLINE_MODE_CHANGED"));
    }
}
