package defpackage;

import com.spotify.music.sociallistening.model.Participant;
import java.util.Comparator;

/* renamed from: -$$Lambda$uox$V0IgJADSKWI5zecr7D0mSfBzEOg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$uox$V0IgJADSKWI5zecr7D0mSfBzEOg implements Comparator {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$uox$V0IgJADSKWI5zecr7D0mSfBzEOg(String str) {
        this.f$0 = str;
    }

    public final int compare(Object obj, Object obj2) {
        return fcn.a().a(((Boolean) fbm.a(((Participant) obj).isHost(), Boolean.FALSE)).booleanValue(), ((Boolean) fbm.a(((Participant) obj2).isHost(), Boolean.FALSE)).booleanValue()).a(((Participant) obj).username().equals(this.f$0), ((Participant) obj2).username().equals(this.f$0)).b();
    }
}
