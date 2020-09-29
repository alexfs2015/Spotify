package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsResponse;
import io.reactivex.Observable;
import java.util.Set;

/* renamed from: rhr reason: default package */
public interface rhr {
    Observable<RecsResponse> a(int i, Set<String> set, Set<String> set2);
}
