package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: azd reason: default package */
public final class azd extends azf {
    public static final azd a;
    public final List<a> b;
    public final List<a> c;
    public final List<a> d;
    public final aqe e;
    public final List<aqe> f;
    public final Map<String, String> g;

    /* renamed from: azd$a */
    public static final class a {
        public final String a;
        public final aqe b;

        public a(String str, aqe aqe) {
            this.a = str;
            this.b = aqe;
        }
    }

    static {
        azd azd = new azd("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap());
        a = azd;
    }

    public azd(String str, List<String> list, List<a> list2, List<a> list3, List<a> list4, aqe aqe, List<aqe> list5, boolean z, Map<String, String> map) {
        super(str, list, z);
        this.b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.e = aqe;
        this.f = list5 != null ? Collections.unmodifiableList(list5) : null;
        this.g = Collections.unmodifiableMap(map);
    }

    private static List<a> a(List<a> list, int i, List<axd> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar = (a) list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                axd axd = (axd) list2.get(i3);
                if (axd.a == i && axd.b == i2) {
                    arrayList.add(aVar);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    public static azd a(String str) {
        List singletonList = Collections.singletonList(new a(str, aqe.b(Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, "application/x-mpegURL", null, null, -1, 0, null)));
        List emptyList = Collections.emptyList();
        azd azd = new azd(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null, false, Collections.emptyMap());
        return azd;
    }

    public final /* synthetic */ Object a(List list) {
        azd azd = new azd(this.n, this.o, a(this.b, 0, list), a(this.c, 1, list), a(this.d, 2, list), this.e, this.f, this.p, this.g);
        return azd;
    }
}
