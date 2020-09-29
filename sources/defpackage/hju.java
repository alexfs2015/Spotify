package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: hju reason: default package */
public abstract class hju implements hjq {
    private List<fps<?>> a;
    private List<fps<? extends Serializable>> b;
    private List<fps<?>> c;

    public final Collection<fps<?>> a() {
        e();
        return this.c;
    }

    public final List<fps<?>> b() {
        e();
        return this.a;
    }

    public final List<fps<? extends Serializable>> c() {
        e();
        return this.b;
    }

    private static void a(List<? extends hjq> list, List<fps<?>> list2, List<fps<? extends Serializable>> list3, List<fps<?>> list4) {
        for (hjq hjq : list) {
            Field[] declaredFields = hjq.getClass().getDeclaredFields();
            try {
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Field field = declaredFields[i];
                        if (fps.class.isAssignableFrom(field.getType())) {
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            fps fps = (fps) field.get(null);
                            String str = fps.d.a;
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
                                list2.add(fps);
                            } else if (c2 == 1) {
                                list3.add(fps);
                            } else {
                                throw new IllegalArgumentException();
                            }
                            list4.add(fps);
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

    /* access modifiers changed from: protected */
    public List<? extends hjq> d() {
        return Collections.singletonList(this);
    }
}
