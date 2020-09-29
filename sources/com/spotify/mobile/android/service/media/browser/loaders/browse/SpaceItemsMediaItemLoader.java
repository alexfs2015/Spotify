package com.spotify.mobile.android.service.media.browser.loaders.browse;

import android.content.Context;
import android.net.Uri;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.internal.util.ScalarSynchronousObservable;

public final class SpaceItemsMediaItemLoader extends how {
    final List<hse> c = new ArrayList(20);
    final List<a> d = new ArrayList(1);
    private boolean e;
    private String f;
    private final String g;
    private final String h;
    private final RxResolver i;
    private final hec j;
    private final hvl k;
    private final hed l;
    private final wug m;
    private final ContentModel n;
    private final hrk o;
    private final hpg p;
    private final boolean q;
    private final xag r = new xag();

    /* renamed from: com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ContentModel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader$ContentModel[] r0 = com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader.ContentModel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader$ContentModel r1 = com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader.ContentModel.STACK_SPACE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader$ContentModel r1 = com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader.ContentModel.COMPOSITE_SPACE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ContentModel {
        STACK_SPACE,
        COMPOSITE_SPACE
    }

    final class a implements hsi<hse> {
        hsl<hse> a;
        private final List<MediaBrowserItem> c;
        private final hpe d;

        /* synthetic */ a(SpaceItemsMediaItemLoader spaceItemsMediaItemLoader, hpe hpe, List list, byte b2) {
            this(hpe, list);
        }

        private a(hpe hpe, List<MediaBrowserItem> list) {
            this.d = (hpe) fay.a(hpe);
            this.c = (List) fay.a(list);
        }

