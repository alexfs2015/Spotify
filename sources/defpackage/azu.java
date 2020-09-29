package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: azu reason: default package */
public final class azu extends azw {
    public static final azu a;
    public final List<a> b;
    public final List<a> c;
    public final List<a> d;
    public final aqv e;
    public final List<aqv> f;
    public final Map<String, String> g;

    /* renamed from: azu$a */
    public static final class a {
        public final String a;
        public final aqv b;

        public a(String str, aqv aqv) {
            this.a = str;
            this.b = aqv;
        }
    }

    static {
        azu azu = new azu("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap());
        a = azu;
    }

    public azu(String str, List<String> list, List<a> list2, List<a> list3, List<a> list4, aqv aqv, List<aqv> list5, boolean z, Map<String, String> map) {
        super(str, list, z);
        this.b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.e = aqv;
        this.f = list5 != null ? Collections.unmodifiableList(list5) : null;
        this.g = Collections.unmodifiableMap(map);
    }

    public static azu a(String str) {
        List singletonList = Collections.singletonList(new a(str, aqv.b(Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, "application/x-mpegURL", null, null, -1, 0, null)));
        List emptyList = Collections.emptyList();
        azu azu = new azu(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null, false, Collections.emptyMap());
        return azu;
    }

    private static List<a> a(List<a> list, int i, List<axu> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar = (a) list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                axu axu = (axu) list2.get(i3);
                if (axu.a == i && axu.b == i2) {
                    arrayList.add(aVar);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ Object a(List list) {
        azu azu = new azu(this.n, this.o, a(this.b, 0, list), a(this.c, 1, list), a(this.d, 2, list), this.e, this.f, this.p, this.g);
        return azu;
    }
}
