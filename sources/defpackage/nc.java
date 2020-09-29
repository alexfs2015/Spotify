package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: nc reason: default package */
public final class nc {
    public static final nc c = new nc(new Bundle(), null);
    public final Bundle a;
    List<String> b;

    /* renamed from: nc$a */
    public static final class a {
        private ArrayList<String> a;

        public a() {
        }

        public a(nc ncVar) {
            if (ncVar != null) {
                ncVar.b();
                if (!ncVar.b.isEmpty()) {
                    this.a = new ArrayList<>(ncVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public final a a(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        private a a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String a2 : collection) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        public final a a(nc ncVar) {
            if (ncVar != null) {
                a((Collection<String>) ncVar.a());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public final nc a() {
            if (this.a == null) {
                return nc.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new nc(bundle, this.a);
        }
    }

    nc(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public final List<String> a() {
        b();
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (this.b == null) {
            this.b = this.a.getStringArrayList("controlCategories");
            List<String> list = this.b;
            if (list == null || list.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final boolean a(List<IntentFilter> list) {
        if (list != null) {
            b();
            int size = this.b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = (IntentFilter) list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory((String) this.b.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(nc ncVar) {
        if (ncVar == null) {
            return false;
        }
        b();
        ncVar.b();
        return this.b.containsAll(ncVar.b);
    }

    public final boolean c() {
        b();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        b();
        ncVar.b();
        return this.b.equals(ncVar.b);
    }

    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public static nc a(Bundle bundle) {
        if (bundle != null) {
            return new nc(bundle, null);
        }
        return null;
    }
}
