package com.spotify.pushnotifications.model;

final class AutoValue_QuickAction extends QuickAction {
    private final String actionData;
    private final String actionIdentifier;
    private final String actionTitle;

    AutoValue_QuickAction(String str, String str2, String str3) {
        if (str != null) {
            this.actionIdentifier = str;
            if (str2 != null) {
                this.actionTitle = str2;
                if (str3 != null) {
                    this.actionData = str3;
                    return;
                }
                throw new NullPointerException("Null actionData");
            }
            throw new NullPointerException("Null actionTitle");
        }
        throw new NullPointerException("Null actionIdentifier");
    }

    public final String actionIdentifier() {
        return this.actionIdentifier;
    }

    public final String actionTitle() {
        return this.actionTitle;
    }

    public final String actionData() {
        return this.actionData;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickAction{actionIdentifier=");
        sb.append(this.actionIdentifier);
        sb.append(", actionTitle=");
        sb.append(this.actionTitle);
        sb.append(", actionData=");
        sb.append(this.actionData);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuickAction) {
            QuickAction quickAction = (QuickAction) obj;
            return this.actionIdentifier.equals(quickAction.actionIdentifier()) && this.actionTitle.equals(quickAction.actionTitle()) && this.actionData.equals(quickAction.actionData());
        }
    }

    public final int hashCode() {
        return ((((this.actionIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.actionTitle.hashCode()) * 1000003) ^ this.actionData.hashCode();
    }
}
