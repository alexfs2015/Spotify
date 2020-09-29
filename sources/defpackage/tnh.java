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

/* renamed from: tnh reason: default package */
public final class tnh {
    private static final String a = ViewUris.k.toString();
    private final spe b;
    private final tnj c;
    private final boolean d;
    private final kpb e;

    /* renamed from: tnh$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tnh.AnonymousClass1.<clinit>():void");
        }
    }

    public tnh(spe spe, tnj tnj, boolean z, kpb kpb) {
        this.b = spe;
        this.c = tnj;
        this.d = z;
        this.e = kpb;
    }

    public final View a(tnb tnb, Context context, ViewGroup viewGroup) {
        $$Lambda$tnh$31wxHUu4tm4jHoKREJy98qTgqo r4 = new $$Lambda$tnh$31wxHUu4tm4jHoKREJy98qTgqo(this, context);
        if (this.d) {
            int i = AnonymousClass1.a[tnb.a().ordinal()];
            if (i == 1) {
                return this.e.b(context, viewGroup, tnb.e(), r4);
            }
            if (i == 2) {
                return this.e.a(context, viewGroup, tnb.e(), r4);
            }
            return a(context, tnb.c(), tnb.d(), tnb.e(), r4, viewGroup);
        }
        return a(context, tnb.c(), tnb.d(), tnb.e(), r4, viewGroup);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, View view) {
        context.startActivity(this.b.a(spd.a(a).a()));
        tnj tnj = this.c;
        String str = a;
        jjf jjf = tnj.b;
        bh bhVar = new bh(null, tnj.c.a(), tnj.d.toString(), "", -1, str, InteractionType.HIT.toString(), "navigate-to-browse-podcast", (double) tnj.a.a());
        jjf.a(bhVar);
    }

    private static View a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnClickListener onClickListener, ViewGroup viewGroup) {
        fuo b2 = fus.b(context, viewGroup);
        b2.getView().setBackgroundColor(0);
        a(b2, charSequence, charSequence2);
        a(b2, onClickListener, charSequence3);
        b2.getView().setId(R.id.empty_state_view);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        a(nestedScrollView, b2);
        nestedScrollView.setId(R.id.empty);
        return nestedScrollView;
    }

    private static void a(fuo fuo, OnClickListener onClickListener, CharSequence charSequence) {
        fuo.c(charSequence);
        fuo.V_().setOnClickListener(onClickListener);
    }

    private static void a(fuo fuo, CharSequence charSequence, CharSequence charSequence2) {
        fuo.a(charSequence);
        fuo.b(charSequence2);
    }

    private static void a(NestedScrollView nestedScrollView, fuo fuo) {
        nestedScrollView.setLayoutParams(new LayoutParams(-1, -1));
        nestedScrollView.addView(fuo.getView());
        nestedScrollView.a(true);
    }
}
