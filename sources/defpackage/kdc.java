package defpackage;

import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import io.reactivex.subjects.PublishSubject;

/* renamed from: kdc reason: default package */
public final class kdc {
    public WazeTransportDrivingDirection a = WazeTransportDrivingDirection.NONE;
    public String b;
    public String c;
    public boolean d;
    public long e;
    public String f;
    public String g;
    public String h;
    public final PublishSubject<Boolean> i = PublishSubject.a();

    public final boolean a() {
        if (this.a != WazeTransportDrivingDirection.NONE) {
            if (!"".equals(this.b)) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        this.b = str;
        this.i.onNext(Boolean.valueOf(a()));
    }
}
