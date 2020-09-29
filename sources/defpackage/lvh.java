package defpackage;

import android.os.Parcel;
import com.google.common.collect.Lists;
import com.spotify.music.features.assistedcuration.provider.CardAction;
import com.spotify.music.features.assistedcuration.provider.CardAction.Action;
import defpackage.lvg;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: lvh reason: default package */
class lvh<T extends lvg<T>> {
    final BehaviorSubject<CardAction> a = BehaviorSubject.a();
    /* access modifiers changed from: private */
    public final a<T> b;
    /* access modifiers changed from: private */
    public Map<String, T> c = Collections.synchronizedMap(new LinkedHashMap());
    /* access modifiers changed from: private */
    public CardAction d = new CardAction(Action.INITIALIZE);

    /* renamed from: lvh$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Action.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.features.assistedcuration.provider.CardAction$Action[] r0 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.JUST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.EXPAND_TRACK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.EXPAND_CARD     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.ADD_CARDS_BASED_ON_TRACK     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.music.features.assistedcuration.provider.CardAction$Action r1 = com.spotify.music.features.assistedcuration.provider.CardAction.Action.REMOVE_TRACKS_IN_SET     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: lvh$a */
    public interface a<T> {
        Observable<T> a(T t);

        Observable<Map<String, T>> a(Set<String> set, String str);

        Observable<Map<String, T>> a(luu luu, Set<String> set);

        Observable<T> a(luu luu, Set<String> set, T t);

        lux a(T t, boolean z);
    }

    lvh(a<T> aVar) {
        this.b = aVar;
    }

    public final Observable<List<lux>> a(final Set<String> set, final String str) {
        return this.a.e(this.d).a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function<CardAction, Observable<Map<String, T>>>() {
            public final /* synthetic */ Object apply(Object obj) {
                final CardAction cardAction = (CardAction) obj;
                final LinkedHashMap linkedHashMap = new LinkedHashMap(lvh.this.c);
                switch (AnonymousClass3.a[cardAction.a.ordinal()]) {
                    case 1:
                        return Observable.b(linkedHashMap);
                    case 2:
                        lvh.this.d = CardAction.a();
                        return lvh.this.b.a(set, str).c((Function<? super T, ? extends R>) new Function<Map<String, T>, Map<String, T>>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                linkedHashMap.putAll((Map) obj);
                                return linkedHashMap;
                            }
                        });
                    case 3:
                        luu b2 = cardAction.b();
                        lvg lvg = (lvg) linkedHashMap.get(cardAction.b);
                        lvg.b.add(b2.a());
                        return lvh.this.b.a(b2, cardAction.c(), lvg).c((Function<? super T, ? extends R>) new Function<T, Map<String, T>>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                linkedHashMap.put(cardAction.b, (lvg) obj);
                                return linkedHashMap;
                            }
                        });
                    case 4:
                        return lvh.this.b.a(linkedHashMap.get(cardAction.b)).c((Function<? super T, ? extends R>) new Function<T, Map<String, T>>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                linkedHashMap.put(cardAction.b, (lvg) obj);
                                return linkedHashMap;
                            }
                        });
                    case 5:
                        return lvh.this.b.a(cardAction.b(), cardAction.c()).c((Function<? super T, ? extends R>) new Function<Map<String, T>, Map<String, T>>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                linkedHashMap.putAll((Map) obj);
                                return linkedHashMap;
                            }
                        });
                    case 6:
                        return Observable.a((Callable<? extends ObservableSource<? extends T>>) new Callable<Observable<Map<String, T>>>() {
                            public final /* synthetic */ Object call() {
                                for (Entry entry : linkedHashMap.entrySet()) {
                                    entry.setValue(((lvg) entry.getValue()).a(cardAction.c()));
                                }
                                return Observable.b(linkedHashMap);
                            }
                        });
                    default:
                        return Observable.c();
                }
            }
        }, 2).c((Function<? super T, ? extends R>) new Function<Map<String, T>, List<lux>>() {
            public final /* synthetic */ Object apply(Object obj) {
                Map map = (Map) obj;
                lvh.this.c = Collections.synchronizedMap(map);
                ArrayList a2 = Lists.a();
                ArrayList a3 = Lists.a((Iterable<? extends E>) map.keySet());
                for (int size = a3.size() - 1; size >= 0; size--) {
                    lvg lvg = (lvg) map.get(a3.get(size));
                    if (!lvg.a().isEmpty()) {
                        a2.add(lvh.this.b.a(lvg, !set.isEmpty()));
                    }
                }
                return a2;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, Set<String> set) {
        this.a.onNext(new CardAction(str, Action.EXPAND_CARD, null, set));
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, luu luu, Set<String> set) {
        this.a.onNext(new CardAction(str, Action.EXPAND_TRACK, luu, set));
    }

    /* access modifiers changed from: 0000 */
    public final void a(Set<String> set) {
        this.a.onNext(new CardAction(Action.REMOVE_TRACKS_IN_SET, set));
    }

    /* access modifiers changed from: 0000 */
    public final void a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        obtain.readMap(this.c, lvh.class.getClassLoader());
        obtain.recycle();
        this.d = CardAction.a();
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeMap(this.c);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
