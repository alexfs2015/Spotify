package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: lxf reason: default package */
public final class lxf implements vua<gum> {
    private final wlc<gvv> a;
    private final wlc<Context> b;
    private final wlc<a> c;
    private final wlc<Map<String, gvk>> d;
    private final wlc<gyl> e;
    private final wlc<luz> f;
    private final wlc<lvb> g;
    private final wlc<lvg> h;
    private final wlc<lwa> i;
    private final wlc<lvu> j;
    private final wlc<lwg> k;
    private final wlc<lvr> l;
    private final wlc<rww> m;

    private lxf(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<Map<String, gvk>> wlc4, wlc<gyl> wlc5, wlc<luz> wlc6, wlc<lvb> wlc7, wlc<lvg> wlc8, wlc<lwa> wlc9, wlc<lvu> wlc10, wlc<lwg> wlc11, wlc<lvr> wlc12, wlc<rww> wlc13) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
    }

    public static lxf a(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<Map<String, gvk>> wlc4, wlc<gyl> wlc5, wlc<luz> wlc6, wlc<lvb> wlc7, wlc<lvg> wlc8, wlc<lwa> wlc9, wlc<lvu> wlc10, wlc<lwg> wlc11, wlc<lvr> wlc12, wlc<rww> wlc13) {
        lxf lxf = new lxf(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13);
        return lxf;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a((Map) this.d.get()).a((gyl) this.e.get()).a(R.id.find_card_category, "find:categoryCard", (luz) this.f.get()).a(R.id.find_card, "find:card", (lvb) this.g.get()).a(R.id.find_header, "find:header", (lvg) this.h.get()).a(R.id.find_search_field, "find:searchField", (lwa) this.i.get()).a(R.id.find_primary_button, "find:primaryButton", (lvu) this.j.get()).a(R.id.find_tertiary_button, "find:tertiaryButton", (lwg) this.k.get()).a(R.id.find_inline_empty_state, "find:inlineEmptyState", (lvr) this.l.get()).a(R.id.podcast_indexed_image_row, "podcast:indexedImageRow", (rww) this.m.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
