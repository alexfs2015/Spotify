package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.util.List;

/* renamed from: gea reason: default package */
final class gea implements Runnable {
    private final List<gee> a;
    private final gej b;

    gea(List<gee> list, gej gej) {
        this.a = list;
        this.b = gej;
    }

    public final void run() {
        try {
            for (gee gee : this.a) {
                List a2 = gee.a();
                while (true) {
                    if (!a2.isEmpty()) {
                        ged a3 = a(gee.b(), a2);
                        ImmutableSet a4 = ImmutableSet.a(fbx.a((Iterable<E>) a3.a()).a((faz<? super E>) new $$Lambda$gea$sP9IVWYkWgx1WYXQqy1VfHcAwM<Object>(a2)).a((Function<? super E, T>) new $$Lambda$gea$DSsSOZ3sccgcWOKRXVnp1d71Ulc<Object,T>(a2)).a());
                        StringBuilder sb = new StringBuilder();
                        sb.append(a4.size());
                        sb.append(" Events to be deleted from DB: ");
                        sb.append(fau.a(" ").a((Iterable<?>) a4));
                        gee.a(a4);
                        if (!a3.b()) {
                            a2 = gee.a();
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            this.b.a(th, "Exception during periodic event sync");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(List list, Integer num) {
        return num.intValue() >= 0 && num.intValue() < list.size();
    }

    private ged a(a aVar, List<gdu> list) {
        try {
            return aVar.publish(list);
        } catch (IOException e) {
            this.b.a("Error publishing events: %s", e.getMessage());
            return ged.c().a(true).a();
        }
    }
}
