/*
 * Copyright 2014-2015 Wesley Lin
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

package language_engine;

/**
 * Created by Wesley Lin on 12/2/14.
 */
public enum TranslationEngineType {
    Bing("Microsoft Translator"),
    Google("Google Translation API");

    private String displayName;

    TranslationEngineType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static TranslationEngineType[] getLanguageEngineArray() {
        return new TranslationEngineType[]{
                Bing,
                Google
        };
    }

    @Override
    public String toString() {
        return getDisplayName();
    }

    public static TranslationEngineType fromName(String name) {
        if (name == null)
            return Google;
        for (TranslationEngineType type : values()) {
            if (type.name().equals(name)) {
                return type;
            }
        }
        return Google;
    }

    public String toName() {
        return name();
    }
}
