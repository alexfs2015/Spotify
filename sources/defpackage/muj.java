package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;

/* renamed from: muj reason: default package */
public interface muj {

    /* renamed from: muj$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ tua a(wzi wzi, mvz mvz) {
            mxd mxd = (mxd) wzi.get();
            mxd.a = mvz;
            return mxd;
        }

        public static a<mvz> a(wzi<mxd> wzi) {
            a<mvz> b = tue.b();
            b.a.b = new $$Lambda$muj$cp9p5qNWMUldHcIQfEJ9vAIu25Y(wzi);
            return b;
        }

        public static vfa<mvz> a(tub tub, Observable<vez<mvz>> observable) {
            return new vfb(observable.a((ObservableTransformer<? super T, ? extends R>) new vff<Object,Object>(10)).a((ObservableTransformer<? super T, ? extends R>) new vfh<Object,Object>()).a((ObservableTransformer<? super T, ? extends R>) new vfe<Object,Object>(tub.b)).a((ObservableTransformer<? super T, ? extends R>) new vfg<Object,Object>(tub.a)));
        }
    }
}
