package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: hmm reason: default package */
public abstract class hmm implements hmi {
    private List<fqm<?>> a;
    private List<fqm<? extends Serializable>> b;
    private List<fqm<?>> c;

    private static void a(List<? extends hmi> list, List<fqm<?>> list2, List<fqm<? extends Serializable>> list3, List<fqm<?>> list4) {
        for (hmi hmi : list) {
            Field[] declaredFields = hmi.getClass().getDeclaredFields();
            try {
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Field field = declaredFields[i];
                        if (fqm.class.isAssignableFrom(field.getType())) {
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            fqm fqm = (fqm) field.get(null);
                            String str = fqm.d.a;
                            char c2 = 65535;
                            int hashCode = str.hashCode();
                            if (hashCode != -45418957) {
                                if (hashCode == 2987040) {
                                    if (str.equals("abba")) {
                                        c2 = 1;
                                    }
                                }
                            } else if (str.equals("product-state")) {
                                c2 = 0;
                            }
                            if (c2 == 0) {
                                list2.add(fqm);
                            } else if (c2 == 1) {
                                list3.add(fqm);
                            } else {
                                throw new IllegalArgumentException();
                            }
                            list4.add(fqm);
                        }
                        i++;
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    private synchronized void e() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        a(d(), arrayList, arrayList2, arrayList3);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = Collections.unmodifiableList(arrayList2);
        this.c = Collections.unmodifiableList(arrayList3);
    }

    public final Collection<fqm<?>> a() {
        e();
        return this.c;
    }

    public final List<fqm<?>> b() {
        e();
        return this.a;
    }

    public final List<fqm<? extends Serializable>> c() {
        e();
        return this.b;
    }

    /* access modifiers changed from: protected */
    public List<? extends hmi> d() {
        return Collections.singletonList(this);
    }
}
