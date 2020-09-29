package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;

/* renamed from: rgq reason: default package */
public abstract class rgq {

    /* renamed from: rgq$a */
    public static abstract class a {
        public abstract a a(Optional<String> optional);

        public abstract a a(ImmutableMap<String, Boolean> immutableMap);

        public abstract a a(EmptyPageAction emptyPageAction);

        public abstract a a(MusicPageId musicPageId);

        public abstract a a(PageAction pageAction);

        public abstract a a(CharSequence charSequence);

        public abstract a a(String str);

        public abstract a a(rkm rkm);

        public abstract a a(vca vca);

        public abstract a a(boolean z);

        public abstract rgq a();

        public abstract a b(CharSequence charSequence);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static a u() {
        String str = "";
        return new a().c(str).b((CharSequence) str).d(str).a(rkm.f).a(EmptyPageAction.NO_ACTION).a(PageAction.NO_ACTION).e(str).a(true).b(true).c(true).b(str).a((CharSequence) str);
    }

    public abstract MusicPageId a();

    public abstract Optional<String> b();

    public abstract String c();

    public abstract rkm d();

    public abstract vca e();

    public abstract ImmutableMap<String, Boolean> f();

    public abstract String g();

    public abstract CharSequence h();

    public abstract String i();

    public abstract CharSequence j();

    public abstract String k();

    public abstract EmptyPageAction l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract PageAction p();

    public abstract String q();

    public abstract a r();

    public final ImmutableList<vca> s() {
        return ImmutableList.a(fdd.a((Iterable<F>) d().a(), (Function<? super F, ? extends T>) $$Lambda$Dz4sENHKwVD27l5iXaqbI4u3c.INSTANCE));
    }

    public final ImmutableList<String> t() {
        return ImmutableList.a(fdd.a((Iterable<F>) d().e(), (Function<? super F, ? extends T>) $$Lambda$KaFiXdKdksg6RjDm4CrNnsPfLyo.INSTANCE));
    }
}
