package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import io.reactivex.Completable;
import java.util.Map;

/* renamed from: oiv reason: default package */
public interface oiv extends oix {
    Completable a(PlayOptions playOptions, PlayOrigin playOrigin, Map<String, String> map);
}
