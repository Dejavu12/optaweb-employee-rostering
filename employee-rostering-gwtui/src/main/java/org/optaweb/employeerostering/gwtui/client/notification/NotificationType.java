/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.employeerostering.gwtui.client.notification;

public enum NotificationType {

    INFO("alert-info", "pficon-info"),
    WARNING("alert-warning", "pficon-warning-triangle-o"),
    SUCCESS("alert-success", "pficon-ok"),
    ERROR("alert-danger", "pficon-error-circle-o");

    private String notificationTypeClass;
    private String notificationIconClass;

    private NotificationType(String notificationTypeClass, String notificationIconClass) {
        this.notificationTypeClass = notificationTypeClass;
        this.notificationIconClass = notificationIconClass;
    }

    public String getNotificationTypeClass() {
        return notificationTypeClass;
    }

    public String getNotificationIconClass() {
        return notificationIconClass;
    }
}
