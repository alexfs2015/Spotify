package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qvd reason: default package */
public final class qvd extends qvb implements qvh {
    private static final Policy a;
    private static final Policy c;
    private final ims d;
    private List<iou> e;
    private final qsr f;
    private final ioo g;
    private final qxq h;

    /* renamed from: qvd$a */
    static class a {
        final boolean a;
        final int b;
        final int c;

        public a(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "link";
        String str2 = "previewId";
        String str3 = "inCollection";
        String str4 = "isBanned";
        String str5 = "isExplicit";
        String str6 = "playable";
        String str7 = "offline";
        String str8 = "isLocal";
        listPolicy.setListAttributes(ImmutableMap.g().b(str, Boolean.TRUE).b("name", Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b());
        listPolicy.setArtistsAttributes(ImmutableMap.a("name", Boolean.TRUE, "link", Boolean.TRUE, "portraits", Boolean.TRUE));
        listPolicy.setAlbumAttributes(ImmutableMap.a("name", Boolean.TRUE, "link", Boolean.TRUE, "covers", Boolean.TRUE));
        listPolicy.setAlbumArtistAttributes(ImmutableMap.b(str, Boolean.TRUE));
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        String str9 = "groupIndex";
        decorationPolicy.setListAttributes(Collections.singletonMap(str9, Boolean.TRUE));
        a = new Policy(decorationPolicy);
        DecorationPolicy decorationPolicy2 = new DecorationPolicy();
        decorationPolicy2.setListAttributes(Collections.singletonMap(str9, Boolean.TRUE));
        c = new Policy(decorationPolicy2);
    }

    public qvd(qsr qsr, ioo ioo, qxq qxq, ims ims) {
        super(qsr);
        this.f = qsr;
        this.g = ioo;
        this.h = qxq;
        this.g.a(vns.e().a("addTime").a());
        this.d = ims;
    }

    private Observable<iov> a(qum qum, boolean z, Policy policy) {
        vns c2 = qum.c().c();
        if (c2 != null) {
            this.g.a(c2);
            this.g.a = z;
        }
        this.g.a(Integer.valueOf(qum.a()), Integer.valueOf(qum.b()));
        this.g.g = qum.f();
        this.g.b = qum.c().b();
        this.g.a(false, ((Boolean) fav.a(qum.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        return this.g.a(policy);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if ("artist.name".equals(r0.a()) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.Observable<defpackage.qun> a(defpackage.qum r6) {
        /*
            r5 = this;
            qum$b r0 = r6.c()
            vns r0 = r0.c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0045
            qsr r3 = r5.f
            jpb r3 = r3.a
            fpt r3 = r3.b()
            if (r3 == 0) goto L_0x0028
            fqa r4 = defpackage.uqy.d
            java.io.Serializable r3 = r3.a(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Enabled"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = r0.a()
            java.lang.String r4 = "album.name"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r0 = r0.a()
            java.lang.String r3 = "artist.name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0081
            java.util.List<iou> r0 = r5.e
            if (r0 == 0) goto L_0x0051
            io.reactivex.Single r0 = io.reactivex.Single.b(r0)
            goto L_0x0077
        L_0x0051:
            qum$a r0 = r6.h()
            qum$a r0 = r0.a(r2)
            qum$a r0 = r0.b(r2)
            qum r0 = r0.a()
            com.spotify.mobile.android.playlist.model.policy.Policy r2 = c
            io.reactivex.Observable r0 = r5.a(r0, r1, r2)
            r1 = 1
            io.reactivex.Observable r0 = r0.c(r1)
            io.reactivex.Single r0 = r0.h()
            -$$Lambda$4BFdjQgIfTL0BQq8Pyjnt5hPRis r1 = defpackage.$$Lambda$4BFdjQgIfTL0BQq8Pyjnt5hPRis.INSTANCE
            io.reactivex.Single r0 = r0.f(r1)
        L_0x0077:
            -$$Lambda$qvd$uBVx-nxN7bBzyWHQyMMh9M2pUAc r1 = new -$$Lambda$qvd$uBVx-nxN7bBzyWHQyMMh9M2pUAc
            r1.<init>(r5, r6)
            io.reactivex.Observable r6 = r0.d(r1)
            return r6
        L_0x0081:
            com.spotify.mobile.android.playlist.model.policy.Policy r0 = a
            io.reactivex.Observable r0 = r5.a(r6, r2, r0)
            -$$Lambda$qvd$YsoOmqjPhV-2fs1i34VTKCqHpMQ r1 = new -$$Lambda$qvd$YsoOmqjPhV-2fs1i34VTKCqHpMQ
            r1.<init>(r5, r6)
            io.reactivex.Observable r6 = r0.c(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvd.a(qum):io.reactivex.Observable");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(qum qum, List list) {
        a aVar;
        int i;
        int a2 = qum.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= list.size()) {
                aVar = new a(false, 0, 0);
                break;
            } else if (i3 == a2) {
                aVar = new a(true, i4, i2);
                break;
            } else {
                int i5 = i3 + 1;
                int b = ((iou) list.get(i2)).b();
                int i6 = a2 - i5;
                if (i6 < b) {
                    aVar = new a(false, i4 + i6, i2);
                    break;
                }
                i3 = i5 + b;
                i4 += b;
                i2++;
            }
        }
        a aVar2 = aVar;
        int a3 = qum.a();
        int b2 = a3 + qum.b();
        int b3 = qum.b();
        vns c2 = qum.c().c();
        if ("album.name".equals(c2.a())) {
            i = 0;
        } else {
            i = "artist.name".equals(c2.a()) ? 1 : -1;
        }
        qum a4 = qum.a(aVar2.b);
        Observable a5 = a(a4, true, a);
        $$Lambda$qvd$sf4a_XYky7g8Hf83FwR3JGtOxM r7 = new $$Lambda$qvd$sf4a_XYky7g8Hf83FwR3JGtOxM(this, aVar2, a4, a3, b2, b3, i, qum);
        return a5.h(r7);
    }

    public final void a(boolean z) {
        this.g.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(qum qum, iov iov) {
        uzc[] uzcArr = (uzc[]) iov.getItems();
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        int a2 = qum.a();
        a(g2, uzcArr, 0, uzcArr.length, a2);
        return quo.a(iov.isLoading(), iov.getUnrangedLength(), a2, g2.a(), qum, MusicItem.p);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar, qum qum, int i, int i2, int i3, int i4, qum qum2, iov iov) {
        int i5;
        Observable observable;
        ArrayList arrayList;
        MusicItem musicItem;
        String str;
        String str2;
        qvd qvd = this;
        a aVar2 = aVar;
        int i6 = i3;
        int i7 = i4;
        uzc[] uzcArr = (uzc[]) iov.getItems();
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        qvd.e = iov.b();
        int i8 = aVar2.c;
        if (uzcArr.length <= 0 || aVar2.a) {
            i5 = 0;
        } else {
            iou iou = (iou) qvd.e.get(i8);
            int b = (iou.b() - aVar2.b) + iou.a();
            a(g2, uzcArr, 0, b, qum.a());
            i5 = b + 0;
            i8++;
        }
        ArrayList arrayList2 = new ArrayList(qvd.e.size());
        while (i8 < qvd.e.size() && i + i5 < i2 && i5 < i6) {
            iou iou2 = (iou) qvd.e.get(i8);
            uzc uzc = uzcArr[iou2.a() - aVar2.b];
            if (i7 == 1 && fax.a(a(uzc).getImageUri(Size.LARGE))) {
                arrayList2.add(a(uzc).getUri());
            }
            uyq album = uzc.getAlbum();
            if (i7 == 0) {
                qxq qxq = qvd.h;
                com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a z = MusicItem.z();
                fdr fdr = qxq.c;
                StringBuilder sb = new StringBuilder();
                sb.append(Type.GROUP_HEADER_ALBUM);
                sb.append(album.getTitle());
                arrayList = arrayList2;
                musicItem = z.a(fdr.a((CharSequence) sb.toString()).c()).a(Type.GROUP_HEADER_ALBUM).a(album.getTitle()).e(album.getImageUri(Size.LARGE)).c(album.getUri()).a(album.getOfflineState()).d(album.getUri()).a();
            } else {
                arrayList = arrayList2;
                if (i7 == 1) {
                    uyr a2 = a(uzc);
                    qxq qxq2 = qvd.h;
                    if (album == null) {
                        str = "";
                    } else {
                        str = album.getArtist().getUri();
                    }
                    jst a3 = jst.a(str);
                    String str3 = qxq2.b;
                    int i9 = AnonymousClass1.a[a3.b.ordinal()];
                    String str4 = "collection:";
                    String str5 = "spotify:user:";
                    if (i9 != 1) {
                        if (i9 == 4) {
                            StringBuilder sb2 = new StringBuilder(str5);
                            sb2.append(str3);
                            sb2.append(':');
                            sb2.append(str4);
                            sb2.append("artist:");
                            sb2.append(a3.f());
                            str2 = sb2.toString();
                        } else if (i9 != 15) {
                            str2 = a3.h();
                        }
                        com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a z2 = MusicItem.z();
                        fdr fdr2 = qxq2.c;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(Type.GROUP_HEADER_ARTIST);
                        sb3.append(a2.getTitle());
                        musicItem = z2.a(fdr2.a((CharSequence) sb3.toString()).c()).a(Type.GROUP_HEADER_ARTIST).a(a2.getName()).e(a2.getImageUri(Size.LARGE)).c(a2.getUri()).a(a2.getOfflineState()).d(str2).a();
                    }
                    StringBuilder sb4 = new StringBuilder(str5);
                    sb4.append(str3);
                    sb4.append(':');
                    sb4.append(str4);
                    sb4.append("album:");
                    sb4.append(a3.f());
                    str2 = sb4.toString();
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a z22 = MusicItem.z();
                    fdr fdr22 = qxq2.c;
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append(Type.GROUP_HEADER_ARTIST);
                    sb32.append(a2.getTitle());
                    musicItem = z22.a(fdr22.a((CharSequence) sb32.toString()).c()).a(Type.GROUP_HEADER_ARTIST).a(a2.getName()).e(a2.getImageUri(Size.LARGE)).c(a2.getUri()).a(a2.getOfflineState()).d(str2).a();
                } else {
                    StringBuilder sb5 = new StringBuilder("Group header type not supported: ");
                    sb5.append(i7);
                    throw new IllegalArgumentException(sb5.toString());
                }
            }
            g2.c(musicItem);
            int i10 = i5 + 1;
            int min = Math.min(iou2.b(), i6 - i10);
            a(g2, uzcArr, iou2.a() - aVar2.b, min, qum.a());
            i5 = i10 + min;
            i8++;
            qvd = this;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        ImmutableList b2 = g2.a();
        if (arrayList3.isEmpty()) {
            observable = Observable.b(Collections.emptyMap());
        } else {
            observable = vun.a(this.d.a("spotify:internal:collection:tracks", (String[]) arrayList3.toArray(new String[0]))).d().e(Collections.emptyMap());
        }
        Observable observable2 = observable;
        $$Lambda$qvd$g4d1qzBI2bJyJnVvU3RdI4vUAy8 r0 = new $$Lambda$qvd$g4d1qzBI2bJyJnVvU3RdI4vUAy8(this, b2, iov, i, qum2);
        return observable2.c((Function<? super T, ? extends R>) r0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(ImmutableList immutableList, iov iov, int i, qum qum, Map map) {
        if (!map.isEmpty()) {
            com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
            fdh R_ = immutableList.R_();
            while (R_.hasNext()) {
                MusicItem musicItem = (MusicItem) R_.next();
                uyr uyr = (uyr) map.get(musicItem.j());
                if (musicItem.a() != Type.GROUP_HEADER_ARTIST || uyr == null) {
                    g2.c(musicItem);
                } else {
                    g2.c(musicItem.r().e(uyr.getImageUri(Size.LARGE)).a());
                }
            }
            immutableList = g2.a();
        }
        return quo.a(iov.isLoading(), iov.getUnrangedLength() + this.e.size(), i, immutableList, qum, MusicItem.p);
    }

    private void a(com.google.common.collect.ImmutableList.a<MusicItem> aVar, uzc[] uzcArr, int i, int i2, int i3) {
        String str;
        uzc[] uzcArr2 = uzcArr;
        int i4 = i;
        while (i4 < i + i2 && i4 < uzcArr2.length) {
            int i5 = i3 + i4;
            uzc uzc = uzcArr2[i4];
            qxq qxq = this.h;
            Type type = this.f.a() ? Type.TRACK_SHUFFLE_ONLY : Type.TRACK;
            if (qxq.d) {
                str = jsx.a(uzc);
            } else {
                str = jsx.b(uzc);
            }
            aVar.c(MusicItem.a(qxq.c.a((CharSequence) uzc.getUri()).c(), type, true, uzc.getName(), str, uzc.getUri(), uzc.getTargetUri(), uzc.getImageUri(Size.NORMAL), uzc.getAddTime(), i5, uzc.getOfflineState(), uzc.inCollection(), uzc.isBanned(), true, false, uzc.isExplicit(), uzc.isCurrentlyPlayable(), false, uzc.isLocal(), uzc.previewId(), "spotify:internal:collection:tracks"));
            i4++;
        }
    }

    private static uyr a(uzc uzc) {
        return (uyr) uzc.getArtists().get(0);
    }
}
