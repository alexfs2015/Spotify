package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.hash.Hashing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: vjx reason: default package */
public final class vjx {
    private static final Comparator<a> a = fct.a($$Lambda$vjx$Os2IomF0eEIXrYjSX1TdjcuOcaA.INSTANCE);
    private static final Comparator<a> b = fct.a($$Lambda$vjx$JhlPtZIj_J803ueFw0BzqEfDlw.INSTANCE);

    /* renamed from: vjx$a */
    static class a implements Entry<String, Object> {
        final String a;
        /* access modifiers changed from: private */
        public Object b;
        /* access modifiers changed from: private */
        public char c;
        /* access modifiers changed from: private */
        public int d;

        a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public final Object getValue() {
            return this.b;
        }

        public final Object setValue(Object obj) {
            this.b = obj;
            return this.b;
        }

        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        int b2 = aVar.c - aVar2.c;
        return b2 == 0 ? aVar.d - aVar2.d : b2;
    }

    private static void a(List<a> list) {
        StringBuilder sb = new StringBuilder(list.size());
        for (a a2 : list) {
            sb.append(a2.b);
        }
        String hashCode = Hashing.c().a(sb, far.c).toString();
        for (int i = 0; i < list.size(); i++) {
            a aVar = (a) list.get(i);
            aVar.c = hashCode.charAt(i);
            aVar.d = i;
        }
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new a((String) entry.getKey(), entry.getValue()));
        }
        Collections.sort(arrayList, a);
        a((List<a>) arrayList);
        Collections.sort(arrayList, b);
        return ImmutableMap.g().a((Iterable<? extends Entry<? extends K, ? extends V>>) arrayList).b();
    }
}
