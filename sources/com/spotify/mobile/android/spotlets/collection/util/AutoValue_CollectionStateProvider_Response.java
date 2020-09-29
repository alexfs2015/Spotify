package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;
import java.util.Arrays;

final class AutoValue_CollectionStateProvider_Response extends Response {
    private final boolean[] isBanned;
    private final boolean[] isInCollection;

    AutoValue_CollectionStateProvider_Response(boolean[] zArr, boolean[] zArr2) {
        if (zArr != null) {
            this.isInCollection = zArr;
            if (zArr2 != null) {
                this.isBanned = zArr2;
                return;
            }
            throw new NullPointerException("Null isBanned");
        }
        throw new NullPointerException("Null isInCollection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Response) {
            Response response = (Response) obj;
            boolean z = response instanceof AutoValue_CollectionStateProvider_Response;
            if (Arrays.equals(this.isInCollection, z ? ((AutoValue_CollectionStateProvider_Response) response).isInCollection : response.isInCollection())) {
                if (Arrays.equals(this.isBanned, z ? ((AutoValue_CollectionStateProvider_Response) response).isBanned : response.isBanned())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.isInCollection) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.isBanned);
    }

    public final boolean[] isBanned() {
        return this.isBanned;
    }

    public final boolean[] isInCollection() {
        return this.isInCollection;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{isInCollection=");
        sb.append(Arrays.toString(this.isInCollection));
        String str = "ens=Bidas n";
        sb.append(", isBanned=");
        sb.append(Arrays.toString(this.isBanned));
        String str2 = "}";
        sb.append("}");
        return sb.toString();
    }
}
