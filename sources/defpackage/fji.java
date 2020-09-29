package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fji reason: default package */
public final class fji implements fio {
    final boolean a;
    private final fiu b;

    /* renamed from: fji$a */
    final class a<K, V> extends fin<Map<K, V>> {
        private final fin<K> a;
        private final fin<V> b;
        private final fiy<? extends Map<K, V>> c;

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                fjw.e();
            } else if (!fji.this.a) {
                fjw.c();
                for (Entry entry : map.entrySet()) {
                    fjw.a(String.valueOf(entry.getKey()));
                    this.b.a(fjw, entry.getValue());
                }
                fjw.d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    fih a2 = this.a.a(entry2.getKey());
                    arrayList.add(a2);
                    arrayList2.add(entry2.getValue());
                    z |= (a2 instanceof fif) || (a2 instanceof fij);
                }
                if (z) {
                    fjw.a();
                    int size = arrayList.size();
                    while (i < size) {
                        fjw.a();
                        fja.a((fih) arrayList.get(i), fjw);
                        this.b.a(fjw, arrayList2.get(i));
                        fjw.b();
                        i++;
                    }
                    fjw.b();
                    return;
                }
                fjw.c();
                int size2 = arrayList.size();
                while (i < size2) {
                    fih fih = (fih) arrayList.get(i);
                    if (fih instanceof fil) {
                        fil h = fih.h();
                        if (h.a instanceof Number) {
                            str = String.valueOf(h.a());
                        } else if (h.a instanceof Boolean) {
                            str = Boolean.toString(h.f());
                        } else if (h.a instanceof String) {
                            str = h.b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (fih instanceof fii) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    fjw.a(str);
                    this.b.a(fjw, arrayList2.get(i));
                    i++;
                }
                fjw.d();
            }
        }

        public a(fid fid, Type type, fin<K> fin, Type type2, fin<V> fin2, fiy<? extends Map<K, V>> fiy) {
            this.a = new fjo(fid, fin, type);
            this.b = new fjo(fid, fin2, type2);
            this.c = fiy;
        }

        public final /* synthetic */ Object a(fjv fjv) {
            JsonToken f = fjv.f();
            if (f == JsonToken.NULL) {
                fjv.k();
                return null;
            }
            Map map = (Map) this.c.a();
            String str = "duplicate key: ";
            if (f == JsonToken.BEGIN_ARRAY) {
                fjv.a();
                while (fjv.e()) {
                    fjv.a();
                    Object a2 = this.a.a(fjv);
                    if (map.put(a2, this.b.a(fjv)) == null) {
                        fjv.b();
                    } else {
                        StringBuilder sb = new StringBuilder(str);
                        sb.append(a2);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                fjv.b();
            } else {
                fjv.c();
                while (fjv.e()) {
                    fix.a.a(fjv);
                    Object a3 = this.a.a(fjv);
                    if (map.put(a3, this.b.a(fjv)) != null) {
                        StringBuilder sb2 = new StringBuilder(str);
                        sb2.append(a3);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                fjv.d();
            }
            return map;
        }
    }

    public fji(fiu fiu, boolean z) {
        this.b = fiu;
        this.a = z;
    }

    public final <T> fin<T> a(fid fid, fju<T> fju) {
        fin<Boolean> fin;
        Type type = fju.b;
        if (!Map.class.isAssignableFrom(fju.a)) {
            return null;
        }
        Type[] b2 = C$Gson$Types.b(type, C$Gson$Types.b(type));
        Type type2 = b2[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            fin = fjp.c;
        } else {
            fin = fid.a(fju.a(type2));
        }
        fid fid2 = fid;
        a aVar = new a(fid2, b2[0], fin, b2[1], fid.a(fju.a(b2[1])), this.b.a(fju));
        return aVar;
    }
}
