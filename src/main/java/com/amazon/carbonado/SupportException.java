/*
 * Copyright 2006-2012 Amazon Technologies, Inc. or its affiliates.
 * Amazon, Amazon.com and Carbonado are trademarks or registered trademarks
 * of Amazon Technologies, Inc. or its affiliates.  All rights reserved.
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

package com.amazon.carbonado;

/**
 * Indicates that an action cannot be supported by the {@link
 * Repository} it is being requested from.  Typically this results from
 * an attempt to get storage for a {@link Storable} which is not supported,
 * or an attempt to configure a repository improperly.
 *
 * @author Brian S O'Neill
 */
public class SupportException extends RepositoryException {

    private static final long serialVersionUID = -6150578915717928592L;

    public SupportException() {
        super();
    }

    public SupportException(String message) {
        super(message);
    }

    public SupportException(String message, Throwable cause) {
        super(message, cause);
    }

    public SupportException(Throwable cause) {
        super(cause);
    }
}
