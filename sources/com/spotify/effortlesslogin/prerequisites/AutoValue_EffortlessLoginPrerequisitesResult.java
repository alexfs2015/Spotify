package com.spotify.effortlesslogin.prerequisites;

import com.google.common.base.Optional;

final class AutoValue_EffortlessLoginPrerequisitesResult extends EffortlessLoginPrerequisitesResult {
    private final boolean enabled;
    private final Optional<String> fullName;

    AutoValue_EffortlessLoginPrerequisitesResult(boolean z, Optional<String> optional) {
        this.enabled = z;
        if (optional != null) {
            this.fullName = optional;
            return;
        }
        throw new NullPointerException("Null fullName");
    }

    public final boolean enabled() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EffortlessLoginPrerequisitesResult) {
            EffortlessLoginPrerequisitesResult effortlessLoginPrerequisitesResult = (EffortlessLoginPrerequisitesResult) obj;
            return this.enabled == effortlessLoginPrerequisitesResult.enabled() && this.fullName.equals(effortlessLoginPrerequisitesResult.fullName());
        }
    }

    public final Optional<String> fullName() {
        return this.fullName;
    }

    public final int hashCode() {
        return (((this.enabled ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.fullName.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EffortlessLoginPrerequisitesResult{enabled=");
        sb.append(this.enabled);
        sb.append(", fullName=");
        sb.append(this.fullName);
        sb.append("}");
        return sb.toString();
    }
}
