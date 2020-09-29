package defpackage;

import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import io.reactivex.Observable;

/* renamed from: vbu reason: default package */
public interface vbu {
    Observable<vbz> a();

    void a(LoadingState loadingState);

    void a(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z);

    void a(boolean z);

    void b();

    void b(boolean z);

    void c(boolean z);
}
