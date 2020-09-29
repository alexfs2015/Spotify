package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fkc reason: default package */
public final class fkc implements fji {
    final boolean a;
    private final fjo b;

    /* renamed from: fkc$a */
    final class a<K, V> extends fjh<Map<K, V>> {
        private final fjh<K> a;
        private final fjh<V> b;
        private final fjs<? extends Map<K, V>> c;

        public a(fix fix, Type type, fjh<K> fjh, Type type2, fjh<V> fjh2, fjs<? extends Map<K, V>> fjs) {
            this.a = new fki(fix, fjh, type);
            this.b = new fki(fix, fjh2, type2);
            this.c = fjs;
        }

        public final /* synthetic */ Object a(fkp fkp) {
            JsonToken f = fkp.f();
            if (f == JsonToken.NULL) {
                fkp.k();
                return null;
            }
            Map map = (Map) this.c.a();
            String str = "duplicate key: ";
            if (f == JsonToken.BEGIN_ARRAY) {
                fkp.a();
                while (fkp.e()) {
                    fkp.a();
                    Object a2 = this.a.a(fkp);
                    if (map.put(a2, this.b.a(fkp)) == null) {
                        fkp.b();
                    } else {
                        StringBuilder sb = new StringBuilder(str);
                        sb.append(a2);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                fkp.b();
            } else {
                fkp.c();
                while (fkp.e()) {
                    fjr.a.a(fkp);
                    Object a3 = this.a.a(fkp);
                    if (map.put(a3, this.b.a(fkp)) != null) {
                        StringBuilder sb2 = new StringBuilder(str);
                        sb2.append(a3);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                fkp.d();
            }
            return map;
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                fkq.e();
            } else if (!fkc.this.a) {
                fkq.c();
                for (Entry entry : map.entrySet()) {
                    fkq.a(String.valueOf(entry.getKey()));
                    this.b.a(fkq, entry.getValue());
                }
                fkq.d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    fjb a2 = this.a.a(entry2.getKey());
                    arrayList.add(a2);
                    arrayList2.add(entry2.getValue());
                    z |= (a2 instanceof fiz) || (a2 instanceof fjd);
                }
                if (z) {
                    fkq.a();
                    int size = arrayList.size();
                    while (i < size) {
                        fkq.a();
                        fju.a((fjb) arrayList.get(i), fkq);
                        this.b.a(fkq, arrayList2.get(i));
                        fkq.b();
                        i++;
                    }
                    fkq.b();
                    return;
                }
                fkq.c();
                int size2 = arrayList.size();
                while (i < size2) {
                    fjb fjb = (fjb) arrayList.get(i);
                    if (fjb instanceof fjf) {
                        fjf h = fjb.h();
                        if (h.a instanceof Number) {
                            str = String.valueOf(h.a());
                        } else if (h.a instanceof Boolean) {
                            str = Boolean.toString(h.f());
                        } else if (h.a instanceof String) {
                            str = h.b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (fjb instanceof fjc) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    fkq.a(str);
                    this.b.a(fkq, arrayList2.get(i));
                    i++;
                }
                fkq.d();
            }
        }
    }

    public fkc(fjo fjo, boolean z) {
        this.b = fjo;
        this.a = z;
    }

    public final <T> fjh<T> a(fix fix, fko<T> fko) {
        Type type = fko.b;
        if (!Map.class.isAssignableFrom(fko.a)) {
            return null;
        }
        Type[] b2 = C$Gson$Types.b(type, C$Gson$Types.b(type));
        Type type2 = b2[0];
        a aVar = new a(fix, b2[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? fkj.c : fix.a(fko.a(type2)), b2[1], fix.a(fko.a(b2[1])), this.b.a(fko));
        return aVar;
    }
}
