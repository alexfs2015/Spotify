package defpackage;

import com.spotify.mobile.android.storylines.model.Storylines;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.Single;

/* renamed from: unx reason: default package */
public interface unx {
    @wti(a = "artist-storylines-view/v0/storylines/entities")
    Single<Storylines> a();

    @wti(a = "artist-storylines-view/v0/storylines/entity/{entityUri}/size/default")
    Single<StorylinesCardContent> a(@wtv(a = "entityUri") String str);
}
