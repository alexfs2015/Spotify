package com.spotify.music.features.quicksilver.triggerengine.domain;

import com.google.common.collect.ImmutableList;

final class AutoValue_TriggerEngineModel extends TriggerEngineModel {
    private static final long serialVersionUID = 1;
    private final boolean adsModeEnabled;
    private final boolean appInBackground;
    private final boolean carModeEnabled;
    private final ImmutableList<OutboundRequest> outboundRequests;
    private final ImmutableList<qag> triggerList;

    static final class a implements com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a {
        private ImmutableList<OutboundRequest> a;
        private ImmutableList<qag> b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        a() {
        }

        private a(TriggerEngineModel triggerEngineModel) {
            this.a = triggerEngineModel.a();
            this.b = triggerEngineModel.b();
            this.c = Boolean.valueOf(triggerEngineModel.c());
            this.d = Boolean.valueOf(triggerEngineModel.d());
            this.e = Boolean.valueOf(triggerEngineModel.e());
        }

        /* synthetic */ a(TriggerEngineModel triggerEngineModel, byte b2) {
            this(triggerEngineModel);
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a a(ImmutableList<OutboundRequest> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null outboundRequests");
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final TriggerEngineModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" outboundRequests");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" triggerList");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" carModeEnabled");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" adsModeEnabled");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" appInBackground");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                AutoValue_TriggerEngineModel autoValue_TriggerEngineModel = new AutoValue_TriggerEngineModel(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), 0);
                return autoValue_TriggerEngineModel;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a b(ImmutableList<qag> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null triggerList");
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_TriggerEngineModel(ImmutableList<OutboundRequest> immutableList, ImmutableList<qag> immutableList2, boolean z, boolean z2, boolean z3) {
        this.outboundRequests = immutableList;
        this.triggerList = immutableList2;
        this.carModeEnabled = z;
        this.adsModeEnabled = z2;
        this.appInBackground = z3;
    }

    /* synthetic */ AutoValue_TriggerEngineModel(ImmutableList immutableList, ImmutableList immutableList2, boolean z, boolean z2, boolean z3, byte b) {
        this(immutableList, immutableList2, z, z2, z3);
    }

    public final ImmutableList<OutboundRequest> a() {
        return this.outboundRequests;
    }

    public final ImmutableList<qag> b() {
        return this.triggerList;
    }

    public final boolean c() {
        return this.carModeEnabled;
    }

    public final boolean d() {
        return this.adsModeEnabled;
    }

    public final boolean e() {
        return this.appInBackground;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TriggerEngineModel) {
            TriggerEngineModel triggerEngineModel = (TriggerEngineModel) obj;
            return this.outboundRequests.equals(triggerEngineModel.a()) && this.triggerList.equals(triggerEngineModel.b()) && this.carModeEnabled == triggerEngineModel.c() && this.adsModeEnabled == triggerEngineModel.d() && this.appInBackground == triggerEngineModel.e();
        }
    }

    public final com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.outboundRequests.hashCode() ^ 1000003) * 1000003) ^ this.triggerList.hashCode()) * 1000003) ^ (this.carModeEnabled ? 1231 : 1237)) * 1000003) ^ (this.adsModeEnabled ? 1231 : 1237)) * 1000003;
        if (!this.appInBackground) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggerEngineModel{outboundRequests=");
        sb.append(this.outboundRequests);
        sb.append(", triggerList=");
        sb.append(this.triggerList);
        sb.append(", carModeEnabled=");
        sb.append(this.carModeEnabled);
        sb.append(", adsModeEnabled=");
        sb.append(this.adsModeEnabled);
        sb.append(", appInBackground=");
        sb.append(this.appInBackground);
        sb.append("}");
        return sb.toString();
    }
}
