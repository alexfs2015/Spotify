package defpackage;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bwh reason: default package */
public final class bwh {
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<bsc<?>, b> d;
    public final String e;
    final String f;
    public final ewm g;
    public Integer h;
    private final int i;
    private final View j;

    /* renamed from: bwh$a */
    public static final class a {
        public Account a;
        public String b;
        public String c;
        private dq<Scope> d;
        private int e = 0;
        private ewm f = ewm.a;

        public final a a(Collection<Scope> collection) {
            if (this.d == null) {
                this.d = new dq<>();
            }
            this.d.addAll(collection);
            return this;
        }

        public final bwh a() {
            bwh bwh = new bwh(this.a, this.d, null, 0, null, this.b, this.c, this.f);
            return bwh;
        }
    }

    /* renamed from: bwh$b */
    public static final class b {
        public final Set<Scope> a;
    }

    public bwh(Account account, Set<Scope> set, Map<bsc<?>, b> map, int i2, View view, String str, String str2, ewm ewm) {
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.d = map;
        this.j = view;
        this.i = i2;
        this.e = str;
        this.f = str2;
        this.g = ewm;
        HashSet hashSet = new HashSet(this.b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
