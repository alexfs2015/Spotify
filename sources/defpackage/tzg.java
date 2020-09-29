package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tzg reason: default package */
public final class tzg {
    private static final String a = ViewUris.j.toString();
    private final szl b;
    private final tzi c;
    private final boolean d;
    private final ksk e;

    /* renamed from: tzg$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[YourLibraryPageId.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId[] r0 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.PODCAST_EPISODES     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.yourlibrary.interfaces.YourLibraryPageId r1 = com.spotify.music.yourlibrary.interfaces.YourLibraryPageId.PODCAST_FOLLOWED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tzg.AnonymousClass1.<clinit>():void");
        }
    }

    public tzg(szl szl, tzi tzi, boolean z, ksk ksk) {
        this.b = szl;
        this.c = tzi;
        this.d = z;
        this.e = ksk;
    }

    private static View a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnClickListener onClickListener, ViewGroup viewGroup) {
        fvi b2 = fvm.b(context, viewGroup);
        b2.getView().setBackgroundColor(0);
        a(b2, charSequence, charSequence2);
        a(b2, onClickListener, charSequence3);
        b2.getView().setId(R.id.empty_state_view);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        a(nestedScrollView, b2);
        nestedScrollView.setId(R.id.empty);
        return nestedScrollView;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, View view) {
        context.startActivity(this.b.a(szk.a(a).a()));
        tzi tzi = this.c;
        String str = a;
        jlr jlr = tzi.b;
        bg bgVar = new bg(null, tzi.c.a(), tzi.d.toString(), "", -1, str, InteractionType.HIT.toString(), "navigate-to-browse-podcast", (double) tzi.a.a());
        jlr.a(bgVar);
    }

    private static void a(NestedScrollView nestedScrollView, fvi fvi) {
        nestedScrollView.setLayoutParams(new LayoutParams(-1, -1));
        nestedScrollView.addView(fvi.getView());
        nestedScrollView.a(true);
    }

    private static void a(fvi fvi, OnClickListener onClickListener, CharSequence charSequence) {
        fvi.c(charSequence);
        fvi.V_().setOnClickListener(onClickListener);
    }

    private static void a(fvi fvi, CharSequence charSequence, CharSequence charSequence2) {
        fvi.a(charSequence);
        fvi.b(charSequence2);
    }

    public final View a(tza tza, Context context, ViewGroup viewGroup) {
        $$Lambda$tzg$Vl9YKllagcMTiCOBp6MkRNpiMKk r4 = new $$Lambda$tzg$Vl9YKllagcMTiCOBp6MkRNpiMKk(this, context);
        if (this.d) {
            int i = AnonymousClass1.a[tza.a().ordinal()];
            if (i == 1) {
                return this.e.b(context, viewGroup, tza.e(), r4);
            }
            if (i == 2) {
                return this.e.a(context, viewGroup, tza.e(), r4);
            }
            return a(context, tza.c(), tza.d(), tza.e(), r4, viewGroup);
        }
        return a(context, tza.c(), tza.d(), tza.e(), r4, viewGroup);
    }
}
