package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import java.util.List;

/* renamed from: mam reason: default package */
public final class mam implements wig<hcs> {
    private final wzi<Boolean> a;
    private final wzi<String> b;
    private final wzi<Context> c;
    private final wzi<Boolean> d;
    private final wzi<mdl> e;

    private mam(wzi<Boolean> wzi, wzi<String> wzi2, wzi<Context> wzi3, wzi<Boolean> wzi4, wzi<mdl> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mam a(wzi<Boolean> wzi, wzi<String> wzi2, wzi<Context> wzi3, wzi<Boolean> wzi4, wzi<mdl> wzi5) {
        mam mam = new mam(wzi, wzi2, wzi3, wzi4, wzi5);
        return mam;
    }

    public final /* synthetic */ Object get() {
        Object obj;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        String str = (String) this.b.get();
        Context context = (Context) this.c.get();
        boolean booleanValue2 = ((Boolean) this.d.get()).booleanValue();
        mdl mdl = (mdl) this.e.get();
        if (booleanValue) {
            obj = hbb.b().a(lzf.a(str).a((List<? extends hcm>) ImmutableList.a(mab.a(context.getString(R.string.find_search_field_hint), context.getString(R.string.find_search_field_hint_voice), booleanValue2).a())).a()).a(mdl.a("browse-loading-empty-view")).a();
        } else {
            obj = hdb.EMPTY;
        }
        return (hcs) wil.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
