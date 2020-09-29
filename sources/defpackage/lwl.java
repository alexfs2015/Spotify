package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import java.util.List;

/* renamed from: lwl reason: default package */
public final class lwl implements vua<gzz> {
    private final wlc<Boolean> a;
    private final wlc<String> b;
    private final wlc<Context> c;
    private final wlc<Boolean> d;
    private final wlc<lzk> e;

    private lwl(wlc<Boolean> wlc, wlc<String> wlc2, wlc<Context> wlc3, wlc<Boolean> wlc4, wlc<lzk> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lwl a(wlc<Boolean> wlc, wlc<String> wlc2, wlc<Context> wlc3, wlc<Boolean> wlc4, wlc<lzk> wlc5) {
        lwl lwl = new lwl(wlc, wlc2, wlc3, wlc4, wlc5);
        return lwl;
    }

    public final /* synthetic */ Object get() {
        Object obj;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        String str = (String) this.b.get();
        Context context = (Context) this.c.get();
        boolean booleanValue2 = ((Boolean) this.d.get()).booleanValue();
        lzk lzk = (lzk) this.e.get();
        if (booleanValue) {
            obj = gyi.b().a(lvg.a(str).a((List<? extends gzt>) ImmutableList.a(lwa.a(context.getString(R.string.find_search_field_hint), context.getString(R.string.find_search_field_hint_voice), booleanValue2).a())).a()).a(lzk.a("browse-loading-empty-view")).a();
        } else {
            obj = hai.EMPTY;
        }
        return (gzz) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
