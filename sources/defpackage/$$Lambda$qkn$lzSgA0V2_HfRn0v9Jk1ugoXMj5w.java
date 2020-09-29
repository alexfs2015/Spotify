package defpackage;

import com.google.common.base.Function;

/* renamed from: -$$Lambda$qkn$lzSgA0V2_HfRn0v9Jk1ugoXMj5w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qkn$lzSgA0V2_HfRn0v9Jk1ugoXMj5w implements Function {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$qkn$lzSgA0V2_HfRn0v9Jk1ugoXMj5w(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return String.format("spotify:search:%s:%s", new Object[]{(String) obj, this.f$0});
    }
}