        public final void a(List<hse> list) {
            SpaceItemsMediaItemLoader.this.d.remove(this);
            fay.a(this.a);
            this.a.a.a();
            if (list != null) {
                SpaceItemsMediaItemLoader.this.c.clear();
                SpaceItemsMediaItemLoader.this.c.addAll(list);
            }
            SpaceItemsMediaItemLoader spaceItemsMediaItemLoader = SpaceItemsMediaItemLoader.this;
            List a2 = spaceItemsMediaItemLoader.a(this.c, spaceItemsMediaItemLoader.c);
            if (a2.isEmpty()) {
                this.d.a((Throwable) new IOException("Failed to load items from space."));
            } else {
                this.d.a(a2);
            }
        }
    }

    public SpaceItemsMediaItemLoader(hpg hpg, Context context, String str, String str2, String str3, RxResolver rxResolver, hec hec, hvl hvl, hed hed, wug wug, String str4, ContentModel contentModel, boolean z, hrk hrk) {
        super(context, str4);
        this.g = (String) fay.a(str);
        this.h = str3;
        this.i = (RxResolver) fay.a(rxResolver);
        this.j = (hec) fay.a(hec);
        this.k = (hvl) fay.a(hvl);
        this.l = hed;
        this.m = wug;
        this.n = (ContentModel) fay.a(contentModel);
        this.f = str2;
        this.p = hpg;
        this.o = hrk;
        this.q = false;
    }

    public final void a() {
        this.d.clear();
        this.r.a();
        this.e = true;
    }

    private String b() {
        StringBuilder sb = new StringBuilder("spotify:space_item:");
        sb.append(this.b);
        sb.append(':');
        return sb.toString();
    }

    private boolean b(String str) {
        return str.startsWith(b());
    }

    private String c(String str) {
        Assertion.a("identifier has to be a space item for this loader", b(str));
        List pathSegments = Uri.parse(str.substring(b().length())).getPathSegments();
        return (String) pathSegments.get(pathSegments.size() - 1);
    }

    private List<MediaBrowserItem> c() {
        return Collections.emptyList();
    }

    public final void a(String str, hpe hpe) {
        if (this.f == null) {
            this.l.a("country_code").f($$Lambda$SpaceItemsMediaItemLoader$wbKRPId0Z3vhKib3FVbEvZXoHI.INSTANCE).c((wud<? extends T>) ScalarSynchronousObservable.d("worldwide")).a(this.m).c().a((wun<? super T>) new wun(str, hpe) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ hpe f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void call(Object obj) {
                    SpaceItemsMediaItemLoader.this.a(this.f$1, this.f$2, (String) obj);
                }
            }, (wun<Throwable>) $$Lambda$SpaceItemsMediaItemLoader$rBr99GJpTWXDSNOL5EIz_dOjOsI.INSTANCE);
        } else {
            b(str, hpe);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, hpe hpe, String str2) {
        this.f = str2;
        b(str, hpe);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        throw wul.a(th);
    }

    public final boolean a(String str) {
        return this.b.equals(str) || b(str);
    }

    private void b(String str, hpe hpe) {
        String str2 = "Unexpected identifier: '%s' (root: '%s')";
        if (this.e || !a(str)) {
            Assertion.a(a(str), String.format(str2, new Object[]{str, this.b}));
            hpe.a((Throwable) new IOException(String.format("Unsupported identifier ('%s') for root: '%s' or stopped(%s)", new Object[]{str, this.b, Boolean.valueOf(this.e)})));
        } else if (b(str)) {
            hpe.a(d(c(str)));
        } else {
            Assertion.a(str.equals(this.b), String.format(str2, new Object[]{str, this.b}));
            this.r.a(vun.a((wrf<T>) this.k.a).f($$Lambda$aihsryigh8IbmprELa05RucwrPA.INSTANCE).c((wud<? extends T>) ScalarSynchronousObservable.d(Boolean.TRUE)).a(this.m).c().a((wun<? super T>) new wun(hpe) {
                private final /* synthetic */ hpe f$1;

                {
                    this.f$1 = r2;
                }

                public final void call(Object obj) {
                    SpaceItemsMediaItemLoader.this.a(this.f$1, (Boolean) obj);
                }
            }, (wun<Throwable>) $$Lambda$SpaceItemsMediaItemLoader$Ue8hMrInoeUzJKp5x3ysWhohGdI.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpe hpe, Boolean bool) {
        hsl hsl;
        if (bool.booleanValue() || this.c.isEmpty()) {
            a aVar = new a(this, hpe, c(), 0);
            if (this.n == ContentModel.STACK_SPACE) {
                hsl = hsl.a(this.a, aVar, this.g, this.f, this.i, this.j, this.k, this.m, this.o);
            } else {
                hsl = hsl.b(this.a, aVar, this.g, this.f, this.i, this.j, this.k, this.m, this.o);
            }
            aVar.a = (hsl) fay.a(hsl);
            SpaceItemsMediaItemLoader.this.d.add(aVar);
            aVar.a.a(0, 50);
            return;
        }
        hpe.a(a(c(), this.c));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw wul.a(th);
    }

    private void b(List<MediaBrowserItem> list, List<hse> list2) {
        MediaBrowserItem mediaBrowserItem;
        for (hse hse : list2) {
            int i2 = AnonymousClass1.a[this.n.ordinal()];
            if (i2 == 1) {
                hsf hsf = (hsf) hse;
                if (this.q) {
                    List<hsd> list3 = hsf.b;
                    if (list3 != null) {
                        for (hsd a2 : list3) {
                            list.add(hrx.a(a2, this.h, this.p));
                        }
                    }
                } else {
                    String a3 = hse.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(b());
                    sb.append(a3);
                    list.add(hrx.a(hsf, Uri.parse(sb.toString()), this.a));
                }
            } else if (i2 != 2) {
                StringBuilder sb2 = new StringBuilder("Unexpected content model type ");
                sb2.append(this.n);
                Assertion.b(sb2.toString());
            } else {
                hsa hsa = (hsa) hse;
                hsd hsd = hsa.b;
                if (hsd != null) {
                    mediaBrowserItem = hrx.a(hsd, this.h, this.p);
                } else {
                    mediaBrowserItem = hrx.a(hsa, Uri.parse(hse.a()));
                }
                list.add(mediaBrowserItem);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public List<MediaBrowserItem> a(List<MediaBrowserItem> list, List<hse> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        b((List<MediaBrowserItem>) arrayList, list2);
        return arrayList;
    }

    private List<MediaBrowserItem> d(String str) {
        List<hsd> list;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            hsf hsf = (hsf) ((hse) it.next());
            if (str.equals(hsf.a)) {
                list = hsf.b;
                break;
            }
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (hsd a2 : list) {
            arrayList.add(hrx.a(a2, this.h, this.p));
        }
        return arrayList;
    }
}
