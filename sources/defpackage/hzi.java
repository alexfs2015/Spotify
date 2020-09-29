package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;

/* renamed from: hzi reason: default package */
public final class hzi implements lbq {
    public final PublishSubject<idv> a = PublishSubject.a();
    private String b = "";

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!str.equals(this.b)) {
            this.a.onNext(new idu(str));
            this.b = str;
        }
    }
}
