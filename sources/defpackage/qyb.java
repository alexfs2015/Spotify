package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.EmptyPageAction;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;

/* renamed from: qyb reason: default package */
public abstract class qyb {

    /* renamed from: qyb$a */
    public static abstract class a {
        public abstract a a(Optional<String> optional);

        public abstract a a(ImmutableMap<String, Boolean> immutableMap);

        public abstract a a(EmptyPageAction emptyPageAction);

        public abstract a a(MusicPageId musicPageId);

        public abstract a a(PageAction pageAction);

        public abstract a a(CharSequence charSequence);

        public abstract a a(String str);

        public abstract a a(rbq rbq);

        public abstract a a(uqv uqv);

        public abstract a a(boolean z);

        public abstract qyb a();

        public abstract a b(CharSequence charSequence);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public abstract MusicPageId a();

    public abstract Optional<String> b();

    public abstract String c();

    public abstract rbq d();

    public abstract uqv e();

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

    public final ImmutableList<uqv> s() {
        return ImmutableList.a(fcl.a((Iterable<F>) d().a(), (Function<? super F, ? extends T>) $$Lambda$2ulIL4U0v7DRzAFpNI_taiLyAns.INSTANCE));
    }

    public final ImmutableList<String> t() {
        return ImmutableList.a(fcl.a((Iterable<F>) d().e(), (Function<? super F, ? extends T>) $$Lambda$wj1NO93pJ83_poiEpWdnslG5zNs.INSTANCE));
    }

    public static a u() {
        String str = "";
        return new a().c(str).b((CharSequence) str).d(str).a(rbq.f).a(EmptyPageAction.NO_ACTION).a(PageAction.NO_ACTION).e(str).a(true).b(true).c(true).b(str).a((CharSequence) str);
    }
}
