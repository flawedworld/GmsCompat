/*
 * Copyright (C) 2013-2017 microG Project Team
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

package com.google.android.gms.common.api;

// https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes
public class CommonStatusCodes {
    public static final int SUCCESS_CACHE = -1;
    public static final int SUCCESS = 0;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int INVALID_ACCOUNT = 5;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int NETWORK_ERROR = 7;
    public static final int INTERNAL_ERROR = 8;
    public static final int SERVICE_INVALID = 9;
    public static final int DEVELOPER_ERROR = 10;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int ERROR = 13;
    public static final int INTERRUPTED = 14;
    public static final int TIMEOUT = 15;
    public static final int CANCELED = 16;
    public static final int API_NOT_CONNECTED = 17;
}
