package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ implements Function {
    public static final /* synthetic */ $$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ INSTANCE = new $$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ();

    private /* synthetic */ $$Lambda$kvd$sVBJcS9RDaCQkYyT_4cDO7EL8OQ() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((CappedOndemandStatus) obj).ondemand());
    }
}
