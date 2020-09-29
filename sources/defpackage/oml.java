package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: oml reason: default package */
public final class oml {
    public final PublishSubject<b> a = PublishSubject.a();
    private a b = $$Lambda$oml$bDChTY7xwuYib_dtNWbeB3QSMBw.INSTANCE;

    /* renamed from: oml$a */
    public interface a {
        int getGlobalPositionForSection(int i);
    }

    /* renamed from: oml$b */
    public static abstract class b {

        /* renamed from: oml$b$a */
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

    public final int a(b bVar) {
        int globalPositionForSection = this.b.getGlobalPositionForSection(bVar.a());
        if (globalPositionForSection == -1) {
            return -1;
        }
        return globalPositionForSection + bVar.b();
    }

    public final void a(int i, int i2) {
        this.a.onNext(new a().a(i).b(i2).a());
    }

    public final void a(a aVar) {
        this.b = (a) fbm.a(aVar, $$Lambda$oml$fZGJrvGj6NxEHiD1dKNywBr58.INSTANCE);
    }
}
