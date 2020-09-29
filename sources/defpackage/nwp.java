package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel;
import com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.LoadState;
import com.spotify.music.features.listeninghistory.model.Session;

/* renamed from: nwp reason: default package */
public final class nwp extends ListeningHistoryModel {
    private final ImmutableList<Session> b;
    private final String c;
    private final LoadState d;
    private final boolean e;

    /* renamed from: nwp$a */
    public static final class a implements com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a {
        private ImmutableList<Session> a;
        private String b;
        private LoadState c;
        private Boolean d;

        public a() {
        }

        private a(ListeningHistoryModel listeningHistoryModel) {
            this.a = listeningHistoryModel.a();
            this.b = listeningHistoryModel.b();
            this.c = listeningHistoryModel.c();
            this.d = Boolean.valueOf(listeningHistoryModel.d());
        }

        /* synthetic */ a(ListeningHistoryModel listeningHistoryModel, byte b2) {
            this(listeningHistoryModel);
        }

        public final com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a a(ImmutableList<Session> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null sessionList");
        }

        public final com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a a(LoadState loadState) {
            if (loadState != null) {
                this.c = loadState;
                return this;
            }
            throw new NullPointerException("Null loadState");
        }

        public final com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null lastSessionEndTime");
        }

        public final com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final ListeningHistoryModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sessionList");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" lastSessionEndTime");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" loadState");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" internetConnected");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                nwp nwp = new nwp(this.a, this.b, this.c, this.d.booleanValue(), 0);
                return nwp;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private nwp(ImmutableList<Session> immutableList, String str, LoadState loadState, boolean z) {
        this.b = immutableList;
        this.c = str;
        this.d = loadState;
        this.e = z;
    }

    /* synthetic */ nwp(ImmutableList immutableList, String str, LoadState loadState, boolean z, byte b2) {
        this(immutableList, str, loadState, z);
    }

    public final ImmutableList<Session> a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final LoadState c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final com.spotify.music.features.listeninghistory.domain.ListeningHistoryModel.a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ListeningHistoryModel) {
            ListeningHistoryModel listeningHistoryModel = (ListeningHistoryModel) obj;
            return this.b.equals(listeningHistoryModel.a()) && this.c.equals(listeningHistoryModel.b()) && this.d.equals(listeningHistoryModel.c()) && this.e == listeningHistoryModel.d();
        }
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListeningHistoryModel{sessionList=");
        sb.append(this.b);
        sb.append(", lastSessionEndTime=");
        sb.append(this.c);
        sb.append(", loadState=");
        sb.append(this.d);
        sb.append(", internetConnected=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
