/*
 * Copyright 2018 Mr Duy
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

package com.duy.ccppcompiler.compiler;

import com.duy.common.DLog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Duy on 18-May-18.
 */

public class Assert {
    private static final String TAG = "Assert";

    public static void existFile(String path) {
        if (!new File(path).exists()) {
            if (DLog.DEBUG) DLog.e(TAG, new FileNotFoundException(path));
        }
        if (new File(path).isDirectory()) {
            if (DLog.DEBUG) DLog.e(TAG, new IOException("Not a file"));
        }
    }

    public static void existDir(String path) {
        if (!new File(path).exists()) {
            if (DLog.DEBUG) DLog.e(TAG, "File not found: ", new FileNotFoundException(path));
        }
    }
}
