package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Map;

/* renamed from: mvz reason: default package */
public abstract class mvz {

    /* renamed from: mvz$a */
    public static abstract class a {
        public abstract a a(ImmutableList<mvr> immutableList);

        public abstract a a(Map<String, String> map);

        public abstract a a(mwa mwa);

        public abstract a a(boolean z);

        public abstract mvz a();
    }

    static {
        new a().a(ImmutableList.d()).a(true).a((mwa) new defpackage.mwa.a()).a(Collections.emptyMap()).a();
    }

    public static a f() {
        return new a();
    }

    public abstract ImmutableList<mvr> a();

    public abstract boolean b();

    public abstract mwa c();

    public abstract Map<String, String> d();

    public abstract a e();
}
