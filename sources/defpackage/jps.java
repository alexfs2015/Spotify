package defpackage;

import android.graphics.Rect;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: jps reason: default package */
public final class jps {
    private final a<?, ?, ?> a;

    /* renamed from: jps$a */
    static class a<T extends R, P extends T, R> {
        final d<R> a;
        private final c<P> b;

        a(c<P> cVar, d<R> dVar) {
            this.b = cVar;
            this.a = dVar;
        }

        /* access modifiers changed from: 0000 */
        public Set<R> a(int i, int i2, e eVar, androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            if (i < 0) {
                return Collections.emptySet();
            }
            if (i >= i2) {
                return Collections.emptySet();
            }
            return a(i, eVar, aVar);
        }

        /* access modifiers changed from: 0000 */
        public Set<R> a(int i, e eVar, androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
            Set<R> a2 = this.b.a(eVar.a(i));
            if (a2.isEmpty()) {
                return Collections.emptySet();
            }
            if (a2 instanceof EnumSet) {
                return a2;
            }
            return ImmutableSet.a((Collection<? extends E>) a2);
        }
    }

    /* renamed from: jps$b */
    public interface b {
        int a();

        int a(int i);

        int b(int i);

        int c(int i);
    }

    /* renamed from: jps$c */
    public interface c<T> {
        Set<T> a(int i);
    }

    /* renamed from: jps$d */
    public interface d<T> {
        int a(Set<T> set, int i);

        void a();

        void a(Rect rect, Set<T> set, Set<T> set2, Set<T> set3, int i, b bVar);
    }

    /* renamed from: jps$e */
    public interface e {
        int a(int i);
    }

    public <T> jps(c<? extends T> cVar, d<? super T> dVar) {
        this.a = new a<>((c) fay.a(cVar), (d) fay.a(dVar));
    }

    public final void a(Rect rect, int i, int i2, b bVar, e eVar, androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
        a<?, ?, ?> aVar2 = this.a;
        rect.set(0, 0, 0, 0);
        aVar2.a.a(rect, aVar2.a(i - 1, i2, eVar, aVar), aVar2.a(i, i2, eVar, aVar), aVar2.a(i + 1, i2, eVar, aVar), i, bVar);
    }

    public final int a(int i, int i2, int i3, e eVar, androidx.recyclerview.widget.RecyclerView.a<?> aVar) {
        a<?, ?, ?> aVar2 = this.a;
        return aVar2.a.a(aVar2.a(i, eVar, aVar), i3);
    }

    public final void a() {
        this.a.a.a();
    }
}
