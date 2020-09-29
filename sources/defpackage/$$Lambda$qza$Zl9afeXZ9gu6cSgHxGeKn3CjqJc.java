package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsResponse;
import io.reactivex.functions.Function;
import java.util.Collection;

/* renamed from: -$$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc implements Function {
    public static final /* synthetic */ $$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc INSTANCE = new $$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc();

    private /* synthetic */ $$Lambda$qza$Zl9afeXZ9gu6cSgHxGeKn3CjqJc() {
    }

    public final Object apply(Object obj) {
        return qyx.a(ImmutableList.a((Collection<? extends E>) ((RecsResponse) obj).recommendedTracks()));
    }
}
