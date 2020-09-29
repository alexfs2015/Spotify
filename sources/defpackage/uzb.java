package defpackage;

import com.spotify.mobile.android.storylines.model.Storylines;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.Single;

/* renamed from: uzb reason: default package */
public interface uzb {
    @xhn(a = "artist-storylines-view/v0/storylines/entities")
    Single<Storylines> a();

    @xhn(a = "artist-storylines-view/v0/storylines/entity/{entityUri}/size/default")
    Single<StorylinesCardContent> a(@xia(a = "entityUri") String str);
}
