package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: ofh reason: default package */
public final class ofh {
    public final PublishSubject<b> a = PublishSubject.a();
    private a b = $$Lambda$ofh$H0WCOBYjCZoCgKfZ6h5NuK2lvE.INSTANCE;

    /* renamed from: ofh$a */
    public interface a {
        int getGlobalPositionForSection(int i);
    }

    /* renamed from: ofh$b */
    public static abstract class b {

        /* renamed from: ofh$b$a */
        public static abstract class a {
            public abstract a a(int i);

            public abstract b a();

            public abstract a b(int i);
        }

        public abstract int a();

        public abstract int b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(int i) {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int b(int i) {
        return -1;
    }

    public final void a(a aVar) {
        this.b = (a) fav.a(aVar, $$Lambda$ofh$ROXdoP42ZTc3FUPLDy0IQxzkiA.INSTANCE);
    }

    public final void a(int i, int i2) {
        this.a.onNext(new a().a(i).b(i2).a());
    }

    public final int a(b bVar) {
        int globalPositionForSection = this.b.getGlobalPositionForSection(bVar.a());
        if (globalPositionForSection == -1) {
            return -1;
        }
        return globalPositionForSection + bVar.b();
    }
}
