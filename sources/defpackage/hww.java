package defpackage;

import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;

/* renamed from: hww reason: default package */
public final class hww implements kyh {
    public final PublishSubject<ibj> a = PublishSubject.a();
    private String b = "";

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        if (!str.equals(this.b)) {
            this.a.onNext(new ibi(str));
            this.b = str;
        }
    }
}
